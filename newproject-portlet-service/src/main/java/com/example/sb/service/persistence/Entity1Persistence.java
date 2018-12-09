package com.example.sb.service.persistence;

import com.example.sb.model.Entity1;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entity1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see Entity1PersistenceImpl
 * @see Entity1Util
 * @generated
 */
public interface Entity1Persistence extends BasePersistence<Entity1> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Entity1Util} to access the entity1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the entity1 in the entity cache if it is enabled.
    *
    * @param entity1 the entity1
    */
    public void cacheResult(com.example.sb.model.Entity1 entity1);

    /**
    * Caches the entity1s in the entity cache if it is enabled.
    *
    * @param entity1s the entity1s
    */
    public void cacheResult(
        java.util.List<com.example.sb.model.Entity1> entity1s);

    /**
    * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
    *
    * @param id the primary key for the new entity1
    * @return the new entity1
    */
    public com.example.sb.model.Entity1 create(long id);

    /**
    * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity1
    * @return the entity1 that was removed
    * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.Entity1 remove(long id)
        throws com.example.sb.NoSuchEntity1Exception,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.sb.model.Entity1 updateImpl(
        com.example.sb.model.Entity1 entity1)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity1 with the primary key or throws a {@link com.example.sb.NoSuchEntity1Exception} if it could not be found.
    *
    * @param id the primary key of the entity1
    * @return the entity1
    * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.Entity1 findByPrimaryKey(long id)
        throws com.example.sb.NoSuchEntity1Exception,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the entity1
    * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.sb.model.Entity1 fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the entity1s.
    *
    * @return the entity1s
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.sb.model.Entity1> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.sb.model.Entity1> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.sb.model.Entity1> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the entity1s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of entity1s.
    *
    * @return the number of entity1s
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
