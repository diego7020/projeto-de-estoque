package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
    
    protected ArrayList<TDominio> tabela;
    protected ArrayList<TDominio> tabelaSubClasse;
    protected ArrayList<TDominio> tabelaProduto;
        
    public ArrayList<TDominio> getTabela(){
        return this.tabela;
    }

    public ArrayList<TDominio> getTabelaSubClasse(){
        return this.tabelaSubClasse;
    }

    public ArrayList<TDominio> getTabelaProduto(){
        return this.tabelaProduto;
    }
        
    public abstract void preencherDados();

    public BaseFakeDB(){
        this.preencherDados();
    }

}
