package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Entity_example;
import repository.Repo;

@Controller

public class controlller {
	

	
	public class EntityMain {
		
		
			
			@Autowired  //it is used to connect repo
			
			Repo repo1;
			
			@RequestMapping("find")
			public ModelAndView mv() {
				
				ModelAndView mv1=new ModelAndView();
				mv1.setViewName("root");
				return mv1;
			}
			@RequestMapping("findbyname")
				public ModelAndView foundpage(Entity_example em) {
				
				ModelAndView mv2=new ModelAndView();
				mv2.setViewName("root1");
				String var=em.getName();
				int name=Integer.parseInt(var);
				
				Entity_example em1=repo1.findid(var).get(name);
				
				if(em1!=null) {
					mv2.addObject("id",em1.getId());
					mv2.addObject("name",em1.getName());
					mv2.addObject("email",em1.getEmail());
					mv2.addObject("password",em1.getPassword());
				}
				else {
					mv2.addObject("Enter valid name");
				}
				return mv2;
				
			}
			
				
				
			}
			 
			
			
		}



	


