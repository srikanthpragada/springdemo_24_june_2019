package jdbc;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

@Component
public class SJIDemo {
	private SimpleJdbcInsert sji;

	public SJIDemo(DataSource datasource) {
		this.sji = new SimpleJdbcInsert(datasource).withTableName("jobs");
	}

	public void add() {
		HashMap<String, Object> job = new HashMap<>();
		job.put("job_id", "AD");
		job.put("job_title", "Anguarl Developer");
		int count = sji.execute(job);
		System.out.println("Added Job");
	}
}
