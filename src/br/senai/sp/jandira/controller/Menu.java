package br.senai.sp.jandira.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() throws SQLException {

        boolean continuar = true;

        while (continuar) {

            System.out.println("------------------------------------");
            System.out.println("                Menu");
            System.out.println("------------------------------------");
            System.out.println("1 - ");
            System.out.println("2 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    break;

                case 2:
                    continuar = false;
                    break;

            }


        }
    }

}
