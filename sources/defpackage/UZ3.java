package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class UZ3 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C4759e04 g;

    public UZ3(C4759e04 c4759e04, String str) {
        this.g = c4759e04;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CW3 cw3 = this.g.h;
        if (cw3 != null) {
            cw3.c(this.a);
        }
    }
}
