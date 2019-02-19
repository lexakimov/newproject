package com.example.sb.service.messaging;

import com.example.sb.service.ClpSerializer;
import com.example.sb.service.Entity1LocalServiceUtil;
import com.example.sb.service.Entity1ServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            Entity1LocalServiceUtil.clearService();

            Entity1ServiceUtil.clearService();
        }
    }
}
