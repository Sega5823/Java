public class Rook extends ChessPiece{

    public Rook(String color) {
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

        int x = 7, y = column;
        for (;x >= 0; x--){
            if (toLine == x && toColumn == y) return true;
        }

        x = line;
        y = 0;
        for (;y <= 7; y++){
            if (toLine == x && toColumn == y) return true;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    private boolean isOutOfBounds(int toLine, int toColumn) {
        if ((toLine < 0 || toLine > 7) || (toColumn < 0 || toColumn > 7)) return true;
        else return false;
    }
}