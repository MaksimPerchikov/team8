/*

package ru.hrhappiness.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.hrhappiness.auth.ApplicationUser;
import ru.hrhappiness.auth.ApplicationUserRepository;
import ru.hrhappiness.auth.DBDao;


import java.util.Optional;


@RestController
@RequestMapping("/hrhappiness/log")
@RequiredArgsConstructor
public class AuthorizeAndAddUserRestController  {


    private final DBDao dbDao;

    @PostMapping
    public Optional<ApplicationUser> entry(@RequestBody String username,
                      @RequestBody String password) throws Exception {

      return dbDao.selectUserFromDbByUserName(username);


    }

}
*/

