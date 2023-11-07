package com.ydlclass.entity.vo;

import com.ydlclass.entity.User;
import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class QueryVo {
    private String sortField;
    private User user;
    private Long[] ids;
    private List<User> userList;
    private Map<String, User> userMap;
}
