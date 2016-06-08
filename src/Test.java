import java.sql.*;

import java.util.LinkedList;

/**
 * Created by admin on 2016.06.08.
 */
public class Test {
    private static LinkedList<Darbuotojas> darbuotojai;

    public static void main(String[] args) {
        darbuotojai = new LinkedList<>();

        String url = "jdbc:mysql://localhost:3306/dbvs?useSSL=false";
        String username = "root";
        String password = "";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("SELECT * FROM `darbuotojai`");

            ResultSet rs = stmt.getResultSet();

            while(rs.next()) {
                darbuotojai.add(new Darbuotojas(
                        rs.getString("Vardas"),
                        rs.getString("Pavardė"),
                        rs.getString("ID_nr."),
                        rs.getInt("Amžius"),
                        rs.getString("Miestas")
                ));
            }
            connection.close();

            System.out.println(darbuotojai.toArray());

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

    public static LinkedList<Darbuotojas> gautiDarbuotojusIsMiesto(String miestas) {
        LinkedList<Darbuotojas> list = new LinkedList<>();

        for(Darbuotojas darbuotojas : darbuotojai) {
            if(darbuotojas.getMiestas().equals(miestas)) {
                list.add(darbuotojas);
            }
        }

        return list;
    }
}
