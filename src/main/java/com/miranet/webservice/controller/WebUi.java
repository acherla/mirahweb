package com.miranet.webservice.controller;


import com.miranet.webservice.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

@Controller
public class WebUi {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String login() {
        return "login";
    }
}
