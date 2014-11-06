package com.bookstore.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Index Controller
 *
 * @category   Bookstore
 * @package    com.bookstore.controller
 * @author     Loi Nguyen <loinguyentrung@gmail.com>
 * @copyright  Hello World Team
 * @license    MIT
 * @version    1.0
 * @link       https://github.com/teamhelloworld/bookstore
 * @since      Class available since Release 1.0
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("title", "Test");        
        System.out.println("abc");
        System.exit(0);
        return "index";
    }  
    
}
