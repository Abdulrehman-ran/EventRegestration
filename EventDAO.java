package dao;
import java.sql.Date;
import model.Event;
import utils.DBConnection;
import java.sql.*;
import java.util.*;

public class EventDAO {
    public static boolean addEvent(Event event) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO events (title, description, event_date) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, event.getTitle());
            stmt.setString(2, event.getDescription());
            stmt.setDate(3, Date.valueOf(event.getDate()));
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Event> getAllEvents() {
        List<Event> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM events");
            while (rs.next()) {
                Event event = new Event(
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getDate("event_date").toLocalDate()
                );
                list.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}