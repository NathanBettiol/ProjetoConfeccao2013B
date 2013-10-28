package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Fabricante;
import br.senai.sc.model.persistencia.FabricanteDaoJDBC;
import br.senai.sc.persistencia.dao.FabricanteDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class TesteConexaoFabricante {
    public static void main(String[] args) {
        String opc;
        do {

            opc = JOptionPane.showInputDialog("Fabricante\n1- Insert\n2- Delete\n3- Update\n4- List\n5- List by ID\n6- Sair");

            switch (opc) {
                case "1":
                    /* Teste Inserção da Classe Fabricante */
                    Fabricante fab = new Fabricante();

                    fab.setCod(1);
                    fab.setNmFantasia(JOptionPane.showInputDialog("Nome Fantasia: "));
                    fab.setCnpj(JOptionPane.showInputDialog("CNPJ: "));
                    fab.setTelefone(JOptionPane.showInputDialog("Telefone: "));
                    fab.setEmail(JOptionPane.showInputDialog("E-mail: "));
                    fab.setEndereco(JOptionPane.showInputDialog("Endereço: "));
                    FabricanteDAO dao = new FabricanteDaoJDBC() {
                    };
                    dao.insert(fab);

                    break;

                case "2":
                    /* Teste Deleção da Classe Fabricante */
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                    FabricanteDAO daodel = new FabricanteDaoJDBC() {
                    };
                    daodel.delete(id);
                    break;

                case "3":
                    /* Teste Alteração da Classe Fabricante */
                    Fabricante fabUp = new Fabricante();

                    fabUp.setCod(Integer.parseInt(JOptionPane.showInputDialog("Codigo do registro que sera modificado: ")));
                    fabUp.setNmFantasia(JOptionPane.showInputDialog("Nome Fantasia: "));
                    fabUp.setCnpj(JOptionPane.showInputDialog("CNPJ: "));
                    fabUp.setTelefone(JOptionPane.showInputDialog("Telefone: "));
                    fabUp.setEmail(JOptionPane.showInputDialog("E-mail: "));
                    fabUp.setEndereco(JOptionPane.showInputDialog("Endereço: "));
                    FabricanteDAO daoup = new FabricanteDaoJDBC() {
                    };
                    daoup.update(fabUp);
                    break;

                case "4":
                    /* Teste Listagem da Classe Fabricante */
                    FabricanteDAO daolist = new FabricanteDaoJDBC();
                    List<Fabricante> fabricante = daolist.listAll();
                    
                    for (Fabricante Fab : fabricante) {
                        System.out.println("\nCod: " + Fab.getCod()+
                                          "\nNome Fantasia: " + Fab.getNmFantasia()
                                         + "\nCNPJ: " + Fab.getCnpj()
                                         + "\nTelefone: "  + Fab.getTelefone()
                                         + "\nE-mail: " + Fab.getEmail()
                                         + "\nEndereço: " + Fab.getEndereco());

                    }
                    break;
                    
                case "5":
                    int idList = Integer.parseInt(JOptionPane.showInputDialog("ID do registro: "));
                    
                    FabricanteDAO daoListId = new FabricanteDaoJDBC() {
                    };
                    
                    break;
                case "6": break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor Inválido!");

            }

        } while ("".equals(opc) || !"6".equals(opc));

    }
} 
