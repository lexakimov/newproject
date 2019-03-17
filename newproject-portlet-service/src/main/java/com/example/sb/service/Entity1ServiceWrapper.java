package com.example.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Entity1Service}.
 *
 * @author akimov
 * @see Entity1Service
 * @generated
 */
public class Entity1ServiceWrapper implements Entity1Service,
    ServiceWrapper<Entity1Service> {
    private Entity1Service _entity1Service;

    public Entity1ServiceWrapper(Entity1Service entity1Service) {
        _entity1Service = entity1Service;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entity1Service.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entity1Service.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entity1Service.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.lang.String[] getEntity() {
        return _entity1Service.getEntity();
    }

    @Override
    public com.example.sb.model.Entity1 getEntity1(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity1Service.getEntity1(id);
    }

    @Override
    public com.example.sb.model.Entity1 addEntity1(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1Service.addEntity1(status);
    }

    @Override
    public java.lang.String getEntity(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity1Service.getEntity(id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Entity1Service getWrappedEntity1Service() {
        return _entity1Service;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntity1Service(Entity1Service entity1Service) {
        _entity1Service = entity1Service;
    }

    @Override
    public Entity1Service getWrappedService() {
        return _entity1Service;
    }

    @Override
    public void setWrappedService(Entity1Service entity1Service) {
        _entity1Service = entity1Service;
    }
}
