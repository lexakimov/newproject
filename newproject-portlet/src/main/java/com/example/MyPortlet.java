package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class MyPortlet extends MVCPortlet {

	private static final Log log = LogFactoryUtil.getLog(MyPortlet.class);

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String resourceID = resourceRequest.getResourceID();
		if ("sock".equals(resourceID)) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try (PrintWriter writer = resourceResponse.getWriter();) {
				writer.println("test message");
			}
		}
		super.serveResource(resourceRequest, resourceResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		//Test test = TestLocalServiceUtil.createTest(CounterLocalServiceUtil.increment(Test.class.getName()));
		File file = new File("C:\\Users\\akimov\\Desktop\\electric_gypsy.pdf");
		InputStream input = new FileInputStream(file);
		OutputBlob dataOutputBlob = new OutputBlob(input, file.length());
		//test.setData1(dataOutputBlob);
		//TestLocalServiceUtil.updateTest(test);
		input.close();

	}
	
	
	
}
