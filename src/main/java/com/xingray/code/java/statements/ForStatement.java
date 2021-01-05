package com.xingray.code.java.statements;

import com.xingray.code.java.JExpression;
import com.xingray.code.java.JStatement;
import com.xingray.code.java.JavaCodeConstants;
import com.xingray.code.java.util.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * for(xx; xx; xx){ xxx; }
 */
public class ForStatement implements JStatement {

    private JExpression initExpression;
    private JExpression conditionExpression;
    private JExpression endExpression;
    private List<JStatement> statements;

    public JExpression getInitExpression() {
        return initExpression;
    }

    public void setInitExpression(JExpression initExpression) {
        this.initExpression = initExpression;
    }

    public JExpression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(JExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public JExpression getEndExpression() {
        return endExpression;
    }

    public void setEndExpression(JExpression endExpression) {
        this.endExpression = endExpression;
    }

    public List<JStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<JStatement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "ForStatement{" +
                "initExpression=" + initExpression +
                ", conditionExpression=" + conditionExpression +
                ", endExpression=" + endExpression +
                ", com.xingray.code.java.statements=" + statements +
                '}';
    }

    @Override
    public List<String> toStatementCodeLines() {
        List<String> codeLines = new ArrayList<>();

        String codeLine = JavaCodeConstants.FOR + "(){";
        codeLines.add(codeLine);
        codeLines.addAll(Util.toCodeLines(statements));
        codeLines.add("}");

        return codeLines;
    }
}
