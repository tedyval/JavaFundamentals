package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Class<Reflection> reflectionClass = Reflection.class;
       Method[] declaredMethods = reflectionClass.getDeclaredMethods();
        Field[] declaredFields = reflectionClass.getDeclaredFields();
        Arrays.stream(declaredFields).filter(f->!Modifier.isPrivate(f.getModifiers())).
                sorted(Comparator.comparing(Field::getName)).
                forEach(f->System.out.printf("%s must be private!%n",f.getName()));



        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method dec : declaredMethods) {
            if (dec.getName().startsWith("get")) {
                getters.add(dec);
            } else if (dec.getName().startsWith("set")){
                setters.add(dec);
            }
        }

        getters.stream().filter(m->!Modifier.isPublic(m.getModifiers())).sorted(Comparator.comparing(Method::getName)).
                forEach(m-> System.out.printf("%s have to be public!%n",m.getName()));

        setters.stream().filter(s-> !Modifier.isPrivate(s.getModifiers())).sorted(Comparator.comparing(Method::getName)).
                forEach(m-> System.out.printf("%s have to be private!%n",m.getName()));



    }
}
