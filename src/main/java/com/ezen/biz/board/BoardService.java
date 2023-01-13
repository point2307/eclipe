package com.ezen.biz.board;

import java.util.List;

import com.ezen.biz.dto.BoardVO;

public interface BoardService {

		public void insertBoard(BoardVO board);
		
		public void updateBoard(BoardVO board);
		
		public void deleteBoard(BoardVO board);
		
		public BoardVO getBoard(BoardVO board);
		
		public List<BoardVO> getBoardList();
}
