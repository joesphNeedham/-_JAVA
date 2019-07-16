package com.shengsiyuan.boot.controller;

import com.shengsiyuan.boot.config.MyConfigBean;
import com.shengsiyuan.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Period;
import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {
    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;


    @Resource
    private MyConfigBean myConfigBean;


    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public Person getPerson(){
        Person person = new Person();
        person.setId(25);
        person.setName("张三");
        person.setBirthday(new Date());

        System.out.println(this.myAge);
        System.out.println(this.myName);
        System.out.println("-----------------");
        System.out.println(this.myConfigBean.getMyAge());
        System.out.println(this.myConfigBean.getMyName());


        return person;


    }
}
