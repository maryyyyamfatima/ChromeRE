package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ME implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int g;
    public final /* synthetic */ OE h;

    public ME(OE oe, String str, int i) {
        this.h = oe;
        this.a = str;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.g(this.a, this.g, "v2_message", null);
    }
}
