package reciter.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import reciter.model.identity.Identity;
import reciter.service.ldap.LdapIdentityService;

@Controller
public class LdapIdentityController {

	private static final Logger slf4jLogger = LoggerFactory.getLogger(LdapIdentityController.class);

	@Autowired
	private LdapIdentityService ldapIdentityService;
	
	@RequestMapping(value = "/reciter/ldap/get/identity/by/cwid", method = RequestMethod.GET)
	@ResponseBody
	public Identity getIdentity(@RequestParam String cwid) {
		return ldapIdentityService.getIdentity(cwid);
	}
}
