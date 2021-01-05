package com.xingray.code.java.statements;

import com.xingray.code.java.JStatement;
import com.xingray.code.java.JavaCodeConstants;
import com.xingray.code.java.util.Util;
import com.xingray.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * if(xxx){xxx;}
 */
public class IfStatement implements JStatement {

    /**
     * 条件表达式
     */
    private com.xingray.code.java.JExpression conditionalExpression;

    private List<JStatement> statements;

    public com.xingray.code.java.JExpression getConditionalExpression() {
        return conditionalExpression;
    }

    public void setConditionalExpression(com.xingray.code.java.JExpression conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
    }

    public List<JStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<JStatement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "IfStatement{" +
                "conditionalExpression=" + conditionalExpression +
                ", com.xingray.code.java.statements=" + statements +
                '}';
    }

    @Override
    public List<String> toStatementCodeLines() {
        List<String> codeLines = new ArrayList<>();

        codeLines.add(JavaCodeConstants.IF + "(" + StringUtil.toString(conditionalExpression.toExpressionCodeLines(), "\n") + "){");
        codeLines.addAll(Util.toCodeLines(statements));
        codeLines.add("}");

        return codeLines;
    }

    public void addStatement(JStatement statement) {
        if (statements == null) {
            statements = new ArrayList<>();
        }
        statements.add(statement);
    }
}
