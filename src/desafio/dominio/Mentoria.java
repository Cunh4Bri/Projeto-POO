package desafio.dominio;

import java.time.LocalDate;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Mentoria extends Conteudo {

    public Mentoria() {
    }

    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                "data=" + data +
                '}';
    }
}
