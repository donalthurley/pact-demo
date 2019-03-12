package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hurleyd on 2019-03-11
 */
@RestController
public class DemoController {

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }


    @RequestMapping(value = {"/getAsset"}, method = RequestMethod.GET)
    public String getAsset() {
        return "here is the asset";

    }

}
