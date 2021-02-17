package dBASE;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectDatabase {
    // Secret.properties file
    //jdbc driver
    //jdbc url
    //config jdbc
    //mySql Query
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectDatabase.connectToSQLDatabase();
    }

    public static Connection connection = null;// Connection, Statement, PreparedStatent and ResultSet are Interface
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;
    public static String filePath = "../LearnInClass/ExternLibrary/Secret.properties";

    //Load Properties
    public static Properties loadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        inputStream.close();

        return properties;
    }
    //DataBase connection

    public static Connection connectToSQLDatabase() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = ConnectDatabase.loadProperties(filePath);
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String user = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
        System.out.println("DB is connected");
        return connection;
    }

    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();// if we don't close the connection there is a chance a chaker enters DB
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException{
        List<String> dataList=new ArrayList<>();
        while (resultSet.next()){
            String itemName=resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;// we created a method and this method will get us particular column
    }
    public static List<String> readDatabase(String tableName, String columnName){
        List<String>data=new ArrayList<>();
        try {
            ConnectDatabase.connectToSQLDatabase();
        }catch (IOException io){
            System.out.println("Exception");
        }catch (SQLException sq){
            System.out.println("Exception");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
