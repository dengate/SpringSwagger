package com.example.account.controller;

import com.example.account.dto.request.UserRequest;
import com.example.account.dto.response.UserResponse;
import com.example.account.model.User;
import com.example.account.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account/user")
@Api(value = "User Api documentation")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping
    @ApiOperation(value = "New User adding method")
    public ResponseEntity<UserResponse> add(@RequestBody User request){
            UserResponse response = service.add(request);
            return ResponseEntity.ok(response);
    }

    @GetMapping
    @ApiOperation(value = "User list method")
    public ResponseEntity<List<UserResponse>> get(){
        List<UserResponse> response = service.get();
        return ResponseEntity.ok(response);
    }
}
