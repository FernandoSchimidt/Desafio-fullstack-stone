package com.fernandoschimidt.docker_manager.controllers;

import com.fernandoschimidt.docker_manager.services.DockerService;
import com.github.dockerjava.api.model.Image;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class DockerImagesController {
    private final DockerService dockerService;

    public DockerImagesController(DockerService dockerService) {
        this.dockerService = dockerService;
    }
    public List<Image> listImages(){
        return  dockerService.listImages();
    }
}
