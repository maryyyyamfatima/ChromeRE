package defpackage;

import android.media.AudioAttributes;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10048tQ1 {
    public final C11768yR1 a;
    public C9705sQ1 b;
    public final /* synthetic */ C11420xQ1 c;

    public C10048tQ1(C11420xQ1 c11420xQ1, C11768yR1 c11768yR1) {
        this.c = c11420xQ1;
        this.a = c11768yR1;
    }

    public final void a() {
        C11768yR1 c11768yR1 = this.a;
        if (c11768yR1 != null) {
            int i = this.c.l.d;
            C9710sR1 c9710sR1 = c11768yR1.a;
            c9710sR1.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            c9710sR1.a.setPlaybackToLocal(builder.build());
            this.b = null;
        }
    }
}
