import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class App {

    private static final Collection<Produto> venda = null;

    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            List<Produto> lista_produto = new ArrayList<>();
            List<Venda> lista_venda = new ArrayList<>();

            String opcao;
            Produto produtoBuscando;
            String nomeProduto;
            boolean achei = false;

            do{

                limparTela();

                System.out.println("1. INCLUIR PRODUTO");
                System.out.println("2. CONSULTAR PRODUTO");
                System.out.println("3. LISTAGEM DE PRODUTO");
                System.out.println("4. VENDAS POR PERÍODO");
                System.out.println("5. REALIZAR VENDA");
                System.out.println("0. SAIR");
                System.out.print("OPCÃO: ");
                opcao = scanner.next();

                scanner.nextLine();

                String nome;
                switch (opcao){
                    case "1":

                       Produto produto = new Produto();
                       

                       System.out.println("NOME DO PRODUTO: ");
                       produto.setNome(scanner.nextLine());

                       System.out.println("CÓDIGO DO PRODUTO: ");
                       produto.setCodigo(scanner.nextInt());

                       System.out.println("QUANTIDADE DO PRODUTO: ");
                       produto.setQuantidade(scanner.nextInt());

                       System.out.println("VALOR UNITÁRIO DO PRODUTO: ");
                       produto.setValor(scanner.next());

                       lista_produto.add(produto);

                       scanner.nextLine();
                       

                    
                       System.out.println("Produto Cadastrado com sucesso ");

                       System.out.println("Pressione ENTER para continuar ");
                       scanner.nextLine();
                       break;

                    case "2":
                        System.out.println("Qual item esta procurando ? ");
                        nomeProduto = scanner.nextLine();

                        achei = false;
                        produtoBuscando = null;

                        for (Produto item : lista_produto){
                            if (item.getNome().equalsIgnoreCase(nomeProduto)){
                                achei = true;
                                produtoBuscando = item;
                                
                            }
                        }

                        if(achei){
                         
                         System.out.println("Produto encontrado " + nomeProduto);
                        } else {
                            System.out.println("Produto não encontrado ");
                        }

                         System.out.println("Pressione ENTER para continuar ");
                         scanner.nextLine();
                         break;
                    
                    case "3":
                       System.out.println("Lista de produtos ");
                       if (extracted(lista_produto).isEmpty() ) {
                           System.out.println("Lista sem produtos ");
                        } else {
                            for (Produto item : extracted(lista_produto)) {
                                System.out.println(item);
                            }
                        
                        }
                        
                        System.out.println("Pressione ENTER para continuar ");
                        scanner.nextLine();
                        break; 


                    case "4":

                    System.out.println("Lista de vendas ");
                       if (extracted2(lista_venda).isEmpty() ) {
                           System.out.println("Lista sem vendas ");
                        } else {
                            for (Venda item :extracted2(lista_venda)) {
                                System.out.println(item);
                            }
                        }
                        
                        Map<LocalDate, List<Venda>> vendasagrupadas = (Map<LocalDate, List<Venda>>) venda.stream();
                        collect(Collectors.groupingBy(Venda::getDataVenda));

                        vendasagrupadas.entrySet().forEach(list_venda -> System.out.printf("Data %s: - Venda: %s\n", ((Entry<LocalDate, List<Venda>>) lista_venda).getKey(), list_venda.getValue()));

                        
                       

                    break;

                    case "5":

                        
                    Venda venda = new Venda ();
                    System.out.println("Digite o nome do produto: "); 
                    venda.setNomeVenda(scanner.nextLine());
                    
                    System.out.println("Digite a quantidade: ");
                    venda.setQuantidadeVenda(scanner.nextInt());

                    System.out.println("Digite o preço: ");
                    venda.setValorUnitVenda(scanner.nextDouble());
                    

                    System.out.println("Digite a data da venda (dd/MM/aaaa): ");
                    venda.setDataVenda(scanner.next());

                    lista_venda.add(venda);               
                
                    

                    System.out.println("Pressione ENTER para continuar ");
                     scanner.nextLine();

                
                    case "0":
                    System.out.println("Saindo do sistema ");
                    break;

                

                }
            } while ( !opcao.equals( "0") );

        }
        
    
    }

    private static void collect(Collector<Venda, ?, Map<String, List<Venda>>> groupingBy) {
    }

    private static List<Produto> extracted(List<Produto> lista_produto) {
        return lista_produto;
    } 

    private static List<Venda> extracted2(List<Venda> lista_venda) {
        return lista_venda;
    } 

    private static void limparTela() {
    }
}

