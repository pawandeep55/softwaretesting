/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.Triangle;

/**
 *
 * @author anonymous
 */
public class Triangle {

    private int a, b, c;
    boolean c1 = a < b + c;
    boolean c2 = b < a + c;
    boolean c3 = c < a + b;
    boolean c4 = a == b;
    boolean c5 = b == c;
    boolean c6 = a == c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isScalene() {
        return (c1 && c2 && c3 && (a != b) && (b != c) && (a != c));
    }

    boolean isEquilateral() {
        return (c1 && c2 && c3 && (a == b) && (b == c));
    }

    boolean isIsosceles() {
        return (c1 && c2 && c3 && ((a == b) || (b == c) || (a == c)));
    }

    boolean isTriangle() {
        return (c1 && c2 && c3);
    }

    boolean isNominal(int x) {
        return (x >= 3 && x <= 198);
    }

    boolean isNominal() {
        return isNominal(a) && isNominal(b) && isNominal(c);
    }

    //single fault assumptioin
    boolean isMax() {
        return (a == 200 && isNominal(b) && isNominal(c)
                || isNominal(a) && b == 200 && isNominal(c)
                || isNominal(a) && isNominal(b) && c == 200);
    }
    boolean isMaxMinus1() {
        return (a == 199 && isNominal(b) && isNominal(c)
                || isNominal(a) && b == 199 && isNominal(c)
                || isNominal(a) && isNominal(b) && c == 199);
    }
    boolean isMin() {
        return (a == 1 && isNominal(b) && isNominal(c)
                || isNominal(a) && b == 1 && isNominal(c)
                || isNominal(a) && isNominal(b) && c == 1);
    }
    boolean isMinPlus1() {
        return (a == 2 && isNominal(b) && isNominal(c)
                || isNominal(a) && b == 2 && isNominal(c)
                || isNominal(a) && isNominal(b) && c == 2);
    }
    boolean isInBoundary(){
        return (isMax() || isMaxMinus1() || isNominal() || isMinPlus1() || isMin() );
    }
    boolean isImpossible(){
        return !isTriangle();
    }
    
}
