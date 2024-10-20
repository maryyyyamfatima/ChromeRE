package defpackage;

import android.media.VolumeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ag4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3611ag4 extends VolumeProvider {
    public final /* synthetic */ C9705sQ1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3611ag4(C9705sQ1 c9705sQ1, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = c9705sQ1;
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        C9705sQ1 c9705sQ1 = this.a;
        c9705sQ1.f.c.n.post(new RunnableC9020qQ1(c9705sQ1, i));
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        C9705sQ1 c9705sQ1 = this.a;
        c9705sQ1.f.c.n.post(new RunnableC9362rQ1(c9705sQ1, i));
    }
}
