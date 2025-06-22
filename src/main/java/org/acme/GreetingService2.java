package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService2 {

    @Inject
    private GreetingService1 greetingService1;

    /**
     * Exception in GreetingService1.java:17
     * 	  15
     * 	  16      public String hello() {
     * 	→ 17          return greetingService2.hello();
     * 	  18      }
     * 	  19  }
     */
    public String hello() {
//        return greetingService1.hello();
        return "greetingService1.hello()";
    }
}
