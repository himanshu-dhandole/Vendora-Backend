package com.himanshu.Vendora.entity;
import lombok.*;

import java.util.List;

@Data
public class Home {

    private List<HomeCategory> grid ;
    private List<HomeCategory> shopByCategories  ;
    private List<HomeCategory> dealCategories ;
    private List<HomeCategory> electricCategories ;
    private List<Deals> deals ;
}
