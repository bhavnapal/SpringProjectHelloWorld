package in.mindgate.recdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	

		@GetMapping(value="/")
	    public String homepage(){
	        return "job_description_list_tl";
		}

	/*@GetMapping(value="/")
    public String proPage(){
        return "update";
    }*/
}