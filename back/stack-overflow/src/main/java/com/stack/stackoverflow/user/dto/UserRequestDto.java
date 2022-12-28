package com.stack.stackoverflow.user.dto;

import com.stack.stackoverflow.validator.NotSpace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserRequestDto {

    @Getter
    @AllArgsConstructor
    public static class Post{
        @NotBlank(message = "이름은 공백이 아니어야 합니다.")
        private String name;

        @NotBlank
        @Email
        private String email;

        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=?<>:])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$",
                message = "특수문자는 1개 이상 들어가야 합니다, 비밀번호 '최소 8자에서 최대 16자'까지 허용")
        private String password;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    public static class Patch{
        private Long userId;

        @NotSpace(message = "이름은 공백이 아니어야 합니다.")
        private String name;

        @NotSpace(message = "비밀번호는 공백이 없어야 합니다.")
        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=?<>:])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$",
                message = "특수문자는 1개 이상 들어가야 합니다, 비밀번호 '최소 8자에서 최대 16자'까지 허용")
        private String password;

        public void setUserId(long userId){
            this.userId = userId;
        }
    }
}
