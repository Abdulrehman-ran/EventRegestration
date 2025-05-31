import java.awt.*;
import java.util.List;
import javax.swing.*;

public class RegistrationForm extends JFrame {
    private JTextField nameField, emailField, phoneField;
    private JButton registerBtn, showBtn;
    private JTextArea displayArea;

    public RegistrationForm() {
        setTitle("Event Registration");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameField = new JTextField(30);
        emailField = new JTextField(30);
        phoneField = new JTextField(30);

        registerBtn = new JButton("Register");
        showBtn = new JButton("Show All Participants");
        displayArea = new JTextArea(10, 30);

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Phone:"));
        add(phoneField);
        add(registerBtn);
        add(showBtn);
        add(new JScrollPane(displayArea));

        registerBtn.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            Participant p = new Participant(name, email, phone);
            ParticipantDAO.insertParticipant(p);

            JOptionPane.showMessageDialog(this, "Registered Successfully!");
            nameField.setText("");
            emailField.setText("");
            phoneField.setText("");
        });

        showBtn.addActionListener(e -> {
            List<Participant> list = ParticipantDAO.getAllParticipants();
            displayArea.setText("");
            for (Participant p : list) {
                displayArea.append(p.getName() + " | " + p.getEmail() + " | " + p.getPhone() + "\n");
            }
        });

        setVisible(true);
    }
}