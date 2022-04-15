package Lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Song> songs = new ArrayList<Song>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] songDetails = scan.nextLine().split("_");
            songs.add(new Song(songDetails[0], songDetails[1], songDetails[2]));
        }

        String type = scan.nextLine();

        if(type.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if(song.getTypeList().equals(type)){
                    System.out.println(song.getName());
                }
            }
        }

        List<Song> filtered = songs.stream().filter(e -> e.typeList.equals(type)).collect(Collectors.toList());

        System.out.print(filtered.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", System.lineSeparator()));
    }
}
