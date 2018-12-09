package com.example.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EntityA. This utility wraps
 * {@link com.example.sb.service.impl.EntityALocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author akimov
 * @see EntityALocalService
 * @see com.example.sb.service.base.EntityALocalServiceBaseImpl
 * @see com.example.sb.service.impl.EntityALocalServiceImpl
 * @generated
 */
public class EntityALocalServiceUtil {
    private static EntityALocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.sb.service.impl.EntityALocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the entity a to the database. Also notifies the appropriate model listeners.
    *
    * @param entityA the entity a
    * @return the entity a that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.EntityA addEntityA(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntityA(entityA);
    }

    /**
    * Creates a new entity a with the primary key. Does not add the entity a to the database.
    *
    * @param id the primary key for the new entity a
    * @return the new entity a
    */
    public static com.example.sb.model.EntityA createEntityA(long id) {
        return getService().createEntityA(id);
    }

    /**
    * Deletes the entity a with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the entity a
    * @return the entity a that was removed
    * @throws PortalException if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.EntityA deleteEntityA(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityA(id);
    }

    /**
    * Deletes the entity a from the database. Also notifies the appropriate model listeners.
    *
    * @param entityA the entity a
    * @return the entity a that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.EntityA deleteEntityA(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEntityA(entityA);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.example.sb.model.EntityA fetchEntityA(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEntityA(id);
    }

    /**
    * Returns the entity a with the primary key.
    *
    * @param id the primary key of the entity a
    * @return the entity a
    * @throws PortalException if a entity a with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.EntityA getEntityA(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityA(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.example.sb.model.EntityA> getEntityAs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityAs(start, end);
    }

    /**
    * Returns the number of entity as.
    *
    * @return the number of entity as
    * @throws SystemException if a system exception occurred
    */
    public static int getEntityAsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntityAsCount();
    }

    /**
    * Updates the entity a in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param entityA the entity a
    * @return the entity a that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.example.sb.model.EntityA updateEntityA(
        com.example.sb.model.EntityA entityA)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEntityA(entityA);
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

    public static EntityALocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EntityALocalService.class.getName());

            if (invokableLocalService instanceof EntityALocalService) {
                _service = (EntityALocalService) invokableLocalService;
            } else {
                _service = new EntityALocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EntityALocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EntityALocalService service) {
    }
}
