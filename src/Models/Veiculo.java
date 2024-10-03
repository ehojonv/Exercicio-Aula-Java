package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Veiculo {
    private String idVeiculo;
    private String nome;
    private List<Vagao> vagoes = new ArrayList<>();

    public void addVagao(Vagao vagao) {
        vagoes.add(vagao);
    }

    public void removeVagao(Vagao vagao) {
        vagoes.remove(vagao);
    }

    public void locomover() {
        System.out.println("Saindo da estação! Até a próxima Robesvaldo Sasafrao");
    }

    public Veiculo() {
    }

    public Veiculo(String idVeiculo, String nome) {
        this.idVeiculo = idVeiculo;
        this.nome = nome;
    }

    public Veiculo(String idVeiculo, String nome, List<Vagao> vagoes) {
        this.idVeiculo = idVeiculo;
        this.nome = nome;
        this.vagoes = vagoes;
    }

    public String getIdVeiculo() {
        return idVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vagao> getVagoes() {
        return vagoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return getIdVeiculo() == veiculo.getIdVeiculo() && Objects.equals(getNome(), veiculo.getNome()) && Objects.equals(vagoes, veiculo.vagoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVeiculo(), getNome(), vagoes);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "idVeiculo=" + idVeiculo +
                ", nome='" + nome + '\'' +
                ", vagoes=" + vagoes +
                '}';
    }
}
