package com.maxprogrammer.chess.pieces;

import com.maxprogrammer.boardgame.Board;
import com.maxprogrammer.boardgame.Piece;
import com.maxprogrammer.chess.Color;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {

        return color;
    }

}
