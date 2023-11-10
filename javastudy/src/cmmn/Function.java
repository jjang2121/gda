package cmmn;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Function {

	public static boolean checkNum(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean checkNull(String str) {
		try {
			if(str.toString() == null)	return false;
			else						return true;
		} catch (NullPointerException ex) {
			return false;
		}
	}
	
	public static String onlyNumComma(double str) {
		DecimalFormat df = new DecimalFormat("###,###,###.######");
		return df.format(str);
	}
	/*
	public static String onlyNumComma1(double str) {
		NumberFormat df = new NumberFormat.getInstance();
		return df.format(str);
	}
	*/

	public static int dateDiff(String sDay, String eDay) throws ParseException {
		int rtnDay = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(null);
		Date sdate = new SimpleDateFormat("yyyyMMdd").parse(sDay.replace("-","").replace(".",""));
		Date edate = new SimpleDateFormat("yyyyMMdd").parse(eDay.replace("-","").replace(".",""));
		c.setTimeInMillis(sdate.getTime()-edate.getTime());
		
		long diffTime = c.getTimeInMillis();
		
		return rtnDay;
	}
	
	// 비밀번호 체크
	public static String pwChk(String pw) {
		String rtnStr = "";
		String[] chkStr = {"qwer","wert","erty","rtyu","tyui","yuii","uiop","asdf","sdfg","dfgh","fghj","ghjk","hjkl","jkl"};
		char[] pwArr = pw.toCharArray();
		int cuCnt=0, clCnt=0, cdCnt=0, ceCnt=0;
		for(char p : pwArr) {
			if(Character.isUpperCase(p))		cuCnt++;
			else if(Character.isLowerCase(p))	clCnt++;
			else if(Character.isDigit(p))		cdCnt++;
			else								ceCnt++;
		}
		
		// 영대소문자, 특수문자, 숫자 조합 체크
		if(cuCnt == 0 || clCnt == 0 || cdCnt == 0 || ceCnt == 0) {
			rtnStr = "FAIL|||||비밀번호는 영대소문자, 특수문자, 숫자 조합으로 입력하세요.";
		} else if (pw.length() < 8) {
			rtnStr = "FAIL|||||비밀번호는 8자리 이상으로 입력하세요.";
		}else {
			rtnStr = "OK|||||";
		}
		
		return rtnStr;
	}
}
