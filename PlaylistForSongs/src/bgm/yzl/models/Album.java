package bgm.yzl.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album { // contains list of songs

	static LinkedList<Song> allTheSongsInAlbums = new LinkedList<>();
	private LinkedList<Song> songlist; // albumun sarki listesi
	private static ArrayList<Album> albumlist = new ArrayList<>();
	private String name;

	public Album(String name) {
		this.name = name;
		albumlist.add(this);
		songlist = new LinkedList<>();
	}

	public void addSongToAlbum(Song song) {
		songlist.add(song);
		allTheSongsInAlbums.add(song);
	}

	public LinkedList<Song> getSonglist() {
		return songlist;
	}

	public String getName() {
		return name;
	}

	private String print() {
		ListIterator<Song> t = songlist.listIterator();
		StringBuilder str = new StringBuilder();
		while (t.hasNext()) {
			str.append("-").append(t.next().getTitle()).append(" - ");
		}
		return str.toString();
	}

	@Override
	public String toString() {
		return print();
	}

}
