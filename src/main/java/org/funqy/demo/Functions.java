package org.funqy.demo;

import io.quarkus.funqy.Funq;
import io.quarkus.funqy.brasilia.BrasiliaEventMapping;
import io.quarkus.funqy.knative.events.CloudEventMapping;

public class Functions {

    @Funq("func-a")
    @BrasiliaEventMapping(name = "Timer", version = "0.1", configJSON = "{ \"schedule\": \"*/1 * * * * *\" }")
    @CloudEventMapping(trigger = "dev.knative.cronjob.event")
    public Object funcA(Object input) {
        System.out.println("funcA " + input + ".");
        return "A String";
    }

    @Funq("func-b")
    public void funcB() {
        System.out.println("funcB");
    }
}
