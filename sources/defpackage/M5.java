package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M5 implements Runnable {
    public final /* synthetic */ P5 a;
    public final /* synthetic */ Object g;

    public M5(P5 p5, Object obj) {
        this.a = p5;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.g;
    }
}
