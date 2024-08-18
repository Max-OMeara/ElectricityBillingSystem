package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn() {
        try {
            c = DriverManager.getConnection("root@localhost:3306", "root", "Dinosaur 1Hundred!");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}