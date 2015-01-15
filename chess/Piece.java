package chess;

public abstract class Piece {
	public abstract boolean isMoveValid(Block[][] board, Move move);
	public abstract boolean move();
}
