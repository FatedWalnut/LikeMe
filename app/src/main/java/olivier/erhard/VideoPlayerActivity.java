package olivier.erhard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        Intent intent = getIntent();
        int musicIndex = intent.getIntExtra("musicIndex", -1);

        if (musicIndex != -1) {
            Music music = Music.music[musicIndex];
            String videoUrl = music.getVideoUrl();

            VideoView videoView = findViewById(R.id.videoView);
            videoView.setVideoURI(Uri.parse(videoUrl));

            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

            videoView.start();
        }
    }
}
