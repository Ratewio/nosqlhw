package io.github.ratewio.nosqlhw.controller;

import io.github.ratewio.nosqlhw.model.User;
import io.github.ratewio.nosqlhw.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // READ
    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userRepository.findById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}
