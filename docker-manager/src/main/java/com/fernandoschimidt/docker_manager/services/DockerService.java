package com.fernandoschimidt.docker_manager.services;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DockerService {
    private final DockerClient dockerClient;


    public List<Container> listConatiners(boolean all) {
        return dockerClient.listContainersCmd().withShowAll(all).exec();
    }

    public List<Image> listImages() {
        return dockerClient.listImagesCmd().exec();
    }
    public void startContainer(String containerId){
        dockerClient.startContainerCmd(containerId).exec();
    }
    public void stopContainer(String containerId){
        dockerClient.stopContainerCmd(containerId).exec();
    }
    public void deleteContainer(String conatinerId){
        dockerClient.removeContainerCmd(conatinerId).exec();
    }
    public void createContainer(String imageName){
        dockerClient.createContainerCmd(imageName).exec();
    }

}
