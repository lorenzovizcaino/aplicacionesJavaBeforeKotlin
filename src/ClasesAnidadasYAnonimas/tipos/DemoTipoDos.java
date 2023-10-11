package ClasesAnidadasYAnonimas.tipos;
//Clase interna anónima que implementa una interfaz en Java
/*
 * Podemos crear un hilo implementando la interfaz Runnable, y la clase interna anónima también puede implementar una interfaz.
 * Usamos la palabra clave new para crear un objeto de clase interna anónimo que hace referencia a un tipo de interfaz.
 */

interface DemoTipoDos {
    public abstract void demo();
}
class AnonymousDemoDos {
    public static void main(String args[]) {
        DemoTipoDos d = new DemoTipoDos() {
            @Override
            public void demo() {
                System.out.println("Type - 2");
            }
        };
        d.demo();
        System.out.println(d.getClass().getName());
    }
}