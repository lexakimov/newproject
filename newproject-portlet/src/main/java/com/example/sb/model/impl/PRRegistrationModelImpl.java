package com.example.sb.model.impl;

import com.example.sb.model.PRRegistration;
import com.example.sb.model.PRRegistrationModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PRRegistration service. Represents a row in the &quot;SB_PRRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.example.sb.model.PRRegistrationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRRegistrationImpl}.
 * </p>
 *
 * @author akimov
 * @see PRRegistrationImpl
 * @see com.example.sb.model.PRRegistration
 * @see com.example.sb.model.PRRegistrationModel
 * @generated
 */
public class PRRegistrationModelImpl extends BaseModelImpl<PRRegistration>
    implements PRRegistrationModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a p r registration model instance should use the {@link com.example.sb.model.PRRegistration} interface instead.
     */
    public static final String TABLE_NAME = "SB_PRRegistration";
    public static final Object[][] TABLE_COLUMNS = {
            { "registrationId", Types.BIGINT },
            { "prUserId", Types.BIGINT },
            { "groupId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table SB_PRRegistration (registrationId LONG not null primary key,prUserId LONG,groupId LONG)";
    public static final String TABLE_SQL_DROP = "drop table SB_PRRegistration";
    public static final String ORDER_BY_JPQL = " ORDER BY prRegistration.registrationId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY SB_PRRegistration.registrationId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.example.sb.model.PRRegistration"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.example.sb.model.PRRegistration"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.example.sb.model.PRRegistration"));
    private static ClassLoader _classLoader = PRRegistration.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PRRegistration.class
        };
    private long _registrationId;
    private long _prUserId;
    private String _prUserUuid;
    private long _groupId;
    private PRRegistration _escapedModel;

    public PRRegistrationModelImpl() {
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
    public Class<?> getModelClass() {
        return PRRegistration.class;
    }

    @Override
    public String getModelClassName() {
        return PRRegistration.class.getName();
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
    }

    @Override
    public long getPrUserId() {
        return _prUserId;
    }

    @Override
    public void setPrUserId(long prUserId) {
        _prUserId = prUserId;
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
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            PRRegistration.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public PRRegistration toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PRRegistration) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PRRegistrationImpl prRegistrationImpl = new PRRegistrationImpl();

        prRegistrationImpl.setRegistrationId(getRegistrationId());
        prRegistrationImpl.setPrUserId(getPrUserId());
        prRegistrationImpl.setGroupId(getGroupId());

        prRegistrationImpl.resetOriginalValues();

        return prRegistrationImpl;
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

        if (!(obj instanceof PRRegistration)) {
            return false;
        }

        PRRegistration prRegistration = (PRRegistration) obj;

        long primaryKey = prRegistration.getPrimaryKey();

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
    public CacheModel<PRRegistration> toCacheModel() {
        PRRegistrationCacheModel prRegistrationCacheModel = new PRRegistrationCacheModel();

        prRegistrationCacheModel.registrationId = getRegistrationId();

        prRegistrationCacheModel.prUserId = getPrUserId();

        prRegistrationCacheModel.groupId = getGroupId();

        return prRegistrationCacheModel;
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
