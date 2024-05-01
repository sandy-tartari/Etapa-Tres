import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu\n");
            System.out.println("[1]Criar loja\n[2]Criar produto\n[3]Sair\n");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    
                    System.out.println("Bem-vindo a criação da loja.");
                    System.out.println("Digite o nome da loja:");
                    String nome = scanner.next();

                    System.out.println("Digite a quantidade de funcionários da loja:");
                    int quantidadeFuncionarios = scanner.nextInt();

                    System.out.println("Digite o salário base dos funcionários da loja:");
                    double salarioBaseFuncionario = scanner.nextDouble();

                    System.out.println("Digite a rua da loja:");
                    String nomeDaRua = scanner.next();
                    
                    System.out.println("Digite a cidade da loja:");
                    String cidade = scanner.next();

                    System.out.println("Digite o estado da loja:");
                    String estado = scanner.next();

                    System.out.println("Digite o pais da loja:");
                    String pais = scanner.next();

                    System.out.println("Digite o cep da loja:");
                    String cep = scanner.next();

                    System.out.println("Digite o número da loja:");
                    String numero = scanner.next();

                    System.out.println("Digite o complemento da loja:");
                    String complemento = scanner.next();

                    System.out.println("Digite o dia de fundação da loja:");
                    int dia = scanner.nextInt();

                    System.out.println("Digite o mes de fundação da loja:");
                    int mes = scanner.nextInt();

                    System.out.println("Digite o ano de fundação da loja:");
                    int ano = scanner.nextInt();
                    
                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep,numero, complemento);
                    Data dataFundacao = new Data( dia, mes, ano);
                    Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario,endereco, dataFundacao);
                    System.out.println("Nome da loja: \n" + loja.getNome() + "\n"+ "Quantidade de funcionários da loja: \n"+ loja.getQuantidadeFuncionarios() + "\n" + "Salário base dos funcionários da loja: "+ loja.getSalarioBaseFuncionario() + "\n"
                    +"Endereço da loja: \n"+ loja.getEndereco() + "\n" +"Data fundação da loja: \n" + loja.getDataFundacao());
                    scanner.close();
                    break;
                case 2:
                    System.out.println("Bem-vindo ao cadastro de produtos da loja.\n");

                    System.out.println("Digite o nome do produto: \n");
                    String nomeProduto = scanner.next();

                    System.out.println("Digite o preço do produto: \n");
                    double precoProduto = scanner.nextDouble();

                    System.out.println("Digite o dia de validade do produto: \n");
                    int diaValidadeProduto = scanner.nextInt();

                    System.out.println("Digite o mes de validade do produto: \n");
                    int mesValidadeProduto = scanner.nextInt();

                    System.out.println("Digite o ano de validade do produto: \n");
                    int anoValidadeProduto = scanner.nextInt();

                    Data dataValidadeProduto = new Data(diaValidadeProduto, mesValidadeProduto, anoValidadeProduto);
                    Produto produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto);

                    System.out.println("Nome do produto: \n" + produto.getNome() + "\n"+ "preço do produto: \n"+ produto.getPreco() + "\n" + "Validade do produto: \n" +
                    produto.getDataValidade());
                    Data dataAtual = new Data(28,04,2024);

                    if (produto.estaVencido(dataAtual)) {

                        System.out.println("O produto " + nomeProduto + " está vencido.");
                    }else {
                        System.out.println("O produto " + nomeProduto + " não está vencido." );
                    }

                    scanner.close();
                    break;
                case 3:
                    System.out.println("Saindo do menu.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);
        
    }
}
