package in.mindgate.recdev.bo;

import java.time.LocalDate;
import java.util.Date;

public class JobDecBo {

	private int jobDescId;
	private int jobDescMakerId;
	private int jobDescCheckerId;
	private Date jobDescRaisedOnDate;
	private Date jobDescApprovedRejectDate;
	private int jobDescExperience;
	private String jobDescSkillsSetMandatory;
	private String jobDescSkillsSetOptional;
	private String jobDescProfile;
	private String jobDesQualification;
	private Date jobDescExpectedDateOfJoining;
	private int jobDescNumberOfCandidates;
	private String jobDescCertification;
	private String jobDescResponsibility;
	private String jobDescProject;
	private String jobDescStatus;
	private int jobDescBudget;
	private String jobDescComments;
	private String jobDescEmployee;

	public JobDecBo() {
		// TODO Auto-generated constructor stub
	}

	public String getJobDescEmployee() {
		return jobDescEmployee;
	}

	public void setJobDescEmployee(String jobDescEmployee) {
		this.jobDescEmployee = jobDescEmployee;
	}

	public Date getJobDescRaisedOnDate() {
		return jobDescRaisedOnDate;
	}

	public void setJobDescRaisedOnDate(Date jobDescRaisedOnDate) {
		this.jobDescRaisedOnDate = jobDescRaisedOnDate;
	}

	public Date getJobDescExpectedDateOfJoining() {
		return jobDescExpectedDateOfJoining;
	}

	public void setJobDescExpectedDateOfJoining(Date jobDescExpectedDateOfJoining) {
		this.jobDescExpectedDateOfJoining = jobDescExpectedDateOfJoining;
	}

	public int getJobDescExperience() {
		return jobDescExperience;
	}

	public void setJobDescExperience(int jobDescExperience) {
		this.jobDescExperience = jobDescExperience;
	}

	public String getJobDescSkillsSetMandatory() {
		return jobDescSkillsSetMandatory;
	}

	public void setJobDescSkillsSetMandatory(String jobDescSkillsSetMandatory) {
		this.jobDescSkillsSetMandatory = jobDescSkillsSetMandatory;
	}

	public String getJobDescSkillsSetOptional() {
		return jobDescSkillsSetOptional;
	}

	public void setJobDescSkillsSetOptional(String jobDescSkillsSetOptional) {
		this.jobDescSkillsSetOptional = jobDescSkillsSetOptional;
	}

	public String getJobDescProfile() {
		return jobDescProfile;
	}

	public void setJobDescProfile(String jobDescProfile) {
		this.jobDescProfile = jobDescProfile;
	}

	public String getJobDesQualification() {
		return jobDesQualification;
	}

	public void setJobDesQualification(String jobDesQualification) {
		this.jobDesQualification = jobDesQualification;
	}

	public String getJobDescCertification() {
		return jobDescCertification;
	}

	public void setJobDescCertification(String jobDescCertification) {
		this.jobDescCertification = jobDescCertification;
	}

	public String getJobDescResponsibility() {
		return jobDescResponsibility;
	}

	public void setJobDescResponsibility(String jobDescResponsibility) {
		this.jobDescResponsibility = jobDescResponsibility;
	}

	public String getJobDescProject() {
		return jobDescProject;
	}

	public void setJobDescProject(String jobDescProject) {
		this.jobDescProject = jobDescProject;
	}

	public int getJobDescId() {
		return jobDescId;
	}

	public void setJobDescId(int jobDescId) {
		this.jobDescId = jobDescId;
	}

	public int getJobDescMakerId() {
		return jobDescMakerId;
	}

	public void setJobDescMakerId(int jobDescMakerId) {
		this.jobDescMakerId = jobDescMakerId;
	}

	public int getJobDescCheckerId() {
		return jobDescCheckerId;
	}

	public void setJobDescCheckerId(int jobDescCheckerId) {
		this.jobDescCheckerId = jobDescCheckerId;
	}

	public Date getJobDescApprovedRejectDate() {
		return jobDescApprovedRejectDate;
	}

	public void setJobDescApprovedRejectDate(Date jobDescApprovedRejectDate) {
		this.jobDescApprovedRejectDate = jobDescApprovedRejectDate;
	}

	public int getJobDescNumberOfCandidates() {
		return jobDescNumberOfCandidates;
	}

	public void setJobDescNumberOfCandidates(int jobDescNumberOfCandidates) {
		this.jobDescNumberOfCandidates = jobDescNumberOfCandidates;
	}

	public String getJobDescStatus() {
		return jobDescStatus;
	}

	public void setJobDescStatus(String jobDescStatus) {
		this.jobDescStatus = jobDescStatus;
	}

	public int getJobDescBudget() {
		return jobDescBudget;
	}

	public void setJobDescBudget(int jobDescBudget) {
		this.jobDescBudget = jobDescBudget;
	}

	public String getJobDescComments() {
		return jobDescComments;
	}

	public void setJobDescComments(String jobDescComments) {
		this.jobDescComments = jobDescComments;
	}

}
