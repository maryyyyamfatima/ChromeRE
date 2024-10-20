package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yz3 */
/* loaded from: classes.dex */
public final class C3248Yz3 extends AbstractC1649Ms {
    public final /* synthetic */ Boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ MF3 j;
    public final /* synthetic */ C9284rA3 k;

    public C3248Yz3(C9284rA3 c9284rA3, Boolean bool, int i, MF3 mf3) {
        this.k = c9284rA3;
        this.h = bool;
        this.i = i;
        this.j = mf3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        MF3 mf3 = this.j;
        C9284rA3 c9284rA3 = this.k;
        int i = this.i;
        Boolean bool = this.h;
        if (bool == null) {
            c9284rA3.getClass();
            C3378Zz3 c3378Zz3 = new C3378Zz3(c9284rA3, i);
            c3378Zz3.d(mf3);
            c9284rA3.x = c3378Zz3;
        } else {
            boolean booleanValue = bool.booleanValue();
            C1436Lb0 c1436Lb0 = C1695Nb0.B;
            EnumC6773js2 a = EnumC6773js2.a(C1695Nb0.class, booleanValue);
            C6844k43 c6844k43 = (C6844k43) a.b().c(i, a.a);
            if (!(c6844k43 == null)) {
                return c6844k43;
            }
            c9284rA3.getClass();
            C3378Zz3 c3378Zz32 = new C3378Zz3(c9284rA3, i);
            c3378Zz32.d(mf3);
            c9284rA3.x = c3378Zz32;
        }
        return null;
    }
}
