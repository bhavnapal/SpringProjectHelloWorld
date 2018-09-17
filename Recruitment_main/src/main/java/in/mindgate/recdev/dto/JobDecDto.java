package in.mindgate.recdev.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class JobDecDto implements Serializable {

	private LocalDate jobDescRaisedOnDate;
	private int jobDescExperience;
	private String jobDescSkillsSetMandatory;
	private String jobDescSkillsSetOptional;
	private String jobDescProfile;
	private String jobDesQualification;
	private LocalDate jobDescExpectedDoj;
	private String jobDescCertification;
	private String jobDescResponsibility;
	private String jobDescProject;

	public JobDecDto() {
		// TODO Auto-generated constructor stub
	}

	public JobDecDto(LocalDate jobDescRaisedOnDate, int jobDescExperience, String jobDescSkillsSetMandatory,
			String jobDescSkillsSetOptional, String jobDescProfile, String jobDesQualification,
			LocalDate jobDescExpectedDoj, String jobDescCertification, String jobDescResponsibility,
			String jobDescProject) {
		super();
		this.jobDescRaisedOnDate = jobDescRaisedOnDate;
		this.jobDescExperience = jobDescExperience;
		this.jobDescSkillsSetMandatory = jobDescSkillsSetMandatory;
		this.jobDescSkillsSetOptional = jobDescSkillsSetOptional;
		this.jobDescProfile = jobDescProfile;
		this.jobDesQualification = jobDesQualification;
		this.jobDescExpectedDoj = jobDescExpectedDoj;
		this.jobDescCertification = jobDescCertification;
		this.jobDescResponsibility = jobDescResponsibility;
		this.jobDescProject = jobDescProject;
	}

	public LocalDate getJobDescRaisedOnDate() {
		return jobDescRaisedOnDate;
	}

	public void setJobDescRaisedOnDate(LocalDate jobDescRaisedOnDate) {
		this.jobDescRaisedOnDate = jobDescRaisedOnDate;
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

	public LocalDate getJobDescExpectedDoj() {
		return jobDescExpectedDoj;
	}

	public void setJobDescExpectedDoj(LocalDate jobDescExpectedDoj) {
		this.jobDescExpectedDoj = jobDescExpectedDoj;
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

	@Override
	public String toString() {
		return "JobDecDto [jobDescRaisedOnDate=" + jobDescRaisedOnDate + ", jobDescExperience=" + jobDescExperience
				+ ", jobDescSkillsSetMandatory=" + jobDescSkillsSetMandatory + ", jobDescSkillsSetOptional="
				+ jobDescSkillsSetOptional + ", jobDescProfile=" + jobDescProfile + ", jobDesQualification="
				+ jobDesQualification + ", jobDescExpectedDoj=" + jobDescExpectedDoj + ", jobDescCertification="
				+ jobDescCertification + ", jobDescResponsibility=" + jobDescResponsibility + ", jobDescProject="
				+ jobDescProject + "]";
	}

}
