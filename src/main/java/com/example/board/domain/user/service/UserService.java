package com.example.board.domain.user.service;

import static com.example.board.domain.user.dto.UserDto.CreateUserRequest;
import static com.example.board.domain.user.dto.UserDto.SingleUserDetailResponse;

public interface UserService {
    SingleUserDetailResponse enroll(CreateUserRequest createUserRequest);
}