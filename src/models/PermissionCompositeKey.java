package models;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PermissionCompositeKey implements Serializable {
	private int empl_id;
	private int ep_index;

	public int getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(int empl_id) {
		this.empl_id = empl_id;
	}

	public int getEp_index() {
		return ep_index;
	}

	public void setEp_index(int ep_index) {
		this.ep_index = ep_index;
	}

}
