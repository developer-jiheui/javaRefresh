package db.main;

import db.ctrl.UserController;
import db.dto.UserDto;

public class MainClass {

  public static void main(String[] args) {
    
    UserController userController = new UserController();

    System.out.println(userController.requestHandler("3", new UserDto(0, "테스트이름", "테스트연락처", null)));
    System.out.println(userController.requestHandler("1", null));

//        UserDto userDto = new UserDto(0,"test Name","test contact",null);
//        UserDto userDto1 = new UserDto(1,"modify Name","modify contact", null);

//        UserDao userDao = UserDao.getInstance();
//        int result = userDao.saveUser(userDto);
//        int result1 = userDao.modifyUser(userDto1);
//
//        System.out.println(result + "행이 삽입되었습니다.");
//        System.out.println(result1 + "row has modified.");
//    UserService userService = new UserServiceImpl();
//
//    List<UserDto> users = userService.getUsers();
//    for(UserDto user : users) {
//      System.out.println(user);
//    }
    
    //UserDto userDto = userDao.getUser(1);
    //System.out.println(userDto);
    
    //UserDto userDto = new UserDto(1, "수정이름", "수정연락처", null);
    //int result = userDao.modifyUser(userDto);
    //System.out.println(result + "행이 수정되었습니다.");
    
    //int result = userDao.removeUser(1);
    //System.out.println(result + "행이 삭제되었습니다.");
    
  }

}
