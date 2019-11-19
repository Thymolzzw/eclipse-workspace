package dao;

import object.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer questionid);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer questionid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKeyWithBLOBs(Question record);

    int updateByPrimaryKey(Question record);
}