package com.weboot.book.controller;

import com.weboot.book.model.Item;
import com.weboot.book.model.User;
import com.weboot.book.repository.ItemRepository;
import com.weboot.book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Yaroslav Bondarchuk
 *         Date: 02.01.2016
 *         Time: 21:27
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findUsers() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
        repo.save(user);
    }
}
