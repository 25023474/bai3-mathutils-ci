package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger logger =
            LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        logger.info("Finding max between {} and {}", a, b);

        if (a >= b) {
            return a;
        }
        return b;
    }

    public static int divide(int a, int b) {
        logger.info("Dividing {} by {}", a, b);

        if (b == 0) {
            logger.error("Divider must not be zero");
            throw new IllegalArgumentException("Divider must not be zero");
        }

        return a / b;
    }
}