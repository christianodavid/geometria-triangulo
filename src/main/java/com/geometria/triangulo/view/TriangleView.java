package com.geometria.triangulo.view;

import java.util.Scanner;

public class TriangleView {
    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\nCALCULADORA DE ÁREA E PERÍMETRO DO TRIÂNGULO");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
        System.out.println("0. Sair");
        System.out.print("Digite uma opção: ");
        return scanner.nextInt();
    }

    public double getBaseInput() {
        System.out.print("Digite o tamanho da base do triângulo (em cm): ");
        return scanner.nextDouble();
    }

    public double getHeightInput() {
        System.out.print("Digite o tamanho da altura do triângulo (em cm): ");
        return scanner.nextDouble();
    }

    public double getSideAInput() {
        System.out.print("Digite o tamanho do lado A do triângulo (em cm): ");
        return scanner.nextDouble();
    }

    public double getSideBInput() {
        System.out.print("Digite o tamanho do lado B do triângulo (em cm): ");
        return scanner.nextDouble();
    }

    public double getSideCInput() {
        System.out.print("Digite o tamanho do lado C do triângulo (em cm): ");
        return scanner.nextDouble();
    }

    public void showResult(String operation, double result) {
        System.out.printf(operation.equals("Área")
                ? "\n%s = %.2f cm²\n"
                : "\n%s = %.2f cm\n", operation, result);
    }

    public void showError(String message) {
        System.out.println("\nErro: " + message);
    }
}
