import java.util.Scanner;

public class ConsultaAgendada {
    private Hora hora = new Hora(0, 0, 0);
    private Data data = new Data(1, 1, 0);
    private String nomePaciente = "";
    private static int quantidade = 0;
    private String nomeMedico = "";

    Scanner ler = new Scanner(System.in);

    // METÓDOS CONSTRUTORES
    public ConsultaAgendada(){
        // CONSTRUIR DATA
        data.setAno();
        data.setMes();
        data.setDia();

        // CONSTRUIR HORA
        hora.setHor();
        hora.setMin();
        hora.setSeg();

        // NOMES DE PACIENTE E MÉDICO
        setNomePaciente();
        setNomeMedico();

        // ACRESCEDOR DE QUANTIDADE
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med){
        // CONTRUIR HORA
        hora.setHor(h);
        hora.setMin(mi);
        hora.setSeg(s);
        
        // CONTRUIR DATA
        data.setAno(a);
        data.setMes(m);
        data.setDia(d);

        // NOMES DE PACIENTE E MÉDICO
        setNomePaciente(p);
        setNomeMedico(med);

        // ACRESCEDOR DE QUANTIDADE
        quantidade++;
    }
    
    public ConsultaAgendada(Data d, Hora h, String p, String m){
        // ATRIBUIÇÃO DE DADOS
        data = d;
        hora = h;
        setNomePaciente(p);
        setNomeMedico(m);

        // ACRESCEDOR DE QUANTIDADE
        quantidade++;
    }

    // METÓDOS SETTERS - VAZIOS
    public void setData(){
        // RECICLAR METÓDOS DA CLASSE DATA
        data.setAno();
        data.setMes();
        data.setDia();
    }

    public void setHora(){
        // RECICLAR METÓDOS DA CLASSE HORA
        hora.setHor();
        hora.setMin();
        hora.setSeg();
    }

    public void setNomePaciente(){
        System.out.print("Por favor, insira o nome do paciente: ");
        String p = ler.nextLine();
        nomePaciente = p;
    }

    public void setNomeMedico(){
        System.out.print("Por favor, insira o nome do Médico: ");
        String m = ler.nextLine();
        nomeMedico = m;
    }

    // METÓDOS SETTERS - COM ARGUMENTOS
    public void setData(int a, int b, int c){
        data.setAno(a);
        data.setMes(b);
        data.setDia(c);
    }

    public void setHora(int a, int b, int c){
        hora.setHor(a);
        hora.setMin(b);
        hora.setSeg(c);
    }

    public void setNomePaciente(String p){
        nomePaciente = p;
    }

    public void setNomeMedico(String m){
        nomeMedico = m;
    }

    // METÓDOS GETTER
    public int getAmostra(){return quantidade;}
    public String getData(){return data.getMostra1();}
    public String getHora(){return hora.getHora1();}
    public String getNomePaciente(){return nomePaciente;}
    public String getNomeMedico(){return nomeMedico;}

    public static void main(String[] args) {
        // CRIANDO E EXIBINDO P1
        System.out.println("--- Primeira consulta --------");
        ConsultaAgendada p1 = new ConsultaAgendada(11, 30, 0, 7, 6, 2023, "Ronald Pereira", "Wellington Tuler");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Médico: " + p1.getNomeMedico());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println();

        // CRIANDO E EXIBINDO P2
        System.out.println("AGENDANDO CONSULTA");
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("--- Segunda consulta --------");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Médico: " + p2.getNomeMedico());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println();

        // ALTERANDO E REEXIBINDO P1
        p1.setData();
        p1.setHora();
        p1.setNomeMedico();
        p1.setNomePaciente();
        System.out.println("--- Primeira consulta --------");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Médico: " + p1.getNomeMedico());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println();

        // EXIBINDO QUANTIDADE FINAL DE CONSULTAS
        System.out.println("Quantidade de agendas: " + quantidade);
    }
}