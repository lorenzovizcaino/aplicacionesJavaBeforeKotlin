package ClasesAnidadasYAnonimas;
/*Hay dos formas principales que podemos usar para crear una clase interna anónima. Estos incluyen el uso de:

        1.Una clase (abstracta o concreta)
        2.Una interfaz
        Veámoslos uno por uno.*/
abstract class DemoUno{
    abstract void demoUno();
}
class AnonymousDemoUno{
    public static void main(String args[]){
        DemoUno d = new DemoUno(){
            void demoUno(){
                System.out.println("This is a demo of an anonymous inner class using  class.");
            }
        };
        d.demoUno();
    }
}
