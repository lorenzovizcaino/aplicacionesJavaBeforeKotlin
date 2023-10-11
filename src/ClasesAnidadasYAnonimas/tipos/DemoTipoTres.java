package ClasesAnidadasYAnonimas.tipos;
//Clase interna anónima dentro de un argumento de método/constructor en Java
/*
La clase interna anónima dentro de un argumento de método o constructor
encuentra uso en aplicaciones GUI (Graphical User Interface).
Aquí, usamos la clase interna anónima como argumento y la pasamos a métodos o constructores.
* */
abstract class DemoTipoTres {
    public abstract void demo();
}
class Example {
    public void example(DemoTipoTres d) {
        d.demo();
    }
}
 class AnonymousDemoTres {
    public static void main(String args[]) {
        Example e = new Example();
        e.example(new DemoTipoTres() {
            @Override
            public void demo() {
                System.out.println("Type - 3");
            }
        });
    }
}