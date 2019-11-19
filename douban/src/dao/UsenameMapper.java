package dao;

import object.UsenameKey;

public interface UsenameMapper {
    int deleteByPrimaryKey(UsenameKey key);

    int insert(UsenameKey record);

    int insertSelective(UsenameKey record);
}