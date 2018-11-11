package com.example.sb.model;

import com.example.sb.service.ClpSerializer;
import com.example.sb.service.PRUserLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PRUserClp extends BaseModelImpl<PRUser> implements PRUser {
    private long _prUserId;
    private String _prUserUuid;
    private String _firstName;
    private String _lastName;
    private BaseModel<?> _prUserRemoteModel;
    private Class<?> _clpSerializerClass = com.example.sb.service.ClpSerializer.class;

    public PRUserClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PRUser.class;
    }

    @Override
    public String getModelClassName() {
        return PRUser.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _prUserId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPrUserId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _prUserId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("prUserId", getPrUserId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long prUserId = (Long) attributes.get("prUserId");

        if (prUserId != null) {
            setPrUserId(prUserId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }
    }

    @Override
    public long getPrUserId() {
        return _prUserId;
    }

    @Override
    public void setPrUserId(long prUserId) {
        _prUserId = prUserId;

        if (_prUserRemoteModel != null) {
            try {
                Class<?> clazz = _prUserRemoteModel.getClass();

                Method method = clazz.getMethod("setPrUserId", long.class);

                method.invoke(_prUserRemoteModel, prUserId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPrUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getPrUserId(), "uuid", _prUserUuid);
    }

    @Override
    public void setPrUserUuid(String prUserUuid) {
        _prUserUuid = prUserUuid;
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_prUserRemoteModel != null) {
            try {
                Class<?> clazz = _prUserRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_prUserRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_prUserRemoteModel != null) {
            try {
                Class<?> clazz = _prUserRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_prUserRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPRUserRemoteModel() {
        return _prUserRemoteModel;
    }

    public void setPRUserRemoteModel(BaseModel<?> prUserRemoteModel) {
        _prUserRemoteModel = prUserRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _prUserRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_prUserRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PRUserLocalServiceUtil.addPRUser(this);
        } else {
            PRUserLocalServiceUtil.updatePRUser(this);
        }
    }

    @Override
    public PRUser toEscapedModel() {
        return (PRUser) ProxyUtil.newProxyInstance(PRUser.class.getClassLoader(),
            new Class[] { PRUser.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PRUserClp clone = new PRUserClp();

        clone.setPrUserId(getPrUserId());
        clone.setFirstName(getFirstName());
        clone.setLastName(getLastName());

        return clone;
    }

    @Override
    public int compareTo(PRUser prUser) {
        long primaryKey = prUser.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PRUserClp)) {
            return false;
        }

        PRUserClp prUser = (PRUserClp) obj;

        long primaryKey = prUser.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{prUserId=");
        sb.append(getPrUserId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.example.sb.model.PRUser");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>prUserId</column-name><column-value><![CDATA[");
        sb.append(getPrUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
