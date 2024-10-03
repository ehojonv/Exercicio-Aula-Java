package Models;

import java.util.Objects;

public class Vagao {
    private String idVagao;
    private CATEGORIAS_VAGAO tipoVagao;
    private double capacidadeMax;

    public Vagao() {
    }

    public Vagao(String idVagao, CATEGORIAS_VAGAO tipoVagao, double capacidadeMax) {
        this.idVagao = idVagao;
        this.tipoVagao = tipoVagao;
        this.capacidadeMax = capacidadeMax;
    }

    public String getIdVagao() {
        return idVagao;
    }

    public CATEGORIAS_VAGAO getTipoVagao() {
        return tipoVagao;
    }

    public void setTipoVagao(CATEGORIAS_VAGAO tipoVagao) {
        this.tipoVagao = tipoVagao;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vagao vagao = (Vagao) o;
        return getIdVagao() == vagao.getIdVagao() && Double.compare(getCapacidadeMax(), vagao.getCapacidadeMax()) == 0 && getTipoVagao() == vagao.getTipoVagao();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVagao(), getTipoVagao(), getCapacidadeMax());
    }

    @Override
    public String toString() {
        return "Vagao{" +
                "idVagao=" + idVagao +
                ", tipoVagao=" + tipoVagao +
                ", capacidadeMax=" + capacidadeMax +
                '}';
    }
}
