package br.ufpb.dcx.tercio.quiz;

import javax.swing.*;
import java.util.List;

public class ProgramaSistemaQuiz {
    public static void main(String[] args) {
        SistemaQuiz sistemaQuiz = new SistemaQuizTercio();
        String opcao = "";
        while (!opcao.startsWith("4")) {
            opcao = JOptionPane.showInputDialog("Digite uma opção\n" +
                    "1. Cadastrar Pergunta\n" +
                    "2. Listar Perguntas\n" +
                    "3. Sortear Pergunta.\n" +
                    "4. Sair");
            if (opcao.startsWith("1")) {
                PerguntaME pergunta = new PerguntaME();
                pergunta.setEnunciado(JOptionPane.showInputDialog("Digite o enunciado"));
                int quantAlternativas = 4;
                String [] alternativas = new String[quantAlternativas];
                for (int i = 0; i < quantAlternativas; i++) {
                    alternativas[i] = JOptionPane.showInputDialog("Digite a alternativa: " + (1+i));
                }
                pergunta.setAlternativas(alternativas);
                pergunta.setRespostaCorreta(JOptionPane.showInputDialog("Qual a resposta correta?"));
                sistemaQuiz.cadastraPergunta(pergunta);
            } else if (opcao.startsWith("2")) {
                JOptionPane.showInputDialog(null, "As perguntas são:");
                List<Pergunta> perguntas = sistemaQuiz.getTodasAsPerguntas();
                for (Pergunta p: perguntas) {
                    JOptionPane.showMessageDialog(null, p.toString());
                }
            } else if (opcao.startsWith("3")) {
                try {
                    Pergunta perguntaEscolhida = sistemaQuiz.sorteiaPergunta();
                    String resposta = JOptionPane.showInputDialog(perguntaEscolhida.toString());
                    if (perguntaEscolhida.estahCorretResposta(resposta)) {
                        JOptionPane.showMessageDialog(null, "Resposta Correta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Resposta Errada");
                    }
                } catch (PerguntaNaoExisteException e) {
                    JOptionPane.showMessageDialog(null,"Não foi possivel sortear");
                    e.printStackTrace();
                }
            } else if (opcao.startsWith("4")) {
                JOptionPane.showMessageDialog(null, "Programa encerrado");
            }

        }
    }
}
