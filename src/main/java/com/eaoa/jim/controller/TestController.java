package com.eaoa.jim.controller;

import com.eaoa.jim.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("test")
@Controller
public class TestController {

    @Autowired
    private TeamService teamService;

    @GetMapping("hello")
    @ResponseBody
    public String hello(@RequestParam(value = "name", required = false) String name) {
//        String str = "";
//        ClassPathResource resource = new ClassPathResource("testJs.json");
//        try {
//            InputStream inputStream = resource.getInputStream();
//            str = FileUtil
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        JsonParser parse = new JsonParser();
        return "hello, " + name;
    }

//    @GetMapping("list")
//    public List<TeamList> list(@RequestBody TeamQuery query) {
//        List<TeamModel> ls = teamService.getTeams(query);
//        //List<TeamList> vo = new ArrayList<>();
//        return ls.stream().map(t -> {
//            TeamList vo = new TeamList();
//            vo.setTeamId(t.getGroupAccount());
//            vo.setTeamName(t.getName());
//            return vo;
//        }).collect(Collectors.toList());
//    }

}
