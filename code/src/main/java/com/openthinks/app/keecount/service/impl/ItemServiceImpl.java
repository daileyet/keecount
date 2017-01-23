package com.openthinks.app.keecount.service.impl;

import com.openthinks.app.keecount.entity.Item;
import com.openthinks.app.keecount.mapper.ItemMapper;
import com.openthinks.app.keecount.service.IItemService;
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
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements IItemService {
	
}
