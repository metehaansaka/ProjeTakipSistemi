package org.kodluyoruz.projetakipsistemi.core.exception;

@SuppressWarnings("serial")
public class TakimNotFoundException extends NotFoundException{
    public TakimNotFoundException(int id) {
        super(String.format("%s id alanına sahip takım bulunamadı", id));
    }

    public TakimNotFoundException(){
        super("Takım Bulunamadı");
    }

}