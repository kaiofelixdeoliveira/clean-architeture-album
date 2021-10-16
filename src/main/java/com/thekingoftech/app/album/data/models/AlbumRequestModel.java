package com.thekingoftech.app.album.data.models;

import com.thekingoftech.app.album.domain.entities.Album;

public class AlbumRequestModel {
	private int userId;
	private int id;
	private String title;

	public static Album toAlbum(AlbumRequestModel albumRequest) {
		Album album = new Album();
		album.setUserId(albumRequest.getUserId());
		album.setId(albumRequest.getId());
		album.setTitle(albumRequest.getTitle());
		return album;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "AlbumRequest [userId=" + userId + ", id=" + id + ", title=" + title + "]";
	}

}
