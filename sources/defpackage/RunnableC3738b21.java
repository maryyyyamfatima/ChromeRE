package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b21 */
/* loaded from: classes.dex */
public final class RunnableC3738b21 implements Runnable {
    public final /* synthetic */ C4081c21 a;

    public RunnableC3738b21(C4081c21 c4081c21) {
        this.a = c4081c21;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3129Yc interfaceC3129Yc = this.a.a.g;
        interfaceC3129Yc.a(interfaceC3129Yc.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
