public class CalculadoraDeSalario {

    public static float[] salarioBruto() {
        float[] salarios = new float[5];

        salarios[0] = 2500;
        salarios[1] = 4000;
        salarios[2] = 1000;
        salarios[3] = 30000;
        salarios[4] = 10000;

        return salarios;

    }

    public static void calcularDescontos() {

        float salario[] = salarioBruto();
        float valorDescontadoINSS[] = new float[salario.length];
        float valorDescontadoIR[] = new float[salario.length];


        for (int i = 0; i < salario.length; i++) {

            if (salario[i] < 1212.00) {
                valorDescontadoINSS[i] = (salario[i] * 0.075f);
                if (salario[i] < 1903.98) {
                    valorDescontadoIR[i] = 0;
                }

                System.out.println("----------------------------------------");
                System.out.printf("SALÁRIO %d\n", i + 1);
                System.out.printf("Salário Bruto: %.2f\n", salario[i]);
                System.out.printf("Valor pago ao INSS: %.2f\n", valorDescontadoINSS[i]);
                System.out.printf("Valor pago ao IR: %.2f\n", valorDescontadoIR[i]);
                System.out.printf("Salário líquido: %.2f\n", salario[i] - valorDescontadoINSS[i] - valorDescontadoIR[i]);
            } else if (salario[i] > 1212.01 && salario[i] < 2427.35) {
                valorDescontadoINSS[i] = (salario[i] * 0.09f);
                if (salario[i] > 1903.99 && salario[i] <= 2826.65) {
                    valorDescontadoIR[i] = salario[i] * 0.075f;
                }
                System.out.println("----------------------------------------");
                System.out.printf("SALÁRIO %d\n", i + 1);
                System.out.printf("Salário Bruto: %.2f\n", salario[i]);
                System.out.printf("Valor pago ao INSS: %.2f\n", valorDescontadoINSS[i]);
                System.out.printf("Valor pago ao IR: %.2f\n", valorDescontadoIR[i]);
                System.out.printf("Salário líquido: %.2f\n", salario[i] - valorDescontadoINSS[i] - valorDescontadoIR[i]);
            } else if (salario[i] > 2427.36 && salario[i] < 3641.03) {
                valorDescontadoINSS[i] = (salario[i] * 0.12f);
                if (salario[i] > 2826.66 && salario[i] <= 3751.05) {
                    valorDescontadoIR[i] = salario[i] * 0.15f;
                }
                System.out.println("----------------------------------------");
                System.out.printf("SALÁRIO %d\n", i + 1);
                System.out.printf("Salário Bruto: %.2f\n", salario[i]);
                System.out.printf("Valor pago ao INSS: %.2f2\n", valorDescontadoINSS[i]);
                System.out.printf("Valor pago ao IR: %.2f\n", valorDescontadoIR[i]);
                System.out.printf("Salário líquido: %.2f\n", salario[i] - valorDescontadoINSS[i] - valorDescontadoIR[i]);
            } else if (salario[i] > 3641.04) {
                valorDescontadoINSS[i] = (salario[i] * 0.14f);
                if (salario[i] > 3751.06 && salario[i] <= 4664.68) {
                    valorDescontadoIR[i] = salario[i] * 0.225f;
                } else if (salario[i] > 4664.68) {
                    valorDescontadoIR[i] = salario[i] * 0.275f;
                }
                System.out.println("----------------------------------------");
                System.out.printf("SALÁRIO %d\n", i + 1);
                System.out.printf("Salário Bruto: %.2f\n", salario[i]);
                System.out.printf("Valor pago ao INSS: %.2f\n", valorDescontadoINSS[i]);
                System.out.printf("Valor pago ao IR: %.2f\n", valorDescontadoIR[i]);
                System.out.printf("Salário líquido: %.2f\n", salario[i] - valorDescontadoINSS[i] - valorDescontadoIR[i]);
            }
        }


    }
}
