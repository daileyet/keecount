package com.openthinks.app.keecount.service.impl;

import com.openthinks.app.keecount.entity.Category;
import com.openthinks.app.keecount.mapper.CategoryMapper;
import com.openthinks.app.keecount.service.ICategoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dailey Dai
 * @since 2017-01-23
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {
	
}
