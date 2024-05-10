package model;

import view.Reserva;
import view.Reserva2;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Voos_DAO {
    // criando vetores
    public static String[] assentos1 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String[] assentos2 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};

    // criando as funções
    public static String[] reserva1() {
        if (Reserva.x == 1) {
            if (assentos1[0].equals("1[x]") && assentos1[1].equals("2[x]") && assentos1[2].equals("3[x]") && assentos1[3].equals("4[x]") && assentos1[4].equals("5[x]") && assentos1[5].equals("6[x]")) {
                JOptionPane.showMessageDialog(null, "Voo está lotado");
            } else {
                switch (Reserva.op) {
                    case 1:
                        if (Objects.equals(assentos1[0], "1[ ]")) {
                            assentos1[0] = "1[x]";
                            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");

                        } else if (Objects.equals(assentos1[0], "1[x]")) {
                            JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                        }
                        break;
                    case 2:
                        if (Objects.equals(assentos1[1], "2[ ]")) {
                            assentos1[1] = "2[x]";
                            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        } else if (Objects.equals(assentos1[1], "2[x]")) {
                            JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                        }
                        break;
                    case 3:
                        if (Objects.equals(assentos1[2], "3[ ]")) {
                            assentos1[2] = "3[x]";
                            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        } else if (Objects.equals(assentos1[2], "3[x]")) {
                            JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                        }
                        break;
                    case 4:
                        if (Objects.equals(assentos1[3], "4[ ]")) {
                            assentos1[3] = "4[x]";
                            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        } else if (Objects.equals(assentos1[3], "4[x]")) {
                            JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                        }
                        break;
                    case 5:
                        if (Objects.equals(assentos1[4], "5[ ]")) {
                            assentos1[4] = "5[x]";
                            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        } else if (Objects.equals(assentos1[4], "5[x]")) {
                            JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                        }
                        break;
                    case 6:
                        if (Objects.equals(assentos1[5], "6[ ]")) {
                            assentos1[5] = "6[x]";
                            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        } else if (Objects.equals(assentos1[5], "6[x]")) {
                            JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                        }
                        break;
                }
            }
        }
        return assentos2;
    }
        public static String[] reserva2(){
        if(Reserva2.x==2){
            if(assentos2[0].equals("1[x]") && assentos2[1].equals("2[x]") && assentos2[2].equals("3[x]") && assentos2[3].equals("4[x]") && assentos2[4].equals("5[x]") && assentos2[5].equals("6[x]")){
                JOptionPane.showMessageDialog(null,"Voo está lotado");
            }else{
                try {
                    switch (Reserva2.op) {
                        case 1:
                            if (Objects.equals(assentos2[0], "1[ ]")){
                                assentos2[0] = "1[x]";
                                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                            }else if (Objects.equals(assentos2[0], "1[x]")) {
                                JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                            }
                            break;
                        case 2:
                            if (Objects.equals(assentos2[1], "2[ ]")){
                                assentos2[1] = "2[x]";
                                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                            }else if (Objects.equals(assentos2[1], "2[x]")) {
                                JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                            }
                            break;
                        case 3:
                            if (Objects.equals(assentos2[2], "3[ ]")){
                                assentos2[2] = "3[x]";
                                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                            }else if (Objects.equals(assentos2[2], "3[x]")) {
                                JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                            }
                            break;
                        case 4:
                            if (Objects.equals(assentos2[3], "4[ ]")){
                                assentos2[3] = "4[x]";
                                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                            }else if (Objects.equals(assentos2[3], "4[x]")) {
                                JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                            }
                            break;
                        case 5:
                            if (Objects.equals(assentos2[4], "5[ ]")){
                                assentos2[4] = "5[x]";
                                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                            }else if (Objects.equals(assentos2[4], "5[x]")) {
                                JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                            }
                            break;
                        case 6:
                            if (Objects.equals(assentos2[5], "6[ ]")){
                                assentos2[5] = "6[x]";
                                JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                            }else if (Objects.equals(assentos2[5], "6[x]")) {
                                JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                            }
                            break;
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"O valor inserido é invalido!");
                }
            }
        }
        return assentos2;
    }
}

