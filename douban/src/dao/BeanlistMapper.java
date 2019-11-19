package dao;

import object.Beanlist;

public interface BeanlistMapper {
    int deleteByPrimaryKey(Integer beanlistid);

    int insert(Beanlist record);

    int insertSelective(Beanlist record);

    Beanlist selectByPrimaryKey(Integer beanlistid);

    int updateByPrimaryKeySelective(Beanlist record);

    int updateByPrimaryKey(Beanlist record);
}