package com.kodilla.logic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RoyalGameOfUr extends Application {
    private Image imageback = new Image("file:resources/playBoardElements/background.jpg");
    private Image white_piece = new Image("file:resources/playBoardElements/white_piece.png");
    private Image black_piece = new Image("file:resources/playBoardElements/black_piece.png");
    private Image diceImg = new Image("file:resources/playBoardElements/dice.jpg");
    private Image diceImgWithPoint = new Image("file:resources/playBoardElements/dice_with_point.jpg");
    private Image diceImgWithoutPoint = new Image("file:resources/playBoardElements/dice_without_point.jpg");
    private Image field_1_img = new Image("file:resources/playBoardElements/field_1.jpg");
    private Image field_2_img = new Image("file:resources/playBoardElements/field_2.jpg");
    private Image field_3_img = new Image("file:resources/playBoardElements/field_3.jpg");
    private Image field_4_img = new Image("file:resources/playBoardElements/field_4.jpg");
    private Image field_5_img = new Image("file:resources/playBoardElements/field_5.jpg");
    private Image field_6_img = new Image("file:resources/playBoardElements/field_6.jpg");
    private Image field_7_img = new Image("file:resources/playBoardElements/field_7.jpg");
    private Image field_8_img = new Image("file:resources/playBoardElements/field_8.jpg");
    private Image field_9_img = new Image("file:resources/playBoardElements/field_9.jpg");
    private Image field_10_img = new Image("file:resources/playBoardElements/field_10.jpg");
    private Image field_11_img = new Image("file:resources/playBoardElements/field_11.jpg");
    private Image field_12_img = new Image("file:resources/playBoardElements/field_12.jpg");
    private Image field_13_img = new Image("file:resources/playBoardElements/field_13.jpg");
    private Image field_14_img = new Image("file:resources/playBoardElements/field_14.jpg");
    private FlowPane board = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        GridPane grid = new GridPane();
        Game game = new Game(grid);

        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        Button button = new Button();
        button.setText("Throw dice!");
        HBox hbbtn = new HBox(10);
        hbbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbbtn.getChildren().add(button);

        grid.add(hbbtn, 11, 8);

        ImageView white_pcs = getImageView(white_piece);
        board.getChildren().add(white_pcs);
        grid.add(white_pcs, 0, 4);

        ImageView white_pcs1 = getImageView(white_piece);
        board.getChildren().add(white_pcs1);
        grid.add(white_pcs1, 1, 4);

        ImageView white_pcs2 = getImageView(white_piece);
        board.getChildren().add(white_pcs2);
        grid.add(white_pcs2, 2, 4);

        ImageView white_pcs3 = getImageView(white_piece);
        board.getChildren().add(white_pcs3);
        grid.add(white_pcs3, 3, 4);

        ImageView white_pcs4 = getImageView(white_piece);
        board.getChildren().add(white_pcs4);
        grid.add(white_pcs4, 4, 4);

        ImageView white_pcs5 = getImageView(white_piece);
        board.getChildren().add(white_pcs5);
        grid.add(white_pcs5, 5, 4);

        ImageView white_pcs6 = getImageView(white_piece);
        board.getChildren().add(white_pcs6);
        grid.add(white_pcs6, 6, 4);

        ImageView black_pcs = getImageView(black_piece);
        board.getChildren().add(black_pcs);
        grid.add(black_pcs, 0, 0);

        ImageView black_pcs1 = getImageView(black_piece);
        board.getChildren().add(black_pcs1);
        grid.add(black_pcs1, 1, 0);

        ImageView black_pcs2 = getImageView(black_piece);
        board.getChildren().add(black_pcs2);
        grid.add(black_pcs2, 2, 0);

        ImageView black_pcs3 = getImageView(black_piece);
        board.getChildren().add(black_pcs3);
        grid.add(black_pcs3, 3, 0);

        ImageView black_pcs4 = getImageView(black_piece);
        board.getChildren().add(black_pcs4);
        grid.add(black_pcs4, 4, 0);

        ImageView black_pcs5 = getImageView(black_piece);
        board.getChildren().add(black_pcs5);
        grid.add(black_pcs5, 5, 0);

        ImageView black_pcs6 = getImageView(black_piece);
        board.getChildren().add(black_pcs6);
        grid.add(black_pcs6, 6, 0);

        ImageView dice = getImageView(diceImg);
        board.getChildren().add(dice);
        grid.add(dice, 9, 1);

        ImageView dice1 = getImageView(diceImg);
        board.getChildren().add(dice1);
        grid.add(dice1, 10, 1);

        ImageView dice2 = getImageView(diceImg);
        board.getChildren().add(dice2);
        grid.add(dice2, 9, 3);

        ImageView dice3 = getImageView(diceImg);
        board.getChildren().add(dice3);
        grid.add(dice3, 10, 3);

        ImageView field_1 = getImageView(field_1_img);
        board.getChildren().add(field_1);
        grid.add(field_1, 3, 1);

        ImageView field_1_white = getImageView(field_1_img);
        board.getChildren().add(field_1_white);
        grid.add(field_1_white, 3, 3);

        ImageView field_2 = getImageView(field_2_img);
        board.getChildren().add(field_2);
        grid.add(field_2, 2, 1);

        ImageView field_2_white = getImageView(field_2_img);
        board.getChildren().add(field_2_white);
        grid.add(field_2_white, 2, 3);

        ImageView field_3 = getImageView(field_3_img);
        board.getChildren().add(field_3);
        grid.add(field_3, 1, 1);

        ImageView field_3_white = getImageView(field_3_img);
        board.getChildren().add(field_3_white);
        grid.add(field_3_white, 1, 3);

        ImageView field_4 = getImageView(field_4_img);
        board.getChildren().add(field_4);
        grid.add(field_4, 0, 1);

        ImageView field_4_white = getImageView(field_4_img);
        board.getChildren().add(field_4_white);
        grid.add(field_4_white, 0, 3);

        ImageView field_5 = getImageView(field_5_img);
        board.getChildren().add(field_5);
        grid.add(field_5, 0, 2);

        ImageView field_6 = getImageView(field_6_img);
        board.getChildren().add(field_6);
        grid.add(field_6, 1, 2);

        ImageView field_7 = getImageView(field_7_img);
        board.getChildren().add(field_7);
        grid.add(field_7, 2, 2);

        ImageView field_8 = getImageView(field_8_img);
        board.getChildren().add(field_8);
        grid.add(field_8, 3, 2);

        ImageView field_9 = getImageView(field_9_img);
        board.getChildren().add(field_9);
        grid.add(field_9, 4, 2);

        ImageView field_10 = getImageView(field_10_img);
        board.getChildren().add(field_10);
        grid.add(field_10, 5, 2);

        ImageView field_11 = getImageView(field_11_img);
        board.getChildren().add(field_11);
        grid.add(field_11, 6, 2);

        ImageView field_12 = getImageView(field_12_img);
        board.getChildren().add(field_12);
        grid.add(field_12, 7, 2);

        ImageView field_13 = getImageView(field_13_img);
        board.getChildren().add(field_13);
        grid.add(field_13, 7, 1);

        ImageView field_13_white = getImageView(field_13_img);
        board.getChildren().add(field_13_white);
        grid.add(field_13_white, 7, 3);

        ImageView field_14 = getImageView(field_14_img);
        board.getChildren().add(field_14);
        grid.add(field_14, 6, 1);

        ImageView field_14_white = getImageView(field_14_img);
        board.getChildren().add(field_14_white);
        grid.add(field_14_white, 6, 3);

        Text actiontarget = new Text();
        grid.add(actiontarget, 11, 3);

        Random randomGenerator = new Random();
        final int[] diceResult1 = {0};
        final int[] diceResult2 = new int[1];
        final int[] diceResult3 = new int[1];
        final int[] diceResult4 = new int[1];

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                int sum = throwDices(actiontarget, grid);
                game.setSteps(sum);
            }
        });

        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("Royal Game of Ur");
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UTILITY);
        game.displayOnGrid();
        primaryStage.show();
    }

    private int throwDices(Text actiontarget, GridPane grid) {
        List<Integer> diceThrowResults = new ArrayList();

        diceThrowResults.add(0, new Random().nextInt(2));
        diceThrowResults.add(1, new Random().nextInt(2));
        diceThrowResults.add(2, new Random().nextInt(2));
        diceThrowResults.add(3, new Random().nextInt(2));

        int sum = (diceThrowResults.get(0) + diceThrowResults.get(1) + diceThrowResults.get(2) + diceThrowResults.get(3));

        actiontarget.setText("Results of the dice throw is: " + sum);

        if (diceThrowResults.get(0) == 1) {
            ImageView diceWithPoint1 = getImageView(diceImgWithPoint);
            board.getChildren().add(diceWithPoint1);
            grid.add(diceWithPoint1, 9, 1);
        } else {
            ImageView diceWithoutPoint1 = getImageView(diceImgWithoutPoint);
            board.getChildren().add(diceWithoutPoint1);
            grid.add(diceWithoutPoint1, 9, 1);
        }

        if (diceThrowResults.get(1) == 1) {
            ImageView diceWithPoint2 = getImageView(diceImgWithPoint);
            board.getChildren().add(diceWithPoint2);
            grid.add(diceWithPoint2, 10, 1);
        } else {
            ImageView diceWithoutPoint1 = getImageView(diceImgWithoutPoint);
            board.getChildren().add(diceWithoutPoint1);
            grid.add(diceWithoutPoint1, 10, 1);
        }

        if (diceThrowResults.get(2) == 1) {
            ImageView diceWithPoint3 = getImageView(diceImgWithPoint);
            board.getChildren().add(diceWithPoint3);
            grid.add(diceWithPoint3, 9, 3);
        } else {
            ImageView diceWithoutPoint3 = getImageView(diceImgWithoutPoint);
            board.getChildren().add(diceWithoutPoint3);
            grid.add(diceWithoutPoint3, 9, 3);
        }

        if (diceThrowResults.get(3) == 1) {
            ImageView diceWithPoint4 = getImageView(diceImgWithPoint);
            board.getChildren().add(diceWithPoint4);
            grid.add(diceWithPoint4, 10, 3);
        } else {
            ImageView diceWithoutPoint4 = getImageView(diceImgWithoutPoint);
            board.getChildren().add(diceWithoutPoint4);
            grid.add(diceWithoutPoint4, 10, 3);
        }
        return sum;
    }

    private ImageView getImageView(Image pieceImage) {
        ImageView piece = new ImageView(pieceImage);
        piece.setFitHeight(50);
        piece.setFitWidth(50);
        return piece;
    }

    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent hbbtn) {
            System.out.println("Hello World");
        }
    };
}
