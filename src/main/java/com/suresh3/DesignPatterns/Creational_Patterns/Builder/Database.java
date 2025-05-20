package com.suresh3.DesignPatterns.Creational_Patterns.Builder;

public class Database {
    private String host;
    private int port;
    private String username;
    private String password;
    //private constructor
    private Database(){
        // private constructor to prevent instantiation
    }
    public static class DatabaseBuilder {
        private String host;
        private int port;
        private String username;
        private String password;
        public Database build(){
            Database dtabase=new Database();
            dtabase.host=this.host;
            dtabase.port=this.port;
            dtabase.username=this.username;
            dtabase.password=this.password;
            return dtabase;
        }

    }

}
