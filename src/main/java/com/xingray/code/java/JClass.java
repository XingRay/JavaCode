package com.xingray.code.java;


import com.xingray.code.java.util.Util;

import java.util.ArrayList;
import java.util.List;

public class JClass extends com.xingray.code.java.JType {

    private List<com.xingray.code.java.JField> fields;
    private List<com.xingray.code.java.JMethod> methods;
    private List<com.xingray.code.java.JMethod> constructors;

    public List<com.xingray.code.java.JField> getFields() {
        return fields;
    }

    public void setFields(List<com.xingray.code.java.JField> fields) {
        this.fields = fields;
    }

    public List<com.xingray.code.java.JMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<com.xingray.code.java.JMethod> methods) {
        this.methods = methods;
    }

    public List<com.xingray.code.java.JMethod> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<com.xingray.code.java.JMethod> constructors) {
        this.constructors = constructors;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JClass{" +
                "fields=" + fields +
                ", methods=" + methods +
                '}';
    }

    public void addMethod(com.xingray.code.java.JMethod method) {
        if (methods == null) {
            methods = new ArrayList<>();
        }
        methods.add(method);
    }

    public void addConstructor(com.xingray.code.java.JMethod constructor) {
        if (constructors == null) {
            constructors = new ArrayList<>();
        }
        constructors.add(constructor);
    }

    public void addConstructMethod(JAccessible accessible, List<com.xingray.code.java.JVariable> params) {
        addMethod(Util.getConstructor(this, accessible, params));
    }

    public com.xingray.code.java.JMethod getDefaultConstruct() {
        if (constructors == null || constructors.isEmpty()) {
            com.xingray.code.java.JMethod defaultConstructor = createDefaultConstructor();
            addConstructor(defaultConstructor);
        }
        return constructors.get(0);
    }

    private com.xingray.code.java.JMethod createDefaultConstructor() {
        com.xingray.code.java.JMethod constructor = new com.xingray.code.java.JMethod();

        constructor.setAccessible(JAccessible.PUBLIC);
        constructor.setStatic(true);
        constructor.setReturnType(this);
        constructor.setName(JavaCodeConstants.NEW + " " + getName());

        return constructor;
    }
}
