package Repositories;


import Database.Database;

public class Repository {

    protected Database database;

    public Repository() {
        this.database = new Database();
    }

}
