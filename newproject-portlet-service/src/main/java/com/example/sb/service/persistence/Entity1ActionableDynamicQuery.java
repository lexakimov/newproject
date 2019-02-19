package com.example.sb.service.persistence;

import com.example.sb.model.Entity1;
import com.example.sb.service.Entity1LocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author akimov
 * @generated
 */
public abstract class Entity1ActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Entity1ActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Entity1LocalServiceUtil.getService());
        setClass(Entity1.class);

        setClassLoader(com.example.sb.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
