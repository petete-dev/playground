package it.petete.springbootreactortest.controller.routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import it.petete.springbootreactortest.controller.handlers.GreetingHandler;

@Configuration(proxyBeanMethods = false)
public class GreetingRouter {

  @Bean
  public RouterFunction<ServerResponse> routeGet(GreetingHandler greetingHandler) {
    return RouterFunctions
      .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), greetingHandler::hello)
      ;
  }

  @Bean
  public RouterFunction<ServerResponse> routePost(GreetingHandler greetingHandler) {
    return RouterFunctions
      .route(RequestPredicates.POST("/hello").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), greetingHandler::hello)
      ;
  }
}