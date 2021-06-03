package co.edu.usta.tunja.array.bidimensional;

import javax.swing.*;

public class bidimensionalBus {
    public static void main(String[] args) {
        int columns = 3, rows=3, filaaocupar=0, columnaaocupar=0, again = 1, contaodrX = 0, contadorD = 0, contadorO = 0, empty=0;
        char[][] position;
        String answer;
        String matriz = "";

        answer = JOptionPane.showInputDialog("Con qué letra desea jugar \n" +
                "1) X\n" +
                "2) O");
        empty=Integer.parseInt(answer);

        position = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (empty == 1) {
                    position[i][j] = '_';
                }
            }
        }
        matriz = "";
        columns = 3;
        rows=3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matriz = matriz + " " + position[i][j];
            }
            matriz = matriz + "\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz dej juego es: \n" + matriz);

        while (again==1){
            answer=JOptionPane.showInputDialog("seleccione la fila");
            filaaocupar=Integer.valueOf(answer);
            answer=JOptionPane.showInputDialog("Seleccione la columna");
            columnaaocupar=Integer.valueOf(answer);
            if (position[filaaocupar][columnaaocupar]=='i'){
                JOptionPane.showMessageDialog(null," ");
            }else {
                position[filaaocupar][columnaaocupar]='O';
                contadorO=contadorO+1;
                contadorD=contadorD-1;
            }
            matriz="";
            columns=3;
            rows=3;
            for (int i = 0; i < rows ; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz=matriz+" "+position[i][j];
                }
                matriz=matriz+"\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es:\n"+ " " +matriz);
        }
            }
        }


