package com.yoon.web;
 
import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
import com.yoon.vo.MovieVO;
import com.yoon.service.MovieService;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class MovieController {
    
    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
    
    @Inject
    private MovieService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public String getMovieByName(@RequestParam("name") String movieName, Model model) throws Exception{
    	List<MovieVO> movie = service.findMovieByName(movieName);
    	
    	if(movie == null) {
    		throw new Exception("Movie Not Found");
    	}
        model.addAttribute("movies", movie);
        return "movie";
    }
}
