package com.star.dubboprovider.api.service;

import com.star.dubboprovider.api.dto.UserDTO;
import com.star.dubboprovider.api.dto.UserKeyDTO;

public interface UserService {
    String queryUser(UserKeyDTO userKeyDTO);

    String insertUSer(UserDTO userDTO);

    String updateUser(UserDTO userDTO);

    int deleteUser(UserKeyDTO userKeyDTO);
}