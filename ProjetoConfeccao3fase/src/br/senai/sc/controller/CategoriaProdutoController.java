package br.senai.sc.controller;

import br.senai.sc.model.negocio.CategoriaProduto;
import br.senai.sc.model.persistencia.CategoriaProdutoDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaProdutoDAO;
import java.util.List;

public class CategoriaProdutoController {

    public List<CategoriaProduto> listAll() {
        CategoriaProdutoDAO dao = new CategoriaProdutoDaoJDBC();
        return dao.listAll();
    }

    public boolean insert (CategoriaProduto cp){
        CategoriaProdutoDAO dao = new CategoriaProdutoDaoJDBC();
        return dao.insert(cp);
    }
    
    public boolean update (CategoriaProduto cp){
        CategoriaProdutoDAO dao = new CategoriaProdutoDaoJDBC();
        return dao.update(cp);
    }
    
     public boolean delete (int codCategoriaProduto){
        CategoriaProdutoDAO dao = new CategoriaProdutoDaoJDBC();
        return dao.delete(codCategoriaProduto);
    }
}
