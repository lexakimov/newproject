package com.example.sb.service.persistence;

import com.example.sb.model.EntityA;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity a service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see EntityAPersistenceImpl
 * @see EntityAUtil
 * @generated
 */
public interface EntityAPersistence extends BasePersistence<EntityA> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EntityAUtil} to access the entity a persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity a in the entity cache if it is enabled.
    *
    * @param entityA the entity a
    */
    public void cacheResult(com.example.sb.model.EntityA entityA);

    /**
    * Caches the entity as in the entity cache if it is enabled.
    *
    * @param entityAs the entity as
    */
    public void cacheResult(
        java.util.List<com.example.sb.model.EntityA> entityAs);

    /**
    * Creates a new entity a with the primary key. Does not add the entity a to the database.
    *
    * @param id the primary key for the new entity a
    * @return the new entity a
    */
    public com.example.sb.model.EntityA create(long id);

    /**
    * Removes the entity a with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity a
    * @return the entity a that was removed
    * @throws com.example.sb.NoSuchEntityAException if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.EntityA remove(long id)
        throws com.example.sb.NoSuchEntityAException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.sb.model.EntityA updateImpl(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity a with the primary key or throws a {@link com.example.sb.NoSuchEntityAException} if it could not be found.
    *
    * @param id the primary key of the entity a
    * @return the entity a
    * @throws com.example.sb.NoSuchEntityAException if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.EntityA findByPrimaryKey(long id)
        throws com.example.sb.NoSuchEntityAException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity a with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the entity a
    * @return the entity a, or <code>null</code> if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.EntityA fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity as.
    *
    * @return the entity as
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.sb.model.EntityA> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.sb.model.EntityA> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the entity as.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of entity as
    * @param end the upper bound of the range of entity as (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of entity as
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.sb.model.EntityA> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity as from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity as.
    *
    * @return the number of entity as
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
