package com.thekingoftech.app.album.domain.usecases;

import com.thekingoftech.app.album.domain.entities.Album;
import com.thekingoftech.app.album.domain.repositories.AlbumRepository;

public class GetAlbum {

	final AlbumRepository albumRepository;

	GetAlbum(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	};

	Album call(int id) {
		return albumRepository.getAlbum(id);

	}

}
