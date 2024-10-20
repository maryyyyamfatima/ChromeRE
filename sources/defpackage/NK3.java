package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NK3 implements Runnable {
    public final /* synthetic */ CharSequence a;
    public final /* synthetic */ int g;
    public final /* synthetic */ C5561gL3 h;

    public NK3(C5561gL3 c5561gL3, CharSequence charSequence, int i) {
        this.h = c5561gL3;
        this.a = charSequence;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5561gL3 c5561gL3 = this.h;
        c5561gL3.i = 0;
        c5561gL3.e.o(this.a, this.g, true, 0);
    }
}
