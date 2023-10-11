package SOLID.LSP;

public class Pinguino extends Pajaro {
    @Override
    public void volar() {
        throw new UnsupportedOperationException();
    }
    //Este es un ejemplo de violación del principio de sustitución de Liskov,
    // ya que Pinguino es una subclase de Pajaro, pero no puede volar.
    // Una solución sería tener una clase separada para pájaros que pueden volar.
}
