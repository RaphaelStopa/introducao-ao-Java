public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];//vetor, criei 2 pessoas
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedero", 22,"M");// defini p0
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO para Inciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avancado", "Maria Candido", 800, p[0]);


        l[0].abrir();
        l[0].folhear(400);


        System.out.println(l[0].detalhes());
    }
}
