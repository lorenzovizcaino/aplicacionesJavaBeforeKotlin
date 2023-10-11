package ClasesAnidadasYAnonimas.idiomas;
//https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
/*
* Las Clases anónimas en JAVA son una solución rápida para implementar una clase que se va utilizar una vez y de forma inmediata.
* Por ejemplo el EventHandler para un botón se puede implementar en la misma asignación valiendonos de la interfaz EventHandler que ya esta definida.
* Pero mejor vamos con un ejemplo mas simple.
* De la definición anterior concluimos dos cosas la primera es que para crear una clase anónima es necesario haber definido:
*  una interfaz, una clase o una clase abstracta.
* La clase anónima lo que hará sera implementar la interfaz definida o sobreescribir los métodos definidos.
 *  */
//en este ejemplo tenemos que implementar clases que cumpliendo con la interfaz Saludo
// sean capaces de saludar en diferentes idiomas.
// 1.El paso uno sera definir la interfaz con la que vamos a trabajar:
public class SaludoAnonimo{
interface Saludo<Object> {
    public void saluda();

    public void saludaAAlguien(String aguien);
}

/*
* Sera la interfaz saludo que tiene dos métodos.
* Ahora para ilustrar el método clásico la implementaremos utilizando una inner class para hacer el saludo en ingles,
* la inner class se ve exactamente como una clase normal de JAVA y como ventaja no necesita una interfaz predefinida para existir.
* La inner class se vera así
* */

    public void diHola() {//ultimo paso
        class SaludaEnIngles implements Saludo {
            String name = "world";

            public void saluda() {
                saludaAAlguien("world");
            }

            public void saludaAAlguien(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        Saludo englishGreeting = new SaludaEnIngles();

        //Ahora si implementaremos otros dos saludos usando inner classes uno en francés y otro en español.

        Saludo frenchGreeting = new Saludo() {
            String name = "tout le monde";

            public void saluda() {
                saludaAAlguien("tout le monde");
            }

            public void saludaAAlguien(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };


        //EXPLICACIÓN
    /*
    como puedes ver no existe un nombre para la clase utiliza el mismo nombre de la interfaz.
    La formula de la clase anónima va así;

    El tipo de dato de cualquier superclase o interfaz que vamos a implementar o a extender,
        Saludo
    el nombre de una variable que va a almacenar nuestra impelementación
        frenchGreeting
    una asignación
        =
    un
        NEW
    el nombre de la interfaz a implementar o la clase a extender como un constructor sin argumentos
        Saludo()
    y dos llaves que contendrán la impelementación y terminar con ;
        {};
    * */
        Saludo spanishGreeting = new Saludo() {
            String nombre = "mundo";

            public void saluda() {
                saludaAAlguien("mundo");
            }

            public void saludaAAlguien(String alguien) {
                nombre = alguien;
                System.out.println("Hola, " + nombre);
            }
        };
        englishGreeting.saluda();
        frenchGreeting.saludaAAlguien("Fred");
        spanishGreeting.saluda();
    }

        public static void main(String... args) {
        new SaludoAnonimo().diHola();
    }
}//OJO debe acabar aqui la claseEnvolvente