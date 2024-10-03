package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estacao {
    private String idEstacao;
    private String nome;
    private List<Linha> linhas = new ArrayList<>();

    public Estacao() {
    }

    public Estacao(String idEstacao, String nome) {
        this.idEstacao = idEstacao;
        this.nome = nome;
    }

    public Estacao(String idEstacao, String nome, List<Linha> linhas) {
        this.idEstacao = idEstacao;
        this.nome = nome;
        this.linhas = linhas;
    }

    public String getIdEstacao() {
        return idEstacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Linha> getLinhas() {
        return linhas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estacao estacao = (Estacao) o;
        return Objects.equals(getIdEstacao(), estacao.getIdEstacao()) && Objects.equals(getNome(), estacao.getNome()) && Objects.equals(getLinhas(), estacao.getLinhas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEstacao(), getNome(), getLinhas());
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "idEstacao='" + idEstacao + '\'' +
                ", nome='" + nome + '\'' +
                ", linhas=" + linhas +
                '}';
    }
}
