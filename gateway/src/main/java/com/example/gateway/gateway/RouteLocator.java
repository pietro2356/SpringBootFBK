package com.example.gateway.gateway;

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class RouteLocator {

    // @Bean
    // public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
    //     return builder.routes()
    //                     .route(r -> r.path("/catalog/**"))
    //                     .filters(f -> f.stripPrefix(1))
    //                         .uri("lb://CATALOG")
    //                     .build();
    // }
}
