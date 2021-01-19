package tw.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.pan.model.Test;
import tw.pan.model.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService tService;
	@Autowired
	ObjectMapper objectMapper ;
	
	@GetMapping(value="/goToMain.controller")
	public String goToMain() {
		return "index";
	}
	
	@GetMapping(value="/goToIndexTest.controller")
	public String goToIndex() {
		return "result";
	}
	
	@RequestMapping(value="/selectController",method=RequestMethod.GET)
	public String selectAction(@RequestParam(name="name") String name,Model m) {
		Test tBean = tService.select(name);
		m.addAttribute("id",tBean.getId());
		m.addAttribute("name",tBean.getName());
		return "result";
	}
	
	@RequestMapping(value="/selectAll.controller",method=RequestMethod.GET)
	public String selectAllAction(Model m) throws Exception {
		List<Test> tList = tService.selectAll();
		String uJson = objectMapper.writeValueAsString(tList);
		System.out.println(uJson);
		m.addAttribute(uJson);
		return "result";
	}
	
	
}
