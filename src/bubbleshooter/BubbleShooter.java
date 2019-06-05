
package bubbleshooter;

import es.antoniomanuelramirez.BubbleShooter.diseñoBurbujas.TableroView;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class BubbleShooter extends Application {
    final int tamPantallaX = 430;
    final int tamPantallaY = 600;
    
    @Override
    public void start(Stage primaryStage) {
        // Objeto de la clase TableroView
        TableroView tableroView = new TableroView();
        
        // Contenedor para alinear el tablero en centro horizontalmente
        HBox hBox = new HBox(tableroView.getGridTablero());
        hBox.setAlignment(Pos.CENTER);
        
        // Contenedor principal será de tipo VBox para centrar tablero verticalmente
        StackPane root = new StackPane();
        root.getChildren().add(hBox);
        
        
        tableroView.ponerBurbuja(0, 0, 'B');
        tableroView.ponerBurbuja(1, 0, 'R');
        tableroView.ponerBurbuja(2, 0, 'Y');
        tableroView.ponerBurbuja(3, 0, 'P');
        tableroView.ponerBurbuja(4, 0, 'G');
        tableroView.ponerBurbuja(5, 0, 'R');
        tableroView.ponerBurbuja(6, 0, 'B');
        tableroView.ponerBurbuja(5, 1, 'G');
        tableroView.ponerBurbuja(3, 1, 'G');
        tableroView.ponerBurbuja(4, 1, 'G');
        tableroView.mostrarTablero();
        
        HBox hBoton = new HBox();
        hBoton.setPadding(new Insets(20));
        hBoton.setSpacing(10);
        hBoton.setAlignment(Pos.CENTER);
        
        Button buttonEliminar = new Button("Eliminar");
        buttonEliminar.setPrefSize(100, 45);
        
        hBoton.setLayoutX(tamPantallaX/2);
        hBoton.setLayoutY(tamPantallaY - 20);
        hBoton.getChildren().addAll(buttonEliminar);
        
        root.getChildren().add(hBoton);
        
        buttonEliminar.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Has pulsado el botón");
                tableroView.borrarBurbuja(4, 0);
            }
        });
        
        Scene scene = new Scene(root, tamPantallaX, tamPantallaY);
        primaryStage.setTitle("BubbleShooter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
