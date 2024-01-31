package db.service;

import db.dto.UserDto;

import java.util.List;

public interface UserService {
  List<UserDto> getUsers();
  UserDto getUser(int user_no);
  int saveUser(UserDto userDto);
  int modifyUser(UserDto userDto);
  int removeUser(int user_no);
}
