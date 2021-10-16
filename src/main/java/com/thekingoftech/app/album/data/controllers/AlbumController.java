package com.thekingoftech.app.album.data.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thekingoftech.app.album.data.models.AlbumRequestModel;
import com.thekingoftech.app.album.data.models.AlbumResponseModel;
import com.thekingoftech.app.album.domain.usecases.CreateAlbum;

@RestController
public class AlbumController {

	final CreateAlbum createAlbum;

	
	AlbumController(CreateAlbum createAlbum) {
		this.createAlbum = createAlbum;
	}

	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlbumResponseModel> create(@RequestBody AlbumRequestModel requestModel) {

		try {
			createAlbum.call(AlbumRequestModel.toAlbum(requestModel));

			return new ResponseEntity<AlbumResponseModel>(new AlbumResponseModel(HttpStatus.OK.value(), HttpStatus.OK.name()),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
