package com.epay.scancode.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epay.commons.utils.PagingResult;
import com.epay.scancode.commons.condition.MerchantInfoCondition;
import com.epay.scancode.commons.condition.SysResourceCondition;
import com.epay.scancode.commons.entity.Admin;
import com.epay.scancode.commons.entity.SysResource;
import com.epay.scancode.service.operator.PageService;


@Controller
@RequestMapping("/adminManage/index")
public class AdminController {
	
	public static final Logger log = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private PageService pageService;
	
/*	@Autowired
	private MerchantInfoService merchantInfoService;*/
	
	/*@Autowired
	private PlatfromUserMessageService userMessageService;*/
	
	/*@Autowired
	private PlatfromMessageService messageService;*/
	
	@RequestMapping
	public String toSignin(HttpServletRequest request,String returnUrl) {
		Admin user = (Admin) request.getSession().getAttribute("currentScanAdminUser");
		MerchantInfoCondition condition = new MerchantInfoCondition();
		condition.setStatus("0");
		//long merchantCount = merchantInfoService.countByCriteria(condition);
		condition.setStatus("1");
		//merchantCount = merchantCount+merchantInfoService.countByCriteria(condition);
		//request.getSession().setAttribute("merchantList",merchantCount);
		
		List<String> userList = new ArrayList<String>();
		userList.add("0");
		userList.add("9");
		//List<PlatfromMessage> messageList = messageService.findAllByUserType(userList);
		/*if(messageList != null && messageList.size() > 0){
			for (Iterator<PlatfromMessage> iterator = messageList.iterator(); iterator.hasNext();) {
				PlatfromMessage message = (PlatfromMessage) iterator.next();
				PlatfromUserMessageCondition userMessageCondition = new PlatfromUserMessageCondition();
				userMessageCondition.setId(Strings.getUUID());
				userMessageCondition.setMessageId(message.getId());
				userMessageCondition.setUserNo(user.getUserName());
				userMessageCondition.setReadStatus("1");
				userMessageCondition.setRecordStatus(Constants.RECORD_STATUS_YES);
				userMessageCondition.setOperator(user.getUserName());
				userMessageCondition.setCreateTime(new Date());
			//	userMessageService.insert(userMessageCondition);
			}
		}*/
		return "admin/index";
	}
	@RequestMapping("/dashbord1")
	public String toDash1(HttpServletRequest request,String returnUrl) {
		return "admin/index_2";
	}
	@RequestMapping("/dashbord2")
	public String toDash2(HttpServletRequest request,String returnUrl) {
		return "admin/index_3";
	}
	
	@RequestMapping("/page")
	public String toPage(HttpServletRequest request,String returnUrl) {
		return "admin/table_advanced";
	}
	@RequestMapping("/showPages")
	public String showPages(HttpServletRequest request,SysResourceCondition condition){
		PagingResult<SysResource> list = pageService.findAllMenu(condition);
        request.setAttribute("pageData",list.getResult());
		return "admin/tableContent"; 
	}
	
	@RequestMapping("/page/viewDetail")
	public String viewDetail(HttpServletRequest request){
		return "admin/viewDetail"; 
	}
	
	/*@RequestMapping(value="/message",method=RequestMethod.POST)
	@ResponseBody
	public JSON message(HttpServletRequest request){
		Admin user = (Admin) request.getSession().getAttribute("currentScanAdminUser");
		if(user != null){
			List<String> userList = new ArrayList<String>();
			userList.add("0");
			userList.add("9");
			List<PlatfromMessage> messageList = messageService.findAllByUserTypeAndUserNo(userList, user.getUserName());
			if(messageList != null && messageList.size() > 0){
				for (Iterator<PlatfromMessage> iterator = messageList.iterator(); iterator.hasNext();) {
					PlatfromMessage message = (PlatfromMessage) iterator.next();
					PlatfromUserMessageCondition userMessageCondition = new PlatfromUserMessageCondition();
					userMessageCondition.setId(Strings.getUUID());
					userMessageCondition.setMessageId(message.getId());
					userMessageCondition.setUserNo(user.getUserName());
					userMessageCondition.setReadStatus("1");
					userMessageCondition.setRecordStatus(Constants.RECORD_STATUS_YES);
					userMessageCondition.setOperator(user.getUserName());
					userMessageCondition.setCreateTime(new Date());
					//userMessageService.insert(userMessageCondition);
				}
			}
			Map<Object, Object> map = new HashMap<Object, Object>();
			PlatfromUserMessageCondition userMessageCondition = new PlatfromUserMessageCondition();
			userMessageCondition.setReadStatus("1");
			userMessageCondition.setRecordStatus(Constants.RECORD_STATUS_YES);
			userMessageCondition.setUserNo(user.getUserName());
			List<String> list = new ArrayList<String>();
			list.add("0");
			list.add("9");
		//	PagingResult<PlatfromUserMessage> page = userMessageService.findByUserType(userMessageCondition,list);
			//List<PlatfromUserMessage> userMessageList = page.getResult();
			int messageSize = 0;
			if(userMessageList.size() > 0){
				messageSize = userMessageList.size();
			}
	        map = Maps.mapByAarray("messageSize",messageSize);
	        return JSONSerializer.toJSON(map);
		}
		return null;
	}*/
	
}
