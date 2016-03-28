package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aseToDbView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>ASE to DB Map</title>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"initial-scale=1.0\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\thtml, body {\r\n");
      out.write("\t\t\t\theight: 80%;\r\n");
      out.write("\t\t\t\tmargin: 20;\r\n");
      out.write("\t\t\t\tpadding: 20;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#map {\r\n");
      out.write("\t\t\t\theight: 100%;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t </style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"map\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t      var map;\r\n");
      out.write("\t\t      function initMap() {\r\n");
      out.write("\t\t    \t \r\n");
      out.write("\t\t    \t  var asePosition = {lat: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aseLatitude}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", lng: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aseLongitude}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("};\r\n");
      out.write("\t\t   \t\t  var dbPosition = {lat: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbLatitude}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", lng: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbLongitude}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\t\t    \t  var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("\t\t    \t    center: dbPosition,\r\n");
      out.write("\t\t    \t    zoom: 7\r\n");
      out.write("\t\t    \t  });\r\n");
      out.write("\r\n");
      out.write("\t\t    \t  var directionsDisplay = new google.maps.DirectionsRenderer({\r\n");
      out.write("\t\t    \t    map: map\r\n");
      out.write("\t\t    \t  });\r\n");
      out.write("\r\n");
      out.write("\t\t    \t  // Set destination, origin and travel mode.\r\n");
      out.write("\t\t    \t  var request = {\r\n");
      out.write("\t\t    \t    destination: dbPosition,\r\n");
      out.write("\t\t    \t    origin: asePosition,\r\n");
      out.write("\t\t    \t    travelMode: google.maps.TravelMode.DRIVING\r\n");
      out.write("\t\t    \t  };\r\n");
      out.write("\r\n");
      out.write("\t\t    \t  // Pass the directions request to the directions service.\r\n");
      out.write("\t\t    \t  var directionsService = new google.maps.DirectionsService();\r\n");
      out.write("\t\t    \t  directionsService.route(request, function(response, status) {\r\n");
      out.write("\t\t    \t    if (status == google.maps.DirectionsStatus.OK) {\r\n");
      out.write("\t\t    \t      // Display the route on the map.\r\n");
      out.write("\t\t    \t      directionsDisplay.setDirections(response);\r\n");
      out.write("\t\t    \t    }\r\n");
      out.write("\t\t    \t  });\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t    </script>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t<script\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${googleKeyUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" async defer></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
