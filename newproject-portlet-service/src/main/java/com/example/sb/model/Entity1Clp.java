package com.example.sb.model;

import com.example.sb.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Entity1Clp extends BaseModelImpl<Entity1> implements Entity1 {
    private long _id;
    private String _Status;
    private String _RequestId;
    private String _Field1;
    private BaseModel<?> _entity1RemoteModel;
    private Class<?> _clpSerializerClass = com.example.sb.service.ClpSerializer.class;

    public Entity1Clp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Entity1.class;
    }

    @Override
    public String getModelClassName() {
        return Entity1.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("Status", getStatus());
        attributes.put("RequestId", getRequestId());
        attributes.put("Field1", getField1());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String Status = (String) attributes.get("Status");

        if (Status != null) {
            setStatus(Status);
        }

        String RequestId = (String) attributes.get("RequestId");

        if (RequestId != null) {
            setRequestId(RequestId);
        }

        String Field1 = (String) attributes.get("Field1");

        if (Field1 != null) {
            setField1(Field1);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_entity1RemoteModel != null) {
            try {
                Class<?> clazz = _entity1RemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_entity1RemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatus() {
        return _Status;
    }

    @Override
    public void setStatus(String Status) {
        _Status = Status;

        if (_entity1RemoteModel != null) {
            try {
                Class<?> clazz = _entity1RemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_entity1RemoteModel, Status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRequestId() {
        return _RequestId;
    }

    @Override
    public void setRequestId(String RequestId) {
        _RequestId = RequestId;

        if (_entity1RemoteModel != null) {
            try {
                Class<?> clazz = _entity1RemoteModel.getClass();

                Method method = clazz.getMethod("setRequestId", String.class);

                method.invoke(_entity1RemoteModel, RequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getField1() {
        return _Field1;
    }

    @Override
    public void setField1(String Field1) {
        _Field1 = Field1;

        if (_entity1RemoteModel != null) {
            try {
                Class<?> clazz = _entity1RemoteModel.getClass();

                Method method = clazz.getMethod("setField1", String.class);

                method.invoke(_entity1RemoteModel, Field1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntity1RemoteModel() {
        return _entity1RemoteModel;
    }

    public void setEntity1RemoteModel(BaseModel<?> entity1RemoteModel) {
        _entity1RemoteModel = entity1RemoteModel;
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

        Class<?> remoteModelClass = _entity1RemoteModel.getClass();

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

        Object returnValue = method.invoke(_entity1RemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public Entity1 toEscapedModel() {
        return (Entity1) ProxyUtil.newProxyInstance(Entity1.class.getClassLoader(),
            new Class[] { Entity1.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Entity1Clp clone = new Entity1Clp();

        clone.setId(getId());
        clone.setStatus(getStatus());
        clone.setRequestId(getRequestId());
        clone.setField1(getField1());

        return clone;
    }

    @Override
    public int compareTo(Entity1 entity1) {
        long primaryKey = entity1.getPrimaryKey();

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

        if (!(obj instanceof Entity1Clp)) {
            return false;
        }

        Entity1Clp entity1 = (Entity1Clp) obj;

        long primaryKey = entity1.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", Status=");
        sb.append(getStatus());
        sb.append(", RequestId=");
        sb.append(getRequestId());
        sb.append(", Field1=");
        sb.append(getField1());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.example.sb.model.Entity1");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RequestId</column-name><column-value><![CDATA[");
        sb.append(getRequestId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Field1</column-name><column-value><![CDATA[");
        sb.append(getField1());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
