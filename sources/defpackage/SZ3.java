package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class SZ3 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C4759e04 g;

    public SZ3(C4759e04 c4759e04, boolean z) {
        this.g = c4759e04;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4759e04 c4759e04 = this.g;
        boolean z = this.a;
        if (z || c4759e04.h != null) {
            C4759e04.a(c4759e04).setVisibility(C4759e04.b(z));
        }
    }
}
