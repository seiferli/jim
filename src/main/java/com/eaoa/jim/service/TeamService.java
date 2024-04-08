package com.eaoa.jim.service;

import com.eaoa.jim.model.TeamModel;
import com.eaoa.jim.query.TeamQuery;

import java.util.List;

public interface TeamService {

    List<TeamModel> getTeams(TeamQuery query);

}
