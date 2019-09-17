package com.star.dubboprovider.service;

import com.alibaba.fastjson.JSON;
import com.star.dubboprovider.api.dto.UserDTO;
import com.star.dubboprovider.api.dto.UserKeyDTO;
import com.star.dubboprovider.api.service.UserService;
import com.star.dubboprovider.model.User;
import com.star.dubboprovider.repository.UserRepository;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public String queryUser(UserKeyDTO userKeyDTO) {
        return JSON.toJSONString(userRepository.findById(userKeyDTO.getId()).get());
    }

    @Override
    public String insertUSer(UserDTO userDTO) {
        return JSON.toJSONString(userRepository.save(userDTOToUser(userDTO)));
    }

    @Override
    public String updateUser(UserDTO userDTO) {
        return JSON.toJSONString(userRepository.save(userDTOToUser(userDTO)).toString());
    }

    @Override
    public int deleteUser(UserKeyDTO userKeyDTO) {
        userRepository.deleteById(userKeyDTO.getId());
        return 1;
    }

    private User userDTOToUser(UserDTO userDTO) {
        return User.builder().id(userDTO.getId()).idno(userDTO.getIdno()).name(userDTO.getName()).age(userDTO.getAge()).address(userDTO.getAddress()).password(userDTO.getPassword()).phone(userDTO.getPhone()).sex(userDTO.getSex()).build();
    }
}
