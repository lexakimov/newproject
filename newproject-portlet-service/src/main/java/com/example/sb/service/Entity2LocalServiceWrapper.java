package com.example.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Entity2LocalService}.
 *
 * @author akimov
 * @see Entity2LocalService
 * @generated
 */
public class Entity2LocalServiceWrapper implements Entity2LocalService,
    ServiceWrapper<Entity2LocalService> {
    private Entity2LocalService _entity2LocalService;

    public Entity2LocalServiceWrapper(Entity2LocalService entity2LocalService) {
        _entity2LocalService = entity2LocalService;
    }

    /**
    * Adds the entity2 to the database. Also notifies the appropriate model listeners.
    *
    * @param entity2 the entity2
    * @return the entity2 that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity2 addEntity2(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.addEntity2(entity2);
    }

    /**
    * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
    *
    * @param id the primary key for the new entity2
    * @return the new entity2
    */
    @Override
    public com.example.sb.model.Entity2 createEntity2(long id) {
        return _entity2LocalService.createEntity2(id);
    }

    /**
    * Deletes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity2
    * @return the entity2 that was removed
    * @throws PortalException if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity2 deleteEntity2(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.deleteEntity2(id);
    }

    /**
    * Deletes the entity2 from the database. Also notifies the appropriate model listeners.
    *
    * @param entity2 the entity2
    * @return the entity2 that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity2 deleteEntity2(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.deleteEntity2(entity2);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entity2LocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.example.sb.model.Entity2 fetchEntity2(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.fetchEntity2(id);
    }

    /**
    * Returns the entity2 with the primary key.
    *
    * @param id the primary key of the entity2
    * @return the entity2
    * @throws PortalException if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity2 getEntity2(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.getEntity2(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity2s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity2s
    * @param end the upper bound of the range of entity2s (not inclusive)
    * @return the range of entity2s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.example.sb.model.Entity2> getEntity2s(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.getEntity2s(start, end);
    }

    /**
    * Returns the number of entity2s.
    *
    * @return the number of entity2s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntity2sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.getEntity2sCount();
    }

    /**
    * Updates the entity2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entity2 the entity2
    * @return the entity2 that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity2 updateEntity2(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity2LocalService.updateEntity2(entity2);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entity2LocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entity2LocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entity2LocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Entity2LocalService getWrappedEntity2LocalService() {
        return _entity2LocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntity2LocalService(
        Entity2LocalService entity2LocalService) {
        _entity2LocalService = entity2LocalService;
    }

    @Override
    public Entity2LocalService getWrappedService() {
        return _entity2LocalService;
    }

    @Override
    public void setWrappedService(Entity2LocalService entity2LocalService) {
        _entity2LocalService = entity2LocalService;
    }
}
