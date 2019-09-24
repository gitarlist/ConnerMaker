package com.connermaker.maker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CController {

	@RequestMapping(value = "/main")
	public String mainPage() {
		return "main";
	}

	/*아이 방*/
	@RequestMapping(value = "/room_Edward")
	public String kidsRoomPageC1() {
		return "/kidsroom/c1";
	}

	@RequestMapping(value = "/room_Ethan")
	public String kidsRoomPageC2() {
		return "/kidsroom/c2";
	}
	@RequestMapping(value = "/room_Eyke")
	public String kidsRoomPageC3() {
		return "/kidsroom/c3";
	}
	@RequestMapping(value = "/room_Elliot")
	public String kidsRoomPageC4() {
		return "/kidsroom/c4";
	}
	
	/*상태일람*/
	@RequestMapping(value = "/stat_Edward")
	public String statusPageC1() {
		return "/status/c1";
	}
	@RequestMapping(value = "/stat_Ethan")
	public String statusPageC2() {
		return "/status/c2";
	}
	@RequestMapping(value = "/stat_Eyke")
	public String statusPageC3() {
		return "/status/c3";
	}
	@RequestMapping(value = "/stat_Elliot")
	public String statusPageC4() {
		return "/status/c4";
	}

}//class end
