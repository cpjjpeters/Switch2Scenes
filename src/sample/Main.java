package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;



    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        window = primaryStage;
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("go to scene 2");
        button1.setOnAction(e-> window.setScene(scene2));

        // layout 1 children are laid out in vertical column
        VBox layout1 = new VBox(20); // spaced out
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1,200,200);

//        Label label2 = new Label("Welcome to the second scene");
        Button button2 = new Button("This scene sucks, go back to scene1 ");
        button2.setOnAction(e-> window.setScene(scene1));

        // layout 2 children are laid out in vertical column
        GridPane layout2 = new GridPane(); // spaced out
        layout2.getChildren().addAll( button2);
        scene2 = new Scene(layout2,300,400);

        window.setScene(scene1);
        window.setTitle("title here");
        window.show();
    }
}
