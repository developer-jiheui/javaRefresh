package db.view;

import db.dto.UserDto;

import javax.swing.*;

public class EditView implements View{
    @Override
    public UserDto display() {
       String user_no = JOptionPane.showInputDialog("수정할 사용자의 번호를 입력하세요.");
        return new UserDto(Integer.parseInt(user_no),null,null,null);
    }
}
