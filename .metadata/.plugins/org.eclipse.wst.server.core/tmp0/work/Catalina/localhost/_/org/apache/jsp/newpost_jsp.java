package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import no.ntnu.tdt4237.*;
import no.ntnu.tdt4237.helperactions.*;
import java.util.Date;
import java.io.File;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import java.util.Map;
import nl.captcha.Captcha;

public final class newpost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/tags/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/menu.tag");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_tags_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tfunction validate() {\n");
      out.write("\t\tvar title = document.getElementsByName(\"Title\")[0].value;\n");
      out.write("\t\tvar text = document.getElementsByName(\"Post\")[0].value;\n");
      out.write("\t\tif (title.search(\"^[^<>%$]*$\") === -1 || text.search(\"^[^<>%$]*$\") === -1) {\n");
      out.write("\t\t\talert(\"Contains illegal chars! \\n Remove the illegal chars (<>^%$) to be able to post\");\n");
      out.write("\t\t\tdocument.getElementById(\"submitPost\").style.display = \"none\";\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tdocument.getElementById(\"submitPost\").style.display = \"block\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");

User loggedInUser = (User) session.getAttribute(SessionKeys.USER_OBJECT);

      out.write('\n');
      //  tags:menu
      org.apache.jsp.tag.web.menu_tag _jspx_th_tags_005fmenu_005f0 = new org.apache.jsp.tag.web.menu_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fmenu_005f0);
      _jspx_th_tags_005fmenu_005f0.setJspContext(_jspx_page_context);
      // /newpost.jsp(37,0) name = loggedInUser type = no.ntnu.tdt4237.User reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fmenu_005f0.setLoggedInUser(loggedInUser);
      _jspx_th_tags_005fmenu_005f0.doTag();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fmenu_005f0);
      out.write('\n');
      out.write('\n');

	if (loggedInUser != null)
{
	boolean postOk = false;
	Map<String, String[]> parameters = MultiPartParser.parseRequest(null, request, getServletContext(), "UTF-8");
	if (parameters !=null && parameters.containsKey("Title"))
	{
		Captcha captcha = (Captcha) session.getAttribute(Captcha.NAME);
		request.setCharacterEncoding("UTF-8"); // Do this so we can capture non-Latin chars
		String answer = parameters.get("answer")[0];
		if (captcha.isCorrect(answer)) { 
      out.write("\n");
      out.write("\t\t    <b>Correct captcha!</b> <br />\n");
      out.write("\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t    <b>Wrong captcha!</b> <br />\n");
      out.write("\t\t");
 }
		
		BlogPost post = new BlogPost(parameters.get("Title")[0],
							 parameters.get("Post")[0],
							 new Date(),
							 loggedInUser);
		 
		String[] filename = parameters.get("FileName");
		if (filename != null) 
		{
			post.setPictureName(filename[0]);
		}	
		
		postOk = Database.savePost(post);
	} 
	if (postOk)
	{

      out.write("\n");
      out.write("\t\t<span>Your post is stored!</span>\n");
      out.write("\t\t");

	}
	else
	{
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<div class=\"blogPost\">\n");
      out.write("\t\t\t<form action=\"\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<span>Title:</span><input type=\"text\" name=\"Title\"  onblur=\"validate()\"/><br/>\n");
      out.write("\t\t\t\t<span>Date:</span><input type=\"text\" name=\"Date\" disabled=\"disabled\" value=\"");
      out.print(DateHelpers.toShortFormat(new Date()));
      out.write("\"/><br/>\n");
      out.write("\t\t\t\t<span>Picture:</span><input type=\"file\" name=\"Picture\" accept=\"image/jpeg image/gif image/png\"/><br/>\n");
      out.write("\t\t\t\t<span>Post:</span><br/>\n");
      out.write("\t\t\t\t<textarea class=\"text\" rows=\"5\" cols=\"30\" name=\"Post\" onblur=\"validate()\"></textarea>\n");
      out.write("\t\t\t\t<img src=\"stickyCaptcha.png\" /><br />\n");
      out.write("\t\t\t\t<span>Captcha Answer:</span> <input name=\"answer\" /> <br/>\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"submitPost\" value=\"Post\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
	
	}
		
} 
else
{
	
      out.write("\n");
      out.write("\t<span>You have to log in to be able to create a post!</span> \n");
      out.write("\t");

}

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tags_005fheader_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:header
    org.apache.jsp.tag.web.header_tag _jspx_th_tags_005fheader_005f0 = new org.apache.jsp.tag.web.header_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    _jspx_th_tags_005fheader_005f0.setJspContext(_jspx_page_context);
    // /newpost.jsp(17,0) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fheader_005f0.setTitle(" - Post");
    _jspx_th_tags_005fheader_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    return false;
  }
}
