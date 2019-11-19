package dao;

import object.ConferKey;

public interface ConferMapper {
    int deleteByPrimaryKey(ConferKey key);

    int insert(ConferKey record);

    int insertSelective(ConferKey record);
}