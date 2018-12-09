package com.example.sb.model;

import com.example.sb.service.ClpSerializer;
import com.example.sb.service.EntityALocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EntityAClp extends BaseModelImpl<EntityA> implements EntityA {
    private long _id;
    private BaseModel<?> _entityARemoteModel;
    private Class<?> _clpSerializerClass = com.example.sb.service.ClpSerializer.class;

    public EntityAClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EntityA.class;
    }

    @Override
    public String getModelClassName() {
        return EntityA.class.getName();
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

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_entityARemoteModel != null) {
            try {
                Class<?> clazz = _entityARemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_entityARemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEntityARemoteModel() {
        return _entityARemoteModel;
    }

    public void setEntityARemoteModel(BaseModel<?> entityARemoteModel) {
        _entityARemoteModel = entityARemoteModel;
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

        Class<?> remoteModelClass = _entityARemoteModel.getClass();

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

        Object returnValue = method.invoke(_entityARemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EntityALocalServiceUtil.addEntityA(this);
        } else {
            EntityALocalServiceUtil.updateEntityA(this);
        }
    }

    @Override
    public EntityA toEscapedModel() {
        return (EntityA) ProxyUtil.newProxyInstance(EntityA.class.getClassLoader(),
            new Class[] { EntityA.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EntityAClp clone = new EntityAClp();

        clone.setId(getId());

        return clone;
    }

    @Override
    public int compareTo(EntityA entityA) {
        long primaryKey = entityA.getPrimaryKey();

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

        if (!(obj instanceof EntityAClp)) {
            return false;
        }

        EntityAClp entityA = (EntityAClp) obj;

        long primaryKey = entityA.getPrimaryKey();

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
        StringBundler sb = new StringBundler(3);

        sb.append("{id=");
        sb.append(getId());

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(7);

        sb.append("<model><model-name>");
        sb.append("com.example.sb.model.EntityA");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
