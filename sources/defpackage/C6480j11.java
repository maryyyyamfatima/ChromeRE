package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6480j11 extends AbstractC1698Nb3 {
    public final Runnable b;

    @Override // defpackage.AbstractC1698Nb3
    public final boolean c() {
        return true;
    }

    public C6480j11(Runnable runnable) {
        super("go_back");
        this.b = runnable;
    }

    @Override // defpackage.AbstractC1698Nb3
    public final void d() {
        this.b.run();
    }
}
