package javann;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[][] rand = LinearAlgebra.createRandomDoubleArray(2, 2);
        System.out.println(Arrays.toString(rand));
    }
}
