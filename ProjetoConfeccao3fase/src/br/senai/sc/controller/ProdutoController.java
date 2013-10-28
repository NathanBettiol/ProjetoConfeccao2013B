package br.senai.sc.controller;

import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.ProdutoDaoJDBC;
import br.senai.sc.persistencia.dao.ProdutoDAO;
import java.util.List;

public class ProdutoController {

    public List<Produto> listAll() {
        ProdutoDAO dao = new ProdutoDaoJDBC();
        return dao.listAll();
    }

    public boolean insert (Produto cp){
        ProdutoDAO dao = new ProdutoDaoJDBC();
        return dao.insert(cp);
    }
    
    public boolean update (Produto cp){
        ProdutoDAO dao = new ProdutoDaoJDBC();
        return dao.update(cp);
    }
    
     public boolean delete (int codProduto){
        ProdutoDAO dao = new ProdutoDaoJDBC();
        return dao.delete(codProduto);
    }
}
