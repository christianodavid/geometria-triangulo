package com.geometria.triangulo;

import com.geometria.triangulo.controller.TriangleController;
import com.geometria.triangulo.view.TriangleView;

public class Main {
    public static void main(String[] args) {
        TriangleView view = new TriangleView();
        TriangleController controller = new TriangleController(view);
        controller.run();
    }
}
