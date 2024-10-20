package org.chromium.components.browser_ui.photo_picker;

import android.content.Context;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.android.chrome.R;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC8540p04;
import defpackage.C0493Du2;
import defpackage.C0623Eu2;
import defpackage.C0753Fu2;
import defpackage.C0883Gu2;
import defpackage.C1013Hu2;
import defpackage.C1471Li0;
import defpackage.C8029nY0;
import defpackage.RunnableC11591xu2;
import defpackage.ViewOnTouchListenerC0233Bu2;
import org.chromium.base.task.PostTask;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PickerVideoPlayer extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnSystemUiVisibilityChangeListener {
    public static final /* synthetic */ int F = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public final C8029nY0 E;
    public Window a;
    public final Context g;
    public final ImageView h;
    public final TextView i;
    public final VideoView j;
    public MediaPlayer k;
    public final View l;
    public boolean m;
    public final View n;
    public final View o;
    public final ImageView p;
    public final ImageView q;
    public boolean r;
    public final ImageView s;
    public boolean t;
    public boolean u;
    public final TextView v;
    public final LinearLayout w;
    public final SeekBar x;
    public boolean y;
    public boolean z;

    public PickerVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = true;
        this.g = context;
        LayoutInflater.from(context).inflate(R.layout.f61900_resource_name_obfuscated_res_0x7f0e02e3, this);
        ImageView imageView = (ImageView) findViewById(R.id.back_button);
        this.h = imageView;
        this.i = (TextView) findViewById(R.id.video_file_name);
        this.j = (VideoView) findViewById(R.id.video_player);
        View findViewById = findViewById(R.id.video_overlay_container);
        this.l = findViewById;
        this.n = findViewById(R.id.video_controls);
        this.o = findViewById(R.id.video_controls_gradient);
        ImageView imageView2 = (ImageView) findViewById(R.id.video_player_play_button);
        this.p = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.mute);
        this.q = imageView3;
        imageView3.setImageResource(R.drawable.f50620_resource_name_obfuscated_res_0x7f090342);
        ImageView imageView4 = (ImageView) findViewById(R.id.fullscreen);
        this.s = imageView4;
        this.v = (TextView) findViewById(R.id.remaining_time);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seek_bar);
        this.x = seekBar;
        this.w = (LinearLayout) findViewById(R.id.fast_forward_message);
        imageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        seekBar.setOnSeekBarChangeListener(this);
        this.E = new C8029nY0(context, new C1013Hu2(this), null);
        findViewById.setOnTouchListener(new ViewOnTouchListenerC0233Bu2(this));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        getHandler().post(new Runnable() { // from class: wu2
            @Override // java.lang.Runnable
            public final void run() {
                int i = PickerVideoPlayer.F;
                PickerVideoPlayer.this.a();
            }
        });
        super.onConfigurationChanged(configuration);
    }

    public final boolean b() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(8);
        this.z = false;
        this.k.pause();
        ImageView imageView = this.p;
        imageView.setImageResource(R.drawable.f50060_resource_name_obfuscated_res_0x7f090303);
        imageView.setContentDescription(this.g.getResources().getString(R.string.f66200_resource_name_obfuscated_res_0x7f14015a));
        d(0, false);
        this.j.setMediaController(null);
        this.q.setImageResource(R.drawable.f50620_resource_name_obfuscated_res_0x7f090342);
        f(false);
        return true;
    }

    public final void f(boolean z) {
        int navigationBarDividerColor;
        if (Build.VERSION.SDK_INT >= 28) {
            if (z) {
                if (this.D) {
                    return;
                }
                this.B = this.a.getNavigationBarColor();
                navigationBarDividerColor = this.a.getNavigationBarDividerColor();
                this.C = navigationBarDividerColor;
            }
            this.a.setNavigationBarColor(z ? -16777216 : this.B);
            this.a.setNavigationBarDividerColor(z ? -16777216 : this.C);
            AbstractC8540p04.j(this.a.getDecorView().getRootView(), !z);
            this.D = z;
        }
    }

    public final void a() {
        int min;
        int max;
        MediaPlayer mediaPlayer = this.k;
        if (mediaPlayer == null || mediaPlayer.getVideoWidth() == 0 || this.k.getVideoHeight() == 0) {
            return;
        }
        float videoWidth = this.k.getVideoWidth() / this.k.getVideoHeight();
        boolean z = this.g.getResources().getConfiguration().orientation == 2;
        if (z) {
            min = Math.max(getWidth(), getHeight());
        } else {
            min = Math.min(getWidth(), getHeight());
        }
        if (z) {
            max = Math.min(getWidth(), getHeight());
        } else {
            max = Math.max(getWidth(), getHeight());
        }
        VideoView videoView = this.j;
        ViewGroup.LayoutParams layoutParams = videoView.getLayoutParams();
        TextView textView = this.i;
        ImageView imageView = this.h;
        if (z) {
            int round = Math.round(max * videoWidth);
            layoutParams.width = round;
            layoutParams.height = max;
            if (round > min) {
                layoutParams.width = min;
                layoutParams.height = Math.round(min / videoWidth);
            }
            imageView.setVisibility(8);
            textView.setVisibility(8);
        } else {
            int round2 = Math.round(min / videoWidth);
            layoutParams.height = round2;
            layoutParams.width = min;
            if (round2 > max) {
                layoutParams.height = max;
                layoutParams.width = Math.round(max * videoWidth);
            }
            imageView.setVisibility(0);
            textView.setVisibility(0);
        }
        videoView.setLayoutParams(layoutParams);
        videoView.requestLayout();
        View view = this.n;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        Context context = this.g;
        if (id == R.id.video_player_play_button) {
            if (!this.j.isPlaying()) {
                e();
                return;
            }
            this.z = false;
            this.k.pause();
            ImageView imageView = this.p;
            imageView.setImageResource(R.drawable.f50060_resource_name_obfuscated_res_0x7f090303);
            imageView.setContentDescription(context.getResources().getString(R.string.f66200_resource_name_obfuscated_res_0x7f14015a));
            d(0, false);
            return;
        }
        if (id == R.id.back_button) {
            b();
            return;
        }
        if (id == R.id.mute) {
            boolean z = !this.r;
            this.r = z;
            ImageView imageView2 = this.q;
            if (z) {
                this.k.setVolume(1.0f, 1.0f);
                imageView2.setImageResource(R.drawable.f50620_resource_name_obfuscated_res_0x7f090342);
                imageView2.setContentDescription(context.getResources().getString(R.string.f65990_resource_name_obfuscated_res_0x7f140144));
                return;
            } else {
                this.k.setVolume(0.0f, 0.0f);
                imageView2.setImageResource(R.drawable.f50610_resource_name_obfuscated_res_0x7f090341);
                imageView2.setContentDescription(context.getResources().getString(R.string.f66800_resource_name_obfuscated_res_0x7f14019a));
                return;
            }
        }
        if (id == R.id.fullscreen) {
            this.u = true;
            View decorView = this.a.getDecorView();
            if (!this.t) {
                decorView.setOnSystemUiVisibilityChangeListener(this);
                int systemUiVisibility = decorView.getSystemUiVisibility();
                this.A = systemUiVisibility;
                decorView.setSystemUiVisibility(systemUiVisibility | 2048 | 4 | 2 | 1024 | 1);
                return;
            }
            decorView.setSystemUiVisibility(this.A);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = i & 4;
        Context context = this.g;
        ImageView imageView = this.s;
        if (i2 == 0) {
            this.a.getDecorView().setOnSystemUiVisibilityChangeListener(null);
            imageView.setImageResource(R.drawable.f47720_resource_name_obfuscated_res_0x7f090211);
            imageView.setContentDescription(context.getResources().getString(R.string.f65890_resource_name_obfuscated_res_0x7f140139));
            this.t = false;
            if (!this.u) {
                getHandler().post(new Runnable() { // from class: yu2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = PickerVideoPlayer.F;
                        PickerVideoPlayer.this.a();
                    }
                });
                return;
            }
        } else {
            imageView.setImageResource(R.drawable.f47710_resource_name_obfuscated_res_0x7f090210);
            imageView.setContentDescription(context.getResources().getString(R.string.f65780_resource_name_obfuscated_res_0x7f14012e));
            this.t = true;
        }
        a();
        this.u = false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            float f = i / 100.0f;
            VideoView videoView = this.j;
            int round = Math.round(f * videoView.getDuration());
            if (Build.VERSION.SDK_INT >= 26) {
                this.k.seekTo(round, 3);
            } else {
                videoView.seekTo(round);
            }
            g();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        d(0, false);
        boolean isPlaying = this.j.isPlaying();
        ImageView imageView = this.p;
        if (isPlaying) {
            this.z = false;
            this.k.pause();
            imageView.setImageResource(R.drawable.f50060_resource_name_obfuscated_res_0x7f090303);
            imageView.setContentDescription(this.g.getResources().getString(R.string.f66200_resource_name_obfuscated_res_0x7f14015a));
            d(0, false);
            this.y = true;
        }
        this.w.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        c(this.y ? 1 : 2);
        if (this.y) {
            e();
            this.y = false;
        }
        this.w.setVisibility(8);
        this.p.setVisibility(0);
    }

    public final void c(int i) {
        if (i == 0) {
            return;
        }
        View view = this.n;
        view.animate().cancel();
        View view2 = this.o;
        view2.animate().cancel();
        ImageView imageView = this.p;
        imageView.animate().cancel();
        int i2 = 0;
        long j = i != 3 ? 2500 : 0;
        view2.animate().alpha(0.0f).setStartDelay(j).setDuration(1000);
        ViewPropertyAnimator startDelay = view.animate().alpha(0.0f).setStartDelay(j);
        long j2 = 750;
        startDelay.setDuration(j2).setListener(new C0493Du2(this));
        if (i != 3) {
            i2 = i == 1 ? 250 : 2500;
        }
        imageView.animate().alpha(0.0f).setStartDelay(i2).setDuration(j2).setListener(new C0623Eu2(this));
    }

    public final void d(int i, boolean z) {
        View view = this.n;
        view.animate().cancel();
        View view2 = this.o;
        view2.animate().cancel();
        ImageView imageView = this.p;
        imageView.animate().cancel();
        if (this.j.isPlaying()) {
            this.z = true;
            PostTask.b(AbstractC5103f04.a, new RunnableC11591xu2(this), 250L);
        }
        this.m = true;
        if (!z) {
            view.setAlpha(1.0f);
            view2.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            this.q.setClickable(true);
            this.s.setClickable(true);
            imageView.setClickable(true);
            c(i);
            return;
        }
        long j = 250;
        view2.animate().alpha(1.0f).setStartDelay(0L).setDuration(j);
        view.animate().alpha(1.0f).setStartDelay(0L).setDuration(500).setListener(new C0753Fu2(this, i));
        imageView.animate().alpha(1.0f).setStartDelay(0L).setDuration(j).setListener(new C0883Gu2(this));
    }

    public final void g() {
        VideoView videoView = this.j;
        try {
            String n = C1471Li0.n(Long.valueOf(videoView.getCurrentPosition()));
            String n2 = C1471Li0.n(Long.valueOf(videoView.getDuration()));
            Context context = this.g;
            String string = context.getResources().getString(R.string.f81720_resource_name_obfuscated_res_0x7f14083b, n, n2);
            TextView textView = this.v;
            textView.setText(string);
            textView.setContentDescription(context.getResources().getString(R.string.f66210_resource_name_obfuscated_res_0x7f14015b, n, n2));
            this.x.setProgress(videoView.getDuration() != 0 ? (videoView.getCurrentPosition() * 100) / videoView.getDuration() : 0);
            if (videoView.isPlaying() && this.z) {
                this.z = true;
                PostTask.b(AbstractC5103f04.a, new RunnableC11591xu2(this), 250L);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void e() {
        this.k.start();
        ImageView imageView = this.p;
        imageView.setImageResource(R.drawable.f49910_resource_name_obfuscated_res_0x7f0902f4);
        imageView.setContentDescription(this.g.getResources().getString(R.string.f66180_resource_name_obfuscated_res_0x7f140158));
        d(1, false);
    }
}
