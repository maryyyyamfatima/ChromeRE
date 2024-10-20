package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ti0 */
/* loaded from: classes.dex */
public final class C10145ti0 extends AbstractC9896sy0 {
    public final InterfaceC9989tE2 a;

    public C10145ti0(C0806Gf0 c0806Gf0) {
        this.a = c0806Gf0;
    }

    @Override // defpackage.AbstractC9896sy0
    public final void d(EnumC11438xU enumC11438xU, String str, U80 u80, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        C10378uN3 c10378uN3 = (C10378uN3) C11064wN3.l.j();
        long j = currentTimeMillis / 1000;
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).j = j;
        int i = (int) ((currentTimeMillis % 1000) * 1000000);
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).k = i;
        C11064wN3 c11064wN3 = (C11064wN3) c10378uN3.j();
        int i2 = enumC11438xU == EnumC11438xU.s ? 3 : 4;
        CH1 ch1 = (CH1) DH1.q.j();
        if (ch1.h) {
            ch1.l();
            ch1.h = false;
        }
        DH1 dh1 = (DH1) ch1.g;
        dh1.getClass();
        dh1.m = AbstractC2373Sg3.b(i2);
        dh1.j |= 4;
        String name = enumC11438xU.name();
        if (ch1.h) {
            ch1.l();
            ch1.h = false;
        }
        DH1 dh12 = (DH1) ch1.g;
        dh12.getClass();
        name.getClass();
        dh12.j |= 8;
        dh12.n = name;
        if (ch1.h) {
            ch1.l();
            ch1.h = false;
        }
        DH1 dh13 = (DH1) ch1.g;
        dh13.getClass();
        str.getClass();
        dh13.j |= 1;
        dh13.k = str;
        if (ch1.h) {
            ch1.l();
            ch1.h = false;
        }
        DH1 dh14 = (DH1) ch1.g;
        dh14.getClass();
        c11064wN3.getClass();
        dh14.l = c11064wN3;
        dh14.j |= 2;
        if (th != null) {
            String a = AbstractC8192o0.a(str, "\n", String.valueOf(th));
            if (ch1.h) {
                ch1.l();
                ch1.h = false;
            }
            DH1 dh15 = (DH1) ch1.g;
            dh15.getClass();
            a.getClass();
            dh15.j |= 1;
            dh15.k = a;
            FH1 fh1 = (FH1) GH1.k.j();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                C12061zH1 c12061zH1 = (C12061zH1) AH1.n.j();
                String a2 = AbstractC8192o0.a(stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName());
                if (c12061zH1.h) {
                    c12061zH1.l();
                    c12061zH1.h = false;
                }
                AH1 ah1 = (AH1) c12061zH1.g;
                ah1.getClass();
                a2.getClass();
                ah1.j |= 1;
                ah1.k = a2;
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber >= 0) {
                    long j2 = lineNumber;
                    if (c12061zH1.h) {
                        c12061zH1.l();
                        c12061zH1.h = false;
                    }
                    AH1 ah12 = (AH1) c12061zH1.g;
                    ah12.j |= 4;
                    ah12.m = j2;
                }
                String fileName = stackTraceElement.getFileName();
                if (fileName != null) {
                    if (c12061zH1.h) {
                        c12061zH1.l();
                        c12061zH1.h = false;
                    }
                    AH1 ah13 = (AH1) c12061zH1.g;
                    ah13.getClass();
                    ah13.j |= 2;
                    ah13.l = fileName;
                }
                AH1 ah14 = (AH1) c12061zH1.j();
                if (fh1.h) {
                    fh1.l();
                    fh1.h = false;
                }
                GH1 gh1 = (GH1) fh1.g;
                gh1.getClass();
                ah14.getClass();
                InterfaceC1377Kp1 interfaceC1377Kp1 = gh1.j;
                if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                    gh1.j = QX0.r(interfaceC1377Kp1);
                }
                gh1.j.add(ah14);
            }
            GH1 gh12 = (GH1) fh1.j();
            if (ch1.h) {
                ch1.l();
                ch1.h = false;
            }
            DH1 dh16 = (DH1) ch1.g;
            dh16.getClass();
            gh12.getClass();
            dh16.p = gh12;
            dh16.j |= 16;
        }
        ((DebuggerClient) this.a.get()).sendLog(((DH1) ch1.j()).toByteArray());
        if (th == null || th.getCause() == null) {
            return;
        }
        d(enumC11438xU, "Caused by:", u80, th.getCause());
    }
}
