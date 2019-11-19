package dao;

import object.Movie;
import object.MovieWithBLOBs;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer movieid);

    int insert(MovieWithBLOBs record);

    int insertSelective(MovieWithBLOBs record);

    MovieWithBLOBs selectByPrimaryKey(Integer movieid);

    int updateByPrimaryKeySelective(MovieWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MovieWithBLOBs record);

    int updateByPrimaryKey(Movie record);
}