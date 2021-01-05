package com.xingray.code.java;

import java.util.List;

public class JPackage {
    private List<JPackage> packages;
    private List<com.xingray.code.java.JType> types;

    public List<JPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<JPackage> packages) {
        this.packages = packages;
    }

    public List<com.xingray.code.java.JType> getTypes() {
        return types;
    }

    public void setTypes(List<com.xingray.code.java.JType> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JPackage{" +
                "packages=" + packages +
                ", types=" + types +
                '}';
    }
}
