package com.example.pathfinder.service;

import com.example.pathfinder.model.sevice.RouteServiceModel;
import com.example.pathfinder.model.view.RouteViewModel;

import java.util.List;

public interface RouteService {

    List<RouteViewModel> findAllRoutesView();

    void addNewRoute(RouteServiceModel routeServiceModel);

}
