package com.kaua.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
//        components.forEach(FileSystemComponent::showDetails);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
