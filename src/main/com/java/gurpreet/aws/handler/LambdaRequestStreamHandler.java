package com.java.gurpreet.aws.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import io.micrometer.core.instrument.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class LambdaRequestStreamHandler implements RequestStreamHandler {
    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String input = IOUtils.toString(inputStream, Charset.forName("UTF-8"));
        outputStream.write(("Lambda app from request stream handler - " + input).getBytes());
    }
}
