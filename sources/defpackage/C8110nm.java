package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.media.AudioManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8110nm extends BroadcastReceiver {
    public final /* synthetic */ AudioManagerAndroid a;

    public C8110nm(AudioManagerAndroid audioManagerAndroid) {
        this.a = audioManagerAndroid;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
        if (intExtra == 0) {
            synchronized (this.a.k) {
                this.a.l[3] = false;
            }
        } else if (intExtra != 1) {
            if (intExtra != 2) {
                if (intExtra != 3) {
                    AudioManagerAndroid.f("Invalid state");
                }
            } else {
                synchronized (this.a.k) {
                    this.a.l[3] = true;
                }
            }
        }
    }
}
