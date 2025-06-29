package ui;

import javax.swing.*;
import model.User;
import dao.UserDAO;

//public class UserRegistrationForm extends JFrame {
//    private JTextField nameField, emailField;
//    private JPasswordField passField;
//
//    public UserRegistrationForm() {
//        setTitle("User Registration");
//        setLayout(null);
//
//        JLabel nameLbl = new JLabel("Name:");
//        JLabel emailLbl = new JLabel("Email:");
//        JLabel passLbl = new JLabel("Password:");
//
//        nameLbl.setBounds(30, 30, 80, 25);
//        emailLbl.setBounds(30, 70, 80, 25);
//        passLbl.setBounds(30, 110, 80, 25);
//
//        nameField = new JTextField();
//        emailField = new JTextField();
//        passField = new JPasswordField();
//
//        nameField.setBounds(120, 30, 200, 25);
//        emailField.setBounds(120, 70, 200, 25);
//        passField.setBounds(120, 110, 200, 25);
//
//        JButton registerBtn = new JButton("Register");
//        registerBtn.setBounds(120, 150, 100, 30);
//
//        registerBtn.addActionListener(e -> {
//            User user = new User(
//                nameField.getText(),
//                emailField.getText(),
//                new String(passField.getPassword())
//            );
//
//            boolean success = UserDAO.registerUser(user);
//            JOptionPane.showMessageDialog(this, success ? "Registered Successfully!" : "Error!");
//        });
//
//        add(nameLbl); add(emailLbl); add(passLbl);
//        add(nameField); add(emailField); add(passField);
//        add(registerBtn);
//
//        setSize(400, 250);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//}
//
//package ui;
//import javax.swing.*;

public class UserRegistrationForm extends JFrame {
    private JTextField nameField, emailField;
    private JPasswordField passField;

    public UserRegistrationForm() {
        setTitle("User Registration");
        setLayout(null);

        JLabel nameLbl = new JLabel("Name:");
        JLabel emailLbl = new JLabel("Email:");
        JLabel passLbl = new JLabel("Password:");

        nameLbl.setBounds(30, 30, 80, 25);
        emailLbl.setBounds(30, 70, 80, 25);
        passLbl.setBounds(30, 110, 80, 25);

        nameField = new JTextField();
        emailField = new JTextField();
        passField = new JPasswordField();

        nameField.setBounds(120, 30, 200, 25);
        emailField.setBounds(120, 70, 200, 25);
        passField.setBounds(120, 110, 200, 25);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(120, 150, 100, 30);

        // ⏩ Go to EventList screen directly when button is clicked
        registerBtn.addActionListener(e -> {
            dispose(); // Close current form
            new EventForm().setLocationRelativeTo(null); // Open next screen
        });

        add(nameLbl); add(emailLbl); add(passLbl);
        add(nameField); add(emailField); add(passField);
        add(registerBtn);

        setSize(400, 250);
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
