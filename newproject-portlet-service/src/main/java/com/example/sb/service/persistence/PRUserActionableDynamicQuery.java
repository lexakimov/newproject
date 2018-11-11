package com.example.sb.service.persistence;

import com.example.sb.model.PRUser;
import com.example.sb.service.PRUserLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author akimov
 * @generated
 */
public abstract class PRUserActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PRUserActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PRUserLocalServiceUtil.getService());
        setClass(PRUser.class);

        setClassLoader(com.example.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("prUserId");
    }
}
