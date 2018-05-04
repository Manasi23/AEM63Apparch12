package com.aem.community.core.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@Model(adaptables = Resource.class, resourceType = "AEM63App/components/content/listenersplitbanner")
@Exporter(name = "jackson", extensions = "json", options = { @ExporterOption(name = "SerializationFeature.WRITE_DATES_AS_TIMESTAMPS", value = "true") })
public class ListenerBannerSplitterModel {

	
/* LEFT PORTION INJECTION */
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ivselectorL")	 
	 public String ivselectorL="";

	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("title")
	 public String titleL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("imgurlL")
	 public String imgurlL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("imgaltL")
	 public String imgaltL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ctatextL")
	 public String ctatextL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ctaurlL")
	 public String ctaurlL;

	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videolinkL")
	 public String videolinkL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videotextL")
	 public String videotextL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videoassetL")
	 public String videoassetL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("serverurlL")
	 public String serverurlL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("emailurlL")
	 public String emailurlL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videoserverurlL")
	 public String videoserverurlL;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("posterimageL")
	 public String posterimageL;
	 
	 
	 /* RIGHT PORTION INJECTION */
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ivselectorR")
	 public String ivselectorR="";

	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("title")
	 public String titleR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("imgurlR")
	 public String imgurlR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("imgaltR")
	 public String imgaltR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ctatextR")
	 public String ctatextR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ctaurlR")
	 public String ctaurlR;

	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videolinkR")
	 public String videolinkR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videotextR")
	 public String videotextR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videoassetR")
	 public String videoassetR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("serverurlR")
	 public String serverurlR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("emailurlR")
	 public String emailurlR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("videoserverurlR")
	 public String videoserverurlR;
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("posterimageR")
	 public String posterimageR;
	 

	 public List<Map<String, String>> leftlist = new ArrayList<>();
	 
	 public List<Map<String, String>> rightlist = new ArrayList<>();
	 
	 public List<Map<String, String>> testList = new ArrayList<>();
	 
	@PostConstruct
    protected void init() {
			
		ListenerBannerSplitterBean listenerBannerSplitterBean = new ListenerBannerSplitterBean( ivselectorL,  imgurlL,  imgaltL,  ctatextL,  ctaurlL, videolinkL,  videotextL,  videoassetL,  serverurlL,  emailurlL,  videoserverurlL,  ivselectorR,  titleR,  imgurlR,  imgaltR,  ctatextR,  ctaurlR,  videolinkR,  videotextR,  videoassetR,  serverurlR,  emailurlR,  videoserverurlR,  posterimageR); // Calling the contructor for Getters and Setters

		if(listenerBannerSplitterBean.ivselectorL.equals("image"))
		{
			videolinkL=null;
	        videotextL=null;
	        videoassetL=null;
	        serverurlL=null;
	        emailurlL=null;
	        videoserverurlL=null;
	        posterimageL=null;
	        
			Map<String, String> ivmap = new TreeMap<>();
					
			if (titleL!=null)
			ivmap.put("title", titleL);
			
			if (imgurlL!=null)
			ivmap.put("imgurl", imgurlL);
			
			if (imgaltL!=null)
			ivmap.put("imgalt", imgaltL);
			
			if (ctatextL!=null)
			ivmap.put("ctatext", ctatextL);
			
			if (ctaurlL!=null)
			ivmap.put("ctaurl", ctaurlL);
				
			leftlist.add(ivmap);
			
		}


		if(ivselectorL.equals("video"))
		{

			titleL=null;
	 		imgurlL=null;
	 		imgaltL=null;
		    ctatextL=null;
	 		ctaurlL=null;
			
	 		Map<String, String> ivmap = new TreeMap<>();
			
	 		if (videolinkL!=null)
	 		ivmap.put("videolink", videolinkL);
	 		
	 		if (videotextL!=null)
	 		ivmap.put("videotext", videotextL);
	 		
	 		if (videoassetL!=null)
	 		ivmap.put("videoasset", videoassetL);
	 		
	 		if (serverurlL!=null)
	 		ivmap.put("serverurl", serverurlL);
	 		
	 		if (emailurlL!=null)
	 		ivmap.put("emailurl", emailurlL);
	 		
	 		if (videoserverurlL!=null)
	 		ivmap.put("videoserverurl", videoserverurlL);
	 		
	 		if (posterimageL!=null)
	 		ivmap.put("posterimage", posterimageL);
				
			leftlist.add(ivmap);
			
			
		}
        
		if(ivselectorR.equals("image"))
		{

			videolinkR=null;
	        videotextR=null;
	        videoassetR=null;
	        serverurlR=null;
	        emailurlR=null;
	        videoserverurlR=null;
	        posterimageR=null;
	        
	        Map<String, String> ivmap = new TreeMap<>();
			
	        if (titleR!=null)
			ivmap.put("title", titleR);
	        
	        if (imgurlR!=null)
			ivmap.put("imgurl", imgurlR);
	        
	        if (imgaltR!=null)
			ivmap.put("imgalt", imgaltR);
	        
	        if (ctatextR!=null)
			ivmap.put("ctatext", ctatextR);
	        
	        if (ctaurlR!=null)
			ivmap.put("ctaurl", ctaurlR);
				
			rightlist.add(ivmap);
			
		}
		
		if(ivselectorR.equals("video"))
		{
			titleR=null;
	 		imgurlR=null;
	 		imgaltR=null;
		    ctatextR=null;
	 		ctaurlR=null;
			
	 		Map<String, String> ivmap = new TreeMap<>();
    		
	 		if (videolinkR!=null)
	 		ivmap.put("videolink", videolinkR);
	 		
	 		if (videotextR!=null)
	 		ivmap.put("videotext", videotextR);
	 		
	 		if (videoassetR!=null)
	 		ivmap.put("videoasset", videoassetR);
	 		
	 		if (serverurlR!=null)
	 		ivmap.put("serverurl", serverurlR);
	 		
	 		if (emailurlR!=null)
	 		ivmap.put("emailurl", emailurlR);
	 		
	 		if (videoserverurlR!=null)
	 		ivmap.put("videoserverurl", videoserverurlR);
	 		
	 		if (posterimageR!=null)
	 		ivmap.put("posterimage", posterimageR);
    			
    		rightlist.add(ivmap);
    		
		}

    }
	
	
	



}
