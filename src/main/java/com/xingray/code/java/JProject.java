package com.xingray.code.java;

import java.util.List;

public class JProject {
    private List<JModule> modules;

    public List<JModule> getModules() {
        return modules;
    }

    public void setModules(List<JModule> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JProject{" +
                "modules=" + modules +
                '}';
    }
}
