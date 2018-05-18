package com.epay.scancode.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.lang3.StringEscapeUtils;

public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {  
	  
    public XssHttpServletRequestWrapper(HttpServletRequest request) {  
        super(request);  
    }  
  
    @Override  
    public String getHeader(String name) {  
        return StringEscapeUtils.escapeHtml4(super.getHeader(name));  
    }  
  
    @Override  
    public String getQueryString() {  
        return StringEscapeUtils.escapeHtml4(super.getQueryString());  
    }  
  
    @Override  
    public String getParameter(String name) {  
        return StringEscapeUtils.escapeHtml4(super.getParameter(name));  
    }  
  
    @Override  
    public String[] getParameterValues(String name) {  
        String[] values = super.getParameterValues(name);  
        if(values != null) {  
            int length = values.length;  
            String[] escapseValues = new String[length];  
            for(int i = 0; i < length; i++){  
//            	if(values[i].indexOf("+") >= 0 || values[i].indexOf("=") >= 0 || values[i].indexOf("@") >= 0 || values[i].indexOf("{") >= 0){
//            		escapseValues[i] = xssEncode(values[i]);
//            	}else{
//            		escapseValues[i] = StringEscapeUtils.escapeHtml4(values[i]);
//            	}
            	if(values[i].indexOf("<") >= 0 || values[i].indexOf(">") >= 0){
            		escapseValues[i] = xssEncode(values[i]);
            	}else{
            		escapseValues[i] = values[i];
            	}
            }  
            return escapseValues;  
        }
        return super.getParameterValues(name);  
    } 
     
    
//    static String stripArray [] = {"|","&",";","$","%","'","\"","<",">","(",")"};
//    private String stripStr(String type){
// 		List<String> stripArrayLists = Arrays.asList(stripArray);
// 		if(Strings.isNotEmpty(type)){
// 			StringBuffer sbf = new StringBuffer();
// 			// 判断单个类型文件的场合 
// 			for (String string : type.split("")) {
// 				 if(stripArrayLists.contains(string)) {
// 					sbf.append("".intern());
// 				 }else{
// 					sbf.append(string);
// 				 }
//			}
// 			return sbf.toString();
// 		}
// 		return type;
//    }
    
    /**
     * 将容易引起xss漏洞的半角字符直接替换成全角字符
     *
     * @param s
     * @return
     */
     private static String xssEncode(String s) {
         if (s == null || "".equals(s)) {
             return s;
         }
         StringBuilder sb = new StringBuilder(s.length() + 16);
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             switch (c) {
                 case '>':
                     sb.append('＞');//全角大于号
                     break;
                 case '<':
                     sb.append('＜');//全角小于号
                     break;
//                 case '(':
//                     sb.append('（');//全角左括号
//                     break;
//                 case ')':
//                     sb.append('）');//全角右括号
//                     break;
//                 case '$':
//                     sb.append('＄');//全角美元符号
//                     break;
                 default:
                     sb.append(c);
                     break;
             }
         }
         return sb.toString();
     }
     
     public static void main(String[] args) {
    	 System.out.println(XssHttpServletRequestWrapper.xssEncode("<script>1<script>"));
         System.out.println(XssHttpServletRequestWrapper.xssEncode("754053007@qq.com<script>"));
         System.out.println(XssHttpServletRequestWrapper.xssEncode("{\"passageNo\":\"cmbc\",\"returnCode\":\"100008\",\"requestTime\":\"\",\"tradeNo\":\"20170919103003154745\",\"returnMsg\":\"商户不存在，查询失败\",\"responseBody\":{\"businessResponse\":null},\"returnLog\":\"[{\"account\":{\"accountName\":\"刘树禹\",\"bankName\":\"建设银行\",\"isRealAccount\":\"N\",\"accountType\":\"N\",\"bankCode\":\"105100000017\",\"bankCard\":\"6227002021491189343\"},\"respCode\":\"000000\",\"payType\":[{\"tradeRate\":0.9,\"payCode\":\"WXSMZF\",\"withdrawRate\":0.9,\"settleAmt\":0,\"status\":\"3\",\"withdrawAmt\":0}],\"info\":{\"merchantName\":\"华付信息测试001\",\"district\":\"\",\"serPhone\":\"18718485428\",\"address\":\"深圳市南山区\",\"merchantNature\":\"\",\"idCard\":\"360782199402287012\",\"merchantLicense\":\"123456\",\"merchantTypeCode\":\"\",\"remark\":\"\",\"merchantNo\":\"891186261979701248\",\"email\":\"\",\"shortName\":\"华付信息测试001\",\"mainBusiness\":\"\",\"auditStatus\":\"3\",\"category\":\"2015061690000027\",\"businessRange\":\"\",\"positionCode\":\"\",\"phone\":\"18718485428\",\"name\":\"刘树禹\",\"mobile\":\"18166044159\"}}]\",\"merchantNo\":\"BB2017072910000001\",\"responseTime\":\"2017-09-19 10:30:03\",\"version\":\"V1.0.0\"}"));
         System.out.println(XssHttpServletRequestWrapper.xssEncode("{\"agencyId\":\"861100003\",\"publicKey\":\"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuzSv63X49gsI1rQBHL+cO7gZyeUQKRFXY4oQ4AUpkXkt7u29r9R6rcpk5Pk3Gd6OR4+/C4mXcb1aVR17bPkhJXiVT4Yv9BfzMjURn42kzvSU/+ZKrWaphsEpXQAkwaXSvEDAo3GyWZmOfiAu5ayxGklWSsz1QXByAmm/WwS+mYclBQ/KXiRZsBlPIe2/vAavlGDSuLW8ggtd4eyPMfohu16hWrTUK3mv/t05W4aTHvng3Q2i9u6G/8s+2BbcDV4ysYh6uwWfL/tyVXV/0WeHo2so400yY39aNQ2Q63rRVTIvk8ba0EpXIsjSD0Py81pk3k+M4ewecsyFhTs1a66PNQIDAQAB\",\"privateKey\":\"MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0U+ID9JCrRisvnJP9QNGgoWC0revS+6I16Qf58qtl0lbXxTF8SIeY93dDnV3bcZRL6xG+MypSHu5AMxHX7YNUWU+HMvqwwNdDJWpbY349GeGRYBoLYJ3e863LdcAkW//3etyeDgurFbr16/njta2K7xendUniAT0uXQvM14tP+jHSmib5rb3tgVnt1W0qrwund53+aY9rwDCgaFsZCzrDe6gXBN7CsU13yjHAnz8M7CWL0gwNlQmoK/na9zbrqKbmkxU17PawnIzUwMDd7aKodpQhZxCRbZT2MDntvGYvFYTaJnFJLuqdgtZ3zOFxpqokHZMkSRmqe0qEnec8CGL3AgMBAAECggEASPOafwEkubWEaRmOISlk5PgEWHP38H3OTML+cBbFUkb6zQXAlEf/W1nZzOfP/aQAW4o4vlqSp3BN8Hj4ogM7WxdafhaYpoMNUuPDGD+y5WMgByD6yFmI5JZuW95CIjN55RO2Rtblz4vV/AFAMefg0lERn7RqdF0N9EC+MluMx4iBSWDFaKGuxCcnLSWJlSVtPL2rHjZZNvM3pvm+UyH1lnREZ1JDxzGaBrspbPuBM67ieJutAPuCiCTfeDhXJaGVrUJz/gdlUxLbbpV1LOVA/YzGCJZWGFQeqyqwk/mEu5CJXwP01n2wxYc234GPpkJIPRSaK3Ats1c2mqT63ch8oQKBgQDeBpqaXjAvOoJb2JxC+B/gyNj/ccspGMVWyNNifHC9kd9ImVRxdzyDH7FgtOJdywr8LP95yz2xCfkqTp2tBe8R1nxP5HORMXEqkw/rgPrDzLaJRNvVsVHSxhCY6W4JRkS2IRw23j7yvP9T4zgGJGh7tXHIJuBr/2RcM4kHtZAVcQKBgQDP69eMSOyX7ANuUTJ+0pUD2/SfnNEANAUNF6cmWgjk8wY9I+KgKngIVvwW7B3DSM+7T4bOqJH16WSIByvdKvpPizJ18bmhzSWMA1N3OhGCTSN9aZv05QLsnLKhADEeatX+QwkDU/YlNUfdAhdwIrDvEYjHdxX+7NhmyqF5QUiq5wKBgQCPalqhTif3yeZ8p33AcIA+9d3dm0atBDgsZ8rLejBk8330aj62kFvBI06zdgQmq8orvHFF3fe6jQOqxV9qbUPRFOf1v067QeGkq5wD9quEoI5kOtt5vHFrIc+Exnvyd7ZYoyiTdJnauCSBrmr45Lms9zZJIHukpzLPr+Za2Xf5sQKBgQCb1khX/NBXja2EoZcXNv45RkKy3vZHELY4eeHt/M1tzDiA2sShBzOwDIIlLBOiqpAH9DM18WJ0zdlrmvRlcDDsLYhEnkhj3T6nElccpYk6AFb5SI57nqnybf/0bBBkm+6IA/ZdaDC08ppKK6clhNrYVGwQFFGIIDyRzo34M9YjQQKBgDbCKHfEc6eRBL6FuqWWJk9N5cWjNZZskejQ7QTkStS3Vm0TSfWVBxU4d+8A85kphMur5J+JaLTq9VY8tHq7z0wBu6Lmqb3PcK7GmLDggpTjLtpHga3WdP4eGOZWKIZe2XAqeRqIW7AjAe4C9Uq7lgW11WfT1SVRcEmURR3dMEsw\",\"notifyUrl\":\"http://jr.pay.ys.huaepay.com/scancodecallback/payCallBack\",\"returnUrl\":\"http://jr.pay.ys.huaepay.com/scan/paymentResult\"}"));
         System.out.println(XssHttpServletRequestWrapper.xssEncode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuzSv63X49gsI1rQBHL+cO7gZyeUQKRFXY4oQ4AUpkXkt7u29r9R6rcpk5Pk3Gd6OR4+/C4mXcb1aVR17bPkhJXiVT4Yv9BfzMjURn42kzvSU/+ZKrWaphsEpXQAkwaXSvEDAo3GyWZmOfiAu5ayxGklWSsz1QXByAmm/WwS+mYclBQ/KXiRZsBlPIe2/vAavlGDSuLW8ggtd4eyPMfohu16hWrTUK3mv/t05W4aTHvng3Q2i9u6G/8s+2BbcDV4ysYh6uwWfL/tyVXV/0WeHo2so400yY39aNQ2Q63rRVTIvk8ba0EpXIsjSD0Py81pk3k+M4ewecsyFhTs1a66PNQIDAQAB"));
     }
} 
