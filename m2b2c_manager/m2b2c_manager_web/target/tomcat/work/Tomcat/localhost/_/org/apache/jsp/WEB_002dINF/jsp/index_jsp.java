/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-19 16:29:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <title>m2b2c商城后台管理系统</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\"> <link href=\"css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.min.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/themes/icon.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/s/ajaxFileUpload.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("</script>\r\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\" style=\"overflow:hidden\">\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("       <h4> 欢迎</h4>\r\n");
      out.write("        <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("            <li>用户</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--左侧导航开始-->\r\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\r\n");
      out.write("        <div class=\"nav-close\"><i class=\"fa fa-times-circle\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                    <li class=\"nav-header\">\r\n");
      out.write("                        <div class=\"dropdown profile-element\">\r\n");
      out.write("                            <a rows-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                                <span class=\"clear\">\r\n");
      out.write("                                    <span class=\"block m-t-xs\" style=\"font-size:20px;\">\r\n");
      out.write("                                        <i class=\"fa fa-area-chart\"></i>\r\n");
      out.write("                                        <strong class=\"font-bold\">后台管理系统</strong>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                              </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"logo-element\">后台管理系统\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"J_menuItem\" href=\"welcome.html\">\r\n");
      out.write("                            <i class=\"fa fa-home\"></i>\r\n");
      out.write("                            <span class=\"nav-label\">首页</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                            <span class=\"ng-scope\">用户管理</span>\r\n");
      out.write("                            <span class=\"fa arrow\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                         <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                <span class=\"nav-label\">品牌商管理</span>\r\n");
      out.write("                                <span class=\"fa arrow\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user_manager/brand.html\">品牌管理</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user_manager/role.html\">企业管理</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                         <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                <span class=\"nav-label\">分销商管理</span>\r\n");
      out.write("                                <span class=\"fa arrow\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user_manager/user.html\">品牌管理</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user_manager/role.html\">企业管理</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                         <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                <span class=\"nav-label\">管理员管理</span>\r\n");
      out.write("                                <span class=\"fa arrow\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user-manager/user.html\">管理员</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                         <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                <span class=\"nav-label\">用户入驻管理</span>\r\n");
      out.write("                                <span class=\"fa arrow\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"nav nav-second-level\" >\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user_manager/Verify_brand.html\">品牌商入驻审核</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a class=\"J_menuItem\" href=\"user_manager/Verify_distributor.html\">分销商入驻审核</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                            <span class=\"ng-scope\">商品管理</span>\r\n");
      out.write("                            <span class=\"fa arrow\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"J_menuItem\" href=\"user_manager/product_add.html\">商品添加</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                    <span class=\"nav-label\">商品修改</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                    <span class=\"nav-label\">商品审核</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                            <span class=\"ng-scope\">钱包管理</span>\r\n");
      out.write("                            <span class=\"fa arrow\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                    <span class=\"nav-label\">钱包审核</span>\r\n");
      out.write("                                    <span class=\"fa arrow\"></span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a class=\"J_menuItem\" href=\"user-manager/user.html\">充值审核</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a class=\"J_menuItem\" href=\"user-manager/role.html\">提现审核</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                    <span class=\"nav-label\">用户钱包</span>\r\n");
      out.write("                                    <span class=\"fa arrow\"></span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a class=\"J_menuItem\" href=\"user-manager/user.html\">钱包明细</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                            <span class=\"ng-scope\">个人资料</span>\r\n");
      out.write("                            <span class=\"fa arrow\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                    <span class=\"nav-label\">账号信息</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul></ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa fa-bar-chart-o\"></i>\r\n");
      out.write("                                    <span class=\"nav-label\">信息修改</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!--左侧导航结束-->\r\n");
      out.write("    <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("        <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                <div class=\"navbar-header\"><a class=\"navbar-minimalize minimalize-styl-2 btn btn-info \" href=\"#\"><i class=\"fa fa-bars\"></i> </a>\r\n");
      out.write("                    <form role=\"search\" class=\"navbar-form-custom\" method=\"post\" action=\"search_results.html\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"请输入您需要查找的内容 …\" class=\"form-control\" name=\"top-search\" id=\"top-search\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row J_mainContent\" id=\"content-main\">\r\n");
      out.write("                <p id=\"add\" style=\"display: none\"></p>\r\n");
      out.write("                <iframe id=\"J_iframe\" width=\"100%\" height=\"100%\" ></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <!--右侧部分结束-->\r\n");
      out.write("    <!-- 自定义js -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/content.js?v=1.0.0\"></script>\r\n");
      out.write("    <!-- 全局js -->\r\n");
      out.write("    <script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("    <script src=\"js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("    <!-- 自定义js -->\r\n");
      out.write("    <script src=\"js/hAdmin.js?v=4.1.0\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <!-- 第三方插件 -->\r\n");
      out.write("    <script src=\"js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $('#productAdd').click(function () {\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        var $test=$(\"#content-main\");\r\n");
      out.write("        var s =\" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "welcome.jsp", out, true);
      out.write(" \";\r\n");
      out.write("        $test.html(s).show;\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("            //菜单点击\r\n");
      out.write("            J_iframe\r\n");
      out.write("            $(\".J_menuItem\").on('click',function(){\r\n");
      out.write("                var url = $(this).attr('href');\r\n");
      out.write("                $(\"#J_iframe\").attr('src',url);\r\n");
      out.write("                return false;\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
