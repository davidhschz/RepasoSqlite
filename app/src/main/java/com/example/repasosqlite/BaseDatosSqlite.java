package com.example.repasosqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class BaseDatosSqlite extends SQLiteOpenHelper{

    //Definir las variables con las instrucciones necesarias para crear las tablas.

    String tblusuario = "Create table usuario (email text primary, nombre text, clave text, rol int)";
    String tblmaterial = "Create table material (email text primary, nombre text, clave text, rol int)";

    public BaseDatosSqlite( Context context,  String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tblusuario);
        db.execSQL(tblmaterial);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLEw usuario");
        db.execSQL(tblusuario);
        db.execSQL("DROP TABLE material");
        db.execSQL(tblmaterial);
    }
}
