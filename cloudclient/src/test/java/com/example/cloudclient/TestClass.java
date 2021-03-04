package com.example.cloudclient;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {
    @Test
    public void testdate(){
        try {
            SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2020-11-13");
            System.out.println(date.before(new Date()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
