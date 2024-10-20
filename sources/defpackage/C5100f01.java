package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5100f01 implements InterfaceC5444g01 {
    public volatile Object a;
    public final /* synthetic */ InterfaceC5444g01 b;

    public C5100f01(InterfaceC5444g01 interfaceC5444g01) {
        this.b = interfaceC5444g01;
    }

    @Override // defpackage.InterfaceC5444g01
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.get();
                    AbstractC6464iy2.b(obj);
                    this.a = obj;
                }
            }
        }
        return this.a;
    }
}
