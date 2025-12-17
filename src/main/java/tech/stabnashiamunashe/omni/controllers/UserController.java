package tech.stabnashiamunashe.omni.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.stabnashiamunashe.omni.dtos.CreateUserRequest;
import tech.stabnashiamunashe.omni.models.User;
import tech.stabnashiamunashe.omni.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest){
        return new ResponseEntity<>(userService.createUser(createUserRequest), HttpStatus.CREATED);
    }

    @PostMapping("/bulk")
    public ResponseEntity<?> createUsers(@RequestBody List<CreateUserRequest> createUserRequests){
        return new ResponseEntity<>(userService.createUsers(createUserRequests), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>> listUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
    }
}
