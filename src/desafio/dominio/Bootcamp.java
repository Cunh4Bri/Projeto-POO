package desafio.dominio;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Conteudo> conteudos = new HashSet<>();
    private Set<Dev> devInscritos = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devInscritos, bootcamp.devInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFim, conteudos, devInscritos);
    }

    public String getNome() {
        return nome;


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }
}
