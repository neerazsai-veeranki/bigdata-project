package streams;

public class Job {
	
	private long jobId;
	private String designation;
	private int companyId;
	private String name;
	private String workType;
	private String involvement;
	private int employeesCount;
	private int totalApplicants;
	private long linkedInFollowers;
	private String jobDetail;
	private int detailsId;
	private String industry;
	private String level;
	private String city;
	private String state;
	
	
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", designationString=" + designation + ", companyId=" + companyId
				+ ", name=" + name + ", workType=" + workType + ", involvement=" + involvement + ", employeesCount="
				+ employeesCount + ", totalApplicants=" + totalApplicants + ", linkedInFollowers=" + linkedInFollowers
				+ ", jobDetail=" + jobDetail + ", detailsId=" + detailsId + ", industry=" + industry + ", level="
				+ level + ", city=" + city + ", state=" + state + "]";
	}
	
	public Job(long jobId, String designationString, int companyId, String name, String workType, String involvement,
			int employeesCount, int totalApplicants, long linkedInFollowers, String jobDetail, int detailsId,
			String industry, String level, String city, String state) {
		super();
		this.jobId = jobId;
		this.designation = designationString;
		this.companyId = companyId;
		this.name = name;
		this.workType = workType;
		this.involvement = involvement;
		this.employeesCount = employeesCount;
		this.totalApplicants = totalApplicants;
		this.linkedInFollowers = linkedInFollowers;
		this.jobDetail = jobDetail;
		this.detailsId = detailsId;
		this.industry = industry;
		this.level = level;
		this.city = city;
		this.state = state;
	}
	public long getJobId() {
		return jobId;
	}
	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	public String getDesignationString() {
		return designation;
	}
	public void setDesignationString(String designationString) {
		this.designation = designationString;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getInvolvement() {
		return involvement;
	}
	public void setInvolvement(String involvement) {
		this.involvement = involvement;
	}
	public int getEmployeesCount() {
		return employeesCount;
	}
	public void setEmployeesCount(int employeesCount) {
		this.employeesCount = employeesCount;
	}
	public int getTotalApplicants() {
		return totalApplicants;
	}
	public void setTotalApplicants(int totalApplicants) {
		this.totalApplicants = totalApplicants;
	}
	public long getLinkedInFollowers() {
		return linkedInFollowers;
	}
	public void setLinkedInFollowers(long linkedInFollowers) {
		this.linkedInFollowers = linkedInFollowers;
	}
	public String getJobDetail() {
		return jobDetail;
	}
	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
	}
	public int getDetailsId() {
		return detailsId;
	}
	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
