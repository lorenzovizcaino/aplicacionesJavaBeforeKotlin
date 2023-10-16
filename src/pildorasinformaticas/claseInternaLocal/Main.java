package pildorasinformaticas.claseInternaLocal;

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
        class DameLaHora implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Date date=new Date();
                System.out.println("Te pongo la hora cada 3 segundos"+date);
                if(sonido) {
                    Toolkit toolkit=Toolkit.getDefaultToolkit();
                    toolkit.beep();
                }
            }
        }

        ActionListener oyente=new DameLaHora();
        Timer timer=new Timer(intervalo,oyente);
        timer.start();
    }


}
