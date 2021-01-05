package com.xingray.code.java.statements;



import com.xingray.code.java.JavaCodeConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * return; or return xxx;
 */
public class ReturnStatement implements com.xingray.code.java.JStatement {

    private com.xingray.code.java.JExpression expression;

    public com.xingray.code.java.JExpression getExpression() {
        return expression;
    }

    public void setExpression(com.xingray.code.java.JExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public List<String> toStatementCodeLines() {
        List<String> codeLines = new ArrayList<>();

        if (expression == null) {
            codeLines.add(JavaCodeConstants.RETURN + ";");
        } else {
            List<String> expressionCodeLines = new ArrayList<>(expression.toExpressionCodeLines());
            String firstCodeLine = JavaCodeConstants.RETURN + " " + expressionCodeLines.get(0);
            expressionCodeLines.set(0, firstCodeLine);

            int lastIndex = expressionCodeLines.size() - 1;
            String lastCodeLine = expressionCodeLines.get(lastIndex) + ";";
            expressionCodeLines.set(lastIndex, lastCodeLine);

            codeLines.addAll(expressionCodeLines);
        }

        return codeLines;
    }
}
