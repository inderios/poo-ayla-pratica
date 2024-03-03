package br.ufpb.dcx.tercio.quiz;

public class PerguntaDissertativa extends Pergunta{
    public PerguntaDissertativa() {
        super("","");
    }

    public PerguntaDissertativa(String enunciado, String respostaCorreta) {
        super(enunciado, respostaCorreta);
    }

    @Override
    public boolean estahCorretResposta(String resposta) {
        return super.getRespostaCorreta().equalsIgnoreCase(resposta);
    }
}
