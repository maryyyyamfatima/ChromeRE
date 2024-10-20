package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class TZ3 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C4759e04 g;

    public TZ3(C4759e04 c4759e04, Runnable runnable) {
        this.g = c4759e04;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4759e04 c4759e04 = this.g;
        Runnable runnable = this.a;
        if (runnable == null && c4759e04.h == null) {
            return;
        }
        C4759e04.a(c4759e04).i = runnable;
    }
}
