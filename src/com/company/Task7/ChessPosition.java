package com.company.Task7;

public class ChessPosition {
    private static final char START = 'a';
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0 && x < 8) {
            this.x = x;
        } else try {
            throw new IllegalPositionException("Неверный ввод x!");
        } catch (IllegalPositionException e) {
            e.printStackTrace();
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0 && y < 8) {
            this.y = y;
        } else try {
            throw new IllegalPositionException("Неверный ввод y!");
        } catch (IllegalPositionException e) {
            e.printStackTrace();
        }
    }

    private ChessPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static ChessPosition parse(String position) {

        if (position == null || position.length() != 2) {
            try {
                throw new IllegalPositionException("Неправильная позиция!");
            } catch (IllegalPositionException e) {
                e.printStackTrace();
            }
        }

        return new ChessPosition(Integer.parseInt(String.valueOf(position.charAt(1))) - 1, position.charAt(0) - START);
    }

    @Override
    public String toString() {
        return String.format("%c%d", (char) (START + y), x + 1);
    }
}
