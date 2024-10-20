package defpackage;

import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Kr4 extends AbstractC9896sy0 {
    public static final C6492j31 b = C6492j31.j();
    public final Tr4 a;

    public Kr4(Tr4 tr4) {
        AbstractC0087Ar1.e(tr4, "logMetadataFactory");
        this.a = tr4;
    }

    @Override // defpackage.AbstractC9896sy0
    public final void d(EnumC11438xU enumC11438xU, String str, U80 u80, Throwable th) {
        Level level;
        AbstractC0087Ar1.e(str, "message");
        AbstractC0087Ar1.e(u80, "conversionContext");
        Tr4 tr4 = this.a;
        tr4.getClass();
        Rr4 rr4 = (Rr4) Sr4.p.j();
        AbstractC0087Ar1.d(rr4, "newBuilder()");
        if (rr4.h) {
            rr4.l();
            rr4.h = false;
        }
        Sr4 sr4 = (Sr4) rr4.g;
        sr4.getClass();
        sr4.k = enumC11438xU.a;
        sr4.j |= 1;
        EnumC6432is4 enumC6432is4 = (EnumC6432is4) tr4.a.e();
        if (enumC6432is4 != null) {
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr42 = (Sr4) rr4.g;
            sr42.getClass();
            sr42.l = enumC6432is4.a;
            sr42.j |= 2;
        }
        if (((C7261lI0) tr4.b.e()) != null) {
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr43 = (Sr4) rr4.g;
            sr43.j |= 4;
            sr43.m = 0;
        }
        QX0 j = rr4.j();
        AbstractC0087Ar1.d(j, "_builder.build()");
        Sr4 a = Ur4.a((Sr4) j, u80);
        int ordinal = enumC11438xU.ordinal();
        char c = ordinal != 11 ? ordinal != 12 ? (char) 6 : (char) 5 : (char) 4;
        if (c == 2) {
            level = Level.FINE;
        } else if (c == 3) {
            level = Level.CONFIG;
        } else if (c == 4) {
            level = Level.INFO;
        } else if (c == 5) {
            level = Level.WARNING;
        } else if (c == 6) {
            level = Level.SEVERE;
        } else {
            level = Level.OFF;
        }
        InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) ((InterfaceC5462g31) b.a(level).f(th)).l(Tr4.c, a);
        C7664mU c7664mU = new C7664mU(enumC11438xU.name());
        EnumC6432is4 b2 = EnumC6432is4.b(a.l);
        if (b2 == null) {
            b2 = EnumC6432is4.g;
        }
        AbstractC6690je3.b(interfaceC5462g31, "com/google/android/libraries/search/rendering/xuikit/runtime/logging/XUiKitFloggerElementsErrorLogger", "logInternal", 45, "XUiKitFloggerElementsErrorLogger.kt").k(c7664mU, str, new C7664mU(Integer.valueOf(b2.a)), new C7664mU(Integer.valueOf(a.m)), new C7664mU(Integer.valueOf(a.o)), new C7664mU(a.n));
    }
}
