package com.xingray.code.java.statements;


import com.xingray.code.java.JExpression;
import com.xingray.code.java.util.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * method(xxx);
 */
public class StaticInvokeMethodStatement extends com.xingray.code.java.JExpressionStatement {

    private com.xingray.code.java.JMethod method;
    private List<JExpression> arguments;

    public com.xingray.code.java.JMethod getMethod() {
        return method;
    }

    public void setMethod(com.xingray.code.java.JMethod method) {
        this.method = method;
    }

    public List<JExpression> getArguments() {
        return arguments;
    }

    public void setArguments(List<JExpression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "StaticInvokeMethodStatement{" +
                "method=" + method +
                ", arguments=" + arguments +
                '}';
    }

    @Override
    public List<String> toExpressionCodeLines() {
        List<String> codeLines = new ArrayList<>();
        String code = method.getName() + "(" + Util.toCodeString(arguments) + ")";
        codeLines.add(code);
        return codeLines;
    }

    public void addArgument(com.xingray.code.java.JExpression argument) {
        if (arguments == null) {
            arguments = new ArrayList<>();
        }
        arguments.add(argument);
    }
}
