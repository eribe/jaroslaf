package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import no.ntnu.tdt4237.*;
import no.ntnu.tdt4237.helperactions.*;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tags/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/menu.tag");
    _jspx_dependants.add("/WEB-INF/tags/blogpost.tag");
    _jspx_dependants.add("/WEB-INF/tags/error.tag");
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
      out.write("     \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      if (_jspx_meth_tags_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");

User loggedInUser = (User) session.getAttribute(SessionKeys.USER_OBJECT);

      out.write('\n');
      //  tags:menu
      org.apache.jsp.tag.web.menu_tag _jspx_th_tags_005fmenu_005f0 = new org.apache.jsp.tag.web.menu_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fmenu_005f0);
      _jspx_th_tags_005fmenu_005f0.setJspContext(_jspx_page_context);
      // /blog.jsp(16,0) name = loggedInUser type = no.ntnu.tdt4237.User reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fmenu_005f0.setLoggedInUser(loggedInUser);
      _jspx_th_tags_005fmenu_005f0.doTag();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fmenu_005f0);
      out.write('\n');


String blogOwnerName = StringHelpers.getBlogOwnerName(request.getRequestURL().toString());
User blogOwner = Database.getUser(blogOwnerName);
if (blogOwner !=null)
{
	java.util.ArrayList<BlogPost> blogPosts  = Database.getPostForUser(blogOwner);
	for(BlogPost post: blogPosts) 
	{
		
      out.write("\n");
      out.write("\t\t\t");
      //  tags:blogpost
      org.apache.jsp.tag.web.blogpost_tag _jspx_th_tags_005fblogpost_005f0 = new org.apache.jsp.tag.web.blogpost_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fblogpost_005f0);
      _jspx_th_tags_005fblogpost_005f0.setJspContext(_jspx_page_context);
      // /blog.jsp(27,3) name = post type = no.ntnu.tdt4237.BlogPost reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fblogpost_005f0.setPost(post);
      // /blog.jsp(27,3) name = loggedInUser type = no.ntnu.tdt4237.User reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fblogpost_005f0.setLoggedInUser(loggedInUser);
      _jspx_th_tags_005fblogpost_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tags_005fblogpost_005f0, null));
      _jspx_th_tags_005fblogpost_005f0.doTag();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fblogpost_005f0);
      out.write(" \n");
      out.write("\t\t");

	}
}
else 
{
	
      if (_jspx_meth_tags_005ferror_005f0(_jspx_page_context))
        return;

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
    // /blog.jsp(10,0) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fheader_005f0.setTitle(" - Blog");
    _jspx_th_tags_005fheader_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005ferror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:error
    org.apache.jsp.tag.web.error_tag _jspx_th_tags_005ferror_005f0 = new org.apache.jsp.tag.web.error_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005ferror_005f0);
    _jspx_th_tags_005ferror_005f0.setJspContext(_jspx_page_context);
    // /blog.jsp(34,3) name = errorMsg type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005ferror_005f0.setErrorMsg("This Blog doens't exist");
    _jspx_th_tags_005ferror_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005ferror_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n");
      out.write("\t\t\t");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
