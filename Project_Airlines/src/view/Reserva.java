package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static model.Voos_DAO.assentos1;

public class Reserva extends JFrame{
    public static String option ="";
    public static int op;
    public static int x =1;
    private JButton voltarButton;
    private JTextField TFop;

    private JLabel lbAssent1;
    private JLabel lbAssent2;
    private JLabel lbAssent3;
    private JLabel lbAssent4;
    private JLabel lbAssent5;
    private JLabel lbAssent6;
    private JPanel PanelReserva;




    public Reserva(){
        setContentPane(PanelReserva);
        setTitle("Terminal");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        lbAssent1.setText(assentos1[0]);
        lbAssent2.setText(assentos1[1]);
        lbAssent3.setText(assentos1[2]);
        lbAssent4.setText(assentos1[3]);
        lbAssent5.setText(assentos1[4]);
        lbAssent6.setText(assentos1[5]);

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen_GUI telaVoo001 = new Screen_GUI();
                telaVoo001.setVisible(true);
                dispose();
            }
        });

        TFop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    option = TFop.getText();
                    op = Integer.parseInt(option); // Tentativa de converter a entrada em um inteiro

                    if (op < 1 || op > 6) {
                        throw new IllegalArgumentException("O valor inserido é inválido!"); // Lançar uma exceção se op não for entre 1 e 6
                    }
                if(op== 1){
                    model.Voos_DAO.reserva1();
                    lbAssent1.setText(assentos1[0]);
                    lbAssent2.setText(assentos1[1]);
                    lbAssent3.setText(assentos1[2]);
                    lbAssent4.setText(assentos1[3]);
                    lbAssent5.setText(assentos1[4]);
                    lbAssent6.setText(assentos1[5]);

                }else if(op== 2){
                    model.Voos_DAO.reserva1();
                    lbAssent1.setText(assentos1[0]);
                    lbAssent2.setText(assentos1[1]);
                    lbAssent3.setText(assentos1[2]);
                    lbAssent4.setText(assentos1[3]);
                    lbAssent5.setText(assentos1[4]);
                    lbAssent6.setText(assentos1[5]);

                }else if(op== 3){
                    model.Voos_DAO.reserva1();
                    lbAssent1.setText(assentos1[0]);
                    lbAssent2.setText(assentos1[1]);
                    lbAssent3.setText(assentos1[2]);
                    lbAssent4.setText(assentos1[3]);
                    lbAssent5.setText(assentos1[4]);
                    lbAssent6.setText(assentos1[5]);

                }else if(op== 4){
                    model.Voos_DAO.reserva1();
                    lbAssent1.setText(assentos1[0]);
                    lbAssent2.setText(assentos1[1]);
                    lbAssent3.setText(assentos1[2]);
                    lbAssent4.setText(assentos1[3]);
                    lbAssent5.setText(assentos1[4]);
                    lbAssent6.setText(assentos1[5]);

                }else if(op== 5){
                    model.Voos_DAO.reserva1();
                    lbAssent1.setText(assentos1[0]);
                    lbAssent2.setText(assentos1[1]);
                    lbAssent3.setText(assentos1[2]);
                    lbAssent4.setText(assentos1[3]);
                    lbAssent5.setText(assentos1[4]);
                    lbAssent6.setText(assentos1[5]);

                }else if(op== 6){
                    model.Voos_DAO.reserva1();
                    lbAssent1.setText(assentos1[0]);
                    lbAssent2.setText(assentos1[1]);
                    lbAssent3.setText(assentos1[2]);
                    lbAssent4.setText(assentos1[3]);
                    lbAssent5.setText(assentos1[4]);
                    lbAssent6.setText(assentos1[5]);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    });
    }
}


