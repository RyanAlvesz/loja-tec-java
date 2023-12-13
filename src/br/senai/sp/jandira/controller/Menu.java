package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Clientes;
import br.senai.sp.jandira.model.ProdutoExterno;
import br.senai.sp.jandira.model.ProdutoInterno;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    ProdutoInternoController produtoInternoController = new ProdutoInternoController();
    ProdutoExternoController produtoExternoController = new ProdutoExternoController();
    ClientesController clientesController = new ClientesController();

    public void executarMenu() throws SQLException {

        boolean continuar = true;

        while (continuar) {
            System.out.println("------------------------------------");
            System.out.println("                Menu");
            System.out.println("------------------------------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Deletar Cliente");
            System.out.println("4 - Cadastrar Produto");
            System.out.println("5 - Listar Produtos");
            System.out.println("6 - Editar Produto");
            System.out.println("7 - Listar Produto Interno");
            System.out.println("8 - Pesquisar por produtos");
            System.out.println("9 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    Clientes cliente = new Clientes();
                    cliente.cadastrarCliente();
                    clientesController.cadastrarCliente(cliente);
                    break;

                case 2:
                    clientesController.listarClientes();
                    break;

                case 3:
                    // Eu ia fazer uma opção para editar várias informações de um cliente,
                    // porém ia ficar muito grande, então eu só vou fazer para deletar.
                    // O importante é o conceito e isso eu tenho!! 🚀🚀
                    System.out.print("Informe o cpf do cliente que deseja deletar: ");
                    int cpf = scanner.nextInt();
                    scanner.nextLine();
                    clientesController.deletarCliente(cpf);
                    break;

                case 4:
                    System.out.println("Você deseja cadastrar um produto: ");
                    System.out.println("1 - Interno");
                    System.out.println("2 - Externo");
                    int escolhaProduto = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaProduto == 1){

                        ProdutoInterno produtoInterno = new ProdutoInterno();
                        produtoInterno.cadastrarProduto();
                        produtoInternoController.cadastrarProdutoInterno(produtoInterno);

                    } else if (escolhaProduto == 2){

                        ProdutoExterno produtoExterno = new ProdutoExterno();
                        produtoExterno.cadastrarProduto();
                        produtoExternoController.cadastrarProdutoExterno(produtoExterno);

                    } else {

                        System.out.println("Escolha uma opção válida");

                    }

                    break;

                case 5:
                    System.out.println("Funcionalidade em Desenvolvimento");
                    break;

                case 6:
                    System.out.println("Funcionalidade em Desenvolvimento");
                    break;

                case 7:
                    System.out.println("Funcionalidade em Desenvolvimento");
                    break;

                case 8:
                    System.out.println("Funcionalidade em Desenvolvimento");
                    break;

                case 9:
                    continuar = false;
                    break;

            }


        }
    }

}
