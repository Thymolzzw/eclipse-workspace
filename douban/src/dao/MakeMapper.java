package dao;

import object.MakeKey;

public interface MakeMapper {
    int deleteByPrimaryKey(MakeKey key);

    int insert(MakeKey record);

    int insertSelective(MakeKey record);
}