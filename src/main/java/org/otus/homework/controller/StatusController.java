package org.otus.homework.controller;

import org.otus.homework.entity.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/health")
    public StatusResponse getResp() {
        return new StatusResponse();
    }
}
