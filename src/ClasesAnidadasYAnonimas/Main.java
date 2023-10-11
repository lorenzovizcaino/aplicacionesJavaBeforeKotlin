package ClasesAnidadasYAnonimas;

public class Main {
    public static void main(String[] args) {
        //new Vehiculo(){};//1.Extender de una clase
        new Vehiculo() {// la clase anónima no tiene nombre
            private int numeroPasajeros;
            public void condudir(){
                System.out.println("En conducción");
            }

            public String metodoDeClaseAnonima() {
                return "Esto es una clase anonima";
            }

            @Override
            public void metodoSuper() {//no es necesario su uso
                super.metodoSuper();
            }
        }.condudir();//siempre tiene que llevar ;
        //para invocar el método creado dentro de la claseAnónima, se debe invocar directamente tras la definición


        //2.Extender de una interfaz y podemos crear objeto
        //2.1//UsuarioServicio userServ= new UsuarioServicio(){
        new UsuarioServicio(){
            public void obtenerUsuario(){
                System.out.println("Usuario: ");
            }

            @Override//hay que implementar los métodos de la interfaz
            public void crearUsuario() {
                System.out.println("Crear usuario");
            }
        }.obtenerUsuario();//2.2

        //userServ.crearUsuario();//2.1.por ser interfaz
        //userServ.obtenerUsuario();//2.2.no se puede por ser método interno


        //USOS
        claseAnonimaVehiculo(new Vehiculo(){

        });

        claseAnonimaInterfaz(new UsuarioServicio() {
            @Override
            public void crearUsuario() {

            }
        });
    }

    //USOS
    public static void claseAnonimaVehiculo(Vehiculo vehiculo){

    }

    public static void claseAnonimaInterfaz(UsuarioServicio userServ){}
}
