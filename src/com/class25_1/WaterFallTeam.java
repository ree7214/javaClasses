package com.class25_1;

import com.class25.ScrumTeam;

public class WaterFallTeam extends ScrumTeam {//must import from another package

	public static void main(String[] args) {
		WaterFallTeam team=new WaterFallTeam();
		team.companyName="Syntax";
		//accessessing protecte variable in different package
		team.employeeID=102;
		

	}

}
