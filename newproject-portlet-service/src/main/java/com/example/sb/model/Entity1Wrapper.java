package com.example.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Entity1}.
 * </p>
 *
 * @author akimov
 * @see Entity1
 * @generated
 */
public class Entity1Wrapper implements Entity1, ModelWrapper<Entity1> {
    private Entity1 _entity1;

    public Entity1Wrapper(Entity1 entity1) {
        _entity1 = entity1;
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
        attributes.put("Field1", getField1());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String Field1 = (String) attributes.get("Field1");

        if (Field1 != null) {
            setField1(Field1);
        }
    }

    /**
    * Returns the primary key of this entity1.
    *
    * @return the primary key of this entity1
    */
    @Override
    public long getPrimaryKey() {
        return _entity1.getPrimaryKey();
    }

    /**
    * Sets the primary key of this entity1.
    *
    * @param primaryKey the primary key of this entity1
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _entity1.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this entity1.
    *
    * @return the ID of this entity1
    */
    @Override
    public long getId() {
        return _entity1.getId();
    }

    /**
    * Sets the ID of this entity1.
    *
    * @param id the ID of this entity1
    */
    @Override
    public void setId(long id) {
        _entity1.setId(id);
    }

    /**
    * Returns the field1 of this entity1.
    *
    * @return the field1 of this entity1
    */
    @Override
    public java.lang.String getField1() {
        return _entity1.getField1();
    }

    /**
    * Sets the field1 of this entity1.
    *
    * @param Field1 the field1 of this entity1
    */
    @Override
    public void setField1(java.lang.String Field1) {
        _entity1.setField1(Field1);
    }

    @Override
    public boolean isNew() {
        return _entity1.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _entity1.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _entity1.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _entity1.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _entity1.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _entity1.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _entity1.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _entity1.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _entity1.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _entity1.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _entity1.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Entity1Wrapper((Entity1) _entity1.clone());
    }

    @Override
    public int compareTo(com.example.sb.model.Entity1 entity1) {
        return _entity1.compareTo(entity1);
    }

    @Override
    public int hashCode() {
        return _entity1.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.sb.model.Entity1> toCacheModel() {
        return _entity1.toCacheModel();
    }

    @Override
    public com.example.sb.model.Entity1 toEscapedModel() {
        return new Entity1Wrapper(_entity1.toEscapedModel());
    }

    @Override
    public com.example.sb.model.Entity1 toUnescapedModel() {
        return new Entity1Wrapper(_entity1.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _entity1.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _entity1.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _entity1.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Entity1Wrapper)) {
            return false;
        }

        Entity1Wrapper entity1Wrapper = (Entity1Wrapper) obj;

        if (Validator.equals(_entity1, entity1Wrapper._entity1)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Entity1 getWrappedEntity1() {
        return _entity1;
    }

    @Override
    public Entity1 getWrappedModel() {
        return _entity1;
    }

    @Override
    public void resetOriginalValues() {
        _entity1.resetOriginalValues();
    }
}
