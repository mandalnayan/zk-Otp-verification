package com.fintrust.controller;

import org.zkoss.bind.BindUtils;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

import com.fintrust.service.OtpService;

public class ForgetPasswordController extends SelectorComposer<Window>{
	private String email = "nayankm99@gmail.com";
	
	@Listen("onClick=#sendOTP")
	public void forgetPassword() {
		BindUtils.postNotifyChange(null, null, this, "Hello");
		alert("Hii");
	
		boolean success = OtpService.generateAndSendOtp(email);
		if (success) {
			alert("Successfully send OTP..!");
		} else {
			alert("Faild to send OTP..!");
		}
	}
}
