package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iU3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6294iU3 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final C5262fU3 b = new C5262fU3();
    public static final ArrayDeque c = new ArrayDeque();
    public static final ArrayDeque d = new ArrayDeque();
    public static final Object e = new Object();

    public static void c(LT3 lt3) {
        C5950hU3 c5950hU3 = (C5950hU3) b.get();
        LT3 lt32 = c5950hU3.b;
        String str = ((B0) lt3).g;
        B0 b0 = (B0) lt32;
        String str2 = b0.g;
        i(c5950hU3, b0.a);
    }

    static {
        new Runnable() { // from class: eU3
            @Override // java.lang.Runnable
            public final void run() {
                Object remove = AbstractC6294iU3.c.remove();
                Object obj = AbstractC6294iU3.e;
                ArrayDeque arrayDeque = AbstractC6294iU3.d;
                if (remove == obj) {
                    arrayDeque.pop();
                } else {
                    arrayDeque.push((LT3) remove);
                }
            }
        };
    }

    public static RunnableC9793sg3 a(String str, boolean z) {
        FX1 U0;
        C10822vg3 c10822vg3 = C10822vg3.d;
        LT3 lt3 = ((C5950hU3) b.get()).b;
        if (lt3 == null) {
            U0 = new FX1(str, z);
        } else if (lt3 instanceof InterfaceC4143cD0) {
            U0 = ((InterfaceC4143cD0) lt3).d(str, z);
        } else {
            U0 = lt3.U0(str);
        }
        h(U0);
        return new RunnableC9793sg3(U0);
    }

    public static LT3 g() {
        LT3 lt3 = ((C5950hU3) b.get()).b;
        return lt3 == null ? new EX1() : lt3;
    }

    public static LT3 h(LT3 lt3) {
        return i((C5950hU3) b.get(), lt3);
    }

    public static LT3 i(C5950hU3 c5950hU3, LT3 lt3) {
        boolean equals;
        LT3 lt32 = c5950hU3.b;
        if (lt32 == lt3) {
            return lt3;
        }
        if (lt32 == null) {
            if (Build.VERSION.SDK_INT < 29) {
                String str = "false";
                try {
                    str = (String) AbstractC0884Gu3.a.invoke(null, "tiktok_systrace", "false");
                } catch (Exception e2) {
                    Log.e("SystemProperties", "get error", e2);
                }
                equals = "true".equals(str);
            } else {
                equals = AbstractC5606gU3.a();
            }
            c5950hU3.a = equals;
        }
        if (c5950hU3.a) {
            j(lt32, lt3);
        }
        if (lt3 != null) {
            lt3.w();
        }
        if (lt32 != null) {
            lt32.w();
        }
        c5950hU3.b = lt3;
        return lt32;
    }

    private static void j(LT3 lt3, LT3 lt32) {
        if (lt3 != null) {
            if (lt32 != null) {
                if (((B0) lt3).a == lt32) {
                    Trace.endSection();
                    return;
                }
                B0 b0 = (B0) lt32;
                if (lt3 == b0.a) {
                    b(b0.g);
                    return;
                }
            }
            e(lt3);
        }
        if (lt32 != null) {
            d(lt32);
        }
    }

    private static void b(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    private static void d(LT3 lt3) {
        if (((B0) lt3).a != null) {
            d(((B0) lt3).a);
        }
        b(((B0) lt3).g);
    }

    private static void e(LT3 lt3) {
        Trace.endSection();
        if (((B0) lt3).a != null) {
            e(((B0) lt3).a);
        }
    }

    public static C10136tg3 f(C10479ug3 c10479ug3) {
        C10136tg3 a2 = C10136tg3.a(2);
        for (LT3 lt3 = ((C5950hU3) b.get()).b; lt3 != null; lt3 = ((B0) lt3).a) {
            a2 = lt3.J(c10479ug3);
            a2.getClass();
            if (AbstractC2373Sg3.b(a2.a) == 0) {
                break;
            }
        }
        return a2;
    }
}
