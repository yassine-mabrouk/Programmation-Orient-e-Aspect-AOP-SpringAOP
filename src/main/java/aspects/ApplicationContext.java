package aspects;
public class ApplicationContext {
    private static   String username="";
    private static String password ="";
    private static String[] roles={};
    public static void login(String username, String password, String[] roles){
        if (username.equals("root") && password.equals("1234")){
             username = username;
            password = password;
            roles = roles;
        }else {
            throw new RuntimeException("Bad credentiales !!!");
        }
    }
    public static Boolean hasRole(String role){
        for(int i=0;i<roles.length;i++){
            if (roles[i].equals(role)){
                return true;
            }
        }
        return  false ;
    }
}
