//
//
//
//
//package 
//
//import model.Event;
//
//import javax.swing.*;
//import java.time.LocalDate;
//
//public class EventForm extends JFrame {
//    JTextField titleField = new JTextField();
//    JTextArea descArea = new JTextArea();
//    JTextField dateField = new JTextField(); // format: yyyy-mm-dd
//    JButton addBtn = new JButton("Add Event");
//
//    public EventForm() {
//        setTitle("Add New Event");
//        setLayout(null);
//
//        JLabel titleLbl = new JLabel("Title:");
//        JLabel descLbl = new JLabel("Description:");
//        JLabel dateLbl = new JLabel("Date (yyyy-mm-dd):");
//
//        titleLbl.setBounds(30, 30, 150, 25);
//        descLbl.setBounds(30, 70, 150, 25);
//        dateLbl.setBounds(30, 150, 150, 25);
//
//        titleField.setBounds(180, 30, 200, 25);
//        descArea.setBounds(180, 70, 200, 60);
//        dateField.setBounds(180, 150, 200, 25);
//        addBtn.setBounds(180, 200, 120, 30);
//
//        // ✅ Pass data to EventList on click
//        addBtn.addActionListener(e -> {
//            try {
//                String title = titleField.getText();
//                String desc = descArea.getText();
//                String dateStr = dateField.getText();
//                LocalDate date = LocalDate.parse(dateStr);
//
//                Event event = new Event(title, desc, date);
//                dispose(); // Close current window
//                new EventList().setLocationRelativeTo(null); // Open next screen with event
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(this, "Invalid input! Please check the date format (yyyy-mm-dd).");
//            }
//        });
//
//        add(titleLbl); add(descLbl); add(dateLbl);
//        add(titleField); add(descArea); add(dateField); add(addBtn);
//
//        setSize(450, 300);
//        setLocationRelativeTo(null); // Center on screen
//        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//}
//
//
//
package ui;

import model.Event;

import javax.swing.*;
import java.time.LocalDate;

public class EventForm extends JFrame {
    JTextField titleField = new JTextField();
    JTextArea descArea = new JTextArea();
    JTextField dateField = new JTextField(); // format: yyyy-mm-dd
    JButton addBtn = new JButton("Add Event");

    public EventForm() {
        setTitle("Add New Event");
        setLayout(null);

        JLabel titleLbl = new JLabel("Title:");
        JLabel descLbl = new JLabel("Description:");
        JLabel dateLbl = new JLabel("Date (yyyy-mm-dd):");

        titleLbl.setBounds(30, 30, 150, 25);
        descLbl.setBounds(30, 70, 150, 25);
        dateLbl.setBounds(30, 150, 150, 25);

        titleField.setBounds(180, 30, 200, 25);
        descArea.setBounds(180, 70, 200, 60);
        dateField.setBounds(180, 150, 200, 25);
        addBtn.setBounds(180, 200, 120, 30);

        addBtn.addActionListener(e -> {
            try {
                String title = titleField.getText();
                String desc = descArea.getText();
                String dateStr = dateField.getText();
                LocalDate date = LocalDate.parse(dateStr);

                Event event = new Event(title, desc, date);
                dispose(); // Close form
                new EventList(event).setLocation(null); // Show display screen

            } catch (Exception ex) {
                System.out.print("Invaid");
     
            }
        });

        add(titleLbl); add(descLbl); add(dateLbl);
        add(titleField); add(descArea); add(dateField); add(addBtn);

        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

