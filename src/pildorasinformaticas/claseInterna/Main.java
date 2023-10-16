package pildorasinformaticas.claseInterna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        MiTemporizador miTemporizador=new MiTemporizador(3000,true);
        miTemporizador.PruebaTemporizador();
        JOptionPane.showMessageDialog(null,"Pulse Aceptar para terminar");
    }
}

class MiTemporizador{
    private int intervalo;
    private boolean sonido;

    public MiTemporizador(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }


    public void PruebaTemporizador(){
        ActionListener oyente=new DameLaHora();
        Timer timer=new Timer(intervalo,oyente);
        timer.start();
    }

    private class DameLaHora implements ActionListener{

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
}
