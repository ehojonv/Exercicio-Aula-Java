package Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Operacao {
    private String idOperacao;
    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFinal;
    private Veiculo veiculo;
    private List<Parada> paradas = new ArrayList<>();
    
    public void addParada(Parada parada) {
        paradas.add(parada);
    }

    public void removeParada(Parada parada) {
        paradas.remove(parada);
    }

    public Operacao() {
    }

    public Operacao(String idOperacao, String nome, LocalDateTime dataInicio, LocalDateTime dataFinal, Veiculo veiculo) {
        this.idOperacao = idOperacao;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.veiculo = veiculo;
    }

    public Operacao(String idOperacao, String nome, LocalDateTime dataInicio, LocalDateTime dataFinal, List<Parada> paradas, Veiculo veiculo) {
        this.idOperacao = idOperacao;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.paradas = paradas;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getIdOperacao() {
        return idOperacao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operacao operacao = (Operacao) o;
        return Objects.equals(getIdOperacao(), operacao.getIdOperacao()) && Objects.equals(getNome(), operacao.getNome()) && Objects.equals(getDataInicio(), operacao.getDataInicio()) && Objects.equals(getDataFinal(), operacao.getDataFinal()) && Objects.equals(getVeiculo(), operacao.getVeiculo()) && Objects.equals(getParadas(), operacao.getParadas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdOperacao(), getNome(), getDataInicio(), getDataFinal(), getVeiculo(), getParadas());
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "idOperacao='" + idOperacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinal=" + dataFinal +
                ", veiculo=" + veiculo +
                ", paradas=" + paradas +
                '}';
    }
}
