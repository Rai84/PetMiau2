package controller;

import model.Pet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pets extends ConectarDao {
    private PreparedStatement ps;

    public Pets() {
        super();
    }

    public void incluirPet(Pet obj) {
        String sql = "INSERT INTO Pet (Nome, Idade, Porte, Pedigree) VALUES (?, ?, ?, ?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setInt(2, obj.getIdade());
            ps.setString(3, obj.getPorte());
            ps.setInt(4, obj.getPedigree());
            
            ps.execute();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Registro de Pet Incluído com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir registro de Pet!" + err.getMessage());
        }
    }

    public void incluir(Pet pet) {
        incluirPet(pet);
    }
}
