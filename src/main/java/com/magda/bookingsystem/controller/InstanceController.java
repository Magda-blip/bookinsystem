
package com.magda.bookingsystem.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    @Value("${INSTANCE_NAME:${HOSTNAME:local}}")
    private String instanceName;

    @GetMapping("/instance")
    public String getInstance() {
        return instanceName;
    }
}
