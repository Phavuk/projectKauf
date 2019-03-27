package database;

import javax.xml.crypto.Data;

public class Database {
    private static Database dtb = new Database();
    private Database(){

    }

    public static Database getInstance(){
        return dtb;
    }


}
