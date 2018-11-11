package com.example.sb.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PRRegistration}.
 * </p>
 *
 * @author akimov
 * @see PRRegistration
 * @generated
 */
public class PRRegistrationWrapper implements PRRegistration,
    ModelWrapper<PRRegistration> {
    private PRRegistration _prRegistration;

    public PRRegistrationWrapper(PRRegistration prRegistration) {
        _prRegistration = prRegistration;
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

    /**
    * Returns the primary key of this p r registration.
    *
    * @return the primary key of this p r registration
    */
    @Override
    public long getPrimaryKey() {
        return _prRegistration.getPrimaryKey();
    }

    /**
    * Sets the primary key of this p r registration.
    *
    * @param primaryKey the primary key of this p r registration
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _prRegistration.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the registration ID of this p r registration.
    *
    * @return the registration ID of this p r registration
    */
    @Override
    public long getRegistrationId() {
        return _prRegistration.getRegistrationId();
    }

    /**
    * Sets the registration ID of this p r registration.
    *
    * @param registrationId the registration ID of this p r registration
    */
    @Override
    public void setRegistrationId(long registrationId) {
        _prRegistration.setRegistrationId(registrationId);
    }

    /**
    * Returns the pr user ID of this p r registration.
    *
    * @return the pr user ID of this p r registration
    */
    @Override
    public long getPrUserId() {
        return _prRegistration.getPrUserId();
    }

    /**
    * Sets the pr user ID of this p r registration.
    *
    * @param prUserId the pr user ID of this p r registration
    */
    @Override
    public void setPrUserId(long prUserId) {
        _prRegistration.setPrUserId(prUserId);
    }

    /**
    * Returns the pr user uuid of this p r registration.
    *
    * @return the pr user uuid of this p r registration
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getPrUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _prRegistration.getPrUserUuid();
    }

    /**
    * Sets the pr user uuid of this p r registration.
    *
    * @param prUserUuid the pr user uuid of this p r registration
    */
    @Override
    public void setPrUserUuid(java.lang.String prUserUuid) {
        _prRegistration.setPrUserUuid(prUserUuid);
    }

    /**
    * Returns the group ID of this p r registration.
    *
    * @return the group ID of this p r registration
    */
    @Override
    public long getGroupId() {
        return _prRegistration.getGroupId();
    }

    /**
    * Sets the group ID of this p r registration.
    *
    * @param groupId the group ID of this p r registration
    */
    @Override
    public void setGroupId(long groupId) {
        _prRegistration.setGroupId(groupId);
    }

    @Override
    public boolean isNew() {
        return _prRegistration.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _prRegistration.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _prRegistration.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _prRegistration.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _prRegistration.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _prRegistration.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _prRegistration.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _prRegistration.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _prRegistration.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _prRegistration.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _prRegistration.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PRRegistrationWrapper((PRRegistration) _prRegistration.clone());
    }

    @Override
    public int compareTo(com.example.sb.model.PRRegistration prRegistration) {
        return _prRegistration.compareTo(prRegistration);
    }

    @Override
    public int hashCode() {
        return _prRegistration.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.sb.model.PRRegistration> toCacheModel() {
        return _prRegistration.toCacheModel();
    }

    @Override
    public com.example.sb.model.PRRegistration toEscapedModel() {
        return new PRRegistrationWrapper(_prRegistration.toEscapedModel());
    }

    @Override
    public com.example.sb.model.PRRegistration toUnescapedModel() {
        return new PRRegistrationWrapper(_prRegistration.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _prRegistration.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _prRegistration.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _prRegistration.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PRRegistrationWrapper)) {
            return false;
        }

        PRRegistrationWrapper prRegistrationWrapper = (PRRegistrationWrapper) obj;

        if (Validator.equals(_prRegistration,
                    prRegistrationWrapper._prRegistration)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PRRegistration getWrappedPRRegistration() {
        return _prRegistration;
    }

    @Override
    public PRRegistration getWrappedModel() {
        return _prRegistration;
    }

    @Override
    public void resetOriginalValues() {
        _prRegistration.resetOriginalValues();
    }
}
