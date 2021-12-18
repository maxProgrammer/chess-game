package com.maxprogrammer.chess.pieces;

import com.maxprogrammer.boardgame.Board;
import com.maxprogrammer.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

}
