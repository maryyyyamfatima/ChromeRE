package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import org.chromium.chrome.browser.media.ui.ChromeMediaNotificationControllerServices$PlaybackListenerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10379uO extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            SparseArray sparseArray = C11408xO.b;
            Intent intent2 = new Intent(V60.a, (Class<?>) ChromeMediaNotificationControllerServices$PlaybackListenerService.class);
            intent2.setAction(intent.getAction());
            try {
                V60.a.startService(intent2);
                z = true;
            } catch (RuntimeException unused) {
                z = false;
            }
            EI2.b("Media.Android.BecomingNoisy", z);
        }
    }
}
