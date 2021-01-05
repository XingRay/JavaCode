package com.xingray.code.java.expressions;


import com.xingray.code.java.JExpression;

import java.util.ArrayList;
import java.util.List;

public class TwoExpression implements JExpression {

    private com.xingray.code.java.JExpression leftExpression;
    private com.xingray.code.java.JExpression rightExpression;
    private com.xingray.code.java.JOperator operator;

    public com.xingray.code.java.JExpression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(com.xingray.code.java.JExpression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public com.xingray.code.java.JExpression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(com.xingray.code.java.JExpression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public com.xingray.code.java.JOperator getOperator() {
        return operator;
    }

    public void setOperator(com.xingray.code.java.JOperator operator) {
        this.operator = operator;
    }

    @Override
    public List<String> toExpressionCodeLines() {
        List<String> codeLines = new ArrayList<>();

        List<String> leftExpressionCodeLines = leftExpression.toExpressionCodeLines();
        List<String> rightCodeLines = rightExpression.toExpressionCodeLines();
        int leftSize = leftExpressionCodeLines.size();
        int rightSize = rightCodeLines.size();

        int leftLastIndex = leftSize - 1;
        for (int i = 0; i < leftLastIndex; i++) {
            codeLines.add(leftExpressionCodeLines.get(i));
        }
        codeLines.add(leftExpressionCodeLines.get(leftLastIndex) + operator.getCode() + rightCodeLines.get(0));
        for (int i = 1; i < rightSize; i++) {
            codeLines.add(rightCodeLines.get(i));
        }

        return codeLines;
    }
}
