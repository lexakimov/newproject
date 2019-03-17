package com.example.sb.service.http;

import com.example.sb.service.Entity1ServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.example.sb.service.Entity1ServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.example.sb.model.Entity1Soap}.
 * If the method in the service utility returns a
 * {@link com.example.sb.model.Entity1}, that is translated to a
 * {@link com.example.sb.model.Entity1Soap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author akimov
 * @see Entity1ServiceHttp
 * @see com.example.sb.model.Entity1Soap
 * @see com.example.sb.service.Entity1ServiceUtil
 * @generated
 */
public class Entity1ServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(Entity1ServiceSoap.class);

    public static java.lang.String[] getEntity() throws RemoteException {
        try {
            java.lang.String[] returnValue = Entity1ServiceUtil.getEntity();

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.example.sb.model.Entity1Soap getEntity1(long id)
        throws RemoteException {
        try {
            com.example.sb.model.Entity1 returnValue = Entity1ServiceUtil.getEntity1(id);

            return com.example.sb.model.Entity1Soap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.example.sb.model.Entity1Soap addEntity1(
        java.lang.String status) throws RemoteException {
        try {
            com.example.sb.model.Entity1 returnValue = Entity1ServiceUtil.addEntity1(status);

            return com.example.sb.model.Entity1Soap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String getEntity(long id) throws RemoteException {
        try {
            java.lang.String returnValue = Entity1ServiceUtil.getEntity(id);

            return returnValue;
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
