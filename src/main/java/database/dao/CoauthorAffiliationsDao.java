package database.dao;

import java.util.List;

import database.model.CoauthorAffiliations;

/**
 * DAO class for table rc_identity_education.
 * @author jil3004
 *
 */
public interface CoauthorAffiliationsDao {
	/**
	 * 
	 * @param affiliation
	 * @return
	 */
	public CoauthorAffiliations getCoathorAffiliationsByAffiliationLabel(String affiliation);
	
	/**
	 * 
	 * @param affiliations
	 * @return
	 */
	public List<CoauthorAffiliations> getCoathorAffiliationsByAffiliationLabel(List<String> affiliations);
}