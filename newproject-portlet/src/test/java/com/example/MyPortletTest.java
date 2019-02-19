package com.example;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyPortletTest {

	@org.junit.Test
	public void serveResource() {
		HttpServletRequest request = mock(HttpServletRequest.class);
		when(request.getRemoteUser()).thenReturn("user");
	}

	@org.junit.Test
	public void processAction() {
	}

	@org.junit.Test
	public void testAction() {
	}
}