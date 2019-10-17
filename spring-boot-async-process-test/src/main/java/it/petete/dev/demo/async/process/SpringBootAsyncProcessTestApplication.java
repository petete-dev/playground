package it.petete.dev.demo.async.process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "it.petete.dev.demo" })
public class SpringBootAsyncProcessTestApplication {
    
    public static void main(final String[] args) {
	 SpringApplication.run(SpringBootAsyncProcessTestApplication.class, args);
    }
    
}
