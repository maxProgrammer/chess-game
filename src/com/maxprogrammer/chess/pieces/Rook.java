package com.maxprogrammer.chess.pieces;

import com.maxprogrammer.boardgame.Board;
import com.maxprogrammer.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {

        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
        return mat;
    }

}
