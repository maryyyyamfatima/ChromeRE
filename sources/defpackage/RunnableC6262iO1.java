package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iO1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC6262iO1 implements Runnable {
    public final /* synthetic */ C6604jO1 a;

    public RunnableC6262iO1(C6604jO1 c6604jO1) {
        this.a = c6604jO1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6604jO1 c6604jO1 = this.a;
        C7980nO1 c7980nO1 = c6604jO1.d;
        if (c7980nO1 != null) {
            c6604jO1.a(c7980nO1);
            c6604jO1.d = null;
        } else {
            c6604jO1.c = null;
        }
    }
}
