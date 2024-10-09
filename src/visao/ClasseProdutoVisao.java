package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;

import repositorio.ClasseProdutoRepo;

public class ClasseProdutoVisao {
    public void Exibir(){
        ClasseProdutoRepo repo = new ClasseProdutoRepo();
        ArrayList<ClasseProduto> lista = repo.Browse();
            for (ClasseProduto cp : lista) {
            this.imprimir(cp);            
            }
        }
        

    private void imprimir(ClasseProduto alvo){
        System.out.println("Classe de Produto: ");
        System.out.println("Codigo: "+ alvo.getCodigo());
        System.out.println("Descrição: "+ alvo.getDescricao());
        System.out.println("Data de inclusão: "+ alvo.getDataDeInclusao());
    }

}
