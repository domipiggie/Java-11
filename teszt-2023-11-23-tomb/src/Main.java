public class Main implements iAutomoso{
    public static void main(String[] args) {
        Automoso a = new Automoso("L Autómosó");

        Mososor m1 = new Mososor();
        Mososor m2 = new Mososor();
        Mososor m3 = new Mososor();

        Jarmu j1 = new Jarmu(SZEMELYAUTO, "AAA-001", KULSO_MOSAS);
        Jarmu j2 = new Jarmu(TEHERAUTO, "BBB-001", BELSO_MOSAS);
        Jarmu j3 = new Jarmu(BUSZ, "CCC-001", KULSO_BELSO);
        Jarmu j4 = new Jarmu(SZEMELYAUTO, "DDD-001", KULSO_MOSAS);


        m1.add(j1);
        m2.add(j2);
        m3.add(j3);
        m1.add(j4);

        m3.remove(j3);
        m3.add(j3);

        a.add(m1);
        a.add(m2);
        a.add(m3);

        System.out.println(a);
        System.out.println(a.getBevetel());
    }
}