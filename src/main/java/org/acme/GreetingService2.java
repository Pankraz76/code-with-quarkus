package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService2 {

    @Inject
    private GreetingService1 greetingService1;

    public String hello() {
//        return greetingService1.hello();
        return "greetingService1.hello()";
    }
}
