package bgm.yzl.models;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

	private String name;
	private ListIterator<Song> it;
	private LinkedList<Song> songsAddedToPlayList;
	private Album album;
	private Song current;

	public Playlist(String name) {
		songsAddedToPlayList = new LinkedList<>();
		this.name = name;
	}

	public void addSongToPlaylist(Song song) {
		if (Album.allTheSongsInAlbums.contains(song)) {
			songsAddedToPlayList.add(song);
		} else {
			System.out.println("song is not available.");
		}
	}

	public Song playSong(Song song) {
		it = songsAddedToPlayList.listIterator();
		current = it.next();

		if (song.equals(current)) {

			return song;

		} else {

			while (!current.equals(song)) {

				current = it.next();

			}

		}
		return current;

	}

	public Song skipSong() { // TODO:fix ...
		Song beg = null;

		if (it.hasNext() && !current.equals(songsAddedToPlayList.getLast())) {
			current = it.next();
			beg = current;
		}
		if (!it.hasNext()) {
			ListIterator<Song> s = songsAddedToPlayList.listIterator();
			beg = s.next();
			it.set(songsAddedToPlayList.getFirst());
		}
		return beg;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		it = songsAddedToPlayList.listIterator();
		StringBuilder str = new StringBuilder();
		while (it.hasNext()) {
			str.append("-").append(it.next().getTitle());
		}
		return str.toString();
	}

}
