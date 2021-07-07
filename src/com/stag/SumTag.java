package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SumTag extends SimpleTagSupport implements DynamicAttributes {

	int sum = 0;

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.print(sum);

	}

	// x y z
	@Override
	public void setDynamicAttribute(String url, String attributeName, Object value) throws JspException {

		sum = sum + Integer.parseInt((String) value);
	}
}
