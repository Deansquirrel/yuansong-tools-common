package com.yuansong.tools.common;

/***
 * 转换工具类
 * @author yuansong6@163.com
 */

public class ConversionTool {
	
	private ConversionTool() {}

	/***
	 * 
	 * @param date
	 * @return
	 */
	public static java.util.Date ConvertSqlDateToUtilDate(java.sql.Date date){
		if(date == null) {
			return null;
		}
		return new java.util.Date(date.getTime());
	}
	
	/***
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Date ConvertUtilDateToSqlDate(java.util.Date date){
		if(date == null) {
			return null;
		}
		return new java.sql.Date(date.getTime());
	}
}
