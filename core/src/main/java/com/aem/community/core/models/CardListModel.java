package com.aem.community.core.models;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
 
@Model(adaptables=Resource.class, resourceType="AEM63App/components/content/card-list")
@Exporter(name="jackson", extensions ="json")
public class CardListModel {

		@Inject
	    private String title;

		@Inject
	    private String text;
		
		@Inject
		@Optional
		public Resource cardlist;
		


		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
}
