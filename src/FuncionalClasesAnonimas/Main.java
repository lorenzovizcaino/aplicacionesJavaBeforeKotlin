package FuncionalClasesAnonimas;
/*
* En Java 8 se introdujeron las interfaces funcionales,
* que son cualquier interfaz que tenga un único método abstracto (sin valor predeterminado).
* Para cualquier interfaz funcional, se puede usar una expresión lambda (una expresión que define una función anónima)
* para crear un objeto que [sea de una clase anónima implícita que] implemente la interfaz.
* En este caso, la definición del método abstracto de la interfaz quedará definido por la expresión lambda que se haya usado.
* Ejemplo:
* */

//https://es.stackoverflow.com/questions/390900/c%c3%b3mo-puedo-implementar-un-eventhandleractionevent
public class Main {
    public static void main(String[] args) {
        // ----------- en main(), u otro método, o jshell -------------

// La expresión () -> { ... } siguiente es una expresión lambda:
        Duck d = () -> { System.out.println("quack! quack!"); };

// Ahora d es un objecto de una clase anónima que implementa Duck, cuya
// implementacion de Duck::quack es { System.out.prinln("quack! quack!"); }
        //System.out.println(d.getClass().getSimpleName());
        d.quack();


   // Si la interfaz que se quiere implementar con la expresión lambda no se indica explícitamente
    // (al contrario de, por ejemplo,
    //new Duck(() -> { ... })
        //o
    //Duck d = () -> { ... }), //Java la inferirá mediante el contexto,
        // típicamente siendo éste el tipo del parámetro de un método al cual se pasa el lambda como argumento
        //
        // (por ejemplo, suponiendo que a.foo() está declarado como A::foo(Duck d);,
        // entonces la expresión lambda en a.foo(() -> { ... }); implementará Duck).
}
}
