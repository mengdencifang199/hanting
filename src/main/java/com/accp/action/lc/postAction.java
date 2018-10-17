package com.accp.action.lc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.lc.postBiz;
import com.accp.pojo.Appraisalapply;
import com.accp.pojo.Services;
import com.accp.vo.lc.postVO;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/lc")
public class postAction {
	@Autowired
	private postBiz biz;
	//查新热门帖子
	@GetMapping("queryRE")
	public String getList(String title, Integer p, Integer s, Model model) {
		PageInfo<postVO> pageInfo = biz.queryRE(p, s,title);
		model.addAttribute("PAGE_INFO", pageInfo);
		model.addAttribute("title", title);
		return "PostRE";
	}
	//查询我的发帖
	@GetMapping("QueryWO")
	public String querywo(String name,String title, Integer p, Integer s, Model model) {
		PageInfo<postVO> pageInfo = biz.QueryWo(p, s,title,name);
		model.addAttribute("PAGE_INFO", pageInfo);
		model.addAttribute("title", title);
		return "wodePost";
	}
	//查询我的收藏
	@GetMapping("QueryShou")
	public String queryShou(String name,String title, Integer p, Integer s, Model model) {
		PageInfo<postVO> pageInfo = biz.QueryShou(p, s,title,name);
		model.addAttribute("PAGE_INFO", pageInfo);
		model.addAttribute("title", title);
		return "wodePost";
	}
	
	//查询我的收藏
		@GetMapping("QueryLiu")
		public String queryLiu(String name,String title, Integer p, Integer s, Model model) {
		PageInfo<postVO> pageInfo = biz.QueryLiu(p, s,title,name);
			model.addAttribute("PAGE_INFO", pageInfo);
			model.addAttribute("title", title);
			return "wodePost";
		}
		
		//查询帖子
			
				//查询帖子留言
				@GetMapping("QueryTie1")
				public String queryLiu(Integer postid, Integer p, Integer s, Model model) {
					List<postVO> pageInfo = biz.QueryTie(postid);
					model.addAttribute("PAGE_INFO", pageInfo);
					
					int a=pageInfo.get(0).getBrowsenumber();
					int id= a+1;
					biz.UpdateBrowseNumber(a+1,postid);
					
				PageInfo<postVO> pageInfo1 = biz.QueryTie1(p, s,postid);
				model.addAttribute("PAGE_INFO1", pageInfo1);
				return "Post";
				
				}
			//222222	
//			@GetMapping("query")
//				public String getLi(int id, Integer p, Integer s, Model model) {
//					PageInfo<Services> pageInfo = biz.query(p, s,id);
//					System.out.println(pageInfo.getList().size());
//					model.addAttribute("PAGE_INFO", pageInfo);
//					model.addAttribute("id", id);
//					return "index";
//			}	
				//33333
//			@GetMapping("query1")
//			public String getLi2(int id, Model model) {
//				List<Appraisalapply> pageInfo = biz.query1(id);
//				model.addAttribute("PAGE_INFO", pageInfo);
//				return "jianding";
//		}	
		
			
		//帖子收藏
			@GetMapping("Shoucang")
			public String shouchang(int userid,int postid,int shouchang, Model model) {
				
				List<postVO> pageInfo = biz.shouchang(userid,postid);
				if(pageInfo!=null) {
					biz.deleteShoucang(userid, postid);
				int dz=	shouchang-1;
					biz.UpdateShoucang(dz, postid);
				}else {
					int dz=	shouchang+1;
					biz.UpdateShoucang(dz, postid);
					biz.addShoucang(userid, postid);
				}

				return "jianding";
		}		
			
				
}
