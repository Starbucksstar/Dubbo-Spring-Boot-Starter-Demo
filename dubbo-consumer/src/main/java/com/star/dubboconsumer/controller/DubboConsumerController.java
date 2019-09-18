package com.star.dubboconsumer.controller;

import com.alibaba.fastjson.JSON;
import com.star.dubboprovider.api.dto.UserDTO;
import com.star.dubboprovider.api.dto.UserKeyDTO;
import com.star.dubboprovider.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DubboConsumerController {

    @Reference(group = "dubbo")
    private UserService userService;

    @RequestMapping(value = "/query")
    public UserDTO queryUserById(@RequestParam Long id) {
        UserKeyDTO userKey = new UserKeyDTO();
        userKey.setId(id);
        return JSON.parseObject(userService.queryUser(userKey), UserDTO.class);
    }

    @PostMapping(value = "/add")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        return JSON.parseObject(userService.insertUSer(userDTO), UserDTO.class);
    }


}
