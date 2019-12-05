package com.example.bootdemo.service;

import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 22:28
 * @Version 1.0
 */

public interface IBaseService<T> extends Mapper<T> {
    /**
     * 条件删除，Object必须包含主键字段，但凡方法名包含PrimaryKey的，都要求参数包含主键字段
     * @param o
     * @return
     */
    @Override
    int deleteByPrimaryKey(Object o);

    /**
     * 根据实体属性作为条件进行删除，个人建议用这个方法
     * @param o
     * @return
     */
    @Override
    int delete(T o);

    /**
     * 插入一条数据，null的属性也会保存，不会使用数据库默认值
     * @param o
     * @return
     */
    @Override
    int insert(T o);

    /**
     * 插入一条数据，null的属性不会保存，会使用数据库默认值，个人建议用这个方法
     * @param o
     * @return
     */
    @Override
    int insertSelective(T o);

    /**
     * 顾名思义，查询全部结果
     * @return
     */
    @Override
    List<T> selectAll();

    /**
     * 查询条件Object必须包含主键属性
     * @param o
     * @return
     */
    @Override
    T selectByPrimaryKey(Object o);

    /**
     * 顾名思义，查询数据条数
     * @param o
     * @return
     */
    @Override
    int selectCount(T o);

    /**
     * 条件查询，返回值是List
     * @param o
     * @return
     */
    @Override
    List<T> select(T o);

    /**
     * 条件查询，返回值只能有一个，出现多个会抛异常
     * @param o
     * @return
     */
    @Override
    T selectOne(T o);

    /**
     * 条件更新，条件必须包含主键字段，null属性也会被更新到数据库
     * @param o
     * @return
     */
    @Override
    int updateByPrimaryKey(T o);

    /**
     * 条件更新，条件必须包含主键字段，null属性不会被更新到数据库，个人建议使用这个方法
     * @param o
     * @return
     */
    @Override
    int updateByPrimaryKeySelective(T o);

    /**
     * 根据Example条件删除数据
     * @param o
     * @return
     */
    @Override
    int deleteByExample(Object o);

    /**
     * 根据Example条件进行查询
     * @param o
     * @return
     */
    @Override
    List<T> selectByExample(Object o);

    /**
     * 根据Example条件进行查询数据条数
     * @param o
     * @return
     */
    @Override
    int selectCountByExample(Object o);

    /**
     * 根据Example条件查询，返回值只能有一个，查到多个会抛异常
     * @param o
     * @return
     */
    @Override
    T selectOneByExample(Object o);

    /**
     * 根据Example条件进行更新，null属性会被更新到数据库，第一个参数是实体列，第二个参数是Example
     * @param o
     * @param o2
     * @return
     */
    @Override
    int updateByExample(T o, Object o2);

    /**
     * 同上，区别在于null属性不会被更新到数据库
     * @param o
     * @param o2
     * @return
     */
    @Override
    int updateByExampleSelective(T o, Object o2);

    /**
     * Example条件分页查询，RowBounds 是分页参数
     * @param o
     * @param rowBounds
     * @return
     */
    @Override
    List<T> selectByExampleAndRowBounds(Object o, RowBounds rowBounds);

    /**
     * 条件分页查询
     * @param o
     * @param rowBounds
     * @return
     */
    @Override
    List<T> selectByRowBounds(T o, RowBounds rowBounds);

}
