package es.antoniomanuelramirez.BubbleShooter.diseñoBurbujas;


public class NewMain {
    
    public static void main(String[] args){
        TableroView tableroView = new TableroView();
//        tableroView.seleccionarBurbuja();
        System.out.println("");
        
        tableroView.ponerBurbuja(0, 0, 'B');
        tableroView.ponerBurbuja(1, 0, 'R');
        tableroView.ponerBurbuja(2, 0, 'Y');
        tableroView.ponerBurbuja(3, 0, 'P');
        tableroView.ponerBurbuja(4, 0, 'G');
        tableroView.mostrarTablero();
    }
}
