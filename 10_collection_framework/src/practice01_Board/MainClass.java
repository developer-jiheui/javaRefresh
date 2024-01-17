package practice01_Board;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        BoardService bs = new BoardService();

        List<BoardVo> boardList = bs.getBoardList();
        for (BoardVo boardVO:boardList
             ) {
            System.out.println("board number : " + boardVO.getBoardNo());
            System.out.println("title : " + boardVO.getTitle());
            System.out.println("writer : " + boardVO.getWriter());
            System.out.println("Date : " + boardVO.getCreatedAt());


        }
    }
}
