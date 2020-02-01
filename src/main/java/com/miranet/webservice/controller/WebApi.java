package com.miranet.webservice.controller;


import com.miranet.webservice.models.User;
import com.miranet.webservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class WebApi {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/rest/api/user/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    User findUser(@PathVariable("userId") Long userId) throws InterruptedException, ExecutionException, SQLException {
        return userRepository.findUserById(userId);
    }

    @RequestMapping(value = "/rest/api/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<User> test() throws InterruptedException, ExecutionException, SQLException {
        return userRepository.findAll();
    }

}
