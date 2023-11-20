package com.s92069394.stress;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="progress.db";
    public static final String TABLE_NAME="progress_table";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="PROGRESS";
    public static final String COL_4="DATE";
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null ,1 );
        SQLiteDatabase db= this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT, PROGRESS TEXT, DATE INTEGER)");
        //create db
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String name, String progress, String date) {
        //insertdata for the batabase
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,progress);
        contentValues.put(COL_4,date);
        long result=db.insert (TABLE_NAME,null,contentValues);
        if (result==-1)
            return false;
        else
            return true;
    }
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("Select * from "+TABLE_NAME,null);
        return result;
    }
    public boolean updateData (String id, String name, String progress, String date){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,progress);
        contentValues.put(COL_4,date);
        db.update(TABLE_NAME,contentValues,"id = ? ",new String[] {id});
        return true;
    }

    public Integer deleteData (String id){
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_NAME,"ID = ? ",new String[] {id});
    }
}


