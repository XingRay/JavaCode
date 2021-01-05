package com.xingray.code.java.expressions;


import com.xingray.code.java.JExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * 变量表达式
 */
public class VariableExpression implements JExpression {

    private com.xingray.code.java.JVariable variable;

    public com.xingray.code.java.JVariable getVariable() {
        return variable;
    }

    public void setVariable(com.xingray.code.java.JVariable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "VariableExpression{" +
                "variable=" + variable +
                '}';
    }

    @Override
    public List<String> toExpressionCodeLines() {
        List<String> codeLines = new ArrayList<>();

        codeLines.add(variable.getName());

        return codeLines;
    }
}
