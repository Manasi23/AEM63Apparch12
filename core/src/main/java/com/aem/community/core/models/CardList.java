package com.aem.community.core.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.factory.ModelFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, resourceType ="AEM63App/components/content/card-list")
@Exporter(name = "jackson", extensions = "json")
public class CardList {
	private final static Logger logger = LoggerFactory.getLogger(CardList.class);
	@Inject
	@Optional
	private String title;

	@Inject
	@Optional
	private String text;
	
	@Inject
	@Optional
	@Named("items")
	private Resource linksResource;

	private List<Link> cards;

	@PostConstruct
	protected void init() {
		logger.info("Executing Init ***");
		cards = new ArrayList<Link>();
		if (linksResource != null) {
			logger.info("linksResource is NULL");
			linksResource.getChildren().forEach(n ->{
			cards.add(n.adaptTo(Link.class));
			});
		}
	}


	public String getTitle() {
		return title;
	}
	public String getText() {
			return text;
	}
	public List<Link> getCards() {
		return cards;
	}
}