package com.example.sb.service.persistence;

import com.example.sb.model.Entity1;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity1 service. This utility wraps {@link Entity1PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see Entity1Persistence
 * @see Entity1PersistenceImpl
 * @generated
 */
public class Entity1Util {
    private static Entity1Persistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Entity1 entity1) {
        getPersistence().clearCache(entity1);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Entity1> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Entity1> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Entity1> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Entity1 update(Entity1 entity1) throws SystemException {
        return getPersistence().update(entity1);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Entity1 update(Entity1 entity1, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entity1, serviceContext);
    }

    /**
    * Caches the entity1 in the entity cache if it is enabled.
    *
    * @param entity1 the entity1
    */
    public static void cacheResult(com.example.sb.model.Entity1 entity1) {
        getPersistence().cacheResult(entity1);
    }

    /**
    * Caches the entity1s in the entity cache if it is enabled.
    *
    * @param entity1s the entity1s
    */
    public static void cacheResult(
        java.util.List<com.example.sb.model.Entity1> entity1s) {
        getPersistence().cacheResult(entity1s);
    }

    /**
    * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
    *
    * @param id the primary key for the new entity1
    * @return the new entity1
    */
    public static com.example.sb.model.Entity1 create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity1
    * @return the entity1 that was removed
    * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity1 remove(long id)
        throws com.example.sb.NoSuchEntity1Exception,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.example.sb.model.Entity1 updateImpl(
        com.example.sb.model.Entity1 entity1)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entity1);
    }

    /**
    * Returns the entity1 with the primary key or throws a {@link com.example.sb.NoSuchEntity1Exception} if it could not be found.
    *
    * @param id the primary key of the entity1
    * @return the entity1
    * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity1 findByPrimaryKey(long id)
        throws com.example.sb.NoSuchEntity1Exception,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the entity1
    * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity1 fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the entity1s.
    *
    * @return the entity1s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.Entity1> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.example.sb.model.Entity1> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity1s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity1s
    * @param end the upper bound of the range of entity1s (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity1s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.Entity1> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity1s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity1s.
    *
    * @return the number of entity1s
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Entity1Persistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Entity1Persistence) PortletBeanLocatorUtil.locate(com.example.sb.service.ClpSerializer.getServletContextName(),
                    Entity1Persistence.class.getName());

            ReferenceRegistry.registerReference(Entity1Util.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Entity1Persistence persistence) {
    }
}
