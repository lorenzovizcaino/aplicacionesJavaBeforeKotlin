package ClasesAnidadasYAnonimas.tipos;
//Clase interna anónima que amplía una clase en Java

/*
Podemos crear un hilo extendiendo una clase Thread, y también podemos tener una clase interna anónima que extienda una clase.

Usamos la palabra clave new aquí para crear un objeto que hace referencia al tipo de clase principal.
* */
class DemoTipoUno {
    public void example() {
        System.out.println("Types of Anonymous classes");
    }
}
 class AnonymousDemoUno {
    public static void main(String args[]) {
        DemoTipoUno d1 = new DemoTipoUno();
        d1.example();
        DemoTipoUno d2 = new DemoTipoUno() {
            @Override
            public void example() {
                System.out.println("Type - 1");
            }
        };
        d2.example();
    }
}
