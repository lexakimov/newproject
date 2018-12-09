package com.example.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityALocalService}.
 *
 * @author akimov
 * @see EntityALocalService
 * @generated
 */
public class EntityALocalServiceWrapper implements EntityALocalService,
    ServiceWrapper<EntityALocalService> {
    private EntityALocalService _entityALocalService;

    public EntityALocalServiceWrapper(EntityALocalService entityALocalService) {
        _entityALocalService = entityALocalService;
    }

    /**
    * Adds the entity a to the database. Also notifies the appropriate model listeners.
    *
    * @param entityA the entity a
    * @return the entity a that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.EntityA addEntityA(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.addEntityA(entityA);
    }

    /**
    * Creates a new entity a with the primary key. Does not add the entity a to the database.
    *
    * @param id the primary key for the new entity a
    * @return the new entity a
    */
    @Override
    public com.example.sb.model.EntityA createEntityA(long id) {
        return _entityALocalService.createEntityA(id);
    }

    /**
    * Deletes the entity a with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity a
    * @return the entity a that was removed
    * @throws PortalException if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.EntityA deleteEntityA(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.deleteEntityA(id);
    }

    /**
    * Deletes the entity a from the database. Also notifies the appropriate model listeners.
    *
    * @param entityA the entity a
    * @return the entity a that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.EntityA deleteEntityA(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.deleteEntityA(entityA);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _entityALocalService.dynamicQuery();
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
        return _entityALocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityALocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _entityALocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _entityALocalService.dynamicQueryCount(dynamicQuery);
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
        return _entityALocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.example.sb.model.EntityA fetchEntityA(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.fetchEntityA(id);
    }

    /**
    * Returns the entity a with the primary key.
    *
    * @param id the primary key of the entity a
    * @return the entity a
    * @throws PortalException if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.EntityA getEntityA(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.getEntityA(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the entity as.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity as
    * @param end the upper bound of the range of entity as (not inclusive)
    * @return the range of entity as
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.example.sb.model.EntityA> getEntityAs(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.getEntityAs(start, end);
    }

    /**
    * Returns the number of entity as.
    *
    * @return the number of entity as
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEntityAsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.getEntityAsCount();
    }

    /**
    * Updates the entity a in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityA the entity a
    * @return the entity a that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.sb.model.EntityA updateEntityA(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _entityALocalService.updateEntityA(entityA);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _entityALocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _entityALocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _entityALocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EntityALocalService getWrappedEntityALocalService() {
        return _entityALocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEntityALocalService(
        EntityALocalService entityALocalService) {
        _entityALocalService = entityALocalService;
    }

    @Override
    public EntityALocalService getWrappedService() {
        return _entityALocalService;
    }

    @Override
    public void setWrappedService(EntityALocalService entityALocalService) {
        _entityALocalService = entityALocalService;
    }
}
