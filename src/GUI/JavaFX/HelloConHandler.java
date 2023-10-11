package GUI.JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloConHandler extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Muy frecuentemente se usa una expresión de clase anónima (anonymous class) para poder definir la acción del botón directamente donde se define el botón:

        Button btn = new Button();
        btn.setText("Click 'Hello World'");

        //OPCIÓN1:ClaseAnónima
       /* btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");//Escribe en consola al hacer click en el botón
            }
        });*/

        //OPCIÓN2:Con lambdas
        btn.setOnAction(actionEvent  -> { System.out.println("Con lambdas-Hello World!"); });


        StackPane root = new StackPane();
        root.getChildren().add(btn);//se añade el botón

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("TituloPantalla-Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
