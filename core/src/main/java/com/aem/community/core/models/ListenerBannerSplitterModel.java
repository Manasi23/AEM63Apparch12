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

	
	
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ivselectorL")	 
	 public String ivselectorL = "";

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
	 
	 
	 /* - - ---------- RIGHT BANNER -- - -- - - - - - - - -*/
	 
	 @Inject
	 @Optional
	 @JsonIgnore
	 @JsonProperty("ivselectorR")
	 public String ivselectorR = "";

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
	 
	//  List implementation start
	 //@JsonProperty("List")
	 public List<Map<String, String>> leftlist = new ArrayList<>();
	 
	 public List<Map<String, String>> rightlist = new ArrayList<>();
	 
	 
	 public List<Map<String, String>> getLeftlist() {
			return leftlist;
		}
	 

		public List<Map<String, String>> getRightlist() {
			return rightlist;
		}


//  List implementation start

		
		

	@PostConstruct
    protected void init() {
		
		  
		
		if(ivselectorL.equals("image"))
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


	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getIvselectorL() {
		return ivselectorL;
	}


	public void setIvselectorL(String ivselectorL) {
		this.ivselectorL = ivselectorL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonIgnore
	public String getTitleL() {
		return titleL;
	}


	public void setTitleL(String titleL) {
		this.titleL = titleL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getImgurlL() {
		return imgurlL;
	}


	public void setImgurlL(String imgurlL) {
		this.imgurlL = imgurlL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getImgaltL() {
		return imgaltL;
	}


	public void setImgaltL(String imgaltL) {
		this.imgaltL = imgaltL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getCtatextL() {
		return ctatextL;
	}


	public void setCtatextL(String ctatextL) {
		this.ctatextL = ctatextL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getCtaurlL() {
		return ctaurlL;
	}


	public void setCtaurlL(String ctaurlL) {
		this.ctaurlL = ctaurlL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideolinkL() {
		return videolinkL;
	}


	public void setVideolinkL(String videolinkL) {
		this.videolinkL = videolinkL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideotextL() {
		return videotextL;
	}


	public void setVideotextL(String videotextL) {
		this.videotextL = videotextL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideoassetL() {
		return videoassetL;
	}


	public void setVideoassetL(String videoassetL) {
		this.videoassetL = videoassetL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getServerurlL() {
		return serverurlL;
	}


	public void setServerurlL(String serverurlL) {
		this.serverurlL = serverurlL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getEmailurlL() {
		return emailurlL;
	}


	public void setEmailurlL(String emailurlL) {
		this.emailurlL = emailurlL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideoserverurlL() {
		return videoserverurlL;
	}


	public void setVideoserverurlL(String videoserverurlL) {
		this.videoserverurlL = videoserverurlL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getPosterimageL() {
		return posterimageL;
	}


	public void setPosterimageL(String posterimageL) {
		this.posterimageL = posterimageL;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonIgnore
	public String getIvselectorR() {
		return ivselectorR;
	}


	public void setIvselectorR(String ivselectorR) {
		this.ivselectorR = ivselectorR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getTitleR() {
		return titleR;
	}


	public void setTitleR(String titleR) {
		this.titleR = titleR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getImgurlR() {
		return imgurlR;
	}


	public void setImgurlR(String imgurlR) {
		this.imgurlR = imgurlR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getImgaltR() {
		return imgaltR;
	}


	public void setImgaltR(String imgaltR) {
		this.imgaltR = imgaltR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getCtatextR() {
		return ctatextR;
	}


	public void setCtatextR(String ctatextR) {
		this.ctatextR = ctatextR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getCtaurlR() {
		return ctaurlR;
	}


	public void setCtaurlR(String ctaurlR) {
		this.ctaurlR = ctaurlR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideolinkR() {
		return videolinkR;
	}


	public void setVideolinkR(String videolinkR) {
		this.videolinkR = videolinkR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideotextR() {
		return videotextR;
	}


	public void setVideotextR(String videotextR) {
		this.videotextR = videotextR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideoassetR() {
		return videoassetR;
	}


	public void setVideoassetR(String videoassetR) {
		this.videoassetR = videoassetR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getServerurlR() {
		return serverurlR;
	}


	public void setServerurlR(String serverurlR) {
		this.serverurlR = serverurlR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getEmailurlR() {
		return emailurlR;
	}


	public void setEmailurlR(String emailurlR) {
		this.emailurlR = emailurlR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getVideoserverurlR() {
		return videoserverurlR;
	}


	public void setVideoserverurlR(String videoserverurlR) {
		this.videoserverurlR = videoserverurlR;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonIgnore
	public String getPosterimageR() {
		return posterimageR;
	}


	public void setPosterimageR(String posterimageR) {
		this.posterimageR = posterimageR;
	}









}
