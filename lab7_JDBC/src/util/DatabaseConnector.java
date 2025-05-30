
package util;

import java.sql.*;
import java.util.ArrayList;
import model.User;

public class DatabaseConnector {
    
    // DB_URL = "jdbc:<database>://ip_address:port/database_name";
    static final String DB_URL = "jdbc:mysql://localhost:3306/customerdb";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "12345";
    
    // Create a connection
    
    // CRUD Operations
    
    // CRUD Operations on Database
    
    // C - Create: Inserting data into the database
    public static void addUser(User u1) throws SQLException{
        String query = "INSERT INTO student(first_name, age, college, hobbies) VALUES (?, ?, ?, ?) ";
        try{
            // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, u1.getName());
            stmt.setInt(2, u1.getAge());
            stmt.setString(3, u1.getCollege());            
            stmt.setString(4, u1.getHobby());
            
            // After this query will look like:
            // "INSERT INTO patient(first_name, age, college, hobbies) VALUES ('Adi', 28, 'COE', 'Football, guitar') "
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: "+rows);
            
            // Close the connection
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    // R - Read: Getting all the values from the database
    public static ArrayList<User> getUsers(){
        ArrayList <User> users = new ArrayList();
        String query = "SELECT * FROM student";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                User u1 = new User();
                u1.setUserId(rs.getInt("student_id"));
                u1.setName(rs.getString("first_name"));
//              u1.setLastName(rs.getString("last_name"));
                u1.setCollege(rs.getString("college"));
                u1.setAge(rs.getInt("age"));
                u1.setHobby(rs.getString("hobbies"));
                users.add(u1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return users;
    }
    
    // U - Update: Changing a value in the database
    public static void updateUser(User oldUser, User updatedUser){
            String query = "UPDATE student SET first_name = ?, college = ?, age = ?, hobbies = ? WHERE student_id = ? ";
            // Update the query
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedUser.getName());
            stmt.setString(2, updatedUser.getCollege());
            stmt.setInt(3, updatedUser.getAge());
            stmt.setString(4, updatedUser.getHobby());
            stmt.setInt(5, oldUser.getUserId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deleteUser(User u1){
        String query = "DELETE FROM student WHERE student_id = ?";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u1.getUserId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
