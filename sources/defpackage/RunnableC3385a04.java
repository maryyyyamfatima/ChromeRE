package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC3385a04 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C4759e04 g;

    public RunnableC3385a04(C4759e04 c4759e04, boolean z) {
        this.g = c4759e04;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.b.setVisibility(C4759e04.b(this.a));
    }
}
