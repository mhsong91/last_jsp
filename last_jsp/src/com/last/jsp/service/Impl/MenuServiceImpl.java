package com.last.jsp.service.Impl;

import javax.servlet.http.HttpServletRequest;

import com.last.jsp.dao.MenuDAO;
import com.last.jsp.dao.Impl.MenuDAOImpl;
import com.last.jsp.service.MenuService;

public class MenuServiceImpl implements MenuService{
	MenuDAO mdao=new MenuDAOImpl();
	@Override
	public void getMenuList(HttpServletRequest req) {
		req.getServletContext().setAttribute("menuList",mdao.selectMEnuList());
		
		
	}
	@Override
	public void printClassName() {
		
		
	}

}
