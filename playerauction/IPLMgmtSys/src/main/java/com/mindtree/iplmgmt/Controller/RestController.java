package com.mindtree.iplmgmt.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.iplmgmt.entity.Ground;
import com.mindtree.iplmgmt.entityDto.GroundDto;
import com.mindtree.iplmgmt.service.IPLService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")

public class RestController {
	@Autowired
	private IPLService iplService;

//@RequestMapping(value="/loadground/{id}",)
	@GetMapping("/loadground/{id}")
	public Set<GroundDto> update(@PathVariable("id") int id) {
		System.out.println(id);
//		model.addAttribute("teams", iplService.getAllTeamNotAssigned());
//		model.addAttribute("locations", iplService.getAllLocations());
		
		Set<GroundDto> result = iplService.getAllGroundsforLocationforDto(id);
		return result;
	}
}
