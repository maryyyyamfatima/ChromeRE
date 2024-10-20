package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ny0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8182ny0 implements InterfaceC9395rX {
    public final InterfaceC9395rX a;
    public final /* synthetic */ C8525oy0 b;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    public C8182ny0(C8525oy0 c8525oy0, InterfaceC9395rX interfaceC9395rX, String str) {
        this.b = c8525oy0;
        this.a = interfaceC9395rX;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        this.b.a.getClass();
        VY c = this.a.c(obj, abstractC9053qX);
        c.getClass();
        AZ c7838my0 = new C7838my0(this, c);
        if (c7838my0 instanceof VY) {
            return (VY) c7838my0;
        }
        return new C8377oZ(c7838my0);
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return this.a.a();
    }
}
