package defpackage;

import J.N;
import android.database.ContentObserver;
import android.os.Handler;
import org.chromium.media.AudioManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8797pm extends ContentObserver {
    public final /* synthetic */ AudioManagerAndroid a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8797pm(AudioManagerAndroid audioManagerAndroid, Handler handler) {
        super(handler);
        this.a = audioManagerAndroid;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        AudioManagerAndroid audioManagerAndroid = this.a;
        N.MCgftn_d(audioManagerAndroid.b, audioManagerAndroid, audioManagerAndroid.a.getStreamVolume(0) == 0);
    }
}
