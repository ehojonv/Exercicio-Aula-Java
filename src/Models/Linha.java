package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Linha {
    private String idLinha;
    private String nome;
    private List<Estacao> estacoes = new ArrayList<>();

    public Linha() {
    }

    public Linha(String idLinha, String nome) {
        this.idLinha = idLinha;
        this.nome = nome;
    }

    public Linha(String idLinha, String nome, List<Estacao> estacoes) {
        this.idLinha = idLinha;
        this.nome = nome;
        this.estacoes = estacoes;
    }

    public String getIdLinha() {
        return idLinha;
    }

    public List<Estacao> getEstacoes() {
        return estacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linha linha = (Linha) o;
        return Objects.equals(getIdLinha(), linha.getIdLinha()) && Objects.equals(getNome(), linha.getNome()) && Objects.equals(getEstacoes(), linha.getEstacoes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdLinha(), getNome(), getEstacoes());
    }

    @Override
    public String toString() {
        return "Linha{" +
                "idLinha='" + idLinha + '\'' +
                ", nome='" + nome + '\'' +
                ", estacoes=" + estacoes +
                '}';
    }
}
