package com.example.sb.service.persistence;

import com.example.sb.model.PRRegistration;
import com.example.sb.service.PRRegistrationLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author akimov
 * @generated
 */
public abstract class PRRegistrationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PRRegistrationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PRRegistrationLocalServiceUtil.getService());
        setClass(PRRegistration.class);

        setClassLoader(com.example.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("registrationId");
    }
}
