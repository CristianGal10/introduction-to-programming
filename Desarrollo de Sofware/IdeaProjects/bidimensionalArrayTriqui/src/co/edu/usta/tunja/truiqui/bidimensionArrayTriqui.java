package co.edu.usta.tunja.truiqui;

import javax.swing.*;

public class bidimensionArrayTriqui {
    public static void main(String[] args) {
        int empty = 1, columns, rows, filaaocupar, columnaaocupar;
        char[][] places;
        String value, matriz;

        value = JOptionPane.showInputDialog("Escoja la figura con la que desea jugar\n" +
                "1) X \n" +
                "2) O");
        empty = Integer.parseInt(value);

        places = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (empty == 1) {
                    places[i][j] = '-';
                }
            }
        }
        value = JOptionPane.showInputDialog("Elija la fila para X");
        filaaocupar = Integer.parseInt(value);
        value = JOptionPane.showInputDialog("Elija la columna para X");
        columnaaocupar = Integer.parseInt(value);
        if (places[filaaocupar][columnaaocupar] == '-') {
            places[filaaocupar][columnaaocupar] = 'X';
        }
        matriz = "";
        rows = 3;
        columns = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matriz = matriz + " " + places[i][j];
            }
            matriz = matriz + "\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

        value = JOptionPane.showInputDialog("Elija la fila para O");
        filaaocupar = Integer.parseInt(value);
        value = JOptionPane.showInputDialog("Elija la columna para O");
        columnaaocupar = Integer.parseInt(value);
        if (places[filaaocupar][columnaaocupar] == '-') {
            places[filaaocupar][columnaaocupar] = 'O';
        }
        if (places[filaaocupar][columnaaocupar] == 'X') {
            JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
        }
        if (places[filaaocupar][columnaaocupar] == 'O') {
            JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para X");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para X");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'X';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para O");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para O");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'O';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para X");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para X");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'X';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para O");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para O");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'O';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para X");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para X");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'X';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para O");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para O");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'O';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

            value = JOptionPane.showInputDialog("Elija la fila para X");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Elija la columna para X");
            columnaaocupar = Integer.parseInt(value);
            if (places[filaaocupar][columnaaocupar] == '-') {
                places[filaaocupar][columnaaocupar] = 'X';
            }
            if (places[filaaocupar][columnaaocupar] == 'X') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            if (places[filaaocupar][columnaaocupar] == 'O') {
                JOptionPane.showMessageDialog(null, "Esta casilla ya está ocupada");
            }
            matriz = "";
            rows = 3;
            columns = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz del juego es: \n" + matriz);

        }
    }
}

        /*matriz = " ";
        rows = 3;
        columns = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matriz = matriz + "  " + places[i][j];
            }
            matriz = matriz + "\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz del juego is: \n" + matriz);

        while (empty == 1) {
            value = JOptionPane.showInputDialog("Seleccione la fila");
            filaaocupar = Integer.parseInt(value);
            value = JOptionPane.showInputDialog("Seleccione la columna");
            columnaaocupar = Integer.parseInt(value);

            if (places[filaaocupar][columnaaocupar] == '-') {
                contadorR = contadorR - 1;
                contadorX = contadorX + 1;
            } else {
                contadorR=contadorR-1;
                contadorO = contadorO + 1;
            }

            matriz = " ";
            columns = 3;
            rows = 3;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz = matriz + " " + places[i][j];
                }
                matriz = matriz + "\n";
            }
            JOptionPane.showMessageDialog(null,"la matriz es: \n"+matriz);
        }
    }
*/