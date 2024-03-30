package com.example;

import java.util.Arrays; // Java util kütüphanesinden Arrays sınıfını içeri aktarır.
import java.util.Random; // Java util kütüphanesinden Random sınıfını içeri aktarır.

public class RandomDiziler { // RandomDiziler adında bir Java sınıfı tanımlar.
    public static void main(String[] args) { // Programın başlangıç noktası olan main metodu.
        // Dizilerin boyutunu belirleme:
        Random rand = new Random(); // Rastgele sayı üretmek için Random sınıfından bir nesne oluşturur.
        int size1 = rand.nextInt(11); // 0-10 arası rastgele bir boyut oluşturulur ve size1 değişkenine atanır.
        int size2 = rand.nextInt(11); // 0-10 arası rastgele bir boyut oluşturulur ve size2 değişkenine atanır.

        // İki boyutlu dizileri oluşturma:
        int[][] array1 = new int[size1][size1]; // Boyutları size1 olan bir iki boyutlu dizi oluşturur.
        int[][] array2 = new int[size2][size2]; // Boyutları size2 olan bir iki boyutlu dizi ooluşturur.

        // Dizileri doldurma ve sıralama:
        fillAndSort(array1); // array1 dizisini doldurmak ve sıralamak için fillAndSort metoduna gönderir.
        fillAndSort(array2); // array2 dizisini doldurmak ve sıralamak için fillAndSort metoduna gönderir.

        // Dizileri ekrana yazdırma:
        System.out.println("Dizi 1:"); // Kullanıcıya array1 dizisinin ekrana yazdırılacağı belirtir.
        printArray(array1); // array1 dizisini ekrana yazdırmak için printArray metodu oluşur.
        System.out.println("\nDizi 2:"); // Kullanıcıya array2 dizisinin ekrana yazdırılacağı belirtir.
        printArray(array2); // array2 dizisini ekrana yazdırmak için printArray metodu oluşur.

        // Dizileri çarpma ve toplama:
        int product = multiplyArrays(array1, array2); // array1 ve array2 dizilerini çarpmak için multiplyArrays metoduna gönderir.
        int sum = sumArrays(array1, array2); // array1 ve array2 dizilerini toplamak için sumArrays metoduna gönderir.

        // Sonuçları ekrana yazdırma:
        System.out.println("\nDizilerin Çarpımı: " + product); // Çarpım sonucunu ekrana yazdırma.
        System.out.println("Dizilerin Toplamı: " + sum); // Toplam sonucunu ekrana yazdırma.
    }

    // Diziyi doldurma ve sıralama fonksiyonu:
    public static void fillAndSort(int[][] array) { // Diziyi doldurup sıralayan fillAndSort metodu.
        Random rand = new Random(); // Rastgele sayı üretmek için Random sınıfından bir nesne oluşturur.
        for (int i = 0; i < array.length; i++) { // Döngü, dizinin her satırı için tekrarlanır.
            for (int j = 0; j < array[i].length; j++) { // Döngü, her satırdaki her sütun için tekrarlanır.
                array[i][j] = rand.nextInt(101); // 0-100 arası rastgele bir sayı ile dizi elemanı doldurur.
            }
            Arrays.sort(array[i]); // Dizinin her satırı sıralanır.
        }
    }

    // Diziyi ekrana yazdırma fonksiyonu:
    public static void printArray(int[][] array) { // Diziyi ekrana yazdıran printArray metodu.
        for (int[] row : array) { // Dizinin her bir satırı için döngü oluşturur.
            System.out.println(Arrays.toString(row)); // Her satırı ekrana yazdırır.
        }
    }

    // İki dizinin elemanlarını çarpma fonksiyonu:
    public static int multiplyArrays(int[][] array1, int[][] array2) { // İki diziyi çarpan multiplyArrays metodu.
        int result = 0; // Çarpım sonucunu tutan dizi.
        for (int[] row1 : array1) { // İlk dizi için satırlar üzerinde döngü oluşturur.
            for (int[] row2 : array2) { // İkinci dizi için satırlar üzerinde döngü oluşturur.
                for (int i = 0; i < row1.length; i++) { // Her iki dizinin sütunları için döngü oluşturur.
                    result += row1[i] * row2[i]; // Karşılıklı elemanları çarparak sonuca ekler.
                }
            }
        }
        return result; // Çarpım sonucunu döndürür.
    }

    // İki dizinin elemanlarını toplama fonksiyonu:
    public static int sumArrays(int[][] array1, int[][] array2) { // İki diziyi toplayan sumArrays metodu.
        int result = 0; // Toplam sonucunu tutan dizi.
        for (int[] row1 : array1) { // İlk dizi için satırlar üzerinde döngü oluşturur.
            for (int[] row2 : array2) { // İkinci dizi için satırlar üzerinde döngü oluşturur.
                for (int i = 0; i < row1.length; i++) { // Her iki dizinin sütunları için döngü oluşturur.
                    result += row1[i] + row2[i]; // Karşılıklı elemanları toplayarak sonuca ekler.
                }
            }
        }
        return result; // Toplam sonucunu döndürür.
    }
}

