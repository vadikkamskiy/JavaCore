package org.skypro.skyshop.exceptions;

import java.io.IOException;

public class BestResultNotFound extends IOException {
    public BestResultNotFound(String m){
        super(m);
    }
}