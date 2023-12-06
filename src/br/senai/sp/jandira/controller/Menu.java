package br.senai.sp.jandira.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    ProdutoInternoController produtoInternoController = new ProdutoInternoController();

    public void executarMenu() throws SQLException {

        boolean continuar = true;

        while (continuar) {

            System.out.println("------------------------------------");
            System.out.println("                Menu");
            System.out.println("------------------------------------");
            System.out.println("1 - Cadastrar Produto Interno");
            System.out.println("2 - Listar Produto Interno");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    produtoInternoController.cadastrarProdutoInterno();
                    break;

                case 2;
                    produtoInternoController.listarProdutos();
                    break;

                case 3:
                    continuar = false;
                    break;

            }


        }
    }

}
