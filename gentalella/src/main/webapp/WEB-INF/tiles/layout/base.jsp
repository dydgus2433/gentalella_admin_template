<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <tiles:insertAttribute name="head"/>
    <tiles:insertAttribute name="head_add"/>
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Y Admin</span></a>
            </div>
 		<div class="clearfix"></div>

			<tiles:insertAttribute name="sidebar"/>
       
          </div>
        </div>

			<tiles:insertAttribute name="header"/>
			<tiles:insertAttribute name="body"/>			
			<tiles:insertAttribute name="footer"/>
      </div>
    </div>
    
    
			<tiles:insertAttribute name="script"/>
			<tiles:insertAttribute name="script_add"/>
	
  </body>
</html>
