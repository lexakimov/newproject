package com.example.sb.service.base;

import com.example.sb.model.Entity2;
import com.example.sb.service.Entity2LocalService;
import com.example.sb.service.persistence.Entity1Persistence;
import com.example.sb.service.persistence.Entity2Persistence;
import com.example.sb.service.persistence.EntityAPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the entity2 local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.example.sb.service.impl.Entity2LocalServiceImpl}.
 * </p>
 *
 * @author akimov
 * @see com.example.sb.service.impl.Entity2LocalServiceImpl
 * @see com.example.sb.service.Entity2LocalServiceUtil
 * @generated
 */
public abstract class Entity2LocalServiceBaseImpl extends BaseLocalServiceImpl
    implements Entity2LocalService, IdentifiableBean {
    @BeanReference(type = com.example.sb.service.Entity1LocalService.class)
    protected com.example.sb.service.Entity1LocalService entity1LocalService;
    @BeanReference(type = Entity1Persistence.class)
    protected Entity1Persistence entity1Persistence;
    @BeanReference(type = com.example.sb.service.Entity2LocalService.class)
    protected com.example.sb.service.Entity2LocalService entity2LocalService;
    @BeanReference(type = Entity2Persistence.class)
    protected Entity2Persistence entity2Persistence;
    @BeanReference(type = com.example.sb.service.EntityALocalService.class)
    protected com.example.sb.service.EntityALocalService entityALocalService;
    @BeanReference(type = EntityAPersistence.class)
    protected EntityAPersistence entityAPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private Entity2LocalServiceClpInvoker _clpInvoker = new Entity2LocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.example.sb.service.Entity2LocalServiceUtil} to access the entity2 local service.
     */

    /**
     * Adds the entity2 to the database. Also notifies the appropriate model listeners.
     *
     * @param entity2 the entity2
     * @return the entity2 that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Entity2 addEntity2(Entity2 entity2) throws SystemException {
        entity2.setNew(true);

        return entity2Persistence.update(entity2);
    }

    /**
     * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
     *
     * @param id the primary key for the new entity2
     * @return the new entity2
     */
    @Override
    public Entity2 createEntity2(long id) {
        return entity2Persistence.create(id);
    }

    /**
     * Deletes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the entity2
     * @return the entity2 that was removed
     * @throws PortalException if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Entity2 deleteEntity2(long id)
        throws PortalException, SystemException {
        return entity2Persistence.remove(id);
    }

    /**
     * Deletes the entity2 from the database. Also notifies the appropriate model listeners.
     *
     * @param entity2 the entity2
     * @return the entity2 that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Entity2 deleteEntity2(Entity2 entity2) throws SystemException {
        return entity2Persistence.remove(entity2);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Entity2.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return entity2Persistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return entity2Persistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return entity2Persistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return entity2Persistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return entity2Persistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Entity2 fetchEntity2(long id) throws SystemException {
        return entity2Persistence.fetchByPrimaryKey(id);
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
    public Entity2 getEntity2(long id) throws PortalException, SystemException {
        return entity2Persistence.findByPrimaryKey(id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return entity2Persistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Entity2> getEntity2s(int start, int end)
        throws SystemException {
        return entity2Persistence.findAll(start, end);
    }

    /**
     * Returns the number of entity2s.
     *
     * @return the number of entity2s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getEntity2sCount() throws SystemException {
        return entity2Persistence.countAll();
    }

    /**
     * Updates the entity2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param entity2 the entity2
     * @return the entity2 that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Entity2 updateEntity2(Entity2 entity2) throws SystemException {
        return entity2Persistence.update(entity2);
    }

    /**
     * Returns the entity1 local service.
     *
     * @return the entity1 local service
     */
    public com.example.sb.service.Entity1LocalService getEntity1LocalService() {
        return entity1LocalService;
    }

    /**
     * Sets the entity1 local service.
     *
     * @param entity1LocalService the entity1 local service
     */
    public void setEntity1LocalService(
        com.example.sb.service.Entity1LocalService entity1LocalService) {
        this.entity1LocalService = entity1LocalService;
    }

    /**
     * Returns the entity1 persistence.
     *
     * @return the entity1 persistence
     */
    public Entity1Persistence getEntity1Persistence() {
        return entity1Persistence;
    }

    /**
     * Sets the entity1 persistence.
     *
     * @param entity1Persistence the entity1 persistence
     */
    public void setEntity1Persistence(Entity1Persistence entity1Persistence) {
        this.entity1Persistence = entity1Persistence;
    }

    /**
     * Returns the entity2 local service.
     *
     * @return the entity2 local service
     */
    public com.example.sb.service.Entity2LocalService getEntity2LocalService() {
        return entity2LocalService;
    }

    /**
     * Sets the entity2 local service.
     *
     * @param entity2LocalService the entity2 local service
     */
    public void setEntity2LocalService(
        com.example.sb.service.Entity2LocalService entity2LocalService) {
        this.entity2LocalService = entity2LocalService;
    }

    /**
     * Returns the entity2 persistence.
     *
     * @return the entity2 persistence
     */
    public Entity2Persistence getEntity2Persistence() {
        return entity2Persistence;
    }

    /**
     * Sets the entity2 persistence.
     *
     * @param entity2Persistence the entity2 persistence
     */
    public void setEntity2Persistence(Entity2Persistence entity2Persistence) {
        this.entity2Persistence = entity2Persistence;
    }

    /**
     * Returns the entity a local service.
     *
     * @return the entity a local service
     */
    public com.example.sb.service.EntityALocalService getEntityALocalService() {
        return entityALocalService;
    }

    /**
     * Sets the entity a local service.
     *
     * @param entityALocalService the entity a local service
     */
    public void setEntityALocalService(
        com.example.sb.service.EntityALocalService entityALocalService) {
        this.entityALocalService = entityALocalService;
    }

    /**
     * Returns the entity a persistence.
     *
     * @return the entity a persistence
     */
    public EntityAPersistence getEntityAPersistence() {
        return entityAPersistence;
    }

    /**
     * Sets the entity a persistence.
     *
     * @param entityAPersistence the entity a persistence
     */
    public void setEntityAPersistence(EntityAPersistence entityAPersistence) {
        this.entityAPersistence = entityAPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.example.sb.model.Entity2",
            entity2LocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.example.sb.model.Entity2");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Entity2.class;
    }

    protected String getModelClassName() {
        return Entity2.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = entity2Persistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
