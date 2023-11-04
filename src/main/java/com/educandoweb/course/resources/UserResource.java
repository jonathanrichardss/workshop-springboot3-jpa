package com.educandoweb.course.resources;

import com.educandoweb.course.entities.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<UserEntity> findAll() {
        UserEntity u = new UserEntity(1L, "John Doe", "doe@mail.com", "47999877880", "123456");
        return ResponseEntity.ok(u);
    }
}
