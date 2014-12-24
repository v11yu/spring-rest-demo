package org.v11.spring_rest.service;

import org.springframework.stereotype.Component;
import org.v11.spring_rest.entity.Person;

@Component
public class PersonService implements IPersonService {
	@Override
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setLocation("Varanasi");
		p.setName("Ram");
		return p;
	}
}
