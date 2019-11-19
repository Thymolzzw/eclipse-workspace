package dao;

import object.Personnel;

public interface PersonnelMapper {
    int deleteByPrimaryKey(Integer personnelid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer personnelid);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}