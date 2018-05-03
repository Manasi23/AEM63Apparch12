package com.aem.community.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables = Resource.class)
//@Exporter(name = "jackson", extensions = "json")
public class Link {

	@Inject
	@Named("linkText")
	@Optional
	private String linkText;

	@Inject
	@Named("linkUrl")
	@Optional
	private String linkUrl;
	
	/*@Inject
	@Named("file")
	@Optional
	private String file;*/

	@PostConstruct
	protected void init() {

	}

	public String getLinkText() {
		return linkText;
	}

	public String getLinkUrl() {
		return linkUrl;
	}
	/*public String getFile() {
		return file;
	}*/
}