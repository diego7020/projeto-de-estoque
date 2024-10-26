package visao;

public class MenuGeral extends BaseMenu {

    @Override
    public void ExibirMenu() {
        int opcao = 0;

        while (opcao != 9) {
            Util.LimparConsole();
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Produto");
            System.out.println("2 - Classe Produto");
            System.out.println("3 - SubClasse Produto");
            System.out.println("4 - Funcionario");
            System.out.println("5 - ...");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção: ");
            opcao = this.scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
            
                case 2:
                    this.Localizar();
                    break;
                    
                case 3:
                    this.Adicionar();
                    break;
                
                case 4:
                    this.Atualizar();
                    break;
                    
                case 5:
                    this.Remover();
                    break;
                
                case 9:
                    System.out.println("Saindo...");
                    break;
                
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    @Override
    public void Listar() {
    
    }

    @Override
    public void Localizar() {
        
    }

    @Override
    public void Adicionar() {
        
    }

    @Override
    public void Atualizar() {
        
    }

    @Override
    public void Remover() {
        
    }
    
}
