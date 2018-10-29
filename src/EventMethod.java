//uses separate method in class to process events

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class EventMethod extends Application implements EventHandler<ActionEvent> {

    Button button1, button2;
    Label label1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {  //define stage name = primaryStage

        primaryStage.setTitle("Event Method");
        Label label1 = new Label();
        label1.setText("Original Content   ");
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        button1.setOnAction(this);
        button2.setOnAction(this); //button handled by code in this class - could be class name in brackets
        FlowPane layout = new FlowPane();   // scene layout
        layout.getChildren().add(label1);
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);
        Scene scene = new Scene(layout, 300, 250); // add layout to scene
        primaryStage.setScene(scene);  // add scene to stage
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) { //event handler as a separate method
        if (event.getSource() == button1) {     // what is the source of the event?
            System.out.println("Button 1 Clicked");
               }
        if (event.getSource() == button2) {     // what is the source of the event?
            System.out.println("Button 2 Clicked");
        }
    }
}
