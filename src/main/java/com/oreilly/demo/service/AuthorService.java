package com.oreilly.demo.service;

import com.jogamp.common.util.InterruptedRuntimeException;
import com.oreilly.demo.model.Author;
import com.oreilly.demo.repository.AuthorRepository;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private static final Logger log = LoggerFactory.getLogger(AuthorService.class);

    @Autowired
    AuthorRepository authorRepository;

    @PostConstruct
    public void postConstruct() {
        Author author = new Author();
        author.setFirstName("Aparna");
        author.setLastName("Soni");
        log.info("Performing saving data into database");
        authorRepository.save(author);
        log.info("Retrieve all records");
        log.info("Authors :" + authorRepository.findAll());
    }
}
//    @Autowired
//    JdbcTemplate jdbcTemplate;//it gets autowired automatically because of spring-data-jdbc dependency
//
//    @PostConstruct
//    public void postConstruct() {
//
//        Author author1 = new Author(1, "Mark", "Shogun");
//        Author author2 = new Author(2, "Ruskin", "Handa");
//        List<Author> authors = new ArrayList<>();
//        authors.add(author1);
//        authors.add(author2);
//        log.info("Creating Tables");
//        jdbcTemplate.execute("DROP TABLE Author IF EXISTS");
//        jdbcTemplate.execute("CREATE TABLE Author(" + "id SERIAL,first_name varchar(255),last_name varchar(255)) ");
//        authors.forEach(author -> jdbcTemplate.update("INSERT INTO author(first_name,last_name) VALUES (?,?)",
//                author.getFirstName(), author.getLastName()));
//        log.info("Records Saved");
//        log.info("Retrieve Records");
//        authors = jdbcTemplate.query("select * from author", (rs, rowNum) -> new Author(rs.getString("first_name"),
//                rs.getString("last_name")));
//        authors.forEach(a -> log.info(a.getFirstName() + " " + a.getLastName()));
//
//    }
//
//
//}
//
//
