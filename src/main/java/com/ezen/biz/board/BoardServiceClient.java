package com.ezen.biz.board;



import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.biz.dto.BoardVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//게시글 등록
		for(int i=1; i<=10; i++) {
			BoardVO board = new BoardVO();
			board.setTitle("게시글 제목 " + i);
			board.setWriter("작성자 : " + i);
			board.setContent("스프링 예제"+i+"번째 게시글");
			
			boardService.insertBoard(board);
			}
		// 게시글 전체 목록 출력
		List<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO vo : boardList) {
			System.out.println(vo);
		}
		factory.close();
	}

}
