package com.java.gurpreet.aws.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaReqHandler implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String value, Context context) {
        context.getLogger().log("Value entered : " + value);
        return "Application of AWS Lambda - " + value;
    }
}
