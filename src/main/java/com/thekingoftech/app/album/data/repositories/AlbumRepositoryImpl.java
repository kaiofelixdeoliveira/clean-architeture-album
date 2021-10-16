package com.thekingoftech.app.album.data.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thekingoftech.app.album.data.datasources.AlbumDatasourcesLocal;
import com.thekingoftech.app.album.data.models.AlbumModel;
import com.thekingoftech.app.album.domain.entities.Album;
import com.thekingoftech.app.album.domain.repositories.AlbumRepository;

public class AlbumRepositoryImpl implements AlbumRepository {

	final AlbumDatasourcesLocal datasourcesAlbumLocal;

	public AlbumRepositoryImpl(AlbumDatasourcesLocal datasourcesAlbumLocal) {

		this.datasourcesAlbumLocal = datasourcesAlbumLocal;
	}

	@Override
	public void createAlbum(Album album) {
		AlbumModel albumModel = new AlbumModel();
		datasourcesAlbumLocal.createAlbum(albumModel.toAlbumModel(album));

	}

	@Override
	public void deleteAlbum(int id) {
		datasourcesAlbumLocal.deleteAlbum(id);

	}

	@Override
	public Album getAlbum(int id) {
		AlbumModel albumModel = new AlbumModel();
		return albumModel.toAlbum(datasourcesAlbumLocal.getAlbum(id));
	}

	@Override
	public List<Album> getAlbums() {
		AlbumModel albumModel = new AlbumModel();
		return albumModel.toAlbumList(datasourcesAlbumLocal.getAlbums());
	}

}
