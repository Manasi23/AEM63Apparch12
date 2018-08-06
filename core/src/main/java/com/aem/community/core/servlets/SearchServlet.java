package com.aem.community.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class,
			property = {
					Constants.SERVICE_DESCRIPTION + "= Search Servlet", 
					"sling.servlet.method=" + HttpConstants.METHOD_GET,
					"sling.servlet.resourceTypes=" + "sling/servlet/default",
					"sling.servlet.selectors=" + "searchConditionalContent",
					"sling.servlet.extensions=json" 
			})
public class SearchServlet extends SlingSafeMethodsServlet{
	private final Logger log = LoggerFactory.getLogger(getClass());
    private static final long serialVersionUID = 2598426539166789515L;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException
    {
        log.debug("In doGet Method");
        response.setContentType("application/json");

        final String path = request.getRequestPathInfo().getResourcePath();
        final String variantId = request.getParameter("variantId");
        final String tagsParam = request.getParameter("tags");
        final String forDateTime = request.getParameter("forDateTime");

        log.debug("Path => " + path + "\t " + "Tags => " + tagsParam + "\t " + "Variant ID => " + variantId + "\t "
                + "forDateTime =>" + forDateTime);

        String responseStr = "";

        /*if (StringUtils.isNotEmpty(responseStr))
        {
            response.getWriter().write(responseStr);
        } else*/
        {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);

        }
    }

}
