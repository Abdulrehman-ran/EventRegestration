import java.sql.*;
import java.util.*;

public class ParticipantDAO {

    public static void insertParticipant(Participant p) {
        String sql = "INSERT INTO participants(name, email, phone) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getName());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getPhone());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Participant> getAllParticipants() {
        List<Participant> list = new ArrayList<>();
        String sql = "SELECT * FROM participants";

        try (Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Participant p = new Participant(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone")
                );
                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}