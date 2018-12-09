package com.example.sb.service.persistence;

import com.example.sb.model.Entity2;
import com.example.sb.service.Entity2LocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author akimov
 * @generated
 */
public abstract class Entity2ActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Entity2ActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Entity2LocalServiceUtil.getService());
        setClass(Entity2.class);

        setClassLoader(com.example.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
