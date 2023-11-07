package com.ydlclass.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydlclass.entity.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data

public class UserVo {
   @NotNull(message = "姓名不能为空")
   private String username;
   private String password;
   @Min(value = 0, message = "年龄不能小于{value}")
   @Max(value = 120,message = "年龄不能大于{value}")
   private int age;
   @DateTimeFormat(pattern = "yyyy-MM-dd")
   @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT-8")
   @Past(message = "必须是以前的日期")
   private Date birthday;
   @Pattern(regexp = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$", message = "手机号码不正确")
   private String phone;
   @Email
   private String email;
}
