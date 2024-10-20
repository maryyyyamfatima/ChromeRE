package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.chrome.browser.media.PictureInPictureActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nu2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792Nu2 extends BroadcastReceiver {
    public final /* synthetic */ PictureInPictureActivity a;

    public C1792Nu2(PictureInPictureActivity pictureInPictureActivity) {
        this.a = pictureInPictureActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.NativePointer", 0L);
        long j = this.a.T;
        if (longExtra == j && j != 0 && intent.getAction() != null && intent.getAction().equals("org.chromium.chrome.browser.media.PictureInPictureActivity.MediaAction") && intent.hasExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.ReceiverToken") && intent.getIntExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.ReceiverToken", 0) == hashCode()) {
            int intExtra = intent.getIntExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.ControlType", -1);
            if (intExtra == 0 || intExtra == 1) {
                N.M3$g8Z3M(longExtra);
            } else if (intExtra == 2) {
                N.MJCP0RbB(longExtra);
            } else {
                if (intExtra != 3) {
                    return;
                }
                N.MBFQ8411(longExtra);
            }
        }
    }
}
