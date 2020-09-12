package com.thoughtworks.capability.gtb.annotation;

public class AgeSerializer{

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Integer) && ((Integer) obj == Integer.MIN_VALUE);
    }
}
