package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService2 {

    public String hello() {
        return "Hello from Quarkus REST";
    }
}
