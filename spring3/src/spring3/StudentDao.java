package spring3;
import org.springframework.jdbc.core.JdbcTemplate;  
public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	public int saveStudent(student s)
	{
	String query="insert into student values('"+s.getId()+"','"+s.getName()+"')";
	return jdbcTemplate.update(query);

	}
	public int updateStudent(student s)
	{
	String query="update student set name='"+s.getName()+"'where id='"+s.getId()+"'";
	return jdbcTemplate.update(query);
	}
	public int deleteStudent(student s)
	{
	String query="delete from student where id='"+s.getId()+"' ";
	return jdbcTemplate.update(query);
	}

	}