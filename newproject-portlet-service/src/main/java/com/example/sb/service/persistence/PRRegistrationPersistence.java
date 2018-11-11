package com.example.sb.service.persistence;

import com.example.sb.model.PRRegistration;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the p r registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see PRRegistrationPersistenceImpl
 * @see PRRegistrationUtil
 * @generated
 */
public interface PRRegistrationPersistence extends BasePersistence<PRRegistration> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PRRegistrationUtil} to access the p r registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the p r registration in the entity cache if it is enabled.
    *
    * @param prRegistration the p r registration
    */
    public void cacheResult(com.example.sb.model.PRRegistration prRegistration);

    /**
    * Caches the p r registrations in the entity cache if it is enabled.
    *
    * @param prRegistrations the p r registrations
    */
    public void cacheResult(
        java.util.List<com.example.sb.model.PRRegistration> prRegistrations);

    /**
    * Creates a new p r registration with the primary key. Does not add the p r registration to the database.
    *
    * @param registrationId the primary key for the new p r registration
    * @return the new p r registration
    */
    public com.example.sb.model.PRRegistration create(long registrationId);

    /**
    * Removes the p r registration with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param registrationId the primary key of the p r registration
    * @return the p r registration that was removed
    * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.PRRegistration remove(long registrationId)
        throws com.example.sb.NoSuchPRRegistrationException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.sb.model.PRRegistration updateImpl(
        com.example.sb.model.PRRegistration prRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the p r registration with the primary key or throws a {@link com.example.sb.NoSuchPRRegistrationException} if it could not be found.
    *
    * @param registrationId the primary key of the p r registration
    * @return the p r registration
    * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.PRRegistration findByPrimaryKey(
        long registrationId)
        throws com.example.sb.NoSuchPRRegistrationException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the p r registration with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param registrationId the primary key of the p r registration
    * @return the p r registration, or <code>null</code> if a p r registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.PRRegistration fetchByPrimaryKey(
        long registrationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the p r registrations.
    *
    * @return the p r registrations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.sb.model.PRRegistration> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.sb.model.PRRegistration> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.sb.model.PRRegistration> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the p r registrations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of p r registrations.
    *
    * @return the number of p r registrations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
