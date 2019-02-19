package com.example.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Entity1LocalService}.
 *
 * @author akimov
 * @see Entity1LocalService
 * @generated
 */
public class Entity1LocalServiceWrapper implements Entity1LocalService,
    ServiceWrapper<Entity1LocalService> {
    private Entity1LocalService _entity1LocalService;

    public Entity1LocalServiceWrapper(Entity1LocalService entity1LocalService) {
        _entity1LocalService = entity1LocalService;
    }

    /**
    * Adds the entity1 to the database. Also notifies the appropriate model listeners.
    *
    * @param entity1 the entity1
    * @return the entity1 that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity1 addEntity1(
        com.example.sb.model.Entity1 entity1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.addEntity1(entity1);
    }

    /**
    * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
    *
    * @param id the primary key for the new entity1
    * @return the new entity1
    */
    @Override
    public com.example.sb.model.Entity1 createEntity1(long id) {
        return _entity1LocalService.createEntity1(id);
    }

    /**
    * Deletes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity1
    * @return the entity1 that was removed
    * @throws PortalException if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity1 deleteEntity1(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.deleteEntity1(id);
    }

    /**
    * Deletes the entity1 from the database. Also notifies the appropriate model listeners.
    *
    * @param entity1 the entity1
    * @return the entity1 that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity1 deleteEntity1(
        com.example.sb.model.Entity1 entity1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.deleteEntity1(entity1);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entity1LocalService.dynamicQuery();
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
        return _entity1LocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entity1LocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entity1LocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _entity1LocalService.dynamicQueryCount(dynamicQuery);
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
        return _entity1LocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.example.sb.model.Entity1 fetchEntity1(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.fetchEntity1(id);
    }

    /**
    * Returns the entity1 with the primary key.
    *
    * @param id the primary key of the entity1
    * @return the entity1
    * @throws PortalException if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity1 getEntity1(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.getEntity1(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity1s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity1s
    * @param end the upper bound of the range of entity1s (not inclusive)
    * @return the range of entity1s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.example.sb.model.Entity1> getEntity1s(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.getEntity1s(start, end);
    }

    /**
    * Returns the number of entity1s.
    *
    * @return the number of entity1s
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntity1sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.getEntity1sCount();
    }

    /**
    * Updates the entity1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entity1 the entity1
    * @return the entity1 that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.Entity1 updateEntity1(
        com.example.sb.model.Entity1 entity1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entity1LocalService.updateEntity1(entity1);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entity1LocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entity1LocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entity1LocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Entity1LocalService getWrappedEntity1LocalService() {
        return _entity1LocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntity1LocalService(
        Entity1LocalService entity1LocalService) {
        _entity1LocalService = entity1LocalService;
    }

    @Override
    public Entity1LocalService getWrappedService() {
        return _entity1LocalService;
    }

    @Override
    public void setWrappedService(Entity1LocalService entity1LocalService) {
        _entity1LocalService = entity1LocalService;
    }
}
