package com.Interview.WebTestapplication.candidate.Controller;

import com.Interview.WebTestapplication.candidate.Entity.POC;
import com.Interview.WebTestapplication.candidate.Entity.User;
import com.Interview.WebTestapplication.candidate.Repository.POCRepository;
import com.Interview.WebTestapplication.candidate.Repository.UserRepository;
import com.Interview.WebTestapplication.candidate.Services.LoginService;
import com.Interview.WebTestapplication.candidate.Services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.net.SocketException;
import java.util.Arrays;
import java.util.List;


@RestController
@SessionAttributes("name")
@RequestMapping("/candidateTesting")
public class LoginController {

    @Autowired
    LoginService loginservice;

    @Autowired
    UserRepository repository;

    @Autowired
    POCRepository pocrepo;
//
//    @RequestMapping(value="/login", method = RequestMethod.GET)
//    public String showLoginPage(ModelMap model){
//        return "login";
//    }
//
//    @RequestMapping(value="/welcome", method = RequestMethod.GET)
//    public String showWelcomePage(ModelMap model)
//    {
//        return "welcome";
//    }

  @ApiOperation(value = "Find by user name",response = String.class)
  @RequestMapping(value = "/findbyusername", method= RequestMethod.GET,produces = {"text/plain", "application/*"})
    public String findByUsername(@RequestParam("username") String username){
        String result = "";

        for(User users: repository.findByUserName(username)){
            result += users.toString() + "<br>";
        }
        return result;
    }



  @ApiOperation(value = "Save user related details",response = String.class)
  @RequestMapping(value = "/save", method= RequestMethod.POST,produces = {"text/plain", "application/*"})
    public String process(){
        // save a single Customer
        repository.save(new User("Jack", "Smith"));

        // save a list of Customers
        repository.saveAll(Arrays.asList(new User("Adam", "Johnson"), new User("Kim", "Smith"),
                new User("David", "Williams"), new User("Peter", "Davis")));

        return "Done";
    }

  @ApiOperation(value = "Save user's point of contact",response = String.class)
  @RequestMapping(value = "/savepoc", method= RequestMethod.POST,produces = {"text/plain", "application/*"})
    public String processPOC(){
        // save a single Customer
        //pocrepo.save(new POC("Arpitha","QA", "Digital","Deepti"));


        //save a list of Users
        pocrepo.saveAll(Arrays.asList(new POC("Riya", "QA","Digital","Deepti",1L),
                new POC("Foram","Developer","Digital","Nataraj",2L),
                new POC("Chakri","Developer","Digital","Nataraj",3L),
                new POC("Nataraj","Developer","Digital","Nayan",4L),
                new POC("Abhinav", "QA","Search","Manoj",5L),
                new POC("Vandana","QA","Search","Abhinav",6L),
                new POC("Anand","Developer","Search","Manu",7L),
                new POC("Pramod","Developer","Search","Manu",8L)));


        return "Done";
    }

  @ApiOperation(value = "Find by user's full name",response = String.class)
  @RequestMapping(value = "/findbyFullname", method= RequestMethod.GET,produces = {"text/plain", "application/*"})
    public String findByFullName(@RequestParam("fullname") String fullname){
        String result = "";
        for(POC poc: pocrepo.findByFullName(fullname)){
            result += poc.toString() + "<br>";
        }
        return result ;
    }


  @ApiOperation(value = "Find all user names",response = String.class)
  @RequestMapping(value = "/findAll", method= RequestMethod.GET,produces = {"text/plain", "application/*"})
    public String findAll() throws InterruptedException {
//        Thread.sleep(5000);
       String result = "";
        for (POC poc : pocrepo.findAll()) {
               result += poc.toString() ;
        }
    return result;
  }

  @ApiOperation(value = "Find by Services",response = String.class)
  @RequestMapping(value = "/findbyService", method= RequestMethod.GET,produces = {"text/plain", "application/*"})
    public void findByService(@RequestParam("service") String service) throws SocketException, InterruptedException {
        Thread.sleep(10000);
        throw new SocketException();
    }

  @ApiOperation(value = "Find by Id",response = String.class)
  @RequestMapping(value = "/findById", method= RequestMethod.GET,produces = {"text/plain", "application/*"})
    public String findById(@RequestParam("id") String id) {
         String result = "";
        return result;
    }


//    @RequestMapping(value="/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
//
//        boolean isValidUser = loginservice.validateUser(name, password);
//
//        if (!isValidUser) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//
//        model.put("name", name);
//        model.put("password", password);
//
//        return "welcome";
//    }

}
