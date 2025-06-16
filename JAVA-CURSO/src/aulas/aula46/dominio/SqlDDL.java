package aulas.aula46.dominio;

public interface SqlDDL {

    void create(String query);
    void alter(String query);
    void drop(String query);
}
