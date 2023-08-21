public class OrganizaArrays {
    public static void main(String[] args) {
        int[] numeros = { 2, 5, 8, 3 };
        int nova = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Esta é a " + (i + 1) + "ª posição: " + numeros[i] + ".");
        }

        System.out.println("=======================================================");

        System.out.println("Estas são as posições desordenadas. Vamos ordená-la em ordem crescente pra você.");

        System.out.println("=======================================================");

        for (int externo = 0; externo < numeros.length; externo++) {

            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    nova = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = nova;

                }

            }
        }
        for (int imprime = 0; imprime < numeros.length; imprime++) {

            System.out.println("Esta é a " + (imprime + 1) + "ª posição: " + numeros[imprime] + ".");
        }

    }
}
