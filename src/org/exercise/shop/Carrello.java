package org.exercise.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAcquisti = 1;
        int scelta = 6;
             System.out.println("Quanti oggetti vuoi comprare?");
             numeroAcquisti = Integer.parseInt(scanner.nextLine());
             Prodotto carrello[] = new Prodotto[numeroAcquisti];


            for (int i = 0; i < carrello.length && scelta !=0; i++) {
                System.out.println();
                System.out.println("Inserisci il tipo del tuo prodotto: 1 per Prodotto Generico 2 per Smartphone 3 per Televisore 4 per Cuffie");
                scelta = Integer.parseInt(scanner.nextLine());

                if (scelta == 1) {
                    System.out.println("Aggiungi un nome");
                    String nome = scanner.nextLine();
                    System.out.println("Aggiungi una dscrizione");
                    String description = scanner.nextLine();
                    System.out.println("Indica il prezzo:");
                    BigDecimal price = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica l'iva");
                    BigDecimal iva = new BigDecimal(scanner.nextLine());
                    carrello[i] = new Prodotto(nome,description,price,iva);
                    System.out.println(carrello[i]);



                }

                if (scelta == 2) {
                    System.out.println("Aggiungi un nome");
                    String nome = scanner.nextLine();
                    System.out.println("Aggiungi una dscrizione");
                    String description = scanner.nextLine();
                    System.out.println("Indica il prezzo:");
                    BigDecimal price = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica l'iva");
                    BigDecimal iva = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica la capacità in GB dello smartPhone");
                    int memory = Integer.parseInt(scanner.nextLine());
                    carrello[i] = new Smartphone(nome,description,price,iva,memory);

                    System.out.println(carrello[i]);

                }

                if (scelta == 3) {
                    System.out.println("Aggiungi un nome");
                    String nome = scanner.nextLine();
                    System.out.println("Aggiungi una dscrizione");
                    String description = scanner.nextLine();
                    System.out.println("Indica il prezzo:");
                    BigDecimal price = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica l'iva");
                    BigDecimal iva = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica la Dimensione in pollici della TV");
                    int pollici = Integer.parseInt(scanner.nextLine());
                    System.out.println("E' Una smart Tv? se si prema 1 se no 2");
                    int answerSmart= Integer.parseInt(scanner.nextLine());
                    boolean isSmart = false;
                    if (answerSmart == 1) {

                        isSmart = true;

                    }

                    carrello[i] = new Televisore(nome,description,price,iva,pollici,isSmart);

                    System.out.println(carrello[i]);
                }

                if (scelta == 4) {
                    System.out.println("Aggiungi un nome");
                    String nome = scanner.nextLine();
                    System.out.println("Aggiungi una dscrizione");
                    String description = scanner.nextLine();
                    System.out.println("Indica il prezzo:");
                    BigDecimal price = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica l'iva");
                    BigDecimal iva = new BigDecimal(scanner.nextLine());
                    System.out.println("Indica Il colore");
                    String color = scanner.nextLine();
                    System.out.println("Se sono wireless prema 1 se sono cablate prema 2");
                    int answerWireless= Integer.parseInt(scanner.nextLine());
                    boolean isWireless = false;
                    if (answerWireless == 1) {

                        isWireless = true;

                    }

                    carrello[i] = new Cuffie(nome,description,price,iva,color,isWireless);

                    System.out.println(carrello[i]);
                }

            }


        for (int i = 0; i < carrello.length; i++)
            System.out.print(carrello[i] + "-");








        scanner.close();
        }



    }

