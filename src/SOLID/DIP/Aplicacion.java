package SOLID.DIP;

public class Aplicacion {
    private BaseDeDatos db;

    public Aplicacion(BaseDeDatos db) {
        this.db = db;
    }

    public void guardarDatos(String datos) {
        db.guardar(datos);
    }
}

//la clase Aplicacion no depende directamente de la clase MySqlDB.
// En lugar de eso, ambos dependen de la abstracción BaseDeDatos.
// De esta manera, si queremos cambiar la base de datos en el futuro, solo necesitamos crear una nueva implementación de BaseDeDatos,
// sin tener que cambiar la clase Aplicacion.
