package SOLID.ISP;

public class Pinguino  implements Pajaro {
    public void comer() {
        // lógica para comer
    }
    //, Pinguino no está forzado a implementar un método volar() que no necesita,
    // ya que hemos segregado las responsabilidades en dos interfaces diferentes.
}
