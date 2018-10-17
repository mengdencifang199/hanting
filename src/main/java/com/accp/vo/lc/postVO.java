package com.accp.vo.lc;

import java.util.Date;

public class postVO {
	   private String username;

	    private String userimgpath;
	    
	    
		private Integer postid;

		private Integer userid;

		private Integer browsenumber;

		private Integer commentnumber;

		private Integer fabulousnumber;

		private Integer collectionnumber;

		private Integer fmid;

		private String title;

		private Date releasetime;

		private Integer operatingstate;

		private Integer recommend;

		
		private String content;

		private String adminopinion;
	

		private Integer commentator;

		private Integer pid;

		private Integer pcid;
		
			private Date reviewtime;

		    private Integer coperatingstate;

		    private String ccontent;
		    

		    private Integer sort;

		    private String fmname;

		    private Boolean auditstatus;

		    private Boolean giftintegral;

		    private Integer adminid;

		    private Integer servicecopies;
		    
	
		public postVO() {
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param username
		 * @param userimgpath
		 * @param postid
		 * @param userid
		 * @param browsenumber
		 * @param commentnumber
		 * @param fabulousnumber
		 * @param collectionnumber
		 * @param fmid
		 * @param title
		 * @param releasetime
		 * @param operatingstate
		 * @param recommend
		 * @param content
		 * @param adminopinion
		 * @param commentator
		 * @param pid
		 * @param pcid
		 * @param reviewtime
		 * @param coperatingstate
		 * @param ccontent
		 * @param sort
		 * @param fmname
		 * @param auditstatus
		 * @param giftintegral
		 * @param adminid
		 * @param servicecopies
		 */
		public postVO(String username, String userimgpath, Integer postid, Integer userid, Integer browsenumber,
				Integer commentnumber, Integer fabulousnumber, Integer collectionnumber, Integer fmid, String title,
				Date releasetime, Integer operatingstate, Integer recommend, String content, String adminopinion,
				Integer commentator, Integer pid, Integer pcid, Date reviewtime, Integer coperatingstate,
				String ccontent, Integer sort, String fmname, Boolean auditstatus, Boolean giftintegral,
				Integer adminid, Integer servicecopies) {
			super();
			this.username = username;
			this.userimgpath = userimgpath;
			this.postid = postid;
			this.userid = userid;
			this.browsenumber = browsenumber;
			this.commentnumber = commentnumber;
			this.fabulousnumber = fabulousnumber;
			this.collectionnumber = collectionnumber;
			this.fmid = fmid;
			this.title = title;
			this.releasetime = releasetime;
			this.operatingstate = operatingstate;
			this.recommend = recommend;
			this.content = content;
			this.adminopinion = adminopinion;
			this.commentator = commentator;
			this.pid = pid;
			this.pcid = pcid;
			this.reviewtime = reviewtime;
			this.coperatingstate = coperatingstate;
			this.ccontent = ccontent;
			this.sort = sort;
			this.fmname = fmname;
			this.auditstatus = auditstatus;
			this.giftintegral = giftintegral;
			this.adminid = adminid;
			this.servicecopies = servicecopies;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getUserimgpath() {
			return userimgpath;
		}

		public void setUserimgpath(String userimgpath) {
			this.userimgpath = userimgpath;
		}

		public Integer getPostid() {
			return postid;
		}

		public void setPostid(Integer postid) {
			this.postid = postid;
		}

		public Integer getUserid() {
			return userid;
		}

		public void setUserid(Integer userid) {
			this.userid = userid;
		}

		public Integer getBrowsenumber() {
			return browsenumber;
		}

		public void setBrowsenumber(Integer browsenumber) {
			this.browsenumber = browsenumber;
		}

		public Integer getCommentnumber() {
			return commentnumber;
		}

		public void setCommentnumber(Integer commentnumber) {
			this.commentnumber = commentnumber;
		}

		public Integer getFabulousnumber() {
			return fabulousnumber;
		}

		public void setFabulousnumber(Integer fabulousnumber) {
			this.fabulousnumber = fabulousnumber;
		}

		public Integer getCollectionnumber() {
			return collectionnumber;
		}

		public void setCollectionnumber(Integer collectionnumber) {
			this.collectionnumber = collectionnumber;
		}

		public Integer getFmid() {
			return fmid;
		}

		public void setFmid(Integer fmid) {
			this.fmid = fmid;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Date getReleasetime() {
			return releasetime;
		}

		public void setReleasetime(Date releasetime) {
			this.releasetime = releasetime;
		}

		public Integer getOperatingstate() {
			return operatingstate;
		}

		public void setOperatingstate(Integer operatingstate) {
			this.operatingstate = operatingstate;
		}

		public Integer getRecommend() {
			return recommend;
		}

		public void setRecommend(Integer recommend) {
			this.recommend = recommend;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getAdminopinion() {
			return adminopinion;
		}

		public void setAdminopinion(String adminopinion) {
			this.adminopinion = adminopinion;
		}

		public Integer getCommentator() {
			return commentator;
		}

		public void setCommentator(Integer commentator) {
			this.commentator = commentator;
		}

		public Integer getPid() {
			return pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

		public Integer getPcid() {
			return pcid;
		}

		public void setPcid(Integer pcid) {
			this.pcid = pcid;
		}

		public Date getReviewtime() {
			return reviewtime;
		}

		public void setReviewtime(Date reviewtime) {
			this.reviewtime = reviewtime;
		}

		public Integer getCoperatingstate() {
			return coperatingstate;
		}

		public void setCoperatingstate(Integer coperatingstate) {
			this.coperatingstate = coperatingstate;
		}

		public String getCcontent() {
			return ccontent;
		}

		public void setCcontent(String ccontent) {
			this.ccontent = ccontent;
		}

		public Integer getSort() {
			return sort;
		}

		public void setSort(Integer sort) {
			this.sort = sort;
		}

		public String getFmname() {
			return fmname;
		}

		public void setFmname(String fmname) {
			this.fmname = fmname;
		}

		public Boolean getAuditstatus() {
			return auditstatus;
		}

		public void setAuditstatus(Boolean auditstatus) {
			this.auditstatus = auditstatus;
		}

		public Boolean getGiftintegral() {
			return giftintegral;
		}

		public void setGiftintegral(Boolean giftintegral) {
			this.giftintegral = giftintegral;
		}

		public Integer getAdminid() {
			return adminid;
		}

		public void setAdminid(Integer adminid) {
			this.adminid = adminid;
		}

		public Integer getServicecopies() {
			return servicecopies;
		}

		public void setServicecopies(Integer servicecopies) {
			this.servicecopies = servicecopies;
		}

		

		
	
}
