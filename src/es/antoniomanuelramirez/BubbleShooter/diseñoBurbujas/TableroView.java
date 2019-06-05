/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.antoniomanuelramirez.BubbleShooter.diseñoBurbujas;

import java.util.ArrayList;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Antonio Manuel
 */
public class TableroView {
    GridPane gridTablero = new GridPane();
    
    final int tamBurbuja = 30;
    int columnas = 7;
    int filas = 4;
    public GridPane getGridTablero(){
        return gridTablero;
    }
    /* Creamos los siguientes metodos para hacer el tablero y mostrarlo en pantalla, es decir, acompañandonos de la 
    matriz rellenamos todos los huecos con un rectangulo*/
    private void rellenarCasilla(int x, int y) {
        // Dibujamos las casillas del tablero con rectangulos 
        Rectangle casilla = new Rectangle(60, 60, Color.TRANSPARENT);
        casilla.setStroke(Color.TRANSPARENT);
//        gridTablero.add(casilla, x, y);
    }
    
    public TableroView() {
        for(int y=0; y<4; y++) {
            for(int x=0; x<7; x++) {
                matrizTablero[x][y] = '0';
            }
        }
    }
    // Este metodo recorre toda la matriz rellenando cada una de las casillas con un rectangulo para formar el tablero
    public void mostrarCasillas() {
        for(int y=0; y<4; y++) {
            for(int x=0; x<7; x++) {
                rellenarCasilla(x, y);
            }
        }
    }
    public char[][] matrizTablero = new char[7][5];
    
    public void mostrarTablero() {
        for(int y=0; y<3; y++) {
            for(int x=0; x<7; x++) {
                System.out.print(matrizTablero[x][y]);
                Circle circleBurbuja = new Circle (tamBurbuja); 
                switch(matrizTablero [x] [y]) {
                    case 'B':
                        circleBurbuja.setFill(Color.BLUE);
                    break;
                    case 'R':
                        circleBurbuja.setFill(Color.RED);
                    break;
                    case 'Y':
                        circleBurbuja.setFill(Color.YELLOW);
                    break;
                    case 'P':
                        circleBurbuja.setFill(Color.PURPLE);
                    break;
                    case 'G':
                        circleBurbuja.setFill(Color.GREEN);
                    break;
                }
                // Añadimos la burbujas a la pantalla para que se muestre
                gridTablero.add(circleBurbuja, x, y);
            }       
            System.out.println();
        }
    }
    public void ponerBurbuja(int x, int y, char burbuja) {
        matrizTablero[x][y]= burbuja;
    }
    
    public void borrarBurbuja(int x, int y){
        int posicion = ((y*columnas) + x);
        System.out.println(gridTablero.getChildren().size());
        gridTablero.getChildren().remove(posicion);
    }
}