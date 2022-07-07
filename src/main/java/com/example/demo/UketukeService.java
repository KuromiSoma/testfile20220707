package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional 
public class UketukeService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Uketuke> getUketukeList() {
		List<Uketuke> uketukeList = jdbcTemplate.queryForObject("select * from java_user.uketuke", new UketukeMapper());

		return uketukeList;
	}
}