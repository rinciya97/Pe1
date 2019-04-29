package com.stackroute.pe1;

class NthIterationLoop {

    public static int nthIterationLoopMethod(int input) {

        for (int i = 1; i <= input; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
        }
        return 0;
    }
}