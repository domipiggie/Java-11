public interface iAutomoso {
    final String[] SZOLGALTATASOK = {"", "külső mosás", "belső mosás", "külső és belső mosás"};

    final int KULSO_MOSAS = 1;
    final int BELSO_MOSAS = 2;
    final int KULSO_BELSO = 3;

    final int KULSO_MOSAS_AR = 2500;
    final int BELSO_MOSAS_AR = 2000;
    final int KULSO_BELSO_AR = 4000;

    final int[] ARAK = {0, KULSO_MOSAS_AR, BELSO_MOSAS_AR, KULSO_BELSO_AR};

    final double FELAR = 1.5;
    final double KEDVEZMENY = 0.7;

    final String SZEMELYAUTO = "személyautó";
    final String TEHERAUTO = "teherautó";
    final String BUSZ = "busz";
}