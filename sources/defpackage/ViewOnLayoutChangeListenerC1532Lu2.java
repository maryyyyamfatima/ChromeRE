package defpackage;

import J.N;
import android.view.View;
import org.chromium.chrome.browser.media.PictureInPictureActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lu2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1532Lu2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ PictureInPictureActivity a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        PictureInPictureActivity pictureInPictureActivity = this.a;
        long j = pictureInPictureActivity.T;
        if (j == 0 || i2 == i4 || i == i3 || (i9 = i3 - i) > pictureInPictureActivity.a0) {
            return;
        }
        N.MLM3OS4j(j, i9, i4 - i2);
    }

    public ViewOnLayoutChangeListenerC1532Lu2(PictureInPictureActivity pictureInPictureActivity) {
        this.a = pictureInPictureActivity;
    }
}
