package controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.ApplyPermissionDaoImpl;
import models.ApplyPermissions;
import models.PermissionCompositeKey;

@Controller
public class PermissionsController {

	ApplyPermissionDaoImpl apd;
	ApplyPermissions ap;
	PermissionCompositeKey compositeKey;

	@Autowired
	public PermissionsController(ApplyPermissionDaoImpl apdi, ApplyPermissions app, PermissionCompositeKey cKey) {
		apd = apdi;
		ap = app;
		compositeKey = cKey;
	}

	@RequestMapping(value = "/getpermissions")
	public String getEmpPermissions() {
		return "emppermission";
	}

	@RequestMapping(value = "/applyPermission")
	public String applyPermission(@RequestParam("id") int id, @RequestParam("current-date") String currentdate,
			@RequestParam("start-time") String sttime, @RequestParam("end-time") String endtime,
			@RequestParam("reason") String reason) {

		Date currentdate1 = Date.valueOf(currentdate);

		compositeKey.setEmpl_id(id);
		compositeKey.setEp_index(0);
		ap.setEprq_date(currentdate1);
		ap.setEprq_sttime(sttime);
		ap.setEprq_endtime(endtime);
		ap.setReason(reason);

		apd.persist(ap);

		return "permissionfinal";
	}
}

// getMonthlyPermissions()
// applyPermission()
// viewPermission()
// updatePermissionStatus()
// getApprovedPermissions()
// showApprovals()