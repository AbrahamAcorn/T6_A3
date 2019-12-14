package controlador;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AlumnoDAO extends SQLiteOpenHelper {

    //constantes para la estructura de la base de datos

    private static final int VERSION_BD=1;
    private static final String NOMBRE_BD="Escuela";//va el nombre de la base de datos
    private static final String TABLA="Alumnos";
    private static final String NUM_CONTROL="num_control";
    private static final String NOMBRE="nombre";
    private static final String PRIM_AP="primer_ap";
    private static final String SEG_AP="segundo_ap";
    private static final String EDAD="edad";
    private static final String SEMESTRE="semestre";
    private static final String CARRERA="carrera";

    //private static final String NUM_CONTROL="num_control";

    private static final String CREAR_TABLA_ALUMNOS="CREATE TABLE " +TABLA+ " ("+NUM_CONTROL+" TEXT ,"+NOMBRE+" TEXT ,";

    public AlumnoDAO(Context context, String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
