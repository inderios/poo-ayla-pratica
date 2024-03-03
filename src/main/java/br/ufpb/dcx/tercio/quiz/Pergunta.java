package br.ufpb.dcx.tercio.quiz;

public abstract class Pergunta {
    private String enunciado, respostaCorreta;

    public Pergunta(String enunciado, String respostaCorreta) {
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
    }

    public Pergunta() {
        this("", "");
    }
    public abstract boolean estahCorretResposta(String resposta);

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}
