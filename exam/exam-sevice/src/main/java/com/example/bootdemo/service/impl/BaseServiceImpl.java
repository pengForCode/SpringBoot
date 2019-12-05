package com.example.bootdemo.service.impl;

import com.example.bootdemo.service.IBaseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    private Mapper<T> mapper;


    @Override
    public int deleteByPrimaryKey(Object o) {
        return mapper.deleteByPrimaryKey(o);
    }

    @Override
    public int delete(T o) {
        return mapper.delete(o);
    }

    @Override
    public int insert(T o) {
        return mapper.insert(o);
    }

    @Override
    public int insertSelective(T o) {
        return mapper.insertSelective(o);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return mapper.selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(T o) {
        return mapper.selectCount(o);
    }

    @Override
    public List<T> select(T o) {
        return mapper.select(o);
    }

    @Override
    public T selectOne(T o) {
        return mapper.selectOne(o);
    }

    @Override
    public int updateByPrimaryKey(T o) {
        return mapper.updateByPrimaryKey(o);
    }

    @Override
    public int updateByPrimaryKeySelective(T o) {
        return mapper.updateByPrimaryKeySelective(o);
    }

    @Override
    public int deleteByExample(Object o) {
        return mapper.deleteByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return mapper.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return mapper.selectCountByExample(o);
    }

    @Override
    public T selectOneByExample(Object o) {
        return mapper.selectOneByExample(o);
    }

    @Override
    public int updateByExample(T o, Object o2) {
        return mapper.updateByExample(o,o2);
    }

    @Override
    public int updateByExampleSelective(T o, Object o2) {
        return mapper.updateByExampleSelective(o,o2);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return mapper.selectByExampleAndRowBounds(o,rowBounds);
    }

    @Override
    public List<T> selectByRowBounds(T o, RowBounds rowBounds) {
        return mapper.selectByRowBounds(o,rowBounds);
    }

    /**
     * 查询一个实体是否存在
     * @param o
     * @return
     */
    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return mapper.existsWithPrimaryKey(o);
    }
}
