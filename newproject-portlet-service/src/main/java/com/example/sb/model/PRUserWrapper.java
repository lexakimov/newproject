package com.example.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PRUser}.
 * </p>
 *
 * @author akimov
 * @see PRUser
 * @generated
 */
public class PRUserWrapper implements PRUser, ModelWrapper<PRUser> {
    private PRUser _prUser;

    public PRUserWrapper(PRUser prUser) {
        _prUser = prUser;
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

    /**
    * Returns the primary key of this p r user.
    *
    * @return the primary key of this p r user
    */
    @Override
    public long getPrimaryKey() {
        return _prUser.getPrimaryKey();
    }

    /**
    * Sets the primary key of this p r user.
    *
    * @param primaryKey the primary key of this p r user
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _prUser.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the pr user ID of this p r user.
    *
    * @return the pr user ID of this p r user
    */
    @Override
    public long getPrUserId() {
        return _prUser.getPrUserId();
    }

    /**
    * Sets the pr user ID of this p r user.
    *
    * @param prUserId the pr user ID of this p r user
    */
    @Override
    public void setPrUserId(long prUserId) {
        _prUser.setPrUserId(prUserId);
    }

    /**
    * Returns the pr user uuid of this p r user.
    *
    * @return the pr user uuid of this p r user
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getPrUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _prUser.getPrUserUuid();
    }

    /**
    * Sets the pr user uuid of this p r user.
    *
    * @param prUserUuid the pr user uuid of this p r user
    */
    @Override
    public void setPrUserUuid(java.lang.String prUserUuid) {
        _prUser.setPrUserUuid(prUserUuid);
    }

    /**
    * Returns the first name of this p r user.
    *
    * @return the first name of this p r user
    */
    @Override
    public java.lang.String getFirstName() {
        return _prUser.getFirstName();
    }

    /**
    * Sets the first name of this p r user.
    *
    * @param firstName the first name of this p r user
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _prUser.setFirstName(firstName);
    }

    /**
    * Returns the last name of this p r user.
    *
    * @return the last name of this p r user
    */
    @Override
    public java.lang.String getLastName() {
        return _prUser.getLastName();
    }

    /**
    * Sets the last name of this p r user.
    *
    * @param lastName the last name of this p r user
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _prUser.setLastName(lastName);
    }

    @Override
    public boolean isNew() {
        return _prUser.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _prUser.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _prUser.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _prUser.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _prUser.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _prUser.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _prUser.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _prUser.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _prUser.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _prUser.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _prUser.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PRUserWrapper((PRUser) _prUser.clone());
    }

    @Override
    public int compareTo(com.example.sb.model.PRUser prUser) {
        return _prUser.compareTo(prUser);
    }

    @Override
    public int hashCode() {
        return _prUser.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.sb.model.PRUser> toCacheModel() {
        return _prUser.toCacheModel();
    }

    @Override
    public com.example.sb.model.PRUser toEscapedModel() {
        return new PRUserWrapper(_prUser.toEscapedModel());
    }

    @Override
    public com.example.sb.model.PRUser toUnescapedModel() {
        return new PRUserWrapper(_prUser.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _prUser.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _prUser.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _prUser.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PRUserWrapper)) {
            return false;
        }

        PRUserWrapper prUserWrapper = (PRUserWrapper) obj;

        if (Validator.equals(_prUser, prUserWrapper._prUser)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PRUser getWrappedPRUser() {
        return _prUser;
    }

    @Override
    public PRUser getWrappedModel() {
        return _prUser;
    }

    @Override
    public void resetOriginalValues() {
        _prUser.resetOriginalValues();
    }
}
