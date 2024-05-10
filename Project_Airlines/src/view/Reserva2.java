package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static model.Voos_DAO.assentos1;
import static model.Voos_DAO.assentos2;

public class Reserva2 extends JFrame{
    public static String option ="";
    public static int op;
    public static int x =2;
    private JTextField textField2;
    private JButton voltarButton;
    private JLabel lbAssent1;
    private JLabel lbAssent2;
    private JLabel lbAssent3;
    private JLabel lbAssent4;
    private JLabel lbAssent5;
    private JLabel lbAssent6;
    private JPanel PanelReserva2;


    public Reserva2(){
        setContentPane(PanelReserva2);
        setTitle("Terminal");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        lbAssent1.setText(assentos2[0]);
        lbAssent2.setText(assentos2[1]);
        lbAssent3.setText(assentos2[2]);
        lbAssent4.setText(assentos2[3]);
        lbAssent5.setText(assentos2[4]);
        lbAssent6.setText(assentos2[5]);


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen_GUI telaVoo001 = new Screen_GUI();
                telaVoo001.setVisible(true);
                dispose();
            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    option = textField2.getText();
                    op = Integer.parseInt(option); // Tentativa de converter a entrada em um inteiro

                    if (op < 1 || op > 6) {
                        throw new IllegalArgumentException("O valor inserido é inválido!"); // Lançar uma exceção se op não for entre 1 e 6
                    }

                if(op== 1){
                    model.Voos_DAO.reserva2();
                    lbAssent1.setText(assentos2[0]);
                    lbAssent2.setText(assentos2[1]);
                    lbAssent3.setText(assentos2[2]);
                    lbAssent4.setText(assentos2[3]);
                    lbAssent5.setText(assentos2[4]);
                    lbAssent6.setText(assentos2[5]);

                }else if(op== 2){
                    model.Voos_DAO.reserva2();
                    lbAssent1.setText(assentos2[0]);
                    lbAssent2.setText(assentos2[1]);
                    lbAssent3.setText(assentos2[2]);
                    lbAssent4.setText(assentos2[3]);
                    lbAssent5.setText(assentos2[4]);
                    lbAssent6.setText(assentos2[5]);

                }else if(op== 3){
                    model.Voos_DAO.reserva2();
                    lbAssent1.setText(assentos2[0]);
                    lbAssent2.setText(assentos2[1]);
                    lbAssent3.setText(assentos2[2]);
                    lbAssent4.setText(assentos2[3]);
                    lbAssent5.setText(assentos2[4]);
                    lbAssent6.setText(assentos2[5]);

                }else if(op== 4){
                    model.Voos_DAO.reserva2();
                    lbAssent1.setText(assentos2[0]);
                    lbAssent2.setText(assentos2[1]);
                    lbAssent3.setText(assentos2[2]);
                    lbAssent4.setText(assentos2[3]);
                    lbAssent5.setText(assentos2[4]);
                    lbAssent6.setText(assentos2[5]);

                }else if(op== 5){
                    model.Voos_DAO.reserva2();
                    lbAssent1.setText(assentos2[0]);
                    lbAssent2.setText(assentos2[1]);
                    lbAssent3.setText(assentos2[2]);
                    lbAssent4.setText(assentos2[3]);
                    lbAssent5.setText(assentos2[4]);
                    lbAssent6.setText(assentos2[5]);

                }else if(op== 6){
                    model.Voos_DAO.reserva2();
                    lbAssent1.setText(assentos2[0]);
                    lbAssent2.setText(assentos2[1]);
                    lbAssent3.setText(assentos2[2]);
                    lbAssent4.setText(assentos2[3]);
                    lbAssent5.setText(assentos2[4]);
                    lbAssent6.setText(assentos2[5]);
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
