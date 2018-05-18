package com.epay.scancode.commons.vo;

import com.epay.scancode.commons.entity.ProfitOrganDay;

public class ProfitOrganDayVo extends ProfitOrganDay  {

	
private static final long serialVersionUID = 1L;
	
	private String channelName;
	private String agentName;
	
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	
	
	
}
