package db.main;

import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class MainClass {

    public static void main(String[] args) throws SQLException {

//        UserDto userDto = new UserDto(0,"test Name","test contact",null);
//        UserDto userDto1 = new UserDto(1,"modify Name","modify contact", null);

//        UserDao userDao = UserDao.getInstance();
//        int result = userDao.saveUser(userDto);
//        int result1 = userDao.modifyUser(userDto1);
//
//        System.out.println(result + "행이 삽입되었습니다.");
//        System.out.println(result1 + "row has modified.");


        UserService userService = new UserServiceImpl();

        List<UserDto> users = userService.getUsers();
        for(UserDto user : users){
            System.out.println(user);
        }

    }
}
