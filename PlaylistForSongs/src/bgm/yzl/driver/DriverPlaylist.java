package bgm.yzl.driver;

import bgm.yzl.models.Album;
import bgm.yzl.models.Playlist;
import bgm.yzl.models.Song;

public class DriverPlaylist {

	public static void main(String[] args) {

		Song song1 = new Song("Courage To Change", 12);
		Song song2 = new Song("Unstoppable", 12);
		Song song3 = new Song("Bird Set Free", 12);

		Album album = new Album("Sia");

		album.addSongToAlbum(song1);
		album.addSongToAlbum(song2);
		album.addSongToAlbum(song3);

		System.out.println(album.toString());

		Song s = new Song("diabolic", 12);
		Song t = new Song("dobm", 12);
		Song d = new Song("secrets of the american gods", 12);

		Album album2 = new Album("Metal");

		album2.addSongToAlbum(s);
		album2.addSongToAlbum(t);
		album2.addSongToAlbum(d);

		System.out.println(album2.toString());

		Playlist p1 = new Playlist("karma");

		p1.addSongToPlaylist(song3);
		p1.addSongToPlaylist(song1);
		p1.addSongToPlaylist(d);
		p1.addSongToPlaylist(t);
		p1.addSongToPlaylist(s);

		System.out.println(p1.toString());

		System.out.println(p1.playSong(s));
		System.out.println(p1.skipSong());
		System.out.println(p1.skipSong());

	}

}
