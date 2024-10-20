package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ce3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4285ce3 {
    public final Object a = new Object();
    public volatile Object b;

    public final Object a(InterfaceC3942be3 interfaceC3942be3) {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = interfaceC3942be3.get();
                }
            }
        }
        return this.b;
    }
}
