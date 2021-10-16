package com.thekingoftech.app.album.data.models;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thekingoftech.app.album.domain.entities.Album;

@Entity
@Table(name = "album")
public class AlbumModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private int userId;

	public AlbumModel(int userId, int id, String title) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
	}

	public Album toAlbum(AlbumModel albumModel) {
		Album album = new Album();
		album.setUserId(albumModel.getUserId());
		album.setId(albumModel.getId());
		album.setTitle(albumModel.getTitle());
		return album;
	}

	public AlbumModel toAlbumModel(Album album) {
		AlbumModel albumModel = new AlbumModel();
		albumModel.setUserId(album.getUserId());
		albumModel.setId(album.getId());
		albumModel.setTitle(album.getTitle());
		return albumModel;
	}

	public List<Album> toAlbumList(List<AlbumModel> albumModel) {
		return albumModel.stream().map(temp -> {
			Album obj = new Album();
			obj.setId(temp.getId());
			obj.setUserId(temp.getUserId());
			obj.setTitle(temp.getTitle());
			return obj;
		}).collect(Collectors.toList());
	}

	public AlbumModel() {
		// TODO Auto-generated constructor stub
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
		return "AlbumModel [userId=" + userId + ", id=" + id + ", title=" + title + "]";
	}

	// public AlbumModel fromAlbumToModel(){

}
