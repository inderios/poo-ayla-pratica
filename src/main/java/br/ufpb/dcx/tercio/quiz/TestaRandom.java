package br.ufpb.dcx.tercio.quiz;

import org.example.Main;

public class TestaRandom {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++)  {
            double numeroSorteado = Math.random();
            System.out.println(numeroSorteado);
            int posicao = (int) (numeroSorteado * 10);
            System.out.println(posicao);
        }
    }
}
