package com.xindaojia.backend.service;

import com.xindaojia.backend.entity.UserInfoRecord;
import java.util.HashMap;
import java.util.List;

/**
 * 用户信息表(UserInfoRecord)表服务接口
 *
 * @author makejava
 * @since 2020-07-22 18:51:40
 */
public interface UserInfoRecordService {

    /**
     * 用户注册接口
     *
     * @param registerRequest registerRequest
     * @return result
     */
    String userRegister(HashMap<Object, Object> registerRequest);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfoRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserInfoRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userInfoRecord 实例对象
     * @return 实例对象
     */
    UserInfoRecord insert(UserInfoRecord userInfoRecord);

    /**
     * 修改数据
     *
     * @param userInfoRecord 实例对象
     * @return 实例对象
     */
    UserInfoRecord update(UserInfoRecord userInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}