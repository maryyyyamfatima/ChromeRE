package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eL3 */
/* loaded from: classes2.dex */
public final class RunnableC4873eL3 implements Runnable {
    public final /* synthetic */ CharSequence a;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h = false;
    public final /* synthetic */ C5561gL3 i;

    public RunnableC4873eL3(C5561gL3 c5561gL3, CharSequence charSequence, int i) {
        this.i = c5561gL3;
        this.a = charSequence;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5561gL3 c5561gL3 = this.i;
        int i = this.h ? c5561gL3.i | Integer.MIN_VALUE : 0;
        c5561gL3.i = 0;
        c5561gL3.e.o(this.a, this.g, false, i);
    }
}
