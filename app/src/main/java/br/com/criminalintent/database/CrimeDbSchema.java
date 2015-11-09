package br.com.criminalintent.database;

/**
 * Created by mauro on 05/11/15.
 */
public class CrimeDbSchema {


    public static final class CrimeTable {

        //db table
        public static final String NAME = "crimes";


        //db columns
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";


        }
    }
}
