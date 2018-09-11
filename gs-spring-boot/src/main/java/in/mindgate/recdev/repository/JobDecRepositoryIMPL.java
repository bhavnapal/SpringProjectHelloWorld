package in.mindgate.recdev.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.mindgate.recdev.bo.JobDecBo;

@Repository
public class JobDecRepositoryIMPL implements IJobDecRepository {
	private static String INSERT = "INSERT INTO JOB_DESC(JD_ID,JD_RAISED_ON_DATE,JD_PROFILE,JD_PROJECT,JD_EXPERIENCE,JD_QUALIFICATION,"
			+ "JD_CERTIFICATION,JD_SKILLS_SET_MANDATORY,JD_SKILLS_SET_OPTIONAL,"
			+ "JD_RESPONSIBILITY,JD_EXPECTED_DOJ)VALUES(JD_ID_SEQ.nextval,?,?,?,?,?,?,?,?,?,?)";
	private static String GET_JOB_REQUEST = "select * from JOB_DESC";
	
	private static String GET_JOB_REQUESTHOME = "select e.employee_name,j.jd_id,j.JD_RAISED_ON_DATE,j.JD_PROFILE from job_desc j left outer join employees e on j.JD_MAKER_ID=e.EMPLOYEE_ID";
	
	private static String GET_JOB_REQUEST_BY_ID = "select * from JOB_DESC  where JD_ID=?";
	private static String UPDATE_JOB_REQUEST_BY_ID_SQL = "update JOB_DESC set JD_RAISED_ON_DATE=?,JD_PROFILE=?,JD_PROJECT=?,JD_EXPERIENCE=?,JD_QUALIFICATION=?,JD_CERTIFICATION=?,JD_SKILLS_SET_MANDATORY=?,JD_SKILLS_SET_OPTIONAL=?,JD_RESPONSIBILITY=?,JD_EXPECTED_DOJ=? where JD_ID=?";
	private static String DELETE_JOB_REQUEST_BY_ID_SQL = "delete from JOB_DESC where JD_ID=?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addJobDecReq(JobDecBo bo) {

		System.out.println("in repository");

		jdbcTemplate.update(INSERT, bo.getJobDescRaisedOnDate(), bo.getJobDescProfile(),
				bo.getJobDescProject(), bo.getJobDescExperience(), bo.getJobDesQualification(),
				bo.getJobDescCertification(), bo.getJobDescSkillsSetMandatory(), bo.getJobDescSkillsSetOptional(),
				bo.getJobDescResponsibility(), bo.getJobDescExpectedDateOfJoining());
		System.out.println("in repository");

		System.out.println(bo);
	}

	@Override
	public List<JobDecBo> getJobRequestList() {
		return this.jdbcTemplate.query(GET_JOB_REQUEST, new JobRequestListRowMapper());

	}

	@Override
	public JobDecBo getJobRequestList(int id) {
		//
		// return this.jdbcTemplate.queryForObject(GET_JOB_REQUEST_BY_ID,new Object[]
		// {id},new JobRequestListRowMapper());
		return this.jdbcTemplate.queryForObject(GET_JOB_REQUEST_BY_ID, new Object[] { id },
				new JobRequestListRowMapper());
	}

	private static final class JobRequestListRowMapper implements RowMapper<JobDecBo> {

		public JobDecBo mapRow(ResultSet rs, int rownum) throws SQLException {

			JobDecBo bo = new JobDecBo();

			bo.setJobDescId(rs.getInt("JD_ID"));
			bo.setJobDescMakerId(rs.getInt("JD_MAKER_ID"));
			bo.setJobDescCheckerId(rs.getInt("JD_CHECKER_ID"));
			bo.setJobDescRaisedOnDate(rs.getDate("JD_RAISED_ON_DATE"));
			bo.setJobDescApprovedRejectDate(rs.getDate("JD_APPROVED_REJECT_DATE"));
			bo.setJobDescExperience(rs.getInt("JD_EXPERIENCE"));
			bo.setJobDescSkillsSetMandatory(rs.getString("JD_SKILLS_SET_MANDATORY"));
			bo.setJobDescSkillsSetOptional(rs.getString("JD_SKILLS_SET_OPTIONAL"));
			bo.setJobDescProfile(rs.getString("JD_PROFILE"));
			bo.setJobDesQualification(rs.getString("JD_QUALIFICATION"));
			bo.setJobDescExpectedDateOfJoining(rs.getDate("JD_EXPECTED_DOJ"));
			bo.setJobDescNumberOfCandidates(rs.getInt("JD_NUMBER_OF_CANDIDATES"));
			bo.setJobDescCertification(rs.getString("JD_CERTIFICATION"));
			bo.setJobDescResponsibility(rs.getString("JD_RESPONSIBILITY"));
			bo.setJobDescProject(rs.getString("JD_PROJECT"));
			bo.setJobDescStatus(rs.getString("JD_STATUS"));
			bo.setJobDescBudget(rs.getInt("JD_BUDGET"));
			bo.setJobDescComments(rs.getString("JD_COMMENTS"));
			
			
			


			return bo;
		}

	}

	
	
	private static final class JobRequestRowMapper implements RowMapper<JobDecBo> {

		public JobDecBo mapRow(ResultSet rs, int rownum) throws SQLException {

			JobDecBo bo = new JobDecBo();

		
			
			
			
			bo.setJobDescProfile(rs.getString("JD_PROFILE"));

			bo.setJobDescEmployee(rs.getString("employee_name"));
			bo.setJobDescId(rs.getInt("JD_ID"));
			bo.setJobDescRaisedOnDate(rs.getDate("JD_RAISED_ON_DATE"));


			return bo;
		}

	}

	
	
	
	
	@Override
	public void updateJobRequestListId(int id, JobDecBo bo) {
		jdbcTemplate.update(UPDATE_JOB_REQUEST_BY_ID_SQL,
				new Object[] { bo.getJobDescRaisedOnDate(), bo.getJobDescProfile(), bo.getJobDescProject(),
						bo.getJobDescExperience(), bo.getJobDesQualification(), bo.getJobDescCertification(),
						bo.getJobDescSkillsSetMandatory(), bo.getJobDescSkillsSetOptional(),
						bo.getJobDescResponsibility(), bo.getJobDescExpectedDateOfJoining(), id });
	}

	@Override
	public void deleteJobRequestListId(int id) {
		jdbcTemplate.update(DELETE_JOB_REQUEST_BY_ID_SQL, new Object[] { id });

	}

	@Override
	public List<JobDecBo> getJobRequestListHome() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query(GET_JOB_REQUESTHOME, new JobRequestRowMapper());
	}

}