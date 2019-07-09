package com.admin.manager.service;

import com.admin.common.pojo.ResultData;
import com.admin.manager.pojo.Content;

public interface ArticleService {
	/**
	 * 获取文章的分类
	 * @return
	 */
	public ResultData getArticleCategory();
	
	/**
	 * 增加一篇博客文章
	 * @param content
	 * @return
	 */
	public ResultData addAnArticle(Content content);
	
	/**
	 * 获取文章列表
	 * @return
	 */
	public ResultData getAllArticle();
	
	public ResultData getAnArticle(Long id);
}
