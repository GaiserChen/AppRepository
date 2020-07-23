package com.xindaojia.backend.dao;

import com.xindaojia.backend.entity.StoreInfoRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商户信息表(StoreInfoRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-22 18:46:11
 */
public interface StoreInfoRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StoreInfoRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StoreInfoRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param storeInfoRecord 实例对象
     * @return 对象列表
     */
    List<StoreInfoRecord> queryAll(StoreInfoRecord storeInfoRecord);

    /**
     * 新增数据
     *
     * @param storeInfoRecord 实例对象
     * @return 影响行数
     */
    int insert(StoreInfoRecord storeInfoRecord);

    /**
     * 修改数据
     *
     * @param storeInfoRecord 实例对象
     * @return 影响行数
     */
    int update(StoreInfoRecord storeInfoRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}