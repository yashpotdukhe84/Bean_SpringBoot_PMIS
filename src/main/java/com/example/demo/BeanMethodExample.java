
package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMethodExample {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(BeanConfiguration.class)) {

            BasicBean bean = context.getBean(BasicBean.class);  // object created 

            System.out.println(bean.greet());
        }
    }
}
