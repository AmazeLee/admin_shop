package com.sh.web.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.sh.domain.Orders;
import com.sh.service.OrdersService;
import com.sh.utils.PageBean;

import net.sf.json.JSONArray;

/**
 * 订单
 * @author Administrator
 *
 */
public class OrdersAction implements ModelDriven<Orders>{
	
	private Orders orders = new Orders();
	private OrdersService ordersService;
	private Integer currentPage;
	private Integer pageSize;

	public OrdersService getOrdersService() {
		return ordersService;
	}

	//获得订单列表
	public String list() throws Exception{
		// 封装离线查询对象
		DetachedCriteria dc = DetachedCriteria.forClass(Orders.class);
		// 判断并封装参数
		if (StringUtils.isNotBlank(orders.getOid())) {
			dc.add(Restrictions.like("oid", "%" + orders.getOid() + "%"));
		}
		// 1.调用service查询分页数据（PageBean）
		PageBean pb = ordersService.getPageBean(dc, currentPage, pageSize);
		// 2.将PageBean放入request域，转发到页面显示
		ActionContext.getContext().put("pageBean", pb);
		return "list";
	}
	
	//获得订单详情
	public String findOrderInfoByOid() throws IOException{
		System.out.println("------------------------------------------");
		
		String oid =ServletActionContext.getRequest().getParameter("oid");
		System.out.println("oid="+oid);
		List<Map<String,Object>> mapList = ordersService.findOrderInfoByOid(oid);
		String json = JSONArray.fromObject(mapList).toString();
		System.out.println(json+"--------------------------------------");
		//将json发送给浏览器
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		return "null";
	}
	
	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}


	public Integer getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}


	public Integer getPageSize() {
		return pageSize;
	}


	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


	@Override
	public Orders getModel() {
		return orders;
	}
	
	

}
