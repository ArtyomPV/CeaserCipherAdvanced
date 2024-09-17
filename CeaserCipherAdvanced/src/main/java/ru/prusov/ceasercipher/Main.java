package ru.prusov.ceasercipher;

public class Main {
    public static void main(String[] args) {
        String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String numeric = "012345+6789";
        String punctuation = "{}[].,;:?- ";

        String alphabet = eng+rus+eng.toLowerCase()+rus.toLowerCase() + numeric + punctuation;
    }
}