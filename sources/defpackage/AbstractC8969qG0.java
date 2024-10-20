package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8969qG0 implements InterfaceC0079Ap3 {
    public Object a;
    public InterfaceC0079Ap3 g;

    @Override // defpackage.InterfaceC0079Ap3
    public final boolean i() {
        return true;
    }

    public AbstractC8969qG0(InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.g = interfaceC0079Ap3;
    }

    @Override // defpackage.InterfaceC0079Ap3
    public Object get() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.g;
        if (interfaceC0079Ap3 != null) {
            this.a = interfaceC0079Ap3.get();
            this.g = null;
        }
        return this.a;
    }
}
