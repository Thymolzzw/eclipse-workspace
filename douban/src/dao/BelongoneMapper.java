package dao;

import object.BelongoneKey;

public interface BelongoneMapper {
    int deleteByPrimaryKey(BelongoneKey key);

    int insert(BelongoneKey record);

    int insertSelective(BelongoneKey record);
}