package com.aem.community.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables={Resource.class},resourceType = "AEM63App/components/content/productbanner")
@Exporter(name = "jackson", extensions = "json")
public class ProductBanner
{
  @Inject
  @Optional
  public Resource products;
  
  @Inject
  @Optional
  public String imagepath;
  
  @Inject
  @Optional  
  public String imageheading;
  
  @Inject
  @Optional  
  public String cta;
  
  
  public String getImagepath() {
	return imagepath;
}

public void setImagepath(String imagepath) {
	this.imagepath = imagepath;
}

public String getImageheading() {
	return imageheading;
}

public void setImageheading(String imageheading) {
	this.imageheading = imageheading;
}

public String getCta() {
	return cta;
}

public void setCta(String cta) {
	this.cta = cta;
}

  
}