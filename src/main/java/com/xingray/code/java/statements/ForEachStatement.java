package com.xingray.code.java.statements;


import com.xingray.code.java.JStatement;
import com.xingray.code.java.JavaCodeConstants;
import com.xingray.code.java.util.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * for(xx; xx; xx){ xxx; }
 */
public class ForEachStatement implements JStatement {

    private com.xingray.code.java.JVariable element;
    private com.xingray.code.java.JVariable list;
    private List<JStatement> statements;

    public com.xingray.code.java.JVariable getElement() {
        return element;
    }

    public void setElement(com.xingray.code.java.JVariable element) {
        this.element = element;
    }

    public com.xingray.code.java.JVariable getList() {
        return list;
    }

    public void setList(com.xingray.code.java.JVariable list) {
        this.list = list;
    }

    public List<JStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<JStatement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "ForEachStatement{" +
                "element=" + element +
                ", list=" + list +
                ", com.xingray.code.java.statements=" + statements +
                '}';
    }

    @Override
    public List<String> toStatementCodeLines() {
        List<String> codeLines = new ArrayList<>();

        String codeLine = JavaCodeConstants.FOR + "(" + element.getType().getName() + " " + element.getName() + ":" + list.getName() + "){";
        codeLines.add(codeLine);
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
