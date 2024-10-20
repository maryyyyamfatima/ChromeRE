package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sX2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9741sX2 implements CY1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ C10084tX2 c;

    public C9741sX2(C10084tX2 c10084tX2, boolean z, Runnable runnable) {
        this.c = c10084tX2;
        this.a = z;
        this.b = runnable;
    }

    @Override // defpackage.CY1
    public final void a(boolean z) {
        C10084tX2 c10084tX2 = this.c;
        boolean z2 = this.a;
        if (z) {
            c10084tX2.f(z2, this.b);
        } else if (z2) {
            c10084tX2.i();
        }
    }
}
