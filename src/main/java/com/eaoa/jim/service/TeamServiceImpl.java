package com.eaoa.jim.service;

import com.eaoa.jim.model.TeamModel;
import com.eaoa.jim.query.TeamQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    //@Autowired
    //private TeamMapper teamMapper;

    public List<TeamModel> getTeams(TeamQuery query) {
        List<TeamModel> l = new ArrayList<>();
        //List<TeamModel> l = teamMapper.listByGroupId(query.getGid());
        return l;
    }

}
