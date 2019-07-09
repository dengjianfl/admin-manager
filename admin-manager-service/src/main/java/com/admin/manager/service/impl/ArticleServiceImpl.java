package com.admin.manager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.common.pojo.ResultData;
import com.admin.manager.mapper.CategoryMapper;
import com.admin.manager.mapper.ContentMapper;
import com.admin.manager.pojo.Category;
import com.admin.manager.pojo.CategoryExample;
import com.admin.manager.pojo.CategoryExample.Criteria;
import com.admin.manager.pojo.Content;
import com.admin.manager.pojo.ContentExample;
import com.admin.manager.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private ContentMapper contentMapper;

	@Override
	public ResultData getArticleCategory() {
		
		CategoryExample example = new CategoryExample();
		
		Criteria criteria = example.createCriteria();
		
		
		criteria.andCValidEqualTo(1);
		
		List<Category> list = categoryMapper.selectByExample(example);
		
		return ResultData.build(true, "成功", list);
	}

	@Override
	public ResultData addAnArticle(Content content) {
		
		// 设置创建时间和更新时间
		content.setCreated(new Date());
		content.setUpdated(new Date());
		contentMapper.insertSelective(content);
		return ResultData.build(true, "添加成功");
	}

	@Override
	public ResultData getAllArticle() {
		
		ContentExample example = new ContentExample();
		
		List<Content> list = contentMapper.selectByExample(example);
		
		return ResultData.build(true, "成功", list);
	}

	@Override
	public ResultData getAnArticle(Long id) {
		Content content = contentMapper.selectByPrimaryKey(id);
		return ResultData.build(true, "成功", content);
	}

}
