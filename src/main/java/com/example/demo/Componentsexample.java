
package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class MyComponent {

    public void display() {
        System.out.println("Hello from MyComponent Bean!");
    }
}

@Configuration
@ComponentScan("com.example.demo")
class ComponentConfig {
}

public class Componentsexample {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ComponentConfig.class)) {

            MyComponent component = context.getBean(MyComponent.class);
            component.display();
        }
    }
}
