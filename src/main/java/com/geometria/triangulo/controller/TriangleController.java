package com.geometria.triangulo.controller;

import com.geometria.triangulo.model.Triangle;
import com.geometria.triangulo.view.TriangleView;

public class TriangleController {
    private final TriangleView view;

    public TriangleController(TriangleView view) {
        this.view = view;
    }

    public void run() {
        int choice;

        do{
            choice = view.showMenu();

            if (choice != 0) {
                double sideA, sideB, sideC, base, height;
                Triangle triangle;

                switch (choice) {
                    case 1:
                        base = view.getBaseInput();
                        height = view.getHeightInput();
                        triangle = new Triangle(base, height);
                        view.showResult("Área", triangle.calculateArea());
                        break;
                    case 2:
                        sideA = view.getSideAInput();
                        sideB = view.getSideBInput();
                        sideC = view.getSideCInput();
                        triangle = new Triangle(sideA, sideB, sideC);
                        view.showResult("Perímetro", triangle.calculatePerimeter());
                        break;
                    default:
                        view.showError("Opção inválida. Tente novamente!");
                }
            }
        } while (choice != 0);
    }
}
