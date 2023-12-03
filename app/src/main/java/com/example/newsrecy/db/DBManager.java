package com.example.newsrecy.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBManager extends SQLiteOpenHelper {


    private static final String dbname="userDesc.db";

    public DBManager(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String qry = "create table tbl_user (email text,password text)";
        sqLiteDatabase.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS tbi_user");
        onCreate(sqLiteDatabase);

    }

    public String addRecord(String e1,String p1)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("email",e1);
        cv.put("password",p1);

        long res=   sqLiteDatabase.insert("tbl_user",null,cv);

        if(res==-1)
        {
            return "Failed";
        }

        else
            return "successfully inserted";

    }


}

