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
            System.out.println("6 - Editar Quantidade de Produtos");
            System.out.println("7 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("");

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
                    // O importante é o conceito e isso eu tenho!!
                    System.out.print("Informe o cpf do cliente que deseja deletar: ");
                    long cpf = scanner.nextLong();
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
                    System.out.println("Você deseja listar ");
                    System.out.println("1 - Todos os produtos");
                    System.out.println("2 - Produtos internos");
                    System.out.println("3 - Produtos externos");
                    int escolhaListarProduto = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaListarProduto == 1){

                        produtoInternoController.listarProdutos();
                        produtoExternoController.listarProdutos();

                    } else if (escolhaListarProduto == 2){

                        produtoInternoController.listarProdutos();

                    } else if (escolhaListarProduto == 3) {

                        produtoExternoController.listarProdutos();

                    } else {

                        System.out.println("Escolha uma opção válida");

                    }

                    break;

                case 6:
                    System.out.println("Você deseja editar ");
                    System.out.println("1 - Produtos internos");
                    System.out.println("2 - Produtos externos");
                    int escolhaEditarProduto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("");

                    System.out.println("Informe o id do produto que deseja editar");

                    System.out.println("");

                    if (escolhaEditarProduto == 1){
                        produtoInternoController.listarProdutos();
                    } else if (escolhaEditarProduto == 2) {
                        produtoExternoController.listarProdutos();
                    }

                    int idProduto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe a quantidade de produtos: ");
                    int qntProduto = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaEditarProduto == 1){
                        produtoInternoController.editarProduto(idProduto, qntProduto);
                    } else {
                        produtoExternoController.editarProduto(idProduto, qntProduto);
                    }

                    break;

                case 7:
                    continuar = false;
                    break;

            }


        }
    }

}
