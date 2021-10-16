package com.thekingoftech.app.album.domain.usecases;

import com.thekingoftech.app.album.domain.entities.Album;
import com.thekingoftech.app.album.domain.repositories.AlbumRepository;


public class CreateAlbum {

	final AlbumRepository albumRepository;

	public CreateAlbum(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	}

	public void call(Album album) {
		albumRepository.createAlbum(album);

	}

}
