package org.kalinga.SpringMVC.Controller;

import java.util.List;



import org.kalinga.SpringMVC.Service.DAOService;
import org.kalinga.SpringMVC.hibernate.AllClass;
import org.kalinga.SpringMVC.hibernate.Lead;
import org.kalinga.SpringMVC.hibernate.Minds;
import org.kalinga.SpringMVC.hibernate.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
		@Autowired
		private DAOService daoService;
	
	
		 @RequestMapping(value = { "/minds" }, method = RequestMethod.GET)
		    public String listEmployees(ModelMap model) {
		 
		        List<Minds> minds = daoService.RetrieveDetails();
		        model.addAttribute("minds", minds);
		        return "new";
		    }
		 @RequestMapping(value = { "/leads" }, method = RequestMethod.GET)
		    public String listminds(ModelMap model1) {
		 
		        List<Lead> leads = daoService.getAllLeads();
		        model1.addAttribute("xyz", leads);
		        System.out.println("inside list minds--" +daoService.getAllLeads().get(0).getLid());
		        return "leads";
		    }
		 @RequestMapping(value = { "/track" }, method = RequestMethod.GET)
		    public String listtrack(ModelMap model1) {
		 
		        List<Track> track = daoService.getAllTracks();
		        model1.addAttribute("xyz", track);
		        System.out.println("inside list minds--" +daoService.getAllLeads().get(0).getLid());
		        return "track";
		    }
		 
		 @RequestMapping(value = { "/getminds" }, method = RequestMethod.GET)
		    public String listmind(ModelMap model1) {
		 
		        List<Minds> mind = daoService.getAllMinds();
		        model1.addAttribute("xyz", mind);
		        System.out.println("inside list minds--" +daoService.getAllLeads().get(0).getLid());
		        return "minds";
		    }
		 
		 @RequestMapping(value={"/save" })
		    public ModelAndView saveminds(@ModelAttribute("a") AllClass a) {
			 System.out.println("check" + a.getLeadid());
		      
		          daoService.InsertMinds(a);
		        
		        return new ModelAndView("Submitted");
		    }
		 
		 
		 @RequestMapping(value={"/add"})
		    public ModelAndView addminds(@ModelAttribute("a") AllClass a) {   
		        return new ModelAndView("addminds");
		    }
		 
		 @RequestMapping(value={"/leadone"})
		    public ModelAndView leadone(@ModelAttribute("a") AllClass a) {   
		        return new ModelAndView("leadbyid");
		    }
		 @RequestMapping(value={"/getleadbyid"})
		    public ModelAndView leadById(@ModelAttribute("a") AllClass a,ModelMap m) {   
			 Lead l=daoService.getLeadById(a);
			 System.out.println("inside list minds--" +a.getLeadid());
			  m.addAttribute("xyz", l);
		        return new ModelAndView("leadbyidshow");
		    }
		 @RequestMapping(value = { "/update" }, method = RequestMethod.GET)
		    public String updateminds(@ModelAttribute("a") AllClass a) {
		 
		       
		       
		        return "Update";
		    }
		 @RequestMapping(value ="/updateinit")
		    public ModelAndView  updatemind(@ModelAttribute("a") AllClass a) {
		 
		       daoService.UpdateDetails(a);
		       
		        return new ModelAndView("Submitted");
		    }

	 @RequestMapping(value = { "/Delete" }, method = RequestMethod.GET)
	    public String Delminds(@ModelAttribute("a") AllClass a) {
	 
	       
	       
	        return "Delete";
	    }
		 @RequestMapping(value ="/Deleteinit")
		    public ModelAndView  Deletemind(@ModelAttribute("a") AllClass a) {
		 
		       daoService.DeleteDetails(a);
		       
		        return new ModelAndView("Submitted");
		    }
}
