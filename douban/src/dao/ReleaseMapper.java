package dao;

import object.ReleaseKey;

public interface ReleaseMapper {
    int deleteByPrimaryKey(ReleaseKey key);

    int insert(ReleaseKey record);

    int insertSelective(ReleaseKey record);
}