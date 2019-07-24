package com.shengsiyuan.boot.domain;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
public class Person {
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private Date birthday;

    public static void main(String[] args) {
//        int z = 4;
//        int b = 4;
//        DecimalFormat df = new DecimalFormat("###.00");
//        double zz = Double.valueOf(df.format(10/3.0));
//        System.out.println(zz);
        HashMap<String,String> zz = new HashMap<String, String>(){
            {
                put("tanbo","daa");
            }
        };
    }
}
