package kz.aitu.oop.assignment6.singleton;

import java.sql.*;

class DBConnectionTest {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();

        try {
            String query = "select * from necklace";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " "
                        + rs.getInt("cost") + " " + rs.getDouble("weight"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
