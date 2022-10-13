package com.letscode.helloworld.controller;

import com.letscode.helloworld.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * CRUD
     *
     *
     * CREATE - POST
     * READ - GET
     * UPDATE - PUT
     * DELETE - DELETE
     *
     *
     *
     */

    @GetMapping("/v1/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/v2/hello")
    public String helloV2(@RequestParam(value = "nome", defaultValue = "world v2!") String nome) {
        return "Hello " + nome;
    }

    private int count = 0;

    @GetMapping("/v3/hello")
    public Hello helloV3(@RequestParam(value = "nome", defaultValue = "José") String nome) {
        count++;
        return new Hello(count, nome);
    }
}
