package com.xingray.code.java.statements;

import com.xingray.code.java.JExpression;
import com.xingray.javabase.interfaces.Mapper;
import com.xingray.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Abc abc = method(args);
 */
public class NewVariableAndGivenByMethodStatement implements com.xingray.code.java.JStatement {

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
        return "ConstructorVariableStatement{" +
                "method=" + method +
                '}';
    }

    @Override
    public List<String> toStatementCodeLines() {
        List<String> codeLines = new ArrayList<>();

        String code = "";
        com.xingray.code.java.JVariable variable = getVariable();
        code += variable.getType().getName() + " " + variable.getName() + " = " + getMethod().getName() + "(" + StringUtil.toString(arguments, ", ", new Mapper<com.xingray.code.java.JExpression, String>() {
            @Override
            public String map(com.xingray.code.java.JExpression expression) {
                return StringUtil.toString(expression.toExpressionCodeLines(), "\n");
            }
        }) + ");";
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
