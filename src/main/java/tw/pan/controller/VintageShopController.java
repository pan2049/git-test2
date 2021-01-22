package tw.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.pan.model.Product;
import tw.pan.service.ProductService;

@Controller
public class VintageShopController {

	@Autowired
	private ProductService pService;
	@Autowired
	private ObjectMapper objectMapper;
	
	@GetMapping(value="/index.controller")
	public String goToIndex() {
		return "index";
	}
	
	@GetMapping(value="/shopGrid.controller")
	public String goToShopGrid() {
		return "shop-grid";
	}
	
	@RequestMapping(value="/shopGridSelectAll.controller",method=RequestMethod.POST)
	public String selectShopAction() throws Exception {
		List<Product> pList = pService.selectAll();
		String pJson = objectMapper.writeValueAsString(pList);
		System.out.println(pJson);
		String response = pJson;
		return response;
	}
}
