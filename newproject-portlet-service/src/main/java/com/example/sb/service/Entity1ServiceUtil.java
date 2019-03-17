package com.example.sb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Entity1. This utility wraps
 * {@link com.example.sb.service.impl.Entity1ServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author akimov
 * @see Entity1Service
 * @see com.example.sb.service.base.Entity1ServiceBaseImpl
 * @see com.example.sb.service.impl.Entity1ServiceImpl
 * @generated
 */
public class Entity1ServiceUtil {
    private static Entity1Service _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.sb.service.impl.Entity1ServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    public static java.lang.String[] getEntity() {
        return getService().getEntity();
    }

    public static com.example.sb.model.Entity1 getEntity1(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntity1(id);
    }

    public static com.example.sb.model.Entity1 addEntity1(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEntity1(status);
    }

    public static java.lang.String getEntity(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEntity(id);
    }

    public static void clearService() {
        _service = null;
    }

    public static Entity1Service getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Entity1Service.class.getName());

            if (invokableService instanceof Entity1Service) {
                _service = (Entity1Service) invokableService;
            } else {
                _service = new Entity1ServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Entity1ServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Entity1Service service) {
    }
}
