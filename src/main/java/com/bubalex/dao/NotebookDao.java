package com.bubalex.dao;

import com.bubalex.entities.NotebookEntity;

import java.util.List;

public interface NotebookDao {

    List<NotebookEntity> getAll();

    NotebookEntity getById(Long id);

    void remove(Long id);

    NotebookEntity update(NotebookEntity notebookEntity);

    NotebookEntity create(NotebookEntity notebookEntity);

}
