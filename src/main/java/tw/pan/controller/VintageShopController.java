package tw.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.pan.model.Product;
import tw.pan.service.ProductService;

@RestController
@RequestMapping(value="/shopGrid")
public class VintageShopController {

	@Autowired
	private ProductService pService;
	
	@GetMapping(value="/index.controller")
	public String goToIndex() {
		return "index";
	}
	
	@GetMapping(value="/shopGrid.package")
	public String goToShopGrid() {
		return "shop-grid";
	}
	
	@PostMapping(value="/shopGridSelectAll")
	public String selectShopAction() throws Exception{
		return pService.getProductAll();
	}
}
