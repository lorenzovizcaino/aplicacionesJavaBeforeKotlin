package ClasesAnidadasYAnonimas;

// 2.Una interfaz
public interface DemonstrationDos {
    void demo();
}
class AnonymousDemoDos{
    public static void main(String args[]){
        DemonstrationDos d=new DemonstrationDos(){
            public void demo(){
                System.out.println("This is an example of an anonymous inner class using an interface.");}
        };
        d.demo();
    }
}
