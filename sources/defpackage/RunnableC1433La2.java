package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: La2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1433La2 implements Runnable {
    public final /* synthetic */ C1562Ma2 a;

    @Override // java.lang.Runnable
    public final void run() {
        C1562Ma2 c1562Ma2 = this.a;
        if (c1562Ma2.o != 1) {
            return;
        }
        if (c1562Ma2.i && c1562Ma2.j == c1562Ma2.h) {
            return;
        }
        boolean z = c1562Ma2.j;
        c1562Ma2.h = z;
        c1562Ma2.i = true;
        c1562Ma2.m.onResult(Boolean.valueOf(z));
    }
}
