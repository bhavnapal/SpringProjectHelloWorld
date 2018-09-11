package in.mindgate.recdev.service;

import java.util.List;

import in.mindgate.recdev.bo.JobDecBo;

public interface IJobDecService {
	public void addJobDecReq(JobDecBo bo);
	public List<JobDecBo> getJobRequestList();
	public JobDecBo getJobRequestList(final int id);
	public void updateJobRequestListId(int id, JobDecBo bo);
	public void deleteJobRequestListId(int id);
	public List<JobDecBo> getJobRequestListHome();

}
