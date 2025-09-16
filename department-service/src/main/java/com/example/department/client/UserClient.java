package com.example.department.client;

import com.example.department.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/*Feign Client is a declarative REST client provided by Spring Cloud.
It lets you define an interface for calling another microservice,
 without writing boilerplate RestTemplate or WebClient code.

✅ Benefits

->No need to manually construct HTTP requests

->Works seamlessly with Eureka for service discovery

->Integrates with Spring Cloud LoadBalancer for client-side load balancing

Supports resilience patterns (Hystrix / Resilience4j)*/
@FeignClient(name = "user-service")
        //, url = "http://localhost:8081")
public interface UserClient {
    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}
