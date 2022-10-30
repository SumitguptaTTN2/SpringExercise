package com.ttn.employee.InheritanceMappingTest;


import com.ttn.employee.InheitanceMapping.entities.Checks;
import com.ttn.employee.InheitanceMapping.repos.AccountRepository;
import com.ttn.employee.InheitanceMapping.entities.Card;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MappingTest {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testPayment() {

    }

    @Test
    public void cardTestSingleTable() {
        Card cc = new Card();
        cc.setCardnumber("5465");
        cc.setAmount(10000);
       accountRepository.save(cc);
    }

    @Test
    public void checkTestSingleTable() {
      Checks ch=new Checks();
      ch.setAmount(1000);
      ch.setChecknumber("1234567");
      accountRepository.save(ch);
    }


}
