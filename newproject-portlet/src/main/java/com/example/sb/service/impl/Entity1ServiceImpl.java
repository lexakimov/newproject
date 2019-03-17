package com.example.sb.service.impl;

import com.example.sb.model.Entity1;
import com.example.sb.service.Entity1LocalServiceUtil;
import com.example.sb.service.base.Entity1ServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.ac.AccessControlled;


public class Entity1ServiceImpl extends Entity1ServiceBaseImpl {

	@AccessControlled(guestAccessEnabled = true)
	public String[] getEntity() {
		String[] array = {"key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4"};
		return array;
	}

	@AccessControlled(guestAccessEnabled = true)
	public Entity1 getEntity1(long id) throws PortalException, SystemException {
		return entity1LocalService.getEntity1(id);
	}

	@AccessControlled(guestAccessEnabled = true)
	public Entity1 addEntity1(String status) throws SystemException {
		long increment = CounterLocalServiceUtil.increment(Entity1.class.getName());
		Entity1 entity1 = Entity1LocalServiceUtil.createEntity1(increment);
		entity1.setStatus(status);
		entity1.persist();

		return entity1;
	}

	@AccessControlled(guestAccessEnabled = true)
	public String getEntity(long id) throws PortalException, SystemException {
		Entity1 entity1 = Entity1LocalServiceUtil.getEntity1(id);

		return entity1.toXmlString();
	}

}
