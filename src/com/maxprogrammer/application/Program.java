package com.maxprogrammer.application;

import com.maxprogrammer.chess.ChessMatch;
import com.maxprogrammer.chess.ChessPosition;
import com.maxprogrammer.chess.pieces.ChessPiece;

import java.time.Clock;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturePiece = chessMatch.performChessMove(source, target);
        }


    }
}
