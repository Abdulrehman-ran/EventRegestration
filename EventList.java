////
////package ui;
////
////import model.Event;
////
////import javax.swing.*;
////import javax.swing.table.DefaultTableModel;
////
////public class EventList extends JFrame {
////
////    // ✅ Constructor that accepts one Event
////    public EventList() {
////        setTitle("Event Details");
////        setSize(600, 300);
////        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
////
////        String[] columns = {"Title", "Description", "Date"};
////        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
////        JTable table = new JTable(tableModel);
////        JScrollPane scrollPane = new JScrollPane(table);
////        add(scrollPane);
////
////        setVisible(true);
////    }
////}
////
////
////
////
////
//
//
//package ui;
//
//import model.Event;
//
//import javax.swing.*;
//
//public class EventList extends JFrame {
//    public EventList(Event event) {
//        setTitle("Event Details");
//        setLayout(null);
//
//        JLabel titleLbl = new JLabel("Title: " + event.getTitle());
//        JLabel descLbl = new JLabel("<html>Description: " + event.getDescription() + "</html>");
//        JLabel dateLbl = new JLabel("Date: " + event.getDate().toString());
//
//        titleLbl.setBounds(30, 30, 400, 25);
//        descLbl.setBounds(30, 70, 400, 50);
//        dateLbl.setBounds(30, 140, 400, 25);
//
//        add(titleLbl);
//        add(descLbl);
//        add(dateLbl);
//
//        setSize(500, 250);
//        setLocationRelativeTo(null);
//        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//}
//
package ui;

import model.Event;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class EventList extends JFrame {
    public EventList(Event event) {
        setTitle("📅 Event Details");
        setSize(550, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Main panel with padding and layout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridwidth = 2;

        // Title label
        JLabel titleLbl = new JLabel("Title: " + event.getTitle());
        titleLbl.setFont(new Font("Segoe UI", Font.BOLD, 18));
        gbc.gridy = 0;
        panel.add(titleLbl, gbc);

        // Date label
        JLabel dateLbl = new JLabel("Date: " + event.getDate().toString());
        dateLbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        gbc.gridy = 1;
        panel.add(dateLbl, gbc);

        // Description title label
        JLabel descTitleLbl = new JLabel("Description:");
        descTitleLbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        gbc.gridy = 2;
        panel.add(descTitleLbl, gbc);

        // Styled Description Area
        JTextArea descArea = new JTextArea(event.getDescription());
        descArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setEditable(false);
        descArea.setBackground(new Color(250, 250, 250));
        descArea.setMargin(new Insets(10, 10, 10, 10));
        descArea.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(200, 200, 200), 1, true),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        JScrollPane scrollPane = new JScrollPane(descArea);
        scrollPane.setPreferredSize(new Dimension(450, 100));
        scrollPane.setBorder(null); // Remove outer border for clean look
        gbc.gridy = 3;
        panel.add(scrollPane, gbc);

        add(panel);
        setVisible(true);
    }
}


