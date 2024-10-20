package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.media.AudioManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7766mm extends BroadcastReceiver {
    public final /* synthetic */ AudioManagerAndroid a;

    public C7766mm(AudioManagerAndroid audioManagerAndroid) {
        this.a = audioManagerAndroid;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra == 0) {
            synchronized (this.a.k) {
                AudioManagerAndroid audioManagerAndroid = this.a;
                audioManagerAndroid.l[1] = false;
                if (audioManagerAndroid.d()) {
                    boolean[] zArr = this.a.l;
                    zArr[4] = true;
                    zArr[2] = false;
                } else {
                    this.a.getClass();
                    if (AudioManagerAndroid.b()) {
                        boolean[] zArr2 = this.a.l;
                        zArr2[2] = true;
                        zArr2[4] = false;
                    }
                }
            }
        } else if (intExtra != 1) {
            AudioManagerAndroid.f("Invalid state");
        } else {
            synchronized (this.a.k) {
                boolean[] zArr3 = this.a.l;
                zArr3[1] = true;
                zArr3[2] = false;
                zArr3[4] = false;
            }
        }
        AudioManagerAndroid audioManagerAndroid2 = this.a;
        synchronized (audioManagerAndroid2.k) {
            z = audioManagerAndroid2.i != -1;
        }
        if (z) {
            AudioManagerAndroid.a(this.a);
        }
    }
}
