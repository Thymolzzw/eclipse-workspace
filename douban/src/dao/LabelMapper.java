package dao;

import object.LabelKey;

public interface LabelMapper {
    int deleteByPrimaryKey(LabelKey key);

    int insert(LabelKey record);

    int insertSelective(LabelKey record);
}