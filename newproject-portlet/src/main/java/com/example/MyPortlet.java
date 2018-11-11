package com.example;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import java.io.IOException;

public class MyPortlet extends MVCPortlet {
	
	private static final Log log = LogFactoryUtil.getLog(MyPortlet.class);
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		log.debug("debug!");
		log.info("\nAtributes");
		/*Enumeration<String> attributeNames = actionRequest.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String element = attributeNames.nextElement();
			log.info(element + " : " + actionRequest.getAttribute(element));
		}

		log.info("\nParams");
		for (Entry<String, String[]> string : actionRequest.getParameterMap().entrySet()) {
			log.info(string.getKey() + " - " + Arrays.deepToString(string.getValue()));
		}

		log.info("\nRender Params");
		for (Entry<String, String[]> string : actionResponse.getRenderParameterMap().entrySet()) {
			log.info(string.getKey() + " - " + Arrays.deepToString(string.getValue()));
		}*/
		
		/*try {
		*//*	FirstEntity entity = FirstEntityLocalServiceUtil.getFirstEntity(1);
			entity.setTestId(ParamUtil.getLong(actionRequest, "testAuiInput", 0));
			FirstEntityLocalServiceUtil.updateFirstEntity(entity);*//*
		} catch (SystemException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		// WebappClassLoader classloader =
		// (WebappClassLoader)PortletBeanLocatorUtil.locate("portletClassLoader");

		// System.out.println(classloader.getJarPath());
		/*
		 * for (String string :
		 * PortletBeanLocatorUtil.getBeanLocator().getNames()) {
		 * System.out.println(string); }
		 */

		copyRequestParameters = true;
		super.processAction(actionRequest, actionResponse);
	}
}
