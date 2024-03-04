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
    public Pergunta sorteiaPergunta() throws PerguntaNaoExisteException {
        if (this.perguntalist.size()==0) {
            throw new PerguntaNaoExisteException("Não existe pergunta cadastrada!");
        } else {
            //todo:usar random depois.
            int posicao = (int) (Math.random() * this.perguntalist.size());
            return this.perguntalist.get(posicao);
        }
    }
    @Override
    public List<Pergunta> getTodasAsPerguntas() {
        return this.perguntalist;
    }
}
