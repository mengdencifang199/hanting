package com.accp.dao.lc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Services;
import com.accp.vo.lc.postVO;

public interface postDao {
		
	//热门查询
	  public List<postVO> queryRE(@Param("title") String title);
	  //我的帖子查询
	  public List<postVO> QueryWO(@Param("title") String title,@Param("name")  String name);
	  //我收藏的帖子查询
	  public List<postVO> QueryShou(@Param("title") String title,@Param("name")  String name);
	 //我的 留言
	  public List<postVO> QueryLiu(@Param("title") String title,@Param("name")  String name);
	//查询帖子
	  public List<postVO> QueryTie(@Param("postid") Integer postid);
	//查询帖子留言
	  public List<postVO> QueryTie1(@Param("postid") Integer postid);
	  //修改浏览人数
	  public void updateBrowseNumber(@Param("id")int id,@Param("postid") Integer number);
//	  public List<Services> query(@Param("id") int id);
	  
//	  public List<Appraisalapply> query1(@Param("id") int id);
	  
	  public List<postVO> querySHoucang(@Param("id") int id,@Param("postid") int postid);
	  
	  public void addShoucang(@Param("userid") int userid,@Param("postid") int postid);
	  
	  public void updateShoucang(@Param("userid") int userid ,@Param("postid") int postid);
	  
	  public void deleteShoucang(@Param("userid") int userid,@Param("postid") int postid);
}
