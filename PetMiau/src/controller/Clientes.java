package controller;

import model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Clientes extends ConectarDao {
    private PreparedStatement ps;// objeto de preparação do comando SQL
    public Clientes() {
        super(); // Executa construtor da classe mãe
    }
    

public void incluir(Cliente obj) {
    // Cria o comando SQL com 5 parâmetros (?, ?, ?, ?, ?)
    String sql = "INSERT INTO Cliente (Telefone, CPF, Nome, Endereco, Email) VALUES (?, ?, ?, ?, ?)";
    
    try {
        // Envia o SQL para dentro da conexão
        ps = mycon.prepareStatement(sql);
        
        // Configura a posição de cada parâmetro começando pelo primeiro
        ps.setString(1, obj.getTelefone());
        ps.setString(2, obj.getCPF());
        ps.setString(3, obj.getNome());
        ps.setString(4, obj.getEndereco());
        ps.setString(5, obj.getEmail());
        
        ps.execute(); // Finalmente executa o comando sql dentro de ps
        ps.close(); // finaliza o comando de execução do sql
        
        JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso!");
    } catch (SQLException err) {
        JOptionPane.showMessageDialog(null, "Erro ao incluir usuário!" + err.getMessage());
    }
}}