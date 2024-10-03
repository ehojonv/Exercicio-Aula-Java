package Models;

import java.util.List;
import java.util.Objects;

public class Parada {
    private String idParada;
    private String localizacao;
    private List<Estacao> estacaos;

    public void addEstacao(Estacao estacao) {
        estacaos.add(estacao);
    }

    public void removeEstacao(Estacao estacao) {
        estacaos.remove(estacao);
    }

    public Parada() {
    }

    public Parada(String idParada, String localizacao) {
        this.idParada = idParada;
        this.localizacao = localizacao;
    }

    public Parada(String idParada, String localizacao, List<Estacao> estacaos) {
        this.idParada = idParada;
        this.localizacao = localizacao;
        this.estacaos = estacaos;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getIdParada() {
        return idParada;
    }

    public List<Estacao> getEstacaos() {
        return estacaos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parada parada = (Parada) o;
        return Objects.equals(getIdParada(), parada.getIdParada()) && Objects.equals(getLocalizacao(), parada.getLocalizacao()) && Objects.equals(getEstacaos(), parada.getEstacaos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdParada(), getLocalizacao(), getEstacaos());
    }

    @Override
    public String toString() {
        return "Parada{" +
                "idParada='" + idParada + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", estacaos=" + estacaos +
                '}';
    }
}
