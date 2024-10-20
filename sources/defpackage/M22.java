package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class M22 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ R22 i;

    public M22(R22 r22, long j, int i, boolean z) {
        this.i = r22;
        this.a = j;
        this.g = i;
        this.h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R22 r22 = this.i;
        T22 t22 = r22.b.d;
        int i = this.g;
        long j = this.a;
        t22.d(i, j);
        if (this.h) {
            r22.b.d.b(i);
            r22.b.d.f(new long[]{j});
        }
    }
}
