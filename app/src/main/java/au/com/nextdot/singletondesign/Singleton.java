package au.com.nextdot.singletondesign;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by sakib on 2/13/2018.
 */

public class Singleton {
    private static Singleton mInstance;
    private static SharedPreferences mSharedPref;
    public Singleton(Context context){

        if(mSharedPref == null)
            mSharedPref = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
    }




    public static Singleton getInstance(Context context)
    {
        if(mInstance == null){
            mInstance = new Singleton(context);
        }
        return mInstance;
    }

    public void setName(String key,String value)
    {
        SharedPreferences.Editor editor=mSharedPref.edit();
        editor.putString(key,value);
        editor.commit();
        Log.d("name",value);
    }
    public String getName(String key,String value)
    {
        return mSharedPref.getString(key,value);
    }
    public void setId(String key,int value)
    {
        SharedPreferences.Editor editor=mSharedPref.edit();
        editor.putInt(key,value);
        editor.commit();
        Log.d("id", String.valueOf(value));
    }
    public int getID(String key,int value)
    {
        return mSharedPref.getInt(key,value);
    }
    public void setNum(String key,int value)
    {
        SharedPreferences.Editor editor=mSharedPref.edit();
        editor.putInt(key,value);
        editor.commit();
        Log.d("num",String.valueOf(value));
    }
    public int getNum(String key,int value)
    {
        return mSharedPref.getInt(key,value);
    }
}
