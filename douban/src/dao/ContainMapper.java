package dao;

import object.Contain;

public interface ContainMapper {
    int deleteByPrimaryKey(String moviename);

    int insert(Contain record);

    int insertSelective(Contain record);

    Contain selectByPrimaryKey(String moviename);

    int updateByPrimaryKeySelective(Contain record);

    int updateByPrimaryKey(Contain record);
}