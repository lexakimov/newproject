package com.example.sb.model.impl;

import com.example.sb.model.Entity1;
import com.example.sb.model.Entity1Model;
import com.example.sb.model.Entity1Soap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Entity1 service. Represents a row in the &quot;SB_Entity1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.example.sb.model.Entity1Model} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Entity1Impl}.
 * </p>
 *
 * @author akimov
 * @see Entity1Impl
 * @see com.example.sb.model.Entity1
 * @see com.example.sb.model.Entity1Model
 * @generated
 */
@JSON(strict = true)
public class Entity1ModelImpl extends BaseModelImpl<Entity1>
    implements Entity1Model {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a entity1 model instance should use the {@link com.example.sb.model.Entity1} interface instead.
     */
    public static final String TABLE_NAME = "SB_Entity1";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "Status", Types.VARCHAR },
            { "RequestId", Types.VARCHAR },
            { "Field1", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table SB_Entity1 (id_ LONG not null primary key,Status VARCHAR(75) null,RequestId VARCHAR(75) null,Field1 VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table SB_Entity1";
    public static final String ORDER_BY_JPQL = " ORDER BY entity1.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY SB_Entity1.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.example.sb.model.Entity1"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.example.sb.model.Entity1"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.example.sb.model.Entity1"));
    private static ClassLoader _classLoader = Entity1.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Entity1.class
        };
    private long _id;
    private String _Status;
    private String _RequestId;
    private String _Field1;
    private Entity1 _escapedModel;

    public Entity1ModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Entity1 toModel(Entity1Soap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Entity1 model = new Entity1Impl();

        model.setId(soapModel.getId());
        model.setStatus(soapModel.getStatus());
        model.setRequestId(soapModel.getRequestId());
        model.setField1(soapModel.getField1());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Entity1> toModels(Entity1Soap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Entity1> models = new ArrayList<Entity1>(soapModels.length);

        for (Entity1Soap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return Entity1.class;
    }

    @Override
    public String getModelClassName() {
        return Entity1.class.getName();
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

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @JSON
    @Override
    public String getStatus() {
        if (_Status == null) {
            return StringPool.BLANK;
        } else {
            return _Status;
        }
    }

    @Override
    public void setStatus(String Status) {
        _Status = Status;
    }

    @JSON
    @Override
    public String getRequestId() {
        if (_RequestId == null) {
            return StringPool.BLANK;
        } else {
            return _RequestId;
        }
    }

    @Override
    public void setRequestId(String RequestId) {
        _RequestId = RequestId;
    }

    @JSON
    @Override
    public String getField1() {
        if (_Field1 == null) {
            return StringPool.BLANK;
        } else {
            return _Field1;
        }
    }

    @Override
    public void setField1(String Field1) {
        _Field1 = Field1;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Entity1.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Entity1 toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Entity1) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        Entity1Impl entity1Impl = new Entity1Impl();

        entity1Impl.setId(getId());
        entity1Impl.setStatus(getStatus());
        entity1Impl.setRequestId(getRequestId());
        entity1Impl.setField1(getField1());

        entity1Impl.resetOriginalValues();

        return entity1Impl;
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

        if (!(obj instanceof Entity1)) {
            return false;
        }

        Entity1 entity1 = (Entity1) obj;

        long primaryKey = entity1.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Entity1> toCacheModel() {
        Entity1CacheModel entity1CacheModel = new Entity1CacheModel();

        entity1CacheModel.id = getId();

        entity1CacheModel.Status = getStatus();

        String Status = entity1CacheModel.Status;

        if ((Status != null) && (Status.length() == 0)) {
            entity1CacheModel.Status = null;
        }

        entity1CacheModel.RequestId = getRequestId();

        String RequestId = entity1CacheModel.RequestId;

        if ((RequestId != null) && (RequestId.length() == 0)) {
            entity1CacheModel.RequestId = null;
        }

        entity1CacheModel.Field1 = getField1();

        String Field1 = entity1CacheModel.Field1;

        if ((Field1 != null) && (Field1.length() == 0)) {
            entity1CacheModel.Field1 = null;
        }

        return entity1CacheModel;
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
