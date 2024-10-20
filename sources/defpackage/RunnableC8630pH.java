package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8630pH implements Runnable {
    public final /* synthetic */ C9315rH a;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public RunnableC8630pH(C9315rH c9315rH, String str, String str2) {
        this.a = c9315rH;
        this.g = str;
        this.h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ZG zg;
        synchronized (this.a.I) {
            zg = (ZG) this.a.I.get(this.g);
        }
        if (zg != null) {
            zg.a(this.a.G, this.g, this.h);
        } else {
            C9315rH.Z.a("Discarded message for unknown namespace '%s'", this.g);
        }
    }
}
