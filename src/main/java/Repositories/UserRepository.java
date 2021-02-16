package Repositories;

import Models.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserRepository extends Repository{

    public ArrayList<User> getAllUsers(){
        return null;
    }

    public void showUsers(){
        Statement stmt = null;

        try {
            stmt = database.open().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.users");

            while(rs.next())
                System.out.println(
                        rs.getInt(1)+"  "+
                        rs.getString(2)+"  "+
                        rs.getString(3)+"  "+
                        rs.getString(5)+"  "+
                        rs.getString(6)
                );

            database.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
