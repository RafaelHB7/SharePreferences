package com.example.notepad;

import android.content.Context;
import android.content.SharedPreferences;

public class NotasController {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public NotasController(Context c){
        sharedPreferences = c.getSharedPreferences("notepad", c.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void salvar(String key, String str){
        editor.putString(key,str);
        editor.commit();
    }

    public String recuperar(String key){
        return sharedPreferences.getString(key,"");
    }

}
