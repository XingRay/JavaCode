package com.xingray.code.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JMethod {

    private JAccessible accessible;
    private boolean isStatic;
    private boolean isAbstract;
    private boolean isFinal;
    private JType returnType;
    private String name;
    private List<com.xingray.code.java.JVariable> params;
    private List<JStatement> statements;

    public JAccessible getAccessible() {
        return accessible;
    }

    public void setAccessible(JAccessible accessible) {
        this.accessible = accessible;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public JType getReturnType() {
        return returnType;
    }

    public void setReturnType(JType returnType) {
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.xingray.code.java.JVariable> getParams() {
        return params;
    }

    public void setParams(List<com.xingray.code.java.JVariable> params) {
        this.params = params;
    }

    public List<JStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<JStatement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JMethod{" +
                "accessible=" + accessible +
                ", isStatic=" + isStatic +
                ", isAbstract=" + isAbstract +
                ", isFinal=" + isFinal +
                ", returnType=" + returnType +
                ", name='" + name + '\'' +
                ", params=" + params +
                ", com.xingray.code.java.statements=" + statements +
                '}';
    }

    public void addParam(com.xingray.code.java.JVariable param) {
        if (params == null) {
            params = new ArrayList<>();
        }
        params.add(param);
    }

    public void addParams(com.xingray.code.java.JVariable... params) {
        if (this.params == null) {
            this.params = new ArrayList<>(params.length);
        }
        Collections.addAll(this.params, params);
    }

    public void addStatement(JStatement statement) {
        if (statements == null) {
            statements = new ArrayList<>();
        }
        statements.add(statement);
    }
}
