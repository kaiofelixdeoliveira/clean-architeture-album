package com.thekingoftech.app.album.domain.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thekingoftech.app.album.domain.entities.Album;

 public interface AlbumRepository {
	
	public void createAlbum(Album album);
	public void deleteAlbum(int id);
	public Album getAlbum(int id);
	public List<Album> getAlbums();

}
