package br.ufpb.dcx.tercio.quiz;

import java.util.LinkedList;
import java.util.List;
public class SistemaQuizTercio implements SistemaQuiz{
    private List<Pergunta> perguntalist;
    public SistemaQuizTercio(List<Pergunta> perguntalist) {
        this.perguntalist = perguntalist;
    }
    public SistemaQuizTercio() {
        this.perguntalist = new LinkedList<>();
    }
    @Override
    public void cadastraPergunta(Pergunta p) {
        this.perguntalist.add(p);
    }
    @Override
    public Pergunta sorteiaPergunta() {
        if (this.perguntalist.size()==0) {
            return null;
        } else {
            //todo:usar random depois.
            return this.perguntalist.get(0);
        }
    }
    @Override
    public List<Pergunta> getTodasAsPerguntas() {
        return this.perguntalist;
    }
}
