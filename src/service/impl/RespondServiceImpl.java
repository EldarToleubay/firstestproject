package service.impl;

import entity.Respond;
import service.RespondService;
import service.ResumeService;

import java.util.ArrayList;
import java.util.List;

public abstract class RespondServiceImpl implements RespondService {
    List<Respond> responds = new ArrayList<>();

    @Override
    public void isResponding() {
    for (Respond respond : responds){
        if (respond.getRespond()){
            System.out.println("Жауап берілді");
        }
        else {
            System.out.println("Өкінішке орай жауап жоқ");
        }

    }



    }


}
