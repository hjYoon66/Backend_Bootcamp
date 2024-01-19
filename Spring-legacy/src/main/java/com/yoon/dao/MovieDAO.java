package com.yoon.dao;
import java.util.List;
import com.yoon.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
    public List<MovieVO> findMovieByName(String movieName) throws Exception;
}
