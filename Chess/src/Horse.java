public class Horse extends ChessPiece{

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // same position
        if (line == toLine || column == toColumn) return false;
        if (isOutOfBounds(toLine, toColumn)) return false;

        int possibleLine = line - 2;
        int possibleColumn = column -1;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line - 2;
        possibleColumn = column + 1;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line + 2;
        possibleColumn = column - 1;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line + 2;
        possibleColumn = column + 1;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line - 1;
        possibleColumn = column - 2;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line + 1;
        possibleColumn = column - 2;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line - 1;
        possibleColumn = column + 2;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        possibleLine = line + 1;
        possibleColumn = column + 2;
        if (possibleMove(toLine, toColumn, possibleLine, possibleColumn)) return true;

        return false;
    }

    private boolean isOutOfBounds(int toLine, int toColumn) {
        if ((toLine < 0 || toLine > 7) || (toColumn < 0 || toColumn > 7)) return true;
        else return false;
    }

    private boolean possibleMove(int line, int column, int line2, int column2){
        if (line == line2 && column == column2){
            return true;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
