package com.example.sb.model;

import com.example.sb.service.ClpSerializer;
import com.example.sb.service.PRRegistrationLocalServiceUtil;

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


public class PRRegistrationClp extends BaseModelImpl<PRRegistration>
    implements PRRegistration {
    private long _registrationId;
    private long _prUserId;
    private String _prUserUuid;
    private long _groupId;
    private BaseModel<?> _prRegistrationRemoteModel;
    private Class<?> _clpSerializerClass = com.example.sb.service.ClpSerializer.class;

    public PRRegistrationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PRRegistration.class;
    }

    @Override
    public String getModelClassName() {
        return PRRegistration.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _registrationId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRegistrationId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _registrationId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("registrationId", getRegistrationId());
        attributes.put("prUserId", getPrUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long registrationId = (Long) attributes.get("registrationId");

        if (registrationId != null) {
            setRegistrationId(registrationId);
        }

        Long prUserId = (Long) attributes.get("prUserId");

        if (prUserId != null) {
            setPrUserId(prUserId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @Override
    public long getRegistrationId() {
        return _registrationId;
    }

    @Override
    public void setRegistrationId(long registrationId) {
        _registrationId = registrationId;

        if (_prRegistrationRemoteModel != null) {
            try {
                Class<?> clazz = _prRegistrationRemoteModel.getClass();

                Method method = clazz.getMethod("setRegistrationId", long.class);

                method.invoke(_prRegistrationRemoteModel, registrationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPrUserId() {
        return _prUserId;
    }

    @Override
    public void setPrUserId(long prUserId) {
        _prUserId = prUserId;

        if (_prRegistrationRemoteModel != null) {
            try {
                Class<?> clazz = _prRegistrationRemoteModel.getClass();

                Method method = clazz.getMethod("setPrUserId", long.class);

                method.invoke(_prRegistrationRemoteModel, prUserId);
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
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_prRegistrationRemoteModel != null) {
            try {
                Class<?> clazz = _prRegistrationRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_prRegistrationRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPRRegistrationRemoteModel() {
        return _prRegistrationRemoteModel;
    }

    public void setPRRegistrationRemoteModel(
        BaseModel<?> prRegistrationRemoteModel) {
        _prRegistrationRemoteModel = prRegistrationRemoteModel;
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

        Class<?> remoteModelClass = _prRegistrationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_prRegistrationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PRRegistrationLocalServiceUtil.addPRRegistration(this);
        } else {
            PRRegistrationLocalServiceUtil.updatePRRegistration(this);
        }
    }

    @Override
    public PRRegistration toEscapedModel() {
        return (PRRegistration) ProxyUtil.newProxyInstance(PRRegistration.class.getClassLoader(),
            new Class[] { PRRegistration.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PRRegistrationClp clone = new PRRegistrationClp();

        clone.setRegistrationId(getRegistrationId());
        clone.setPrUserId(getPrUserId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(PRRegistration prRegistration) {
        long primaryKey = prRegistration.getPrimaryKey();

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

        if (!(obj instanceof PRRegistrationClp)) {
            return false;
        }

        PRRegistrationClp prRegistration = (PRRegistrationClp) obj;

        long primaryKey = prRegistration.getPrimaryKey();

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

        sb.append("{registrationId=");
        sb.append(getRegistrationId());
        sb.append(", prUserId=");
        sb.append(getPrUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.example.sb.model.PRRegistration");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>registrationId</column-name><column-value><![CDATA[");
        sb.append(getRegistrationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>prUserId</column-name><column-value><![CDATA[");
        sb.append(getPrUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
