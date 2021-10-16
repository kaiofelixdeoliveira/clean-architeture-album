package com.thekingoftech.app.album.data.datasources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thekingoftech.app.album.data.models.AlbumModel;

@Repository
public interface JpaAlbumRepository extends JpaRepository<AlbumModel, String>{

}
