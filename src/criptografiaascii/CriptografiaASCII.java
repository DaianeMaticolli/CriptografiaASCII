package criptografiaascii;

import javax.swing.JOptionPane;

public class CriptografiaASCII {
    public static void main(String[] args) {
        // Solicita ao usuário uma mensagem para criptografar
        String mensagem = JOptionPane.showInputDialog("Digite uma mensagem para criptografar:");

        // Verifica se a entrada é válida
        if (mensagem == null || mensagem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma mensagem inserida. Encerrando o programa.");
            return;
        }

        // Converte a string para um vetor de caracteres
        char[] caracteres = mensagem.toCharArray();
        int[] asciiValores = new int[caracteres.length];
        int[] asciiCriptografados = new int[caracteres.length];
        char[] mensagemCriptografada = new char[caracteres.length];

        // Exibição dos caracteres individuais
        StringBuilder caracteresSeparados = new StringBuilder("Caracteres separados:\n");
        StringBuilder valoresAsciiOriginais = new StringBuilder("Valores ASCII originais:\n");
        StringBuilder valoresAsciiCriptografados = new StringBuilder("Valores ASCII após criptografia (+10):\n");

        // Processamento da criptografia
        for (int i = 0; i < caracteres.length; i++) {
            asciiValores[i] = (int) caracteres[i]; // Converte para ASCII
            asciiCriptografados[i] = asciiValores[i] + 10; // Soma 10 unidades
            mensagemCriptografada[i] = (char) asciiCriptografados[i]; // Converte de volta para char

            // Construção das strings informativas
            caracteresSeparados.append(caracteres[i]).append(" ");
            valoresAsciiOriginais.append(asciiValores[i]).append(" ");
            valoresAsciiCriptografados.append(asciiCriptografados[i]).append(" ");
        }

        // Mensagem final criptografada
        String mensagemFinal = new String(mensagemCriptografada);

        // Exibição das etapas do processo
        JOptionPane.showMessageDialog(null, caracteresSeparados.toString());
        JOptionPane.showMessageDialog(null, valoresAsciiOriginais.toString());
        JOptionPane.showMessageDialog(null, valoresAsciiCriptografados.toString());
        JOptionPane.showMessageDialog(null, "Mensagem criptografada final: " + mensagemFinal);
    }
}


