package com.example.integration;

import com.example.sb.model.Entity1;
import com.example.sb.service.Entity1LocalServiceUtil;
import com.liferay.portal.kernel.bean.BeanLocator;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.InitUtil;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Entity1Test {

	private static final Log logger = LogFactoryUtil.getLog(Entity1Test.class);

	@BeforeClass
	public static void beforeClass() {
		ClassLoader classLoader = ClassLoaderUtil.getContextClassLoader();
		PortletClassLoaderUtil.setClassLoader(classLoader);
		PortalClassLoaderUtil.setClassLoader(classLoader);
		InitUtil.initWithSpring();
		BeanLocator portalBeanLocator = PortalBeanLocatorUtil.getBeanLocator();
		PortletBeanLocatorUtil.setBeanLocator("newproject-portlet", portalBeanLocator);
	}

	@Before
	public void beforeEveryTest() {
		logger.info("Prepare for new test...");
	}

	@Test
	public void testClass() {
		logger.info("YES!!!");
		try {
			Entity1 entity1 = Entity1LocalServiceUtil.getEntity1(1);
			System.out.println(entity1.getStatus());
		} catch (SystemException | PortalException e) {
			e.printStackTrace();
		}

	}
}
