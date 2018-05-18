package com.epay.scancode.commons.contants;

public enum ScanCodeErrorCode {
	SYSTEM_000000("交易成功", "000000"),
	
	SYSTEM_999999("系统异常", "999999"),
	SYSTEM_999998("通讯异常", "999998"),
	SYSTEM_100000("交易失败", "100000"),
	
	//头部报文，000001的情况下才有body
	SYSTEM_000001("请求成功", "000001"),
	
	//校验类错误码定义：
	VALIDAT_100001("报文格式不合法", "100001"),
	VALIDAT_100002("请求参数不能为空", "100002"),
	VALIDAT_100003("请求参数不合法", "100003"),
	VALIDAT_100004("报文解密失败", "100004"),
	VALIDAT_100005("合作方公钥未提供或不可用", "100005"),
	VALIDAT_100006("报文内容不正确","100006"),
	VALIDAT_100007("交易流水号，请求流水号至少指定一个","100007"),
	VALIDAT_100008("商户状态有误不能支付","100008"),
	
	VALIDAT_100009("验签失败","100009"),
	
	
	
	
	//交易类错误码定义
	TRADE_200001("支付方式已被禁用，不能支付","200001"),
	TRADE_200002("未配置支付方式，不能支付","200002"),
	TRADE_200003("支付方式已被禁用，不能支付","200003"),
	TRADE_200004("原交易订单不存在","200004"),
	TRADE_200005("原支付订单不存在","200005"),
	TRADE_200006("该商户已产生资金交易，不能删除","200006"),
	TRADE_200007("限额","200007"),
	TRADE_200008("计算限额失败","200008"),
	TRADE_200009("代理商或者渠道不允许执行收款操作","200009"),
	TRADE_200010("IP地址未绑定", "200010"),
	TRADE_200011("订单状态异常", "200011"),
	TRADE_200012("退款失败", "200012"),
	TRADE_200013("查询失败", "200013"),
	TRADE_200014("查询成功", "200014"),
	TRADE_200015("退款成功", "200015"),
	TRADE_200016("已全额退款", "200016"),
	
	TRADE_300001("渠道支付异常","300001"),
	TRADE_300002("渠道支付失败","300002"),
	TRADE_300003("该渠道暂不能支付","300003"),
	
	TRADE_400001("提现渠道处理异常","400001"),
	TRADE_400002("提现渠道处理","400002"),
	TRADE_400000("提现渠道受理中","400000"),
	
	TRADE_500000("商户入驻失败","500000"),
	
	TRADE_600001("收款人不存在","600001"),
	TRADE_600002("交易不存在","600002"),
	
	PASSAGE_100000("未配置通道","100000"),
	PASSAGE_100001("暂不支持此交易","100001"),
	PASSAGE_100002("暂不支付该支付方式","100002"),
	PASSAGE_100003("暂不支付的通道","100003"),
	
	PASSAGE_100004("该商户暂无可用通道","100004"),
	PASSAGE_100005("商户基本信息修改失败","100005"),
	PASSAGE_100006("商户费率修改失败","100006"),
	PASSAGE_100007("商户通道入驻失败","100007"),
	PASSAGE_100008("商户不存在，查询失败","100008"),
	PASSAGE_100009("暂不支持修改","100009"),
	
	PASSAGE_100010("不支持的收款类别","100010"),
	PASSAGE_100011("流水号重复","100011");
	
	// 成员变量  
    private String desc;  
    private String code;  
    // 构造方法  
    private ScanCodeErrorCode(String desc, String code) {  
        this.desc = desc;  
        this.code = code; 
    }  
    //覆盖方法  
    @Override  
    public String toString() {  
        return this.code+"_"+this.desc;  
    }
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}