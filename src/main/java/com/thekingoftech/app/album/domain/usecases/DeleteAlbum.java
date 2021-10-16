package com.thekingoftech.app.album.domain.usecases;

import com.thekingoftech.app.album.domain.repositories.AlbumRepository;

public class DeleteAlbum {

	final AlbumRepository albumRepository;

	DeleteAlbum(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	};

	void call(int id) {
		albumRepository.deleteAlbum(id);

	}

}
