package com.thekingoftech.app.album.domain.usecases;

import java.util.List;

import com.thekingoftech.app.album.domain.entities.Album;
import com.thekingoftech.app.album.domain.repositories.AlbumRepository;

public class GetAlbums {

	final AlbumRepository albumRepository;

	GetAlbums(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	};

	List<Album> call() {
		return albumRepository.getAlbums();

	}

}
