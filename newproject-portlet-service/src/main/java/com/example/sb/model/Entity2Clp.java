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


public class Entity2Clp extends BaseModelImpl<Entity2> implements Entity2 {
    private long _id;
    private String _Status;
    private String _RequestId;
    private String _Field2;
    private BaseModel<?> _entity2RemoteModel;
    private Class<?> _clpSerializerClass = com.example.sb.service.ClpSerializer.class;

    public Entity2Clp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Entity2.class;
    }

    @Override
    public String getModelClassName() {
        return Entity2.class.getName();
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
        attributes.put("Field2", getField2());

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

        String Field2 = (String) attributes.get("Field2");

        if (Field2 != null) {
            setField2(Field2);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_entity2RemoteModel != null) {
            try {
                Class<?> clazz = _entity2RemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_entity2RemoteModel, id);
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

        if (_entity2RemoteModel != null) {
            try {
                Class<?> clazz = _entity2RemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_entity2RemoteModel, Status);
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

        if (_entity2RemoteModel != null) {
            try {
                Class<?> clazz = _entity2RemoteModel.getClass();

                Method method = clazz.getMethod("setRequestId", String.class);

                method.invoke(_entity2RemoteModel, RequestId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getField2() {
        return _Field2;
    }

    @Override
    public void setField2(String Field2) {
        _Field2 = Field2;

        if (_entity2RemoteModel != null) {
            try {
                Class<?> clazz = _entity2RemoteModel.getClass();

                Method method = clazz.getMethod("setField2", String.class);

                method.invoke(_entity2RemoteModel, Field2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntity2RemoteModel() {
        return _entity2RemoteModel;
    }

    public void setEntity2RemoteModel(BaseModel<?> entity2RemoteModel) {
        _entity2RemoteModel = entity2RemoteModel;
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

        Class<?> remoteModelClass = _entity2RemoteModel.getClass();

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

        Object returnValue = method.invoke(_entity2RemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public Entity2 toEscapedModel() {
        return (Entity2) ProxyUtil.newProxyInstance(Entity2.class.getClassLoader(),
            new Class[] { Entity2.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Entity2Clp clone = new Entity2Clp();

        clone.setId(getId());
        clone.setStatus(getStatus());
        clone.setRequestId(getRequestId());
        clone.setField2(getField2());

        return clone;
    }

    @Override
    public int compareTo(Entity2 entity2) {
        long primaryKey = entity2.getPrimaryKey();

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

        if (!(obj instanceof Entity2Clp)) {
            return false;
        }

        Entity2Clp entity2 = (Entity2Clp) obj;

        long primaryKey = entity2.getPrimaryKey();

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
        sb.append(", Field2=");
        sb.append(getField2());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.example.sb.model.Entity2");
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
            "<column><column-name>Field2</column-name><column-value><![CDATA[");
        sb.append(getField2());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
