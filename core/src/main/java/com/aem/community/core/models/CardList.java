package com.aem.community.core.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.Via;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class, resourceType ="AEM63App/components/content/card-list")
@Exporter(name = "jackson", extensions = "json")
public class CardList {
	private final static Logger logger = LoggerFactory.getLogger(CardList.class);
	@Inject
	@Optional
	@Via("resource")
    private String title;

	@Inject
	@Optional
	@Via("resource")
    private String text;
	
	@Inject
	@Optional
	@Via("resource")
	@Named("items")
	private Resource linksResource;
	
	public java.util.List<Link> cards;

	@PostConstruct
	protected void init() {
		logger.info("Hello I am your Sling Model ***** 11");
		cards = new ArrayList<Link>();
		if (linksResource != null) {
			logger.info("Hello I am your Sling Model ***** 11!= null");
			populateModel(cards, linksResource);
		}
		if (linksResource == null) {
			logger.info("Hello I am your Sling Model ***** 11 == null");
		}
	}
	public static java.util.List<Link> populateModel(
			java.util.List<Link> array, Resource resource) {
		if (resource != null) {
			logger.info("Hello I am your Sling Model ***** populateModel");
			Iterator<Resource> linkResources = resource.listChildren();
			while (linkResources.hasNext()) {
				Link link = linkResources.next().adaptTo(Link.class);
				if (link != null)
					array.add(link);
				logger.info("linkurl= {}",link.getLinkText());
			}
		}
		return array;
	}
	
	public String getTitle() {
		return title;
	}

	public String getText() {
			return text;
	}

}