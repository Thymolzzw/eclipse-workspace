package dao;

import object.BelongKey;

public interface BelongMapper {
    int deleteByPrimaryKey(BelongKey key);

    int insert(BelongKey record);

    int insertSelective(BelongKey record);
}