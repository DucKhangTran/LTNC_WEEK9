package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class); // gán logger cho class

    public int add(int a, int b) {
        logger.info("Adding {} and {}", a, b);
        return a + b;
    }

    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divided by 0");
        }
        return a / b;
    }
}
