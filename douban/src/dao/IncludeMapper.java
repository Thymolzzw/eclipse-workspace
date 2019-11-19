package dao;

import object.IncludeKey;

public interface IncludeMapper {
    int deleteByPrimaryKey(IncludeKey key);

    int insert(IncludeKey record);

    int insertSelective(IncludeKey record);
}