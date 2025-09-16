package atividade;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter //Colocar antes da classe para fazer para tudo
@Setter


public abstract class Midia{
    private long id;
    private String titulo;
    private int anoLancamento;
    private String classificacaoIndicativa;
    private LocalDate dataAquisicao;
    private String observacoes;




    





    public abstract String getInformacoes();
}