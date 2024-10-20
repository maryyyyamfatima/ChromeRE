package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ft0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0746Ft0 implements Runnable {
    public final /* synthetic */ AbstractC1136It0 a;

    public RunnableC0746Ft0(C2214Rb c2214Rb) {
        this.a = c2214Rb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1136It0 abstractC1136It0 = this.a;
        abstractC1136It0.a(true);
        abstractC1136It0.invalidateSelf();
    }
}
