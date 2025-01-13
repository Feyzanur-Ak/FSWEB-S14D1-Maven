package com.workintech.developers;

public class HRManager extends Employee {

    private String [] JuniorDeveloper;
    private String [] MidDeveloper;
    private String [] SeniorDeveloper;


    public  HRManager(int id,String name,double salary,String [] JuniorDeveloper,String [] MidDeveloper,String [] SeniorDeveloper){
        super(id,name,salary);
        this.JuniorDeveloper= JuniorDeveloper;
        this.MidDeveloper= MidDeveloper;
        this.SeniorDeveloper= SeniorDeveloper;
    }

    public void addJuniorDeveloper(String developerName, int index) {

        if(index<0 || index>=JuniorDeveloper.length){
            System.out.println("İndeks Uygun Değil");
           return;
        }

        if(JuniorDeveloper[index]==null){
            JuniorDeveloper[index]=developerName;
            System.out.println(developerName + " Junior Developer olarak eklendi.");
        } else{
            System.out.println("Bu indeks zaten dolu! (" + JuniorDeveloper[index] + ")");
        }
    }

    public void addMidDeveloper(String developerName, int index) {

        if(index<0 || index>=MidDeveloper.length){
            System.out.println("İndeks Uygun Değil");
            return;
        }

        if(MidDeveloper[index]==null){
            MidDeveloper[index]=developerName;
            System.out.println(developerName + " Mid Developer olarak eklendi.");
        } else{
            System.out.println("Bu indeks zaten dolu! (" + MidDeveloper[index] + ")");
        }
    }

    public void addSeniorDeveloper(String developerName, int index) {

        if(index<0 || index>=SeniorDeveloper.length){
            System.out.println("İndeks Uygun Değil");
            return;
        }

        if(SeniorDeveloper[index]==null){
            SeniorDeveloper[index]=developerName;
            System.out.println(developerName + " Senior Developer olarak eklendi.");
        } else{
            System.out.println("Bu indeks zaten dolu! (" + SeniorDeveloper[index] + ")");
        }
    }


}
