package com.aem.community.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.factory.ModelFactory;

@Model(adaptables = SlingHttpServletRequest.class, resourceType ="AEM63App/components/structure/page")
@Exporter(name = "jackson", extensions = "json")
public class Page {
	
	@Inject
	@Optional
	@Via("resource")
	@Named("root")
	private Resource rootResource;
    
    @Inject
    private ModelFactory mf;
    
    private List<Object> components = new ArrayList<>();
    
	@PostConstruct
	public void init() {
		if(rootResource!=null) {
			rootResource.getChildren().forEach(responsiveGrid -> {
				if(responsiveGrid!=null) {
					responsiveGrid.getChildren().forEach(component ->{ 
						if(component!=null) {
							components.add(mf.getModelFromResource(component));
						}
					});
				}
			});
		}
			
	}

	public List<Object> getComponents() {
		return components;
	}
	
	}
	


