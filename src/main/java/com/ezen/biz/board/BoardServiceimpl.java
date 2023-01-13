package com.ezen.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;
@Service("boardService")
public class BoardServiceimpl implements BoardService {

	@Autowired
	private BoardDAO bDao;
	
	@Override
	public void insertBoard(BoardVO board) {
		bDao.insertBoard(board);
	}

	@Override
	public void updateBoard(BoardVO board) {
		bDao.updateBoard(board);
	}

	@Override
	public void deleteBoard(BoardVO board) {
		bDao.deleteBoard(board);
	}

	@Override
	public BoardVO getBoard(BoardVO board) {
		return bDao.getBoard(board);
	}

	@Override
	public List<BoardVO> getBoardList() {
		return bDao.getBoardList();
	}

}
