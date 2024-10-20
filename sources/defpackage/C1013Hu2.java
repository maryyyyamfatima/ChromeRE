package defpackage;

import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1013Hu2 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ PickerVideoPlayer a;

    public C1013Hu2(PickerVideoPlayer pickerVideoPlayer) {
        this.a = pickerVideoPlayer;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        PickerVideoPlayer pickerVideoPlayer = this.a;
        int currentPosition = pickerVideoPlayer.k.getCurrentPosition();
        pickerVideoPlayer.k.getDuration();
        ImageView imageView = pickerVideoPlayer.p;
        int i = currentPosition + (x > imageView.getX() + ((float) (imageView.getWidth() / 2)) ? 10000 : -10000);
        if (Build.VERSION.SDK_INT >= 26) {
            pickerVideoPlayer.k.seekTo(i, 3);
        } else {
            pickerVideoPlayer.j.seekTo(i);
        }
        pickerVideoPlayer.g();
        pickerVideoPlayer.d(1, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        PickerVideoPlayer pickerVideoPlayer = this.a;
        if (pickerVideoPlayer.m) {
            pickerVideoPlayer.c(3);
        } else {
            pickerVideoPlayer.d(2, true);
        }
        return true;
    }
}
