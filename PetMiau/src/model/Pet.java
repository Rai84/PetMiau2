package model;

public class Pet {
    private String nome;
    private int idade;
    private String porte;
    private int pedigree;

    public Pet(String nome, int idade, String porte, int pedigree) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.pedigree = pedigree;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getPedigree() {
        return pedigree;
    }

    public void setPedigree(int pedigree) {
        this.pedigree = pedigree;
    }
}
