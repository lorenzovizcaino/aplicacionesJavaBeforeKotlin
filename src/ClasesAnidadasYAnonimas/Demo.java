package ClasesAnidadasYAnonimas;
/*
* una clase sin nombre se denomina clase interna anónima de Java.
* Por lo general, cada vez que creamos una nueva clase, esta tiene un nombre.

Por lo tanto, la clase interna anónima de Java no se utiliza para crear nuevas clases.
* Más bien, lo usamos para anular métodos de una clase o interfaz.

También son útiles en la programación de gráficos, donde escribimos clases de implementación para interfaces de escucha.

La sintaxis de la clase interna anónima de Java se asemeja a la llamada de un constructor,
* excepto que la definición de la clase también está presente dentro del bloque de código.
* */
public class Demo {// 1.clase abstracta/concreta o 2.una interfaz.
    Demo d = new Demo()
    {
        public void demo_method()
        {

//definition

        }
    };

    //Características Clase Anónima
    /*veamos en qué se diferencia de una clase Java normal.
    Podemos implementar cualquier cantidad de interfaces usando una clase normal, pero la clase interna anónima implementa solo una interfaz a la vez.
    Una clase regular puede extender otra clase e implementar simultáneamente varias interfaces.
    Mientras que, por otro lado, una clase interna anónima solo puede hacer una de estas cosas a la vez.

    El nombre del constructor es el mismo que el nombre de una clase.
    Implica que podemos escribir cualquier número de constructores en una clase regular, pero esto no es cierto para una clase interna anónima.
     */
}
