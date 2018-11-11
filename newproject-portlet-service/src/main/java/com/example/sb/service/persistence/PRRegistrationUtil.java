package com.example.sb.service.persistence;

import com.example.sb.model.PRRegistration;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the p r registration service. This utility wraps {@link PRRegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see PRRegistrationPersistence
 * @see PRRegistrationPersistenceImpl
 * @generated
 */
public class PRRegistrationUtil {
    private static PRRegistrationPersistence _persistence;

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
    public static void clearCache(PRRegistration prRegistration) {
        getPersistence().clearCache(prRegistration);
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
    public static List<PRRegistration> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PRRegistration> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PRRegistration> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PRRegistration update(PRRegistration prRegistration)
        throws SystemException {
        return getPersistence().update(prRegistration);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PRRegistration update(PRRegistration prRegistration,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(prRegistration, serviceContext);
    }

    /**
    * Caches the p r registration in the entity cache if it is enabled.
    *
    * @param prRegistration the p r registration
    */
    public static void cacheResult(
        com.example.sb.model.PRRegistration prRegistration) {
        getPersistence().cacheResult(prRegistration);
    }

    /**
    * Caches the p r registrations in the entity cache if it is enabled.
    *
    * @param prRegistrations the p r registrations
    */
    public static void cacheResult(
        java.util.List<com.example.sb.model.PRRegistration> prRegistrations) {
        getPersistence().cacheResult(prRegistrations);
    }

    /**
    * Creates a new p r registration with the primary key. Does not add the p r registration to the database.
    *
    * @param registrationId the primary key for the new p r registration
    * @return the new p r registration
    */
    public static com.example.sb.model.PRRegistration create(
        long registrationId) {
        return getPersistence().create(registrationId);
    }

    /**
    * Removes the p r registration with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param registrationId the primary key of the p r registration
    * @return the p r registration that was removed
    * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.PRRegistration remove(
        long registrationId)
        throws com.example.sb.NoSuchPRRegistrationException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(registrationId);
    }

    public static com.example.sb.model.PRRegistration updateImpl(
        com.example.sb.model.PRRegistration prRegistration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(prRegistration);
    }

    /**
    * Returns the p r registration with the primary key or throws a {@link com.example.sb.NoSuchPRRegistrationException} if it could not be found.
    *
    * @param registrationId the primary key of the p r registration
    * @return the p r registration
    * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.PRRegistration findByPrimaryKey(
        long registrationId)
        throws com.example.sb.NoSuchPRRegistrationException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(registrationId);
    }

    /**
    * Returns the p r registration with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param registrationId the primary key of the p r registration
    * @return the p r registration, or <code>null</code> if a p r registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.PRRegistration fetchByPrimaryKey(
        long registrationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(registrationId);
    }

    /**
    * Returns all the p r registrations.
    *
    * @return the p r registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.PRRegistration> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the p r registrations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of p r registrations
    * @param end the upper bound of the range of p r registrations (not inclusive)
    * @return the range of p r registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.PRRegistration> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the p r registrations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of p r registrations
    * @param end the upper bound of the range of p r registrations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of p r registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.sb.model.PRRegistration> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the p r registrations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of p r registrations.
    *
    * @return the number of p r registrations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PRRegistrationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PRRegistrationPersistence) PortletBeanLocatorUtil.locate(com.example.sb.service.ClpSerializer.getServletContextName(),
                    PRRegistrationPersistence.class.getName());

            ReferenceRegistry.registerReference(PRRegistrationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PRRegistrationPersistence persistence) {
    }
}
