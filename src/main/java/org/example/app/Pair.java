package org.example.app;

import java.util.Objects;

public class Pair {
    private String original;
    private String uppercase;

    public Pair(String original, String uppercase) {
        this.original = original;
        this.uppercase = uppercase;
    }

    public String getOriginal() {
        return original;
    }

    public String getUppercase() {
        return uppercase;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair other = (Pair) obj;
        return original.equals(other.original) && uppercase.equals(other.uppercase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(original, uppercase);
    }

}
