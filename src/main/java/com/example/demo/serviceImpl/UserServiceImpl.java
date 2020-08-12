package com.example.demo.serviceImpl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.UserExample;
import com.example.demo.service.UserService;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;
import com.example.demo.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;
    @Override
    public int add(User user) {
        return usermapper.insert(user);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtil.getPageResult(pageRequest, getPageInfo(pageRequest));
    }
    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<User> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<User> sysMenus = usermapper.selectByExample(new UserExample());
        return new PageInfo<User>(sysMenus);
    }

}
