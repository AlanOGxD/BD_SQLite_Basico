package controlador;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AlumnoDAO extends SQLiteOpenHelper {

    //Constantes que definirán la estructura de la BD

    private static final int VERSION_BD = 1;

    private static final String NOMBRE_BD = "Escuela";

    private static final String TABLA_ALUMNOS = "Alumnos";

    private static final String CAMPO_NUM_CONTROL = "Num_Control";
    private static final String CAMPO_NOMBRE = "Nombre";
    private static final String CAMPO_PRIMER_AP = "Primer_Ap";
    private static final String CAMPO_SEGUNDO_AP = "Segundo_Ap";
    private static final String CAMPO_EDAD = "Edad";
    private static final String CAMPO_SEMESTRE = "Semestre";
    private static final String CAMPO_CARRERA = "Carrera";

    //CREATE TABLE Alumnos(Num_Control TEXT

    private static final String CREAR_TABLA_ALUMNOS = "CREATE TABLE "+ TABLA_ALUMNOS+"("+CAMPO_NUM_CONTROL+" TEXT, "+CAMPO_NOMBRE+" TEXT, "+
            CAMPO_PRIMER_AP+" TEXT, "+CAMPO_SEGUNDO_AP+" TEXT, "+CAMPO_EDAD+" INTEGER, "+CAMPO_SEMESTRE+" INTEGER, "+CAMPO_CARRERA+" TEXT  ";


    public AlumnoDAO(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
