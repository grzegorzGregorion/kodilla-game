package com.kodilla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

public class White_piece extends Application {
    private Image white_piece = new Image("file:resources/playBoardElements/white_piece.png");



    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView white_pcs = new ImageView(white_piece);
    }

}
