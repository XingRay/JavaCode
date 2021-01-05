package com.xingray.code.java.util;

import com.xingray.code.java.*;
import com.xingray.javabase.interfaces.Mapper;
import com.xingray.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util {

    public static JMethod getConstructor(JClass cls, JAccessible accessible, List<JVariable> params) {
        JMethod constructor = new JMethod();

        constructor.setAccessible(accessible);
        constructor.setStatic(true);
        constructor.setReturnType(cls);
        constructor.setName(JavaCodeConstants.NEW + " " + cls.getName());
        constructor.setParams(params);

        return constructor;
    }

    public static List<String> toCodeLines(List<JStatement> statements) {
        if (statements == null) {
            return Collections.emptyList();
        }
        List<String> codeLines = new ArrayList<>();

        for (JStatement statement : statements) {
            codeLines.addAll(statement.toStatementCodeLines());
        }

        return codeLines;
    }

    public static String toCodeString(List<JExpression> expressions) {
        return StringUtil.toString(expressions, ",", new Mapper<JExpression, String>() {
            @Override
            public String map(JExpression argument) {
                return StringUtil.toString(argument.toExpressionCodeLines(), "\n");
            }
        });
    }
}
