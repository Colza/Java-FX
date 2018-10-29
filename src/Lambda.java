//uses an lambda to process events

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Lambda extends Application {  //doesn't need to implement EventHandler here

    Button button1, button2;
    Label label1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {  //define stage name = primaryStage

        primaryStage.setTitle("Lambda");
        Label label1 = new Label();
        label1.setText("Original Content   ");
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");

        button1.setOnAction( e -> {
            System.out.println("Button 1 Pressed");
            label1.setText("Button 1");
        });

        button2.setOnAction( e -> {
            System.out.println("Button 2 Pressed");
            label1.setText("Button 2");
        });

        FlowPane layout = new FlowPane();   // scene layout
        layout.getChildren().add(label1);
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);
        Scene scene = new Scene(layout, 300, 250); // add layout to scene
        primaryStage.setScene(scene);  // add scene to stage
        primaryStage.show();
    }


}

