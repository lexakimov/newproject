package com.example.sb.service.persistence;

import com.example.sb.model.Entity2;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entity2 service. This utility wraps {@link Entity2PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see Entity2Persistence
 * @see Entity2PersistenceImpl
 * @generated
 */
public class Entity2Util {
    private static Entity2Persistence _persistence;

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
    public static void clearCache(Entity2 entity2) {
        getPersistence().clearCache(entity2);
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
    public static List<Entity2> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Entity2> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Entity2> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Entity2 update(Entity2 entity2) throws SystemException {
        return getPersistence().update(entity2);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Entity2 update(Entity2 entity2, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(entity2, serviceContext);
    }

    /**
    * Caches the entity2 in the entity cache if it is enabled.
    *
    * @param entity2 the entity2
    */
    public static void cacheResult(com.example.sb.model.Entity2 entity2) {
        getPersistence().cacheResult(entity2);
    }

    /**
    * Caches the entity2s in the entity cache if it is enabled.
    *
    * @param entity2s the entity2s
    */
    public static void cacheResult(
        java.util.List<com.example.sb.model.Entity2> entity2s) {
        getPersistence().cacheResult(entity2s);
    }

    /**
    * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
    *
    * @param id the primary key for the new entity2
    * @return the new entity2
    */
    public static com.example.sb.model.Entity2 create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity2
    * @return the entity2 that was removed
    * @throws com.example.sb.NoSuchEntity2Exception if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 remove(long id)
        throws com.example.sb.NoSuchEntity2Exception,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.example.sb.model.Entity2 updateImpl(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(entity2);
    }

    /**
    * Returns the entity2 with the primary key or throws a {@link com.example.sb.NoSuchEntity2Exception} if it could not be found.
    *
    * @param id the primary key of the entity2
    * @return the entity2
    * @throws com.example.sb.NoSuchEntity2Exception if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 findByPrimaryKey(long id)
        throws com.example.sb.NoSuchEntity2Exception,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the entity2 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the entity2
    * @return the entity2, or <code>null</code> if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the entity2s.
    *
    * @return the entity2s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.Entity2> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.example.sb.model.Entity2> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the entity2s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity2s
    * @param end the upper bound of the range of entity2s (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity2s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.Entity2> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the entity2s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of entity2s.
    *
    * @return the number of entity2s
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Entity2Persistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Entity2Persistence) PortletBeanLocatorUtil.locate(com.example.sb.service.ClpSerializer.getServletContextName(),
                    Entity2Persistence.class.getName());

            ReferenceRegistry.registerReference(Entity2Util.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Entity2Persistence persistence) {
    }
}
