package br.com.theusma.userserviceapi.controller;

import br.com.theusma.userserviceapi.entity.User;
import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users")
public interface UserController {

    @GetMapping("/{id}")
    ResponseEntity<UserResponse> findById(@PathVariable(name = "id") final String id);
}
