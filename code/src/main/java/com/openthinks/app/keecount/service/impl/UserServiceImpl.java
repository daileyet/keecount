package com.openthinks.app.keecount.service.impl;

import com.openthinks.app.keecount.entity.User;
import com.openthinks.app.keecount.mapper.UserMapper;
import com.openthinks.app.keecount.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
