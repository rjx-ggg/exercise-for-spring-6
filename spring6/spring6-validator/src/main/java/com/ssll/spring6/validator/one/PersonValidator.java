package com.ssll.spring6.validator.one;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * ClassName: PersonValidator
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/28 22:37
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // 名称不能为空
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty", "姓名不能为空");

        // 年龄不能小于0和大于300
        Person person = (Person) target;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "age.down.range", "年龄不能小于0");
        }
        if (person.getAge() > 300) {
            errors.rejectValue("age", "age.up.range", "年龄不能大于300");
        }

    }



}
