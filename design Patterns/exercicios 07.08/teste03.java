class Config {

    public static String urlBanco = "jdbc:mysql://localhost:3306/loja";
    public static String usuarioBanco = "admin";
    public static String ambiente = "producao";
    public static int tentativasLogin = 3;
}

class LoginService {

    public void autenticar() {
        Config.tentativasLogin = 5;
    }
}