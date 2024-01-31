package db.ctl;

import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;

public class UserController {


    public static String requestHandler(String choice, UserDto userDto){

        UserService userService = new UserServiceImpl();
        String message ="";

        switch(choice){

            case"1":
                for (UserDto user: userService.getUsers()
                     ) {
                    message+= user.toString() +"\n";
                }
                break;
            case "2":
                UserDto user = userService.getUser(userDto.getUser_no());
                if(user == null){
                    message = "조회된 사용자 정보가 없습니다.";
                }else{
                    message = user.toString();
                }
                break;
            case "3" :
                message = userService.saveUser(userDto) + "명의 정보가 등록되었습니다";
                break;

            case "4" :
                message = userService.modifyUser(userDto) + "명의 정보가 수정되었습니다.";

            case "5":
                message = userService.removeUser(userDto.getUser_no()) + "명의 정보가 삭제되었습니다";

        }

        return message;
    }

}
