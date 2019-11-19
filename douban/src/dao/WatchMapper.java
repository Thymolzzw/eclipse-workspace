package dao;

import object.WatchKey;

public interface WatchMapper {
    int deleteByPrimaryKey(WatchKey key);

    int insert(WatchKey record);

    int insertSelective(WatchKey record);
}