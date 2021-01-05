package com.xingray.code.java;

public class JField extends com.xingray.code.java.JVariable {

    private JAccessible accessible;
    private boolean isStatic;

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

    @Override
    public String toString() {
        return "com.xingray.code.java.JField{" +
                "accessible=" + accessible +
                ", isStatic=" + isStatic +
                '}';
    }
}
