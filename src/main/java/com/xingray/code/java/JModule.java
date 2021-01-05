package com.xingray.code.java;

import java.util.List;

public class JModule {
    private List<Package> packages;

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "com.xingray.code.java.JModule{" +
                "packages=" + packages +
                '}';
    }
}
