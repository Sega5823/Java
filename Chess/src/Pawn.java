import com.sun.tools.javac.Main;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (isOutOfBounds(toLine, toColumn)) return false;
        if (line == toLine && column == toColumn) return false;
        if (color.equals("White")) {
            if (line == 1 && toLine == 3 && toColumn == column) return true;
            if (line + 1 == toLine && column == toColumn) return true;
        }
        if (color.equals("Black")) {
            if (line == 6 && toLine == 4 && toColumn == column) return true;
            if (line - 1 == toLine && column == toColumn) return true;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    private boolean isOutOfBounds(int toLine, int toColumn) {
        if ((toLine < 0 || toLine > 7) || (toColumn < 0 || toColumn > 7)) return true;
        else return false;
    }

}