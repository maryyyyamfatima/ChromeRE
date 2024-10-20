package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iD1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6207iD1 implements InterfaceC7581mD1 {
    public final Object a;
    public final InterfaceC7925nD1 g;
    public final InterfaceC5863hD1 h;

    @Override // defpackage.InterfaceC7581mD1
    public final /* synthetic */ void f(int i, int i2) {
    }

    public C6207iD1(AbstractC5519gD1 abstractC5519gD1, Object obj, InterfaceC5863hD1 interfaceC5863hD1) {
        this.g = abstractC5519gD1;
        this.a = obj;
        this.h = interfaceC5863hD1;
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void m(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2) {
        this.h.a(this.g, this.a, i, i2);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void k(int i, int i2) {
        this.h.b(this.g, this.a, i, i2);
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void p(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2, Object obj) {
        this.h.c(this.g, i, this.a, obj, i2);
    }
}
