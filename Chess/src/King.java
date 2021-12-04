public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (isOutOfBounds(toLine, toColumn)) return false;
        if (line == toLine && column == toColumn) return false;

        if (line == toLine && column + 1 == toColumn) return true;
        if (line == toLine && column - 1 == toColumn) return true;
        if (line + 1 == toLine && column == toColumn) return true;
        if (line + 1 == toLine && column + 1 == toColumn) return true;
        if (line + 1 == toLine && column - 1 == toColumn) return true;
        if (line - 1 == toLine && column == toColumn) return true;
        if (line - 1 == toLine && column + 1 == toColumn) return true;
        if (line - 1 == toLine && column - 1 == toColumn) return true;

        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    private boolean isOutOfBounds(int toLine, int toColumn) {
        if ((toLine < 0 || toLine > 7) || (toColumn < 0 || toColumn > 7)) return true;
        else return false;
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < board.board.length; i++) {
            for (int z = 0; z < board.board[i].length; z++) {
                if (!board.board[i][z].getColor().equals(this.getColor())) {
                    if (board.board[i][z].canMoveToPosition(board, i, z, line, column)) return true;
                }
            }
        }
        return false;
    }
}
