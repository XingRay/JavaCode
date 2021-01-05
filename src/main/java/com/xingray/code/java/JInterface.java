package com.xingray.code.java;

import java.util.ArrayList;
import java.util.List;

public class JInterface extends com.xingray.code.java.JType {
    private List<com.xingray.code.java.JMethod> methods;

    public List<com.xingray.code.java.JMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<com.xingray.code.java.JMethod> methods) {
        this.methods = methods;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JInterface{" +
                "methods=" + methods +
                '}';
    }

    public void addMethod(JMethod method) {
        if (methods == null) {
            methods = new ArrayList<>();
        }
        methods.add(method);
    }
}
