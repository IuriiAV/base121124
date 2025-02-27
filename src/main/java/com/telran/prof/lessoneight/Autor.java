package com.telran.prof.lessoneight;

public class Autor {

    private String name;

    private String surname;

    public Autor(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //1 null
        if (obj == null) {
            return false;
        }
        //2
        if (this == obj) {
            return true;
        }
        //3
        if (!(obj instanceof Autor)) {
            return false;
        }

        Autor autor = (Autor) obj;

        return this.name.equals(autor.name) && this.surname.equals(autor.surname);
    }
}
