package Hard;

public class TicTacToe {
    String[][] field;
    String nowPlayer;
    String winner;

    public TicTacToe() {
        this.field = new String[3][3];
        newGame();
    }

    void newGame() {
        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z < field[i].length; z++) {
                field[i][z] = "-";
            }
        }
        nowPlayer = "X";
        winner = null;
    }

    String[][] getField() {
        return field;
    }

    //delete public
    public String makeMove(int x, int y) {
        x -= 1;
        y -= 1;

        // if winner already defined
        String check = checkGame();
        if (check != null) return "Game was ended";
        // if cell is already busy
        if (cellIsBusy(x, y)) return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";

        field[x][y] = nowPlayer;

        check = checkGame();
        if (check != null && check != "D") return "Player " + check + " won";
        if (check == "D") return "Draw";

        nowPlayer = nowPlayer.equals("X") ? "0" : "X";
        return "Move completed";
    }

    boolean cellIsBusy(int x, int y) {
        if (field[x][y].equals("-")) return false;
        else return true;
    }

    String checkGame() {
        int counterX = 0;
        int counterO = 0;
        // gorizontal
        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z < field[i].length; z++) {
                if (field[i][z].equals("X") && !field[i][z].equals("-")) counterX++;
                if (field[i][z].equals("O") && !field[i][z].equals("-")) counterO++;
            }
            if (counterX == 3) {
                winner = "X";
                return "X";
            } else if (counterO == 3) {
                winner = "O";
                return "O";
            }
            counterX = 0;
            counterO = 0;
        }
        // vertical
        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z < field[i].length; z++) {
                if (field[z][i].equals("X") && !field[z][i].equals("-")) counterX++;
                if (field[z][i].equals("O") && !field[z][i].equals("-")) counterO++;
            }
            if (counterX == 3) {
                winner = "X";
                return "X";
            } else if (counterO == 3) {
                winner = "O";
                return "O";
            }
            counterX = 0;
            counterO = 0;
        }

        String[] diagonal = {field[0][0], field[1][1], field[2][2]};
        String[] diagonal2 = {field[0][2], field[1][1], field[2][0]};

        for (int i = 0; i < 3; i++) {
            if (diagonal[i].equals("X") && !diagonal[i].equals("-")) counterX++;
            if (diagonal[i].equals("O") && !diagonal[i].equals("-")) counterO++;
        }
        if (counterX == 3) {
            winner = "X";
            return "X";
        } else if (counterO == 3) {
            winner = "O";
            return "O";
        }

        counterX = 0;
        counterO = 0;

        for (int i = 0; i < 3; i++) {
            if (diagonal2[i].equals("X") && !diagonal2[i].equals("-")) counterX++;
            if (diagonal2[i].equals("O") && !diagonal2[i].equals("-")) counterO++;
        }
        if (counterX == 3) {
            winner = "X";
            return "X";
        } else if (counterO == 3) {
            winner = "O";
            return "O";
        }

        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z < field.length; z++) {
                if (field[i][z].equals("-")) return null;
            }
        }

        return "D";
    }
}