package kr.co.luckywave.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.luckywave.model.Product;
import kr.co.luckywave.model.Slider;
import kr.co.luckywave.repository.CartRepository;
import kr.co.luckywave.repository.ProductRepository;
import kr.co.luckywave.repository.SliderRepository;
import kr.co.luckywave.service.CategoryService;

@Controller
public class MainController{
	
	private static final String PATH = "/error";
	
	@Autowired
	private SliderRepository sliderRepository;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ApplicationContext appContext;
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	@ResponseBody
	public String test(HttpServletRequest request){
//		return (String)appContext.getBean("testBean");
		return "OK";
		
	}
	/*		
	 *		Home.jsp
	 * */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<Slider> sliderList = (List<Slider>) sliderRepository.findAll();
        List<Product> productList = productRepository.findAll(new PageRequest(0, 16)).getContent();
        List<String> mainCategoryNameList = categoryService.getAllMainCategory();
        List<Product> productPopularList = productRepository.findAll
        		(new PageRequest(0, 8, Direction.DESC, "productViews")).getContent();
        List<Product> productLatest = productRepository.findAll
        		(new PageRequest(0, 8, Direction.DESC, "productDate")).getContent();

        model.addAttribute("productPopular", productPopularList);
        model.addAttribute("productLatest", productLatest);
        model.addAttribute("sliders", sliderList);
        model.addAttribute("products", productList);
        model.addAttribute("mainCategoryNameList", mainCategoryNameList);
        return "home";
	}
	
	@RequestMapping("/version")
    public String version() {
        return "version";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
}
