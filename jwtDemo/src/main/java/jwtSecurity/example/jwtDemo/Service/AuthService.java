package jwtSecurity.example.jwtDemo.Service;

import jwtSecurity.example.jwtDemo.Dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}