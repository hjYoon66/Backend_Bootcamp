package com.yoon.service;

import java.util.List;
import com.yoon.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}
