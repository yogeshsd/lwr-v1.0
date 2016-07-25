package com.lwr.software.reporter;

import java.io.File;

public interface DashboardConstants {

	public static final String PATH=".";
	public static final String PRODUCT_NAME="Light Weight Reporter";
	public static final String PIE_CHART_TYPE = "pie";
	public static final String BAR_CHART_TYPE = "bar";
	public static final String BAR_STACK_CHART_TYPE = "barstack";
	public static final String ELEMENT_TYPE = "element";
	public static final String CELL_TYPE = "cell";
	public static final String DASHBOARD_DIR=File.separator+"dashboard"+File.separator;
	public static final String COLUMN_CHART_TYPE = "column";
	public static final String LINE_CHART_TYPE = "line";
	public static final String TABLE_TYPE = "table";
	public static final String HTML_GOOGLE="html_google";
	public static final String CHART_OPTIONS = "chart";
	public static final String TABLE_OPTIONS = "table";
	public static final String STRING = "string";
	public static final String NUMBER = "number";
	public static final String BOOLEAN = "boolean";	
	public static final String USERNAME = "username";
	public static final String DATETIME = "datetime";
	public static final String PASSWORD = "password";
	public static final String CSV = "CSV";
	public static final String ADMIN_USER = "admin";
	public static final String COLUMN_STACK_CHART_TYPE = "columnstack";
	public static final String CHART_STACK_OPTIONS = "columnstack";
	public static final String SECURITY_CONTEXT = "SECURITY_CONTEXT";
	public static final String ANNOTATED_TYPE = "annotated";
	public static final String HTML_JFREE = "html_jfree";
	public static final String PDF="pdf";
	public static final String ALL_PAGES = "ALL_PAGES";
	public static final String HTML = "html";
	public static final long DEFAULT_REFRESH_INTERVAL_MILLIS = 300000;
	public static final Integer MAX_CONNECTIONS = 2;
	public static enum Destination  {EMAIL,FTP};
	public static enum OutputFormat  {HTML,PDF,CSV};
	public static enum Role {	ADMIN,	VIEW, GUEST, ALL };
	public static enum Status { SUCCESS,ERROR,RUNNING, UNKNOWN};
	public static enum Frequency { HOURLY,DAILY,WEEKLY, MONTHLY};
}