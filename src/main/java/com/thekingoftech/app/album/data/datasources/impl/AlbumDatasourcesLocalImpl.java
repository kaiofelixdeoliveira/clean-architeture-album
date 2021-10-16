package com.thekingoftech.app.album.data.datasources.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thekingoftech.app.album.data.datasources.AlbumDatasourcesLocal;
import com.thekingoftech.app.album.data.datasources.JpaAlbumRepository;
import com.thekingoftech.app.album.data.models.AlbumModel;

public class AlbumDatasourcesLocalImpl implements AlbumDatasourcesLocal {

	final JpaAlbumRepository jpaAlbumRepository;

	public AlbumDatasourcesLocalImpl(JpaAlbumRepository jpaAlbumRepository) {

		this.jpaAlbumRepository = jpaAlbumRepository;
	}

	@Override
	public void createAlbum(AlbumModel album) {
		jpaAlbumRepository.save(album);

	}

	@Override
	public void deleteAlbum(int id) {
		jpaAlbumRepository.deleteById(Integer.toString(id));

	}

	@Override
	public AlbumModel getAlbum(int id) {
		Optional<AlbumModel> op = jpaAlbumRepository.findById(Integer.toString(id));

		return op.get();
	}

	@Override
	public List<AlbumModel> getAlbums() {
		return jpaAlbumRepository.findAll();
	}

}
