package com.thekingoftech.app.album.data.datasources;

import java.util.List;

import com.thekingoftech.app.album.data.models.AlbumModel;


public interface AlbumDatasourcesLocal {

	public void createAlbum(AlbumModel album);
	public void deleteAlbum(int id);
	public AlbumModel getAlbum(int id);
	public List<AlbumModel> getAlbums();
}


