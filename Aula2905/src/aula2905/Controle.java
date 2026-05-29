/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.util.ArrayList;

public class Controle {

    ArrayList<Integer> numeros = new ArrayList<>();

    // ADICIONAR
    public void adicionar(int n) {

        numeros.add(n);
    }

    // MAIOR
    public int maior() {

        int maior = numeros.get(0);

        for (int n : numeros) {

            if (n > maior) {

                maior = n;
            }
        }

        return maior;
    }

    // MENOR
    public int menor() {

        int menor = numeros.get(0);

        for (int n : numeros) {

            if (n < menor) {

                menor = n;
            }
        }

        return menor;
    }

    // MÉDIA
    public double media() {

        int soma = 0;

        for (int n : numeros) {

            soma += n;
        }

        return soma / numeros.size();
    }

    // SOMA
    public int somar() {

        int soma = 0;

        for (int n : numeros) {

            soma += n;
        }

        return soma;
    }

    // MULTIPLICAR
    public int multiplicar() {

        int mult = 1;

        for (int n : numeros) {

            mult *= n;
        }

        return mult;
    }
}