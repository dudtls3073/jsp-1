/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-06-10 10:33:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bookshop.shopping;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	request.setCharacterEncoding("utf-8");
	String title = "Log in";

      out.write('\r');
      out.write('\n');

	Cookie[] cookies = request.getCookies();
	String id = "";
	if (cookies != null) { //쿠키가 존재하면
		for (int i=0; i<cookies.length; i++) {
			if ( cookies[i].getName().equals("id")) {
				id = cookies[i].getValue(); //찾은 쿠키값 가져오기
			}
		}
	}

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../module/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(title ), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<main role=\"main\" class=\"container\">\r\n");
      out.write("<h3 class=\"pb-3 mb-4 font-italic border-bottom\">로그인</h3>\r\n");
      out.write("\t<form name=\"loginForm\" class=\"text-center\" method=\"post\" action=\"loginPro.jsp\">\t\t\t\r\n");
      out.write("\t\t<div class=\"form-row justify-content-md-center\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 mb-3\">\r\n");
      out.write("\t\t\t\t<label for=\"id\" class=\"sr-only\">ID</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"id\" name=\"id\" placeholder=\"ID\" autofocus=\"autofocus\" required=\"required\" value=\"");
      out.print(id );
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-row justify-content-md-center\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 mb-3\">\r\n");
      out.write("\t\t\t\t<label for=\"passwd\" class=\"sr-only\">PASSWORD</label>\r\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"passwd\" name=\"passwd\" placeholder=\"PASSWORD\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"custom-control custom-checkbox custom-control-inline\">\r\n");
      out.write("\t\t\t<input class=\"custom-control-input\" type=\"checkbox\" name=\"saveId\" id=\"loginCheck1\"");
 if(id.isEmpty()==false) out.print(" checked=\"checked\"");
      out.write(">\r\n");
      out.write("\t\t\t<label class=\"custom-control-label\" for=\"loginCheck1\">아이디 저장</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-row justify-content-md-center\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 mb-3\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-dark btn-block\">로그인</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-outline-dark btn-block\" onclick=\"history.go(-1);\">이전 화면으로 돌아가기</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"insertMemberForm.jsp\" target=\"_blank\"><i class=\"fas fa-external-link-alt\"></i> 회원 가입하기</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p class=\"mt-5 mb-3 text-muted\">&copy; 2018 KHM</p>\r\n");
      out.write("\t</form>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../module/footer.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
