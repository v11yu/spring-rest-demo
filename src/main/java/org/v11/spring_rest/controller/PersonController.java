package org.v11.spring_rest.controller;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.v11.spring_rest.entity.Person;
import org.v11.spring_rest.service.IPersonService;
import org.v11.spring_rest.util.MediaTypes;





@RestController
@RequestMapping("/api")
public class PersonController {
	@Autowired
	private IPersonService personService;
	@RequestMapping("/person")
	public Person getPersonDetail(@RequestParam(value = "id",required = false,
	                                                    defaultValue = "0") Integer id) {
		Person p = personService.getPersonDetail(id);
		return p;
	}
	@RequestMapping(value = "/p/{id}", method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public Person getPerson (@PathVariable("id") Integer id) {
		Person p = personService.getPersonDetail(id);
		return p;
	}

	
}

