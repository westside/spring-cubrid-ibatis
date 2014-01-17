package com.westside.cubrid.sample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.westside.cubrid.sample.Sample;

@ContextConfiguration("classpath:applicationContext-datasource.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DaoTest {
	public static final String NAMESPACE = "Sample";
	
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(sqlMapClientTemplate);
		List<Sample> result = sqlMapClientTemplate.queryForList("Sample.selectAll");
		System.out.println(result);
	}

}
