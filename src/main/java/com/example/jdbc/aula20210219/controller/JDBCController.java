package com.example.jdbc.aula20210219.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.jdbc.aula20210219.entities.Category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JDBCController {

    @GetMapping
    public ResponseEntity<List<Category>> test() {

        String msg; 
        List<Category> list = new ArrayList<>();

        /* O driver só precisa ser carregar 1 única vez no sistema todo */
        try {
            Class.forName("org.h2.Driver");
            msg = "<h1>Driver Carregado Com Sucesso</h1>";

            String url = "jdbc:h2:mem:testdb"; /* retirado da documentação */
            String user = "sa";
            String pwd = "";

            Connection con = DriverManager.getConnection(url, user, pwd);
            msg += "<br/><h2>Conexão Estabelecida com Sucesso</h2>";

            Statement stm = con.createStatement();
            msg += "<br/><h2>Statement Criado com Sucesso</h2>";

            stm.execute("drop table IF EXISTS tb_category");
            msg += "<br/><h3>DROP</h3>";

            stm.execute("create table tb_category ("+
                        "id int8 generated by default as identity,"+
                        " created_at TIMESTAMP WITHOUT TIME ZONE,"+
                        " name varchar(255),"+
                        " primary key (id))");
            msg += "<br/><h3>CREATE</h3>";

            stm.execute("INSERT INTO tb_category (name, created_at) VALUES ('Livros', NOW())");
            stm.execute("INSERT INTO tb_category (name, created_at) VALUES ('Eletrônicos', NOW())");
            stm.execute("INSERT INTO tb_category (name, created_at) VALUES ('Computadores', NOW())");
            msg += "<br/><h3>INSERT</h3>";
            /* http://localhost:8080/h2-console */

            ResultSet rs = stm.executeQuery("select * from tb_category");
            msg += "<br/><h3>SELECT</h3>";

            while(rs.next()){
                Category c = new Category();
                c.setId(rs.getLong("id"));
                c.setName(rs.getString("name"));

                list.add(c);
            }


        } 
        /* catch para quando não acha o driver */
        catch (ClassNotFoundException e) {
            msg = "<h1>Erro ao carregar o driver!</h1>";
            e.printStackTrace();
        } 
        /* catch para quando não há conexão com o banco */
        catch (SQLException ex) {
            msg = "<h1>Erro ao conectar com o banco</h1>";
            ex.printStackTrace();
        }

        return ResponseEntity.ok().body(list);
    }
}
