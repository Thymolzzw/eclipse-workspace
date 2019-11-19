package dao;

import object.Response;

public interface ResponseMapper {
    int deleteByPrimaryKey(Integer responseid);

    int insert(Response record);

    int insertSelective(Response record);

    Response selectByPrimaryKey(Integer responseid);

    int updateByPrimaryKeySelective(Response record);

    int updateByPrimaryKeyWithBLOBs(Response record);

    int updateByPrimaryKey(Response record);
}