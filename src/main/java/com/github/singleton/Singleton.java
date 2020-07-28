package com.github.singleton;

final public class Singleton {

    private static volatile Object dbConnection;
    private static Singleton instance;

    private Singleton(){
        super();
    }

    public Object getDbConnection(){
        return dbConnection;
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
                dbConnection = new Object();
            }
        }

        return instance;
    }
}
