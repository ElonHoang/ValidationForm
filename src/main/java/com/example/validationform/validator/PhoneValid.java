package com.example.validationform.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValid implements ConstraintValidator<PhoneAnno,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        try{
            if(!matcher.matches()){
                System.out.println("Not match !");
                return false;
            }else{
                char number = value.charAt(0);
                String convertChar = Character.toString(number);
                int convert = Integer.parseInt(convertChar);
                if(convert != 0){
                    System.out.println("Not match .Values must be begin  0 !");
                    return false;
                }
            }

            System.out.println("Oke goood");
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public void initialize(PhoneAnno constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
