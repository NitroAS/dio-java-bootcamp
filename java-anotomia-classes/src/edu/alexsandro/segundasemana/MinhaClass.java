package edu.alexsandro.segundasemana;

public class MinhaClass {

    // Praticamento um OnInit
    public static void main(String[] args) {
        // Valor pode ser alterado
        int ano = 2022;
        ano = 2023;

        // Variavel com letra maiuscula não pode mudada ou com final = const
        String BR = "Brazil";
        final String BRS = "Brasil";


        String primerioNome = "Alexsandro";
        String segundaNome = "Silva";
        System.out.println(nomeCompleto(primerioNome, segundaNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
