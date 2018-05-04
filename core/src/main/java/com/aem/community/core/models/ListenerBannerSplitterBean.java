package com.aem.community.core.models;

import java.util.List;
import java.util.Map;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Model(adaptables = Resource.class, resourceType = "AEM63App/components/content/listenersplitbanner")
public class ListenerBannerSplitterBean extends ListenerBannerSplitterModel{
	
	ListenerBannerSplitterBean(
			String ivselectorL, String imgurlL, String imgaltL, String ctatextL, String ctaurlL, String videolinkL, String videotextL, String videoassetL, String serverurlL, String emailurlL, String videoserverurlL, String ivselectorR, String titleR, String imgurlR, String imgaltR, String ctatextR, String ctaurlR, String videolinkR, String videotextR, String videoassetR, String serverurlR, String emailurlR, String videoserverurlR, String posterimageR)
	{
		
		getIvselectorL();
		setIvselectorL(ivselectorL);
		getTitleL();
		setTitleL(titleL);
		getImgurlL();
		setImgurlL(imgurlL);
		getImgaltL();
		setImgaltL(imgaltL);
		getCtatextL();
		setCtatextL(ctatextL);
		getCtaurlL();
		setCtaurlL(ctaurlL);
		
		getVideolinkL();
		setVideolinkL(videolinkL);
		getVideotextL();
		setVideotextL(videotextL);
		getVideoassetL();
		setVideoassetL(videoassetL);
		getServerurlL();
		setServerurlL(serverurlL);
		getEmailurlL();
		setEmailurlL(emailurlL);
		getVideoserverurlL();
		setVideoserverurlL(videoserverurlL);
		getPosterimageL();
		setPosterimageL(posterimageL);
		
		
		getIvselectorR();
		setIvselectorR(ivselectorR);
		getTitleR();
		setTitleR(titleR);
		getImgurlR();
		setImgurlR(imgurlR);
		getImgaltR();
		setImgaltR(imgaltR);
		getCtatextR();
		setCtatextR(ctatextR);
		getCtaurlR();
		setCtaurlR(ctaurlR);
		
		getVideolinkR();
		setVideolinkR(videolinkR);
		getVideotextR();
		setVideotextR(videotextR);
		getVideoassetR();
		setVideoassetR(videoassetR);
		getServerurlR();
		setServerurlR(serverurlR);
		getEmailurlR();
		setEmailurlR(emailurlR);
		getVideoserverurlR();
		setVideoserverurlR(videoserverurlR);
		getPosterimageR();
		setPosterimageR(posterimageR);
		
		getLeftlist();
		getRightlist();
				
		
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


	public List<Map<String, String>> getLeftlist() {
			return leftlist;
		}
	 
	public List<Map<String, String>> getRightlist() {
			return rightlist;
		}

	

}
