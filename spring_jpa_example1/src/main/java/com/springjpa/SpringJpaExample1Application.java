package com.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springjpa.repositry.DpOperation;

@SpringBootApplication
public class SpringJpaExample1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringJpaExample1Application.class, args);
        
        DpOperation result = container.getBean(DpOperation.class);
      //  result.addInformation();
     //  result.addInformationByList();
     //   result.getInformation();
      //  result.getInformationAll();
         result.getEmployByAddress("Varanasi");
         result.getEmployByAddress("Dafi");
    }
}


