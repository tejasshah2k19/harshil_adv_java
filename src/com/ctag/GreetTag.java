package com.ctag;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

//classic tag  -- no body no attribute 
public class GreetTag implements Tag {

	PageContext pageContext;
	Tag parent;

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
		System.out.println("good morning");
		JspWriter out = getPageContext().getOut();

		Date d = new Date();

		try {
			if (d.getHours() >= 0 && d.getHours() <= 11) {
				out.print("Good Morning");
			} else if (d.getHours() >= 12 && d.getHours() <= 17) {
				out.print("Good AfterNoon");
			} else if (d.getHours() >= 18 && d.getHours() <= 23) {
				out.print("Good Evening");
			}
		} catch (Exception e) {

		}
		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		return EVAL_PAGE; //continue
//		return SKIP_PAGE;//page ignore
	}

	public void release() {

	}

}
