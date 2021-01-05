package com.xingray.code.java.statements;

import com.xingray.code.java.JExpression;
import com.xingray.javabase.interfaces.Mapper;
import com.xingray.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * object.method(xxx);
 */
public class VariableInvokeMethodStatement extends com.xingray.code.java.JExpressionStatement {

    private com.xingray.code.java.JVariable variable;
    private com.xingray.code.java.JMethod method;
    private List<JExpression> arguments;

    public com.xingray.code.java.JVariable getVariable() {
        return variable;
    }

    public void setVariable(com.xingray.code.java.JVariable variable) {
        this.variable = variable;
    }

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
        return "VariableInvokeMethodStatement{" +
                "variable=" + variable +
                ", method=" + method +
                ", arguments=" + arguments +
                '}';
    }

    @Override
    public List<String> toExpressionCodeLines() {
        List<String> codeLines = new ArrayList<>();

        String code = variable.getName() + "." + method.getName() + "(" + StringUtil.toString(arguments, ",", new Mapper<com.xingray.code.java.JExpression, String>() {
            @Override
            public String map(com.xingray.code.java.JExpression argument) {
                return StringUtil.toString(argument.toExpressionCodeLines(), "\n");
            }
        }) + ")";

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
