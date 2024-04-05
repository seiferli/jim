package com.eaoa.jim.model;

//import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
//@TableName("tb_imc_group")
public class TeamModel {
    private Integer groupId;

    private String groupAccount;

    private String appKey;

    private String name;

    private Integer status;

    private String namePy;
}
