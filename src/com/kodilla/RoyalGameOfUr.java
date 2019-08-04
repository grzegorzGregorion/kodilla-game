package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class RoyalGameOfUr extends Application {
    private Image imageback = new Image("file:resources/background.png");
    private Image board_img = new Image("file:resources/playBoardElements/board.png");
    private Image white_piece = new Image("file:resources/playBoardElements/white_piece.png");
    private Image black_piece = new Image("file:resources/playBoardElements/black_piece.png");
    private FlowPane board = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        Button button = new Button();
        button.setText("Throw dice!");
        HBox hbbtn = new HBox(10);
        hbbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbbtn.getChildren().add(button);

        grid.add(hbbtn, 8, 4);

        ImageView img = new ImageView(board_img);
        board.getChildren().add(img);
        board.setAlignment(Pos.CENTER);
        grid.add(board, 0, 1, 8, 3);

        ImageView white_pcs = new ImageView(white_piece);
        white_pcs.setFitHeight(50);
        white_pcs.setFitWidth(50);
        board.getChildren().add(white_pcs);
        grid.add(white_pcs, 0, 4);

        ImageView white_pcs1 = new ImageView(white_piece);
        white_pcs1.setFitHeight(50);
        white_pcs1.setFitWidth(50);
        board.getChildren().add(white_pcs1);
        grid.add(white_pcs1, 1, 4);

        ImageView white_pcs2 = new ImageView(white_piece);
        white_pcs2.setFitHeight(50);
        white_pcs2.setFitWidth(50);
        board.getChildren().add(white_pcs2);
        grid.add(white_pcs2, 2, 4);

        ImageView white_pcs3 = new ImageView(white_piece);
        white_pcs3.setFitHeight(50);
        white_pcs3.setFitWidth(50);
        board.getChildren().add(white_pcs3);
        grid.add(white_pcs3, 3, 4);

        ImageView white_pcs4 = new ImageView(white_piece);
        white_pcs4.setFitHeight(50);
        white_pcs4.setFitWidth(50);
        board.getChildren().add(white_pcs4);
        grid.add(white_pcs4, 4, 4);

        ImageView white_pcs5 = new ImageView(white_piece);
        white_pcs5.setFitHeight(50);
        white_pcs5.setFitWidth(50);
        board.getChildren().add(white_pcs5);
        grid.add(white_pcs5, 5, 4);

        ImageView white_pcs6 = new ImageView(white_piece);
        white_pcs6.setFitHeight(50);
        white_pcs6.setFitWidth(50);
        board.getChildren().add(white_pcs6);
        grid.add(white_pcs6, 6, 4);

        ImageView black_pcs = new ImageView(black_piece);
        black_pcs.setFitHeight(50);
        black_pcs.setFitWidth(50);
        board.getChildren().add(black_pcs);
        grid.add(black_pcs, 0, 0);

        ImageView black_pcs1 = new ImageView(black_piece);
        black_pcs1.setFitHeight(50);
        black_pcs1.setFitWidth(50);
        board.getChildren().add(black_pcs1);
        grid.add(black_pcs1, 1, 0);

        ImageView black_pcs2 = new ImageView(black_piece);
        black_pcs2.setFitHeight(50);
        black_pcs2.setFitWidth(50);
        board.getChildren().add(black_pcs2);
        grid.add(black_pcs2, 2, 0);

        ImageView black_pcs3 = new ImageView(black_piece);
        black_pcs3.setFitHeight(50);
        black_pcs3.setFitWidth(50);
        board.getChildren().add(black_pcs3);
        grid.add(black_pcs3, 3, 0);

        ImageView black_pcs4 = new ImageView(black_piece);
        black_pcs4.setFitHeight(50);
        black_pcs4.setFitWidth(50);
        board.getChildren().add(black_pcs4);
        grid.add(black_pcs4, 4, 0);

        ImageView black_pcs5 = new ImageView(black_piece);
        black_pcs5.setFitHeight(50);
        black_pcs5.setFitWidth(50);
        board.getChildren().add(black_pcs5);
        grid.add(black_pcs5, 5, 0);

        ImageView black_pcs6 = new ImageView(black_piece);
        black_pcs6.setFitHeight(50);
        black_pcs6.setFitWidth(50);
        board.getChildren().add(black_pcs6);
        grid.add(black_pcs6, 6, 0);

        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("Royal Game of Ur");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
