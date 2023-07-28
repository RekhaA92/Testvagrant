package InterviewQuestions;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;

	public class PlaylistManager {
	    private Queue<String> playlist;
	    private int initialCapacity;

	    public PlaylistManager(int initialCapacity) {
	        this.playlist = new LinkedList<String>();
	        this.initialCapacity = initialCapacity;
	    }

	    public void playSong(String song) {
	        if (playlist.size() >= initialCapacity) {
	            playlist.poll(); // Dequeue the oldest song if the playlist is full
	        }
	        playlist.offer(song); // Enqueue the new song
	    }

	    public void displayPlaylist() {
	        System.out.println("Current playlist: " + playlist);
	    }

	    public static void main(String[] args) {
	        int initialCapacity = 3;
	        PlaylistManager playlistManager = new PlaylistManager(initialCapacity);
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 1; i <= 4; i++) {
	            System.out.print("Enter song " + i + ": ");
	            String song = scanner.nextLine();
	            playlistManager.playSong(song);
	            playlistManager.displayPlaylist();
	        }

	        scanner.close();
	    }
	}


