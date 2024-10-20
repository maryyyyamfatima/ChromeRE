package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Tr4 {
    public static final GW1 c = new GW1("xuikit_metadata", Sr4.class, false, false);
    public final AbstractC9095qe2 a;
    public final AbstractC9095qe2 b;

    public Tr4(AbstractC9095qe2 abstractC9095qe2, AbstractC9095qe2 abstractC9095qe22) {
        this.a = abstractC9095qe2;
        this.b = abstractC9095qe22;
    }

    public final Sr4 a() {
        Rr4 rr4 = (Rr4) Sr4.p.j();
        AbstractC0087Ar1.d(rr4, "newBuilder()");
        EnumC6432is4 enumC6432is4 = (EnumC6432is4) this.a.e();
        if (enumC6432is4 != null) {
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr4 = (Sr4) rr4.g;
            sr4.getClass();
            sr4.l = enumC6432is4.a;
            sr4.j |= 2;
        }
        if (((C7261lI0) this.b.e()) != null) {
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr42 = (Sr4) rr4.g;
            sr42.j |= 4;
            sr42.m = 0;
        }
        QX0 j = rr4.j();
        AbstractC0087Ar1.d(j, "_builder.build()");
        return (Sr4) j;
    }
}
