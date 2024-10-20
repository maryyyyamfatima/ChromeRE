package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: os2 */
/* loaded from: classes.dex */
public final class C8493os2 extends AbstractC4712ds3 implements AV0 {
    public final /* synthetic */ C8836ps2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8493os2(C8836ps2 c8836ps2, InterfaceC8927q80 interfaceC8927q80) {
        super(interfaceC8927q80);
        this.j = c8836ps2;
    }

    @Override // defpackage.AV0
    public final Object c(Object obj, Object obj2) {
        C8493os2 c8493os2 = (C8493os2) e((P90) obj, (InterfaceC8927q80) obj2);
        C8546p14 c8546p14 = C8546p14.a;
        c8493os2.g(c8546p14);
        return c8546p14;
    }

    @Override // defpackage.AbstractC11245wu
    public final InterfaceC8927q80 e(Object obj, InterfaceC8927q80 interfaceC8927q80) {
        return new C8493os2(this.j, interfaceC8927q80);
    }

    @Override // defpackage.AbstractC11245wu
    public final Object g(Object obj) {
        SP2.b(obj);
        C6492j31 c6492j31 = C8836ps2.i;
        C8836ps2 c8836ps2 = this.j;
        synchronized (c8836ps2.g) {
            if (c8836ps2.h == null) {
                c8836ps2.h = c8836ps2.f.a(c8836ps2.c, c8836ps2.a);
            }
        }
        return C8546p14.a;
    }
}
