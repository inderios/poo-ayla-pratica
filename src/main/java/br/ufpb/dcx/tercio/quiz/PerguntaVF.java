package br.ufpb.dcx.tercio.quiz;

public class PerguntaVF extends Pergunta{
    private String afirmativa;

    public PerguntaVF(String enunciado,  String afirmativa, String respostaCorreta) {
        super(enunciado, respostaCorreta);
        this.afirmativa = afirmativa;
    }
    public PerguntaVF() {
        super("","");
        afirmativa = "";
    }
    @Override
    public boolean estahCorretResposta(String resposta) {
        return super.getRespostaCorreta().startsWith(afirmativa);
    }

    public String getAfirmativa() {
        return afirmativa;
    }

    public void setAfirmativa(String afirmativa) {
        this.afirmativa = afirmativa;
    }
}
