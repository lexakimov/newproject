package com.example.sb.service.persistence;

import com.example.sb.model.EntityA;
import com.example.sb.service.EntityALocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author akimov
 * @generated
 */
public abstract class EntityAActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntityAActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntityALocalServiceUtil.getService());
        setClass(EntityA.class);

        setClassLoader(com.example.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
