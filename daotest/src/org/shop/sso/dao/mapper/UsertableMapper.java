package org.shop.sso.dao.mapper;

import org.shop.sso.dao.entity.Usertable;

public interface UsertableMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Usertable record);

    int insertSelective(Usertable record);

    Usertable selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Usertable record);

    int updateByPrimaryKey(Usertable record);
}