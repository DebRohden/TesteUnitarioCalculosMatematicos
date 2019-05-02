/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import Objeto.Numero;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author debor
 */
public class Calculo {

    public double media(List<Numero> listaNumeros) {
        
        int tot      = listaNumeros.size();
        double media = 0;
        
        for (int i = 0; i < tot; i++) {
            media += listaNumeros.get(i).getNum();
        }
        media = media / tot;
        return media;
    }

    public double moda(List<Numero> listaNumeros) {
        
        int numeroVezesModa = 0;
        double numModa      = 0;
        int tot             = listaNumeros.size();   
        int numeroVezesAtual;

        for (int i = 0; i < tot; i++) {
            numeroVezesAtual = 0;
            for (int j = i + 1; j < tot; j++) {
                if (listaNumeros.get(i).getNum() == listaNumeros.get(j).getNum()) {
                    numeroVezesAtual++;
                }
            }

            if (numeroVezesAtual > numeroVezesModa) {
                numeroVezesModa = numeroVezesAtual;
                numModa         = listaNumeros.get(i).getNum();         
            }
        }
        return numModa;
    }

    public double mediana(List<Numero> listaNumeros) {

        listaNumeros.sort(Comparator.comparingDouble(Numero::getNum));

        int tot = listaNumeros.size();
        int meio;
        double mediana;

        meio = tot / 2;

        if (tot % 2 != 0) {
            mediana = listaNumeros.get(meio).getNum();
        } else {
            mediana = (listaNumeros.get(meio - 1).getNum() + listaNumeros.get(meio).getNum()) / 2;
        }
        return mediana;
    }

    public double variancia(List<Numero> listaNumeros) {

        NumberFormat nf  = new DecimalFormat("0.##");
        double mediaArit = media(listaNumeros);
        int tot          = listaNumeros.size();
        double variancia = 0;
        double v;

        for (int i = 0; i < tot; i++) {
            double result = listaNumeros.get(i).getNum() - mediaArit;
            variancia += Math.pow(result, 2);
        }
        int n = tot - 1;

        v = variancia / n;
        String formatado = (nf.format(v)).replaceAll(",", ".");
        
        return Double.parseDouble(formatado);
    }

    public double desvioPadrao(List<Numero> listaNumeros) {

        NumberFormat nf  = new DecimalFormat("0.##");
        String formatado = (nf.format(Math.sqrt(variancia(listaNumeros)))).replaceAll(",", ".");
        
        return Double.parseDouble(formatado);
    }

}
