
package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeExample {

    public static void main(String[] args) {

        // Start Spring context using ScopeConfiguration
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ScopeConfiguration.class)) {

            // Singleton: Spring returns the same object for both requests
            SingletonBean firstSingleton =
                    context.getBean(SingletonBean.class);

            SingletonBean secondSingleton =
                    context.getBean(SingletonBean.class);

            // Prototype: Spring creates a new object for each request
            PrototypeBean firstPrototype =
                    context.getBean(PrototypeBean.class);

            PrototypeBean secondPrototype =
                    context.getBean(PrototypeBean.class);

            // Compare object identity
            System.out.println(
                    "Singleton objects are the same: "
                    + (firstSingleton == secondSingleton)
                    + "\nFirst: " + firstSingleton
                    + "\nSecond: " + secondSingleton
            );

            System.out.println(
                    "\nPrototype objects are the same: "
                    + (firstPrototype == secondPrototype)
                    + "\nFirst: " + firstPrototype
                    + "\nSecond: " + secondPrototype
            );
        }
    }
}
