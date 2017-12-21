package org.kalinga.SpringMVC.Service;

import java.util.List;

import org.kalinga.SpringMVC.hibernate.AllClass;
import org.kalinga.SpringMVC.hibernate.DAOClass;
import org.kalinga.SpringMVC.hibernate.Lead;
import org.kalinga.SpringMVC.hibernate.Minds;
import org.kalinga.SpringMVC.hibernate.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class DAOServiceImpl implements DAOService{
	@Autowired
	private DAOClass daoClass;
	
		
	@Override
	@Transactional
	public List<Minds> RetrieveDetails() {
		// TODO Auto-generated method stub
		return this.daoClass.RetrieveDetails();
	}


	@Override
	public void InsertMinds(AllClass a) {
		
		
		daoClass.InsertMinds(a.getTrackname(), a.getLeadname(), a.getMindname(), a.getTrackid(), a.getTrackid(), a.getMindid());
	
		
	}



	@Override
	public List<Lead> getAllLeads() {
		return this.daoClass.getAllLead();
	}


	public List<Minds> getAllMinds() {
		return this.daoClass.getAllMinds();
		
	}


	@Override
	public List<Track> getAllTracks() {
		// TODO Auto-generated method stub
		return this.daoClass.getAllTracks();
	}


	public Lead getLeadById(AllClass a) {
		// TODO Auto-generated method stub
		Lead l;
		
		l=daoClass.getLeadById(a.getLeadid());
		System.out.println(l.getLid()+"   "+l.getLname());
		return l;
		
	}


	
	public void UpdateDetails(AllClass a) {
		daoClass.UpdateDetails(a.getMindid(),a.getMindname());
		
	}


	@Override
	public void DeleteDetails(AllClass a) {
		daoClass.DeleteDetails(a.getMindid());
		
	}






}
