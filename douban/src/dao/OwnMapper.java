package dao;

import object.OwnKey;

public interface OwnMapper {
    int deleteByPrimaryKey(OwnKey key);

    int insert(OwnKey record);

    int insertSelective(OwnKey record);
}