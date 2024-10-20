package com.google.android.libraries.blocks;

import defpackage.AbstractC4809e90;
import defpackage.C1127Ir1;
import defpackage.C1526Lt1;
import defpackage.C1656Mt1;
import defpackage.C2003Pk3;
import defpackage.C2133Qk3;
import defpackage.C2254Rj;
import defpackage.C5563gM0;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.InterfaceC1377Kp1;
import defpackage.LV1;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.XF0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StatusExceptionFactory {
    private StatusExceptionFactory() {
    }

    public static StatusException fromProto(byte[] bArr) {
        Object a;
        StackTraceElement[] stackTraceElementArr = null;
        try {
            XF0 d = XF0.d();
            C2133Qk3 c2133Qk3 = C2133Qk3.q;
            int length = bArr.length;
            C2133Qk3 c2133Qk32 = new C2133Qk3();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c2133Qk32.getClass());
                    b.f(c2133Qk32, bArr, 0, length + 0, new C2254Rj(d));
                    b.b(c2133Qk32);
                    if (c2133Qk32.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c2133Qk32);
                    String str = c2133Qk32.m.isEmpty() ? "unknown error" : c2133Qk32.m;
                    LV1 lv1 = c2133Qk32.o;
                    if (lv1 == null) {
                        lv1 = LV1.l;
                    }
                    OX0 ox0 = C1526Lt1.p;
                    lv1.getClass();
                    ox0.getClass();
                    lv1.v(ox0);
                    C5563gM0 c5563gM0 = lv1.j;
                    c5563gM0.getClass();
                    NX0 nx0 = ox0.d;
                    nx0.getClass();
                    if (c5563gM0.a.get(nx0) != null) {
                        lv1.v(ox0);
                        Object c = lv1.j.c(nx0);
                        if (c == null) {
                            a = ox0.b;
                        } else {
                            nx0.getClass();
                            a = ox0.a(c);
                        }
                        C1526Lt1 c1526Lt1 = (C1526Lt1) a;
                        if (c1526Lt1.m.size() > 0) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            InterfaceC1377Kp1 interfaceC1377Kp1 = c1526Lt1.m;
                            int size = interfaceC1377Kp1.size();
                            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[size];
                            for (int i = 0; i < interfaceC1377Kp1.size(); i++) {
                                C1656Mt1 c1656Mt1 = (C1656Mt1) interfaceC1377Kp1.get(i);
                                stackTraceElementArr2[i] = new StackTraceElement("_blocks_js_", c1656Mt1.k, c1656Mt1.l, c1656Mt1.m);
                            }
                            StackTraceElement[] stackTraceElementArr3 = (StackTraceElement[]) Arrays.copyOf(stackTraceElementArr2, (stackTrace.length + size) - 1);
                            System.arraycopy(stackTrace, 1, stackTraceElementArr3, size, stackTrace.length - 1);
                            stackTraceElementArr = stackTraceElementArr3;
                        }
                    }
                    return new StatusException(str, stackTraceElementArr);
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                    throw e;
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            return new StatusException(AbstractC4809e90.a("Proto parse failed:", e4.getMessage()), null);
        }
    }

    public static byte[] toProto(Throwable th) {
        C2003Pk3 c2003Pk3 = (C2003Pk3) C2133Qk3.q.j();
        if (c2003Pk3.h) {
            c2003Pk3.l();
            c2003Pk3.h = false;
        }
        C2133Qk3 c2133Qk3 = (C2133Qk3) c2003Pk3.g;
        c2133Qk3.j |= 1;
        c2133Qk3.k = 13;
        if (c2003Pk3.h) {
            c2003Pk3.l();
            c2003Pk3.h = false;
        }
        C2133Qk3 c2133Qk32 = (C2133Qk3) c2003Pk3.g;
        c2133Qk32.j |= 8;
        c2133Qk32.n = 13;
        if (c2003Pk3.h) {
            c2003Pk3.l();
            c2003Pk3.h = false;
        }
        C2133Qk3 c2133Qk33 = (C2133Qk3) c2003Pk3.g;
        c2133Qk33.getClass();
        c2133Qk33.j |= 2;
        c2133Qk33.l = "generic";
        if (th.getMessage() != null) {
            String message = th.getMessage();
            if (c2003Pk3.h) {
                c2003Pk3.l();
                c2003Pk3.h = false;
            }
            C2133Qk3 c2133Qk34 = (C2133Qk3) c2003Pk3.g;
            c2133Qk34.getClass();
            message.getClass();
            c2133Qk34.j |= 4;
            c2133Qk34.m = message;
        } else {
            if (c2003Pk3.h) {
                c2003Pk3.l();
                c2003Pk3.h = false;
            }
            C2133Qk3 c2133Qk35 = (C2133Qk3) c2003Pk3.g;
            c2133Qk35.getClass();
            c2133Qk35.j |= 4;
            c2133Qk35.m = "[message unknown]";
        }
        return ((C2133Qk3) c2003Pk3.j()).toByteArray();
    }
}
