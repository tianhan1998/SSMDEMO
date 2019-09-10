package controller;

import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import service.PersonService;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;
    @RequestMapping(value = "/addPerson",method = RequestMethod.POST)
    public String addPerson(Person a,Model m){
        personService.addPerson(a);
        m.addAttribute("List",personService.selectList());
        return "showList";
    }
    @RequestMapping(value = "/deletePerson/{id}",method = RequestMethod.GET)
    public String deletePerson(@PathVariable("id") int id,Model m){
        personService.deletePerson(id);
        m.addAttribute("List",personService.selectList());
        return "showList";
    }
    @RequestMapping(value ="/updatePerson",method = RequestMethod.POST)
    public String updatePerson(Person a,Model m){
        personService.updatePerson(a);
        m.addAttribute("List",personService.selectList());
        return "showList";
    }
    @RequestMapping(value="/findById/{id}",method =RequestMethod.GET)
    public String findById(@PathVariable("id")int id, Model m){
        m.addAttribute("Person",personService.findById(id));
        return "findOne";
    }
    @RequestMapping(value="/updateWho/{id}",method = RequestMethod.GET)
    public String updateWho(@PathVariable("id") int id,Model m){
        m.addAttribute("Person",personService.findById(id));
        return "updateOne";
    }
    @RequestMapping(value="/selectList")
    public String selectList(Model m){
        m.addAttribute("List",personService.selectList());
        return "showList";
    }
//    @InitBinder
//    public void initBinder(WebDataBinder binder, WebRequest request) {
//        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
//        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
//    }
}
