package com.example.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Entity2}.
 * </p>
 *
 * @author akimov
 * @see Entity2
 * @generated
 */
public class Entity2Wrapper implements Entity2, ModelWrapper<Entity2> {
    private Entity2 _entity2;

    public Entity2Wrapper(Entity2 entity2) {
        _entity2 = entity2;
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

    /**
    * Returns the primary key of this entity2.
    *
    * @return the primary key of this entity2
    */
    @Override
    public long getPrimaryKey() {
        return _entity2.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity2.
    *
    * @param primaryKey the primary key of this entity2
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _entity2.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this entity2.
    *
    * @return the ID of this entity2
    */
    @Override
    public long getId() {
        return _entity2.getId();
    }

    /**
    * Sets the ID of this entity2.
    *
    * @param id the ID of this entity2
    */
    @Override
    public void setId(long id) {
        _entity2.setId(id);
    }

    /**
    * Returns the status of this entity2.
    *
    * @return the status of this entity2
    */
    @Override
    public java.lang.String getStatus() {
        return _entity2.getStatus();
    }

    /**
    * Sets the status of this entity2.
    *
    * @param Status the status of this entity2
    */
    @Override
    public void setStatus(java.lang.String Status) {
        _entity2.setStatus(Status);
    }

    /**
    * Returns the request ID of this entity2.
    *
    * @return the request ID of this entity2
    */
    @Override
    public java.lang.String getRequestId() {
        return _entity2.getRequestId();
    }

    /**
    * Sets the request ID of this entity2.
    *
    * @param RequestId the request ID of this entity2
    */
    @Override
    public void setRequestId(java.lang.String RequestId) {
        _entity2.setRequestId(RequestId);
    }

    /**
    * Returns the field2 of this entity2.
    *
    * @return the field2 of this entity2
    */
    @Override
    public java.lang.String getField2() {
        return _entity2.getField2();
    }

    /**
    * Sets the field2 of this entity2.
    *
    * @param Field2 the field2 of this entity2
    */
    @Override
    public void setField2(java.lang.String Field2) {
        _entity2.setField2(Field2);
    }

    @Override
    public boolean isNew() {
        return _entity2.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entity2.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entity2.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entity2.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entity2.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entity2.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entity2.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entity2.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entity2.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entity2.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entity2.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Entity2Wrapper((Entity2) _entity2.clone());
    }

    @Override
    public int compareTo(com.example.sb.model.Entity2 entity2) {
        return _entity2.compareTo(entity2);
    }

    @Override
    public int hashCode() {
        return _entity2.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.sb.model.Entity2> toCacheModel() {
        return _entity2.toCacheModel();
    }

    @Override
    public com.example.sb.model.Entity2 toEscapedModel() {
        return new Entity2Wrapper(_entity2.toEscapedModel());
    }

    @Override
    public com.example.sb.model.Entity2 toUnescapedModel() {
        return new Entity2Wrapper(_entity2.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entity2.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entity2.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entity2.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Entity2Wrapper)) {
            return false;
        }

        Entity2Wrapper entity2Wrapper = (Entity2Wrapper) obj;

        if (Validator.equals(_entity2, entity2Wrapper._entity2)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Entity2 getWrappedEntity2() {
        return _entity2;
    }

    @Override
    public Entity2 getWrappedModel() {
        return _entity2;
    }

    @Override
    public void resetOriginalValues() {
        _entity2.resetOriginalValues();
    }
}
