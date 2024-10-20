package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gc3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5648gc3 extends AbstractC10743vS0 implements PK2 {
    public final AbstractC5519gD1 g;
    public final InterfaceC5992hc3 h;
    public final C4960ec3 i;

    @Override // defpackage.PK2
    public /* bridge */ /* synthetic */ void g(Object obj) {
    }

    @Override // defpackage.PK2
    public final int a() {
        return this.g.size();
    }

    public C5648gc3(C5175fD1 c5175fD1, InterfaceC5992hc3 interfaceC5992hc3, InterfaceC5304fc3 interfaceC5304fc3) {
        C4960ec3 c4960ec3 = new C4960ec3(interfaceC5304fc3);
        this.h = interfaceC5992hc3;
        this.i = c4960ec3;
        this.g = c5175fD1;
        c5175fD1.l(this);
    }

    @Override // defpackage.PK2
    public final int getItemViewType(int i) {
        InterfaceC5992hc3 interfaceC5992hc3 = this.h;
        if (interfaceC5992hc3 == null) {
            return 0;
        }
        return interfaceC5992hc3.a(this.g.get(i));
    }

    @Override // defpackage.PK2
    public final void b(Object obj, int i, Object obj2) {
        Object obj3 = this.g.get(i);
        C4960ec3 c4960ec3 = this.i;
        c4960ec3.getClass();
        c4960ec3.a.a(obj, obj3);
    }
}
