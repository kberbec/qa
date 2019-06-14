package com.jsystems.qa.qaapi.model.database;

import com.jsystems.qa.qaapi.model.model.user.Userdb;

import java.sql.SQLException;

public class UserDao {

public static Userdb getoneById(Long id){
    String sql = "select * from testuser where id" = + id;

    try {
        Statement statement = DatabaseConnector.getConnection().created Statement();
        ResultSet wynik = statement.executeQuery(sql);

        while (wynik.next()) ;
        {
            userdb.setId(wynik.getLong(1));
            userdb.setName(wynik.getString(2));
            userdb.setSurname(wynik.getString(3));
        }
        wynik.close();
        statement.close();
    }
    catch (SQLException e){
        e.printStackTrace();

    }
    return.userdb
}

}
