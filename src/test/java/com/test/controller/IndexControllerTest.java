package com.test.controller;

import com.bookstore.controller.IndexController;
import com.test.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Index Controller Test
 *
 * @category   Bookstore
 * @package    com.bookstore.controller
 * @author     Loi Nguyen <loinguyentrung@gmail.com>
 * @copyright  Hello World Team
 * @license    MIT
 * @version    1.0
 * @link       https://github.com/teamhelloworld/bookstore
 * @since      Class available since Release 1.0
 */public class IndexControllerTest extends TestCase {
    
    public IndexControllerTest() {
    }

    @Test
    public void hello() {
        IndexController controller = new IndexController();
        assertEquals(7,7);
        
    }
}
