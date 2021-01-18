package tw.pan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {

	@Autowired
	private TestDao tDao;
	@Autowired
	public TestService(TestDao tDao) {
		this.tDao = tDao;
	}
	
	public Test select(String name) {
		return tDao.select(name);
	}

}
