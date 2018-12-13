package sample;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Group root = new Group();
        primaryStage.setTitle("Hello World");

        primaryStage.setScene(new Scene(root, 750, 500));

        Canvas canvas = new Canvas(400, 200);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
        gc.setFont(theFont);
        gc.fillText("Hello, World", 60,50);
        gc.strokeText("Hello, World", 60,50);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
