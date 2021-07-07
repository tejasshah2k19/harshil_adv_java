package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class PrintTag implements IterationTag {

	Tag parent;
	PageContext pageContext;
	int count;

	public Tag getParent() {
		return parent;
	}

	public void setParent(Tag parent) {
		this.parent = parent;
	}

	public PageContext getPageContext() {
		return pageContext;
	}

	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException {
		if (--count > 0) {
			return EVAL_BODY_AGAIN; //body print -again 

		} else {
			return SKIP_BODY; //skip ==> doEndTag
		}
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public void release() {

	}

}
