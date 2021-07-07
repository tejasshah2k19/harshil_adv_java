package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class CurrConvertTag implements Tag {

	PageContext pageContext;
	Tag parent;

	int amount;
	String type;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PageContext getPageContext() {
		return pageContext;
	}

	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	public Tag getParent() {
		return parent;
	}

	public void setParent(Tag parent) {
		this.parent = parent;
	}

	public int doStartTag() throws JspException {
		try {
			JspWriter out = getPageContext().getOut();
			if (type.toLowerCase().equals("usd")) {
				amount = amount / 75;
				out.print(amount + "$");

			} else if (type.toLowerCase().equals("aud")) {
				amount = amount / 55;
				out.print(amount + "AUD");

			} else {
				out.print(amount + "INR");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}


		return EVAL_BODY_INCLUDE;
	}

	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	public void release() {

	}
}
