package Singleton;

public class Main {
    public static void main(String[] args) {
        //obtengo la instancia unica de appconfig
        AppConfig config = AppConfig.getInstance();
        //aqui solo establesco sus valores
        config.setPaginaName("Blende.com");
        config.setAnioDecreacion(2010);
        config.setServerUrl("http://miapi.com");
        config.setPort(8080);

        //utilizamo la propiedades

        System.out.println("nombre de la pagina: "+config.getPaginaName());
        System.out.println("año de creacion: "+config.getAnioDecreacion());
        System.out.println("URL de la pagina: " + config.getServerUrl());
        System.out.println("Numero del Puerto: " + config.getPort());
    }
}