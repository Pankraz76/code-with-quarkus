package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
public class GreetingService1 {

    @Inject
    private final GreetingService2 greetingService2;

    public GreetingService1(GreetingService2 greetingService2) {
        this.greetingService2 = greetingService2;
    }

    public String hello() {
        return greetingService2.hello();
    }
}
