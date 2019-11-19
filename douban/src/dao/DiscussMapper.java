package dao;

import object.Discuss;

public interface DiscussMapper {
    int deleteByPrimaryKey(Integer discussid);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer discussid);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKeyWithBLOBs(Discuss record);

    int updateByPrimaryKey(Discuss record);
}