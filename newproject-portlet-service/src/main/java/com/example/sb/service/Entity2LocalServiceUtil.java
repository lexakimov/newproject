package com.example.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Entity2. This utility wraps
 * {@link com.example.sb.service.impl.Entity2LocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author akimov
 * @see Entity2LocalService
 * @see com.example.sb.service.base.Entity2LocalServiceBaseImpl
 * @see com.example.sb.service.impl.Entity2LocalServiceImpl
 * @generated
 */
public class Entity2LocalServiceUtil {
    private static Entity2LocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.sb.service.impl.Entity2LocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the entity2 to the database. Also notifies the appropriate model listeners.
    *
    * @param entity2 the entity2
    * @return the entity2 that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 addEntity2(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntity2(entity2);
    }

    /**
    * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
    *
    * @param id the primary key for the new entity2
    * @return the new entity2
    */
    public static com.example.sb.model.Entity2 createEntity2(long id) {
        return getService().createEntity2(id);
    }

    /**
    * Deletes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity2
    * @return the entity2 that was removed
    * @throws PortalException if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 deleteEntity2(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntity2(id);
    }

    /**
    * Deletes the entity2 from the database. Also notifies the appropriate model listeners.
    *
    * @param entity2 the entity2
    * @return the entity2 that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 deleteEntity2(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntity2(entity2);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.example.sb.model.Entity2 fetchEntity2(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEntity2(id);
    }

    /**
    * Returns the entity2 with the primary key.
    *
    * @param id the primary key of the entity2
    * @return the entity2
    * @throws PortalException if a entity2 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 getEntity2(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntity2(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.example.sb.model.Entity2> getEntity2s(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntity2s(start, end);
    }

    /**
    * Returns the number of entity2s.
    *
    * @return the number of entity2s
    * @throws SystemException if a system exception occurred
    */
    public static int getEntity2sCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntity2sCount();
    }

    /**
    * Updates the entity2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entity2 the entity2
    * @return the entity2 that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.Entity2 updateEntity2(
        com.example.sb.model.Entity2 entity2)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEntity2(entity2);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static Entity2LocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Entity2LocalService.class.getName());

            if (invokableLocalService instanceof Entity2LocalService) {
                _service = (Entity2LocalService) invokableLocalService;
            } else {
                _service = new Entity2LocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Entity2LocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Entity2LocalService service) {
    }
}
