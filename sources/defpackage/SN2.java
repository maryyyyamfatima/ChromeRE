package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SN2 implements Runnable {
    public final /* synthetic */ InterfaceC11989z40 a;
    public final /* synthetic */ Object g;

    public SN2(InterfaceC11989z40 interfaceC11989z40, Object obj) {
        this.a = interfaceC11989z40;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.g);
    }
}
