package dao;

import object.CollectionKey;

public interface CollectionMapper {
    int deleteByPrimaryKey(CollectionKey key);

    int insert(CollectionKey record);

    int insertSelective(CollectionKey record);
}