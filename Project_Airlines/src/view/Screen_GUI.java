package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen_GUI extends JFrame {

    private JPanel mainPanel;
    private JLabel lbTitle;
    private JButton btnVoo01;
    private JButton btnvoo2;
    private JButton sairButton;

    public Screen_GUI(){
        setContentPane(mainPanel);
        setTitle("Terminal");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnVoo01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reserva telaVoo001 = new Reserva();
                telaVoo001.setVisible(true);
                dispose();
            }
        });

        btnvoo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reserva2 telaVoo002 = new Reserva2();
                telaVoo002.setVisible(true);
                dispose();
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                System.exit(0); // Encerra o programa
            }
        });
    }
}