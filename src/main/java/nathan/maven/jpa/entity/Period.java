package nathan.maven.jpa.entity;

import java.util.Date;

import javax.persistence.*;

@Embeddable
public class Period {
	private Date startDate;
	private Date endDate;
	public Period(){
		
	}
	@Column(name="START_DATE")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Column(name="END_DATE")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
