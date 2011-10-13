package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blogpost_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private no.ntnu.tdt4237.BlogPost post;
  private no.ntnu.tdt4237.User loggedInUser;
  private java.lang.String full;

  public no.ntnu.tdt4237.BlogPost getPost() {
    return this.post;
  }

  public void setPost(no.ntnu.tdt4237.BlogPost post) {
    this.post = post;
    jspContext.setAttribute("post", post);
  }

  public no.ntnu.tdt4237.User getLoggedInUser() {
    return this.loggedInUser;
  }

  public void setLoggedInUser(no.ntnu.tdt4237.User loggedInUser) {
    this.loggedInUser = loggedInUser;
    jspContext.setAttribute("loggedInUser", loggedInUser);
  }

  public java.lang.String getFull() {
    return this.full;
  }

  public void setFull(java.lang.String full) {
    this.full = full;
    jspContext.setAttribute("full", full);
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);
    if( getPost() != null ) 
      _jspx_page_context.setAttribute("post", getPost());
    if( getLoggedInUser() != null ) 
      _jspx_page_context.setAttribute("loggedInUser", getLoggedInUser());
    if( getFull() != null ) 
      _jspx_page_context.setAttribute("full", getFull());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"blogPost\">\n");
      out.write("\t<div class=\"postHeader\">\n");
      out.write("\t\t<span class=\"title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.title}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</span>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.formatedText}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</div>\n");
      out.write("\t");

	if (post.getPictureName() != null)
	{
	
      out.write("\n");
      out.write("\t<img alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.pictureName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" src=\"/pictures/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.pictureName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t<div class=\"postFooter\">\n");
      out.write("\t\t<span class=\"date\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.date}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</span>\n");
      out.write("\t\t<span class=\"owner\"><a href=\"/profile/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.owner.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.owner.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("</a></span>\n");
      out.write("\t\t");
if (full==null || full=="")
		{
			
      out.write("\n");
      out.write("\t\t\t\t<span class=\"more\"><a href=\"/post/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.owner.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.date}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.title}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\">more   comments</a></span>\n");
      out.write("\t\t\t");

		}
		if (loggedInUser != null && loggedInUser.equals(post.getOwner()))
		{
			
      out.write("\n");
      out.write("\t\t\t<form action=\"/post/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.owner.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.date}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.title}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" method=\"post\">\n");
      out.write("\t\t\t<input type=\"submit\" name=\"Delete\" value=\"Delete post\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<form action=\"/editpost/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.owner.userName}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.date}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.title}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" method=\"post\">\n");
      out.write("\t\t\t<input type=\"submit\" name=\"Edit\" value=\"Edit post\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t");
	
		}
		
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("</div>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
