package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MathsTag extends SimpleTagSupport {

	String opr;
	int n1, n2;

	public String getOpr() {
		return opr;
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();

		if (opr.equals("add")) {
			out.print(n1 + n2);
		} else if (opr.equals("sub")) {
			out.print(n1 - n2);

		} else if (opr.equals("mul")) {
			out.print(n1 * n2);

		}

	}
}
