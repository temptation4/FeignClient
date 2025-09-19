# 🚀 Spring Boot Microservices with Feign & Eureka 

This project demonstrates a **microservices architecture** using **Spring Boot** and **Spring Cloud**.  
It consists of three services:

- **Eureka Server** → Service registry for discovery  
- **User Service** → Provides user information  
- **Department Service** → Uses **OpenFeign** to call User Service via Eureka  

---

## 🔑 Features
- Service discovery with **Eureka**
- Declarative REST client with **OpenFeign**
- Multi-module **Maven** project
- Loose coupling (no hardcoded URLs)

---

## 🛠 Tech Stack
- Java 21  
- Spring Boot 3.3.x  
- Spring Cloud 2023.0.x  
- Maven  

---

## 🔍 What is Feign Client?

**Feign Client** is a declarative REST client provided by **Spring Cloud**.  
It allows you to call another microservice by just defining an interface, without writing boilerplate HTTP code.

### ✅ Benefits
- Eliminates manual `RestTemplate` or `WebClient` calls  
- Integrates with **Eureka** for service discovery  
- Built-in client-side load balancing  
- Cleaner, more maintainable code  

---

### 💻 Example in this Project

**Define the Feign Client (in Department Service):**
```java
@FeignClient(name = "user-service")  // service name from Eureka
public interface UserClient {
    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}

## 👨‍💻 Author
Neelu Sahai  
