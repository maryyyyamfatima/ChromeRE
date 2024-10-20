package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.media.AudioManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8454om extends BroadcastReceiver {
    public final /* synthetic */ AudioManagerAndroid a;

    public C8454om(AudioManagerAndroid audioManagerAndroid) {
        this.a = audioManagerAndroid;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
        AudioManagerAndroid audioManagerAndroid = this.a;
        boolean z = true;
        if (intExtra != 0) {
            if (intExtra == 1) {
                audioManagerAndroid.e = 1;
                return;
            } else {
                if (intExtra != 2) {
                    AudioManagerAndroid.f("Invalid state");
                    return;
                }
                return;
            }
        }
        if (audioManagerAndroid.e != 3) {
            synchronized (audioManagerAndroid.k) {
                if (audioManagerAndroid.i == -1) {
                    z = false;
                }
            }
            if (z) {
                AudioManagerAndroid.a(audioManagerAndroid);
            }
        }
        audioManagerAndroid.e = 0;
    }
}
