package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WrappingServiceTest {



    @Test
    public void WrappingServiceTest1() {

        WrappingService wrappingService = new WrappingService();

//        System.out.println(wrappingService.doWrapping("mohit rathod aaaa bbbb cccc", 7));

        System.out.println(wrappingService.doWrapping("I am a wily old  fox", 10));


//        System.out.println(wrappingService.doWrapping("Czechoslovakia is a european country", 10));
    }
}
