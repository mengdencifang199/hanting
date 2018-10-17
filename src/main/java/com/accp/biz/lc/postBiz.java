package com.accp.biz.lc;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.postDao;
import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Services;
import com.accp.vo.lc.postVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional()
public class postBiz {
	 @Autowired           
     private postDao dao;
	 //查询热门帖子
	 public PageInfo<postVO>  queryRE(Integer pageNum,Integer pageSize,String title){
 	    PageHelper.startPage(pageNum, pageSize);
 	    return new PageInfo<postVO>(dao.queryRE(title));            	    
   } 
	 //查询我的发帖
	 public PageInfo<postVO>  QueryWo(Integer pageNum,Integer pageSize,String title,String name){
	 	    PageHelper.startPage(pageNum, pageSize);
	 	    return new PageInfo<postVO>(dao.QueryWO(title,name));            	    
	   } 
	 //查询我的收藏
	 public PageInfo<postVO>  QueryShou(Integer pageNum,Integer pageSize,String title,String name){
	 	    PageHelper.startPage(pageNum, pageSize);
	 	    return new PageInfo<postVO>(dao.QueryShou(title,name));            	    
	   }   
	   //查询我的留言
	 public PageInfo<postVO>  QueryLiu(Integer pageNum,Integer pageSize,String title,String name){
	 	    PageHelper.startPage(pageNum, pageSize);
	 	    return new PageInfo<postVO>(dao.QueryLiu(title,name));            	    
	   }  
	 //查询帖子
	 public List<postVO>  QueryTie(Integer postid){
	 	    return  dao.QueryTie(postid);            	    
	   }  
	//查询帖子留言
	public PageInfo<postVO>   QueryTie1(Integer pageNum,Integer pageSize,Integer postid){
		PageHelper.startPage(pageNum, pageSize); 	 
		 return new PageInfo<postVO>(dao.QueryTie1(postid));            	    
		   }  
	//修改浏览
		public void  UpdateBrowseNumber(int id,Integer postid){
			 	 dao.updateBrowseNumber(id, postid);            	    
			   }     
	//222222
//		 public PageInfo<Services>  query(Integer pageNum,Integer pageSize,int id){
//	 	    PageHelper.startPage(pageNum, pageSize);
//	 	    return new PageInfo<Services>(dao.query(id));            	    
//	   } 
		 //33333
//		 public List<Appraisalapply>  query1(int id){
//			 return dao.query1(id);            	    
//		   } 
		
		//查询收藏过没
		 public List<postVO>  shouchang(int userid, int postid){
			 return dao.querySHoucang(userid,postid);
		   }
		 
		//修改收藏个数
		public void  UpdateShoucang(int id,Integer postid){
				 	 dao.updateShoucang(id, postid);            	    
				   }    
		//删除收藏个数
		public void  deleteShoucang(int id,Integer postid){
				 	 dao.deleteShoucang(id, postid);            	    
				   }   
		//添加收藏个数
		public void  addShoucang(int id,Integer postid){
					 dao.addShoucang(id, postid);            	    
					}    
}
