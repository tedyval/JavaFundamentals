package Telephony;

import java.util.List;


public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;
   
    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }



    @Override
    public String browse() {
        StringBuilder str = new StringBuilder();
        for (String url : this.urls) {
            boolean isValid = validateURl(url);
            if(isValid){
                str.append(String.format("Browsing: %s!",url)).append(System.lineSeparator());
            }else{
                str.append("Invalid URL!").append(System.lineSeparator());
            }
        }
       return str.toString().trim();

    }

    private boolean validateURl(String url) {
        for (char c : url.toCharArray()) {
            if(Character.isDigit(c)){
                return false;
            }
        }
        return  true;

    }

    @Override
    public String call() {
        StringBuilder str = new StringBuilder();
        for (String number : this.numbers) {
            boolean isValid = validateNumber(number);
            if(isValid){
                str.append(String.format("Calling... %s",number)).append(System.lineSeparator());
            }else{
                str.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return str.toString().trim();
       
    }

    private boolean validateNumber(String number) {
        for (char c : number.toCharArray()) {
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return  true;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }
}
