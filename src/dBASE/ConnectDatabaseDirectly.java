package dBASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDatabaseDirectly {
    public static void main(String[] args) {
      //  # protocol // [hosts ][/database][? properties]  - the way/ the path to create connection

      //  MYSQLJDBC.url=jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021?serverTimezone=UTC
      //  MYSQLJDBC.driver=com.mysql.cj.jdbc.Driver
      //  MYSQLJDBC.userName=root
      // MYSQLJDBC.password= K89268327090k

        String url="jdbc:mysql://localhost:3306/wea_selenium_ny_fall2021?serverTimezone=UTC";
        String user="root";
        String password="K89268327090k";

        Connection connection=null;
        Statement statement= null;
        Movie titanic = new Movie(1,"Titanic", 1998, "Romance", "PG-15","John Smith");//parameterized Constuctor
        Movie trumanShow = new Movie(2,"Truman Show", 1997, "Comedy", "PG-12","Scott Rudin");
        Movie lionKing = new Movie(2,"Lion King", 1994, "Drama", "PG-10", "Elton John");
        Movie littleThings = new Movie(2, "Little Things", 1995, "Comedy", "PG-12", "Garry Michael");
        Movie shrek = new Movie(4, "Shrek", 2007, "Comedy", "PG-10","Baron Cohen");

        ArrayList<Movie> movies= new ArrayList<>();
        movies.add(titanic);
        movies.add(trumanShow);
        movies.add(lionKing);
        movies.add(littleThings);
        movies.add(shrek);
        //them we want to insert everything in our DB


        try{
            connection= DriverManager.getConnection(url, user, password);
            statement= connection.createStatement();// how to execute some quiry
           // String query= "select * from students";// how to write a single query?// this table is in DB MySQL
       /* for (Movie mv: movies){
            String query="insert into movie (id, title, releaseYear, genre, mpaRating, producer)"
                    + "values("+mv.getId()+", "+mv.getTitle()+", "+mv.getReleaseYear()+","+mv.getGenre()+","+mv.getMpaRating()+","+mv.getProducer()+");
                    statement.execute(query);



        }


            statement.execute(query);

        */
            String query="insert into movie (id, title, releaseYear, genre, mpaRating, producer)"
                    + "values(100,'demo', 2020, 'unknown', 'pg-18','demoprod')";

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
