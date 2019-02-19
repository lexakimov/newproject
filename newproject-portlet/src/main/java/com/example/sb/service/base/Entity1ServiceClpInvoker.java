package com.example.sb.service.base;

import com.example.sb.service.Entity1ServiceUtil;

import java.util.Arrays;

/**
 * @author akimov
 * @generated
 */
public class Entity1ServiceClpInvoker {
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;

    public Entity1ServiceClpInvoker() {
        _methodName18 = "getBeanIdentifier";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "setBeanIdentifier";

        _methodParameterTypes19 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return Entity1ServiceUtil.getBeanIdentifier();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            Entity1ServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
