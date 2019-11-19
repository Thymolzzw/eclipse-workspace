package dao;

import object.Reply;

public interface ReplyMapper {
    int deleteByPrimaryKey(Integer replyid);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);
}