package TEN20251020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaGroup {
    private List<Media> mediaList;

    public MediaGroup() {
        mediaList = new ArrayList<>();
    }

    //defins kopering
    public List<Media> getMediaList() {
        List<Media> copy = new ArrayList<>(mediaList);
        Collections.sort(copy);
        return copy;
    }

    public boolean add(Media media) {
        if (mediaList.contains(media)) {
            return false;
        }
        mediaList.add(media);
        return true;
    }

    public boolean remove(Media media) {
        return mediaList.remove(media);
    }

    public String toString() {
        return mediaList.toString();
    }
}
