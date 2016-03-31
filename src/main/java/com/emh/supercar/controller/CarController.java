package com.emh.supercar.controller;

/**
 * mongheng.ear
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.SystemException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.emh.supercar.model.transaction.CarForSaleRecord;
import com.emh.supercar.model.vehicle.Car;
import com.emh.supercar.model.vehicle.Category;
import com.emh.supercar.model.vehicle.Ccc;
import com.emh.supercar.model.vehicle.Product;
import com.emh.supercar.repository.business.transaction.CarForSaleRecordBusiness;
import com.emh.supercar.repository.business.vehicle.CarBusiness;

@Controller
public class CarController {

	@Autowired
	private CarBusiness carBusiness;
	
	@Autowired
	private CarForSaleRecordBusiness carForSaleRecordBusiness;
	
	private Logger logger = Logger.getLogger(CarController.class.getName());

	public CarController() {
		// TODO Auto-generated constructor stub
		logger.info("Starting Controller...");
	}

	@RequestMapping(value="/", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody List<CarForSaleRecord> index() throws Exception{
		logger.info("List of Car...");
		return carForSaleRecordBusiness.selectAllCar();
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView hometest(@ModelAttribute("car")Car car, ModelMap mmap){
		
		ModelAndView mv = new ModelAndView("redirect:redirectwithparameter");
		
		try{	
			if (carBusiness != null && carForSaleRecordBusiness != null){
				
				CarForSaleRecord carForSaleRecord = new CarForSaleRecord();
				carForSaleRecord.setDateofadded(null);
				carForSaleRecord.setSaleprice(10000.00);
				carForSaleRecord.setSpeedoreading(100);
				carForSaleRecord.setBranchlocation("Phnom Penh");
				carForSaleRecord.setCar(car);
				
				carForSaleRecordBusiness.createCar(carForSaleRecord);
				
				mmap.addAttribute("id", carForSaleRecord.getSpeedoreading());
				mv.addObject(mmap);
				//mv.addObject("id", carForSaleRecord.getSpeedoreading());
			}
		}
		catch(Exception ex){
			
		}
		return mv;
	}
	
	@RequestMapping(value = "/redirectwithparameter", method = RequestMethod.GET)
	public String reDirectWithParameter(@RequestParam("id")int id , ModelMap modelMap){
		
		/*ModelAndView mav = new ModelAndView("home");
		mav.addObject("id", id);
		return mav;*/
		modelMap.addAttribute("id", id);
		
		return "home";
	}
	
	@RequestMapping(value = "/land", method = RequestMethod.GET)
	public ModelAndView landtest(@RequestParam("id") int id, Model model){
		
		model.addAttribute("id", id);
		
		ModelAndView mav = new ModelAndView("redirect:landredirect");
		mav.addObject(model);
		return mav;
	}
	
	@RequestMapping(value = "/landredirect", method = RequestMethod.GET)
	public ModelAndView landRedirect(){
		
		ModelAndView mav = new ModelAndView("land");
		
		Set<Category> categories = new HashSet<Category>();
		
		Category c1 = new Category(1,"A");
		Category c2 = new Category(2, "B");
		
		categories.add(c1);
		categories.add(c2);
		
		mav.addObject("category_lst", categories);
		
		return mav;
	}
	
	@RequestMapping(value = "/products_ajax", method = RequestMethod.GET, headers = "accept=*/*", produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<Product> productsForCategory(@RequestParam(value = "categoryId", required = true) Integer categoryId) throws IllegalStateException, SystemException {
		
		List<Product> products = new ArrayList<Product>();
		Product p1;
		Product p2;
		if (categoryId.equals(1)){
			p1 = new Product(1,"A1");
			p2 = new Product(2,"A2");
		}else {
			p1 = new Product(1,"B1");
			p2 = new Product(2,"B2");
		}
		products.add(p1);
		products.add(p2);
		return products;
	}
	
	@RequestMapping(value = "/ccc_ajax", method = RequestMethod.GET, headers = "accept=*/*", produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<Ccc> CCC(@RequestParam(value = "productId", required = true) Integer productId, @RequestParam(value="ajax") Boolean ajax) throws IllegalStateException, SystemException {
		
		List<Ccc> cccs = new ArrayList<Ccc>();
		Ccc c1;
		Ccc c2;
		
		if (productId.equals(1)){
			c1 = new Ccc(1, "C1");
			c2 = new Ccc(2, "C2");
		}else {
			c1 = new Ccc(3, "C3");
			c2 = new Ccc(4, "C4");
		}
		cccs.add(c1);
		cccs.add(c2);
		return cccs;
	}
	
	@RequestMapping(value = "getCateAndPro", method = RequestMethod.POST)
	public String getData(HttpServletRequest req, Model model){
		
		String cate = req.getParameter("category_list_d");
		String pro = req.getParameter("product_list_d");
		model.addAttribute("cate", cate);
		model.addAttribute("pro", pro);
		return "data";
	}
	
	@RequestMapping(value = "car/{id}", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Object testPathVariable(@PathVariable("id") int id, Model model){
		ModelAndView mav = new ModelAndView("carInfromation");
		CarForSaleRecord carForSaleRecord = null;
		try {
			carForSaleRecord = carForSaleRecordBusiness.selectCar(id);
			model.addAttribute("carRecord", carForSaleRecord);
			//mav.addObject("carRecord",carForSaleRecord);
		}
		catch(Exception ex) {
			
		}
		return carForSaleRecord;
	}
	
	@RequestMapping(value = "new", method = {RequestMethod.GET,RequestMethod.POST})
	public String testPopup(){
		return "new";
	}
}
