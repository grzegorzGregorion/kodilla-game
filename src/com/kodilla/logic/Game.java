package com.kodilla.logic;

import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Figure> black = new ArrayList<>();
    private List<Figure> white = new ArrayList<>();
    private int whiteLeft = 7;
    private int blackLeft = 7;
    private GridPane grid;
    private int stepCount = -1;
    private boolean isWhiteMove = true;

    public Game(GridPane grid) {
        this.grid = grid;
        grid.setOnMouseClicked(e -> {
            System.out.println(e.getX() + ", " + e.getY());
            int x = ((int)e.getX() - 313) / 66;
            int y = ((int)e.getY() - 177) / 66;
            System.out.println(x + ", " + y);
            if (stepCount > 0) {
                if (!move(0, stepCount, isWhiteMove)) {
                    isWhiteMove = !isWhiteMove;
                }
            }

//            move();
            stepCount = -1;
            displayOnGrid();
        });
        for (int i = 0; i < 14; i++) {
            black.add(new None());
            white.add(new None());
        }
        displayOnGrid();
    }

    public boolean move(int whichFigure, int steps, boolean isWhiteMove) {
        if (whichFigure == -1) {
            if (isWhiteMove && whiteLeft > 0) {
                if (white.get(steps - 1) instanceof None) {
                    whiteLeft--;
                    white.set(steps - 1, new Pawn());
                }
            } else if (!isWhiteMove && blackLeft > 0) {
                if (black.get(steps - 1) instanceof None) {
                    blackLeft--;
                    //pary add i remove można zamienić
                    black.set(steps - 1, new Pawn());
                }
            } else {
                if (whichFigure + steps == 15) {
                    if (isWhiteMove && white.get(whichFigure) instanceof Pawn) {
                        white.add(whichFigure, new None());
                        white.remove(whichFigure + 1);
                    } else if (!isWhiteMove && black.get(whichFigure) instanceof Pawn) {
                        black.add(whichFigure, new None());
                        black.remove(whichFigure + 1);
                    }
                } else if (whichFigure + steps < 15) {
                    if (isWhiteMove && white.get(whichFigure + steps) instanceof None) {
                        white.add(whichFigure + steps, white.get(whichFigure));
                        white.remove(whichFigure);
                    } else if (!isWhiteMove && black.get(whichFigure + steps) instanceof None) {
                        black.add(whichFigure + steps, white.get(whichFigure));
                        black.remove(whichFigure);
                    }
                    if (whichFigure + steps >= 4 && whichFigure + steps <= 11) {
                        if (isWhiteMove && black.get(whichFigure + steps) instanceof Pawn) {
                            blackLeft++;
                            black.add(whichFigure + steps, new None());
                            black.remove(whichFigure + steps + 1);
                        } else if (!isWhiteMove && white.get(whichFigure + steps) instanceof Pawn) {
                            whiteLeft++;
                            white.add(whichFigure + steps, new None());
                            white.remove(whichFigure + steps + 1);
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setSteps(int steps) {
        this.stepCount = steps;
    }

    private class XY {
        private int x;
        private int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public void displayOnGrid() {
        //przed wyświetleniem najpierw należy planszę wyczyścić z elementów
        Map<Integer, XY> whiteXY = new HashMap<>();
        whiteXY.put(0, new XY(3, 0));

        //przeszukać w pętli black i white i wyświetla pionki w odpowiednich polach

    }
}
