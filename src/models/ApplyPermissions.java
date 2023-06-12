package models;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_employeepermissionrequests")
public class ApplyPermissions {

	@EmbeddedId
	private PermissionCompositeKey id;

	private Date eprq_date;
	private String eprq_sttime;
	private String eprq_endtime;
	private String reason;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public PermissionCompositeKey getId() {
		return id;
	}

	public void setId(PermissionCompositeKey id) {
		this.id = id;
	}

	public Date getEprq_date() {
		return eprq_date;
	}

	public void setEprq_date(Date eprq_date) {
		this.eprq_date = eprq_date;
	}

	public String getEprq_sttime() {
		return eprq_sttime;
	}

	public void setEprq_sttime(String eprq_sttime) {
		this.eprq_sttime = eprq_sttime;
	}

	public String getEprq_endtime() {
		return eprq_endtime;
	}

	public void setEprq_endtime(String eprq_endtime) {
		this.eprq_endtime = eprq_endtime;
	}

}
