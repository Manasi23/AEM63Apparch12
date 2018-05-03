package com.aem.community.core.models;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Model(adaptables=Resource.class,resourceType = "AEM63App/components/content/productbanner")
@Exporter(name = "jackson", extensions = "json")
@JsonIgnoreProperties({"skipp"}) 
public class ProductBanner
{
  @Inject
  @Optional
  public Resource products;
 
  @Inject
  //@ValueMapValue
  @Optional
  public String imagepath;
  
  @Inject
  @Optional  
  public String imageheading;
  
  @Inject
  @Optional  
  public String cta;
  
  @Inject
  @Named("jcr:primaryType")
  @JsonIgnore
  @JsonProperty("jcr:primaryType")
  //@JsonInclude(JsonInclude.Include.valueOf("heading product"))
  public String skipp;
  
  
  public String getSkipp() {
	return skipp;
}

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