package cn.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.pojo.TbItem;
import cn.e3.service.TbItemService;

@Controller
public class TbItemController {
	
	@Autowired
	private TbItemService tbItemService;
	
	
	@RequestMapping("findItemById/{id}")
	@ResponseBody
	public TbItem getTbItemById(@PathVariable Long id) throws Exception{
		
		TbItem tbItem = tbItemService.getItemById(id);
		
		return tbItem;
	}

}
