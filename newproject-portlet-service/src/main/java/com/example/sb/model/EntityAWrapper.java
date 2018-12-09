package com.example.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityA}.
 * </p>
 *
 * @author akimov
 * @see EntityA
 * @generated
 */
public class EntityAWrapper implements EntityA, ModelWrapper<EntityA> {
    private EntityA _entityA;

    public EntityAWrapper(EntityA entityA) {
        _entityA = entityA;
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

    /**
    * Returns the primary key of this entity a.
    *
    * @return the primary key of this entity a
    */
    @Override
    public long getPrimaryKey() {
        return _entityA.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity a.
    *
    * @param primaryKey the primary key of this entity a
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _entityA.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this entity a.
    *
    * @return the ID of this entity a
    */
    @Override
    public long getId() {
        return _entityA.getId();
    }

    /**
    * Sets the ID of this entity a.
    *
    * @param id the ID of this entity a
    */
    @Override
    public void setId(long id) {
        _entityA.setId(id);
    }

    @Override
    public boolean isNew() {
        return _entityA.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entityA.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entityA.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entityA.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entityA.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entityA.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entityA.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entityA.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entityA.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entityA.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entityA.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EntityAWrapper((EntityA) _entityA.clone());
    }

    @Override
    public int compareTo(com.example.sb.model.EntityA entityA) {
        return _entityA.compareTo(entityA);
    }

    @Override
    public int hashCode() {
        return _entityA.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.sb.model.EntityA> toCacheModel() {
        return _entityA.toCacheModel();
    }

    @Override
    public com.example.sb.model.EntityA toEscapedModel() {
        return new EntityAWrapper(_entityA.toEscapedModel());
    }

    @Override
    public com.example.sb.model.EntityA toUnescapedModel() {
        return new EntityAWrapper(_entityA.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entityA.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entityA.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entityA.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EntityAWrapper)) {
            return false;
        }

        EntityAWrapper entityAWrapper = (EntityAWrapper) obj;

        if (Validator.equals(_entityA, entityAWrapper._entityA)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EntityA getWrappedEntityA() {
        return _entityA;
    }

    @Override
    public EntityA getWrappedModel() {
        return _entityA;
    }

    @Override
    public void resetOriginalValues() {
        _entityA.resetOriginalValues();
    }
}
