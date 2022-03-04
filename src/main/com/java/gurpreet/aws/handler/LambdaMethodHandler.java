package com.java.gurpreet.aws.handler;

import com.amazonaws.services.lambda.runtime.Context;

public class LambdaMethodHandler {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Application of AWS Lambda Method - " + input;
    }
}
