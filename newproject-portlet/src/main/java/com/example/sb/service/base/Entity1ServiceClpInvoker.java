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
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName26;
    private String[] _methodParameterTypes26;
    private String _methodName27;
    private String[] _methodParameterTypes27;

    public Entity1ServiceClpInvoker() {
        _methodName18 = "getBeanIdentifier";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "setBeanIdentifier";

        _methodParameterTypes19 = new String[] { "java.lang.String" };

        _methodName24 = "getEntity";

        _methodParameterTypes24 = new String[] {  };

        _methodName25 = "getEntity1";

        _methodParameterTypes25 = new String[] { "long" };

        _methodName26 = "addEntity1";

        _methodParameterTypes26 = new String[] { "java.lang.String" };

        _methodName27 = "getEntity";

        _methodParameterTypes27 = new String[] { "long" };
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

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return Entity1ServiceUtil.getEntity();
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            return Entity1ServiceUtil.getEntity1(((Long) arguments[0]).longValue());
        }

        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return Entity1ServiceUtil.addEntity1((java.lang.String) arguments[0]);
        }

        if (_methodName27.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
            return Entity1ServiceUtil.getEntity(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
