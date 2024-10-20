package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fO2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5231fO2 implements InterfaceC5467g40 {
    public final C9696sO2 a;
    public final /* synthetic */ ComponentCallbacks2C5575gO2 b;

    public C5231fO2(ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2, C9696sO2 c9696sO2) {
        this.b = componentCallbacks2C5575gO2;
        this.a = c9696sO2;
    }

    @Override // defpackage.InterfaceC5467g40
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                this.a.b();
            }
        }
    }
}
