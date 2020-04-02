package utils;
public class MyUtils {
    
    public static String toCamelCase(String s){
           String[] parts = s.split(" ");
           String camelCaseString = "";
           for (String part : parts){
              camelCaseString = camelCaseString + toProperCase(part);
           }
           return camelCaseString;
        }
        public static String toProperCase(String s) {
            return s.substring(0, 1).toUpperCase() +
                       s.substring(1).toLowerCase();
        }
}