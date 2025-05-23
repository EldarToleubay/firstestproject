package service.impl;

import service.VacancyService;

import java.util.ArrayList;
import java.util.List;

public  class VacancySerImpl implements VacancyService {

    @Override
    public void displayVacancy() {
        List<String> vacancies = new ArrayList<>();
        vacancies.add("Java developer");
        vacancies.add("Puthon developer");
        vacancies.add("c++ developer");

        for (String vacancy : vacancies){
            System.out.println(vacancy);
        }

    }

    @Override
    public void lookingVacancies(String searchJob) {
        List<String> resJob = new ArrayList<>();
       resJob.add("Java developer");
       resJob.add("Puthon developer");
       resJob.add("c++ developer");

        for (String vacancy :resJob) {

            if (vacancy.contains(searchJob)){
                resJob.add(vacancy);
            }
        }
    }

}
