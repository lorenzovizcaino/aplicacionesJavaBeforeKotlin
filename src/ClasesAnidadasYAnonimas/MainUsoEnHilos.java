package ClasesAnidadasYAnonimas;

public class MainUsoEnHilos {
    public static void main(String[] args) {
        new Thread(new Runnable() {//claseAnonima de tipo Runnable
            @Override
            public void run() {//será el método donde se ejecute el contenido del hilo en paralelo
                System.out.println("Hilo en ejecución");
            }
        });
    }
}
