package uz.dev;

import uz.dev.model.Laptop;
import uz.dev.model.Pc;
import uz.dev.model.Printer;
import uz.dev.model.Product;

import java.sql.*;

public class DatabaseService {
    private String mobt = "postgresql";
    private String host = "localhost";
    private String port = "5432";
    private String db = "computer_db";
    private String dbUser = "postgres";
    private String dbPassword = "odil1215";

    private String url = "jdbc:" + mobt + "://" + host +":" + port + "/" + db;


    public void getPcec(float minPrice, float maxPrice){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String quary = "select * from pc where price between ? and ?";
            PreparedStatement preparedStatement = connection.prepareStatement(quary);
            preparedStatement.setFloat(1, minPrice);
            preparedStatement.setFloat(2, maxPrice);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Pc pc = new Pc();
                pc.setCode(resultSet.getInt("code"));
                pc.setModel(resultSet.getString("model"));
                pc.setSpeed(resultSet.getInt("speed"));
                pc.setRam(resultSet.getInt("ram"));
                pc.setHd(resultSet.getInt("hd"));
                pc.setCd(resultSet.getString("cd"));
                pc.setPrice(resultSet.getFloat("price"));
                System.out.println(pc);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getLaptops(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String quary = "select * from laptop";
            PreparedStatement preparedStatement = connection.prepareStatement(quary);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Laptop laptop = new Laptop();
                laptop.setCode(resultSet.getInt("code"));
                laptop.setModel(resultSet.getString("model"));
                laptop.setSpeed(resultSet.getInt("speed"));
                laptop.setRam(resultSet.getInt("ram"));
                laptop.setHd(resultSet.getInt("hd"));
                laptop.setScreen(resultSet.getInt("screen"));
                laptop.setPrice(resultSet.getFloat("price"));
                System.out.println(laptop);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getPrinters(){
        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String quary = "select * from printer";
            PreparedStatement preparedStatement = connection.prepareStatement(quary);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Printer printer = new Printer();
                printer.setCode(resultSet.getInt("code"));
                printer.setModel(resultSet.getString("model"));
                printer.setColor(resultSet.getString("color"));
                printer.setType(resultSet.getString("type"));
                printer.setPrice(resultSet.getFloat("price"));
                System.out.println(printer);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUserPreparedStatement(Product product){

        try {
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            String quary = "insert into product(maker, model, type) values(?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(quary);
            preparedStatement.setString(1, product.getMaker());
            preparedStatement.setString(2, product.getModel());
            preparedStatement.setString(3, product.getType());
            preparedStatement.executeUpdate();

            System.out.println("User added from preparedStatement");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
