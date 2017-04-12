import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * Created by tkanchanawanchai6403 on 4/11/2017.
 */
public class Csc201 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setPadding(new Insets(15,15,15,15));
        Button click1 = new Button("Open Confirmation box");
        click1.setOnAction(e->{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.showAndWait();
        });
        Button click2 = new Button("Open New Window");
        click2.setOnAction((ActionEvent e) -> {
            Circle circle = new Circle();
            circle.setCenterX(100);
            circle.setCenterY(100);
            circle.setRadius(50);
            circle.setStroke(Color.MAGENTA);
            circle.setFill(Color.GREENYELLOW);
            Pane circlePane = new Pane(circle);
            Scene circleScene = new Scene(circlePane,500,1000);
            Stage stage = new Stage();
            stage.setScene(circleScene);
            stage.show();
        });
        Button click3 = new Button("Exit");
        click3.setOnAction(e->{
            primaryStage.close();
        });
        pane.add(click1,0,0);
        pane.add(click2,1,0);
        pane.add(click3,2,0);
        Scene scene = new Scene(pane, 700,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
