package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping("/search")
	public RedirectView searrch(@RequestParam("querybox") String query) {
		
		RedirectView redirectview = new RedirectView();

		if(query.isBlank()) {
			String url2="home";
			redirectview.setUrl(url2);
			return redirectview;
		}
		
		String url="https://www.google.com/search?q="+query;
		redirectview.setUrl(url);
		return redirectview;
	}
}
