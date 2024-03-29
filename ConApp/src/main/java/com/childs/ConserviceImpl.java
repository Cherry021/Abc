package com.childs;

import java.util.logging.Logger;

import javax.persistence.TypedQuery;

import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.User;
import com.implies.ConService;

@Repository
public class ConserviceImpl implements ConService{
	
	final static Logger log = (Logger) LoggerFactory.getLogger(User.class);
	private SessionFactory s;
	
	public User getUser(long id) {
		System.out.println("GetUser   "+id);
		Session ss = this.s.getCurrentSession();
		TypedQuery<User> query = ss.getNamedQuery("findByUser");
		query.setParameter("ID", id);
		User u = query.getSingleResult();
		return u;
	}
	@Autowired
	public ConserviceImpl(SessionFactory s) {
		super();
		this.s = s;
	}

}
