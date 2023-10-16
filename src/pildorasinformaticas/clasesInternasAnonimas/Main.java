package pildorasinformaticas.clasesInternasAnonimas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        MiTemporizador miTemporizador=new MiTemporizador();
        miTemporizador.PruebaTemporizador(3000,true);
        JOptionPane.showMessageDialog(null,"Pulse Aceptar para terminar");
    }
}

class MiTemporizador{
    private int intervalo;
    private boolean sonido;

    


    public void PruebaTemporizador(int intervalo, boolean sonido){

        Timer timer=new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date=new Date();
                System.out.println("Te pongo la hora cada 3 segundos"+date);
                if(sonido) {
                    Toolkit toolkit=Toolkit.getDefaultToolkit();
                    toolkit.beep();
                }
            }
        });
        timer.start();
    }


}
