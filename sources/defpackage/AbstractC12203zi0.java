package defpackage;

import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import com.facebook.litho.ComponentTree;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zi0 */
/* loaded from: classes.dex */
public abstract class AbstractC12203zi0 {
    public static final AtomicInteger a = new AtomicInteger();
    public static final XF0 b;
    public static final XF0 c;

    static {
        XF0 xf0 = new XF0();
        xf0.a(C11174wi0.p);
        b = xf0;
        XF0 xf02 = new XF0();
        xf02.a(C6823k10.o);
        xf02.a(C11349xC0.o);
        c = xf02;
    }

    public static String h(UF0 uf0) {
        if (uf0 == null) {
            return null;
        }
        try {
            ByteBuffer j = RP0.j(uf0, 224886694);
            if (j == null) {
                Log.w("Elements", "Failed to get debugger id: PROPERTIES_SERIALIZED_PROTO_BYTES_ID missing");
                return null;
            }
            XF0 xf0 = b;
            DV h = DV.h(j, false);
            C9984tD2 c9984tD2 = C9984tD2.l;
            C9984tD2 c9984tD22 = new C9984tD2();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b2 = c7931nE2.b(c9984tD22.getClass());
                        EV ev = h.d;
                        if (ev == null) {
                            ev = new EV(h);
                        }
                        b2.e(c9984tD22, ev, xf0);
                        b2.b(c9984tD22);
                        QX0.i(c9984tD22);
                        QX0.i(c9984tD22);
                        return i(c9984tD22);
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (C6827k14 e2) {
                        throw e2.a();
                    }
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e3.getCause());
                    }
                    throw e3;
                }
            } catch (IOException e4) {
                if (e4.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e4.getCause());
                }
                throw new C1127Ir1(e4);
            }
        } catch (IOException e5) {
            Log.w("Elements", "Failed to get debugger id: failed to parse PROPERTIES_SERIALIZED_PROTO_BYTES_ID", e5);
            return null;
        }
    }

    public static String i(C9984tD2 c9984tD2) {
        Object a2;
        OX0 ox0 = C11174wi0.p;
        ox0.getClass();
        c9984tD2.v(ox0);
        C5563gM0 c5563gM0 = c9984tD2.j;
        c5563gM0.getClass();
        NX0 nx0 = ox0.d;
        nx0.getClass();
        if (!(c5563gM0.a.get(nx0) != null)) {
            Log.w("Elements", "Failed to get debugger id: DebuggerProperties missing");
            return null;
        }
        c9984tD2.v(ox0);
        Object c2 = c9984tD2.j.c(nx0);
        if (c2 == null) {
            a2 = ox0.b;
        } else {
            nx0.getClass();
            a2 = ox0.a(c2);
        }
        C11174wi0 c11174wi0 = (C11174wi0) a2;
        if (!((c11174wi0.j & 2) != 0)) {
            Log.w("Elements", "Failed to get debugger id: DebuggerProperties.debugger_id missing");
            return null;
        }
        return c11174wi0.l;
    }

    public static C11703yE1 g(View view, String str) {
        if (view instanceof C11703yE1) {
            C11703yE1 c11703yE1 = (C11703yE1) view;
            Object tag = c11703yE1.getTag(R.id.elements_tree_debug_id);
            if (str.equals(!(tag instanceof String) ? null : (String) tag)) {
                return c11703yE1;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C11703yE1 g = g(viewGroup.getChildAt(i), str);
                if (g != null) {
                    return g;
                }
            }
        }
        return null;
    }

    public static C3025Xh0 f(View view, String str) {
        if (view == null) {
            return null;
        }
        if (view instanceof C11703yE1) {
            HashMap hashMap = C3025Xh0.c;
            return e(C3025Xh0.h(((C11703yE1) view).D), str);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C3025Xh0 f = f(viewGroup.getChildAt(i), str);
                if (f != null) {
                    return f;
                }
            }
        }
        return null;
    }

    public static C3025Xh0 e(C3025Xh0 c3025Xh0, String str) {
        View view;
        Object obj;
        if (c3025Xh0 == null) {
            return null;
        }
        if (str.equals(c3025Xh0.e())) {
            return c3025Xh0;
        }
        if (WZ.i0(c3025Xh0.a.t0())) {
            if (c3025Xh0.b == 0) {
                C7849n00 context = c3025Xh0.a.getContext();
                ComponentTree componentTree = context == null ? null : context.l;
                C11703yE1 lithoView = componentTree == null ? null : componentTree.getLithoView();
                C12151zZ1 c12151zZ1 = lithoView == null ? null : lithoView.E;
                if (c12151zZ1 != null) {
                    int p = c12151zZ1.p();
                    for (int i = 0; i < p; i++) {
                        C11122wZ1 o = c12151zZ1.o(i);
                        WZ wz = o == null ? null : o.d.b.j.i;
                        if (wz != null && wz == c3025Xh0.a.t0()) {
                            obj = o.a;
                            break;
                        }
                    }
                }
            }
            obj = null;
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            C3025Xh0 f = f(view, str);
            if (f != null) {
                return f;
            }
        } else {
            Iterator it = c3025Xh0.c().iterator();
            while (it.hasNext()) {
                C3025Xh0 e = e((C3025Xh0) it.next(), str);
                if (e != null) {
                    return e;
                }
            }
        }
        return null;
    }

    public static List a(Class cls, Object obj) {
        if (obj == null) {
            C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
            return OL2.j;
        }
        Field declaredField = cls.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(obj);
        if (obj2 == null) {
            C0172Bi1 c0172Bi12 = AbstractC0562Ei1.g;
            return OL2.j;
        }
        if (obj2 instanceof List) {
            return (List) obj2;
        }
        if (obj2 instanceof View[]) {
            return Arrays.asList((Object[]) obj2);
        }
        C0172Bi1 c0172Bi13 = AbstractC0562Ei1.g;
        return OL2.j;
    }

    public static C4883eN3 c(U80 u80) {
        String str;
        C4540dN3 c4540dN3 = (C4540dN3) C4883eN3.m.j();
        String num = Integer.toString(a.getAndIncrement());
        if (c4540dN3.h) {
            c4540dN3.l();
            c4540dN3.h = false;
        }
        C4883eN3 c4883eN3 = (C4883eN3) c4540dN3.g;
        c4883eN3.getClass();
        num.getClass();
        c4883eN3.j |= 2;
        c4883eN3.l = num;
        String str2 = ((C3184Yn) u80).s;
        C3184Yn c3184Yn = (C3184Yn) u80;
        if (str2 == null || (str = c3184Yn.t) == null) {
            return (C4883eN3) c4540dN3.j();
        }
        C0246Bx0 c0246Bx0 = (C0246Bx0) C0376Cx0.m.j();
        if (c0246Bx0.h) {
            c0246Bx0.l();
            c0246Bx0.h = false;
        }
        C0376Cx0 c0376Cx0 = (C0376Cx0) c0246Bx0.g;
        c0376Cx0.getClass();
        c0376Cx0.j |= 2;
        c0376Cx0.l = str2;
        if (c0246Bx0.h) {
            c0246Bx0.l();
            c0246Bx0.h = false;
        }
        C0376Cx0 c0376Cx02 = (C0376Cx0) c0246Bx0.g;
        c0376Cx02.getClass();
        c0376Cx02.j |= 1;
        c0376Cx02.k = str;
        if (c4540dN3.h) {
            c4540dN3.l();
            c4540dN3.h = false;
        }
        C4883eN3 c4883eN32 = (C4883eN3) c4540dN3.g;
        C0376Cx0 c0376Cx03 = (C0376Cx0) c0246Bx0.j();
        c4883eN32.getClass();
        c0376Cx03.getClass();
        c4883eN32.k = c0376Cx03;
        c4883eN32.j |= 1;
        return (C4883eN3) c4540dN3.j();
    }

    public static C3235Yx0 b(C5427fx0 c5427fx0, C7188l43 c7188l43, byte[] bArr, String str) {
        try {
            ByteBuffer j = RP0.j(c5427fx0.l(), 287553821);
            if (j == null) {
                Log.w("Elements", "Failed to create debugger info: ELEMENT_SERIALIZED_PROTO_BYTES missing");
                return null;
            }
            XF0 d = XF0.d();
            C0896Gx0 c0896Gx0 = C0896Gx0.o;
            DV h = DV.h(j, false);
            C0896Gx0 c0896Gx02 = new C0896Gx0();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b2 = c7931nE2.b(c0896Gx02.getClass());
                        EV ev = h.d;
                        if (ev == null) {
                            ev = new EV(h);
                        }
                        b2.e(c0896Gx02, ev, d);
                        b2.b(c0896Gx02);
                        QX0.i(c0896Gx02);
                        QX0.i(c0896Gx02);
                        C3105Xx0 c3105Xx0 = (C3105Xx0) C3235Yx0.p.j();
                        if (c3105Xx0.h) {
                            c3105Xx0.l();
                            c3105Xx0.h = false;
                        }
                        C3235Yx0 c3235Yx0 = (C3235Yx0) c3105Xx0.g;
                        c3235Yx0.getClass();
                        c3235Yx0.m = c0896Gx02;
                        c3235Yx0.j |= 4;
                        if (c7188l43 != null) {
                            ByteBuffer duplicate = c7188l43.a.duplicate();
                            XF0 d2 = XF0.d();
                            C8199o10 c8199o10 = C8199o10.l;
                            DV h2 = DV.h(duplicate, false);
                            C8199o10 c8199o102 = C8199o10.l;
                            C8199o10 c8199o103 = new C8199o10();
                            try {
                                try {
                                    try {
                                        QW2 b3 = c7931nE2.b(c8199o103.getClass());
                                        EV ev2 = h2.d;
                                        if (ev2 == null) {
                                            ev2 = new EV(h2);
                                        }
                                        b3.e(c8199o103, ev2, d2);
                                        b3.b(c8199o103);
                                        QX0.i(c8199o103);
                                        QX0.i(c8199o103);
                                        if (c3105Xx0.h) {
                                            c3105Xx0.l();
                                            c3105Xx0.h = false;
                                        }
                                        C3235Yx0 c3235Yx02 = (C3235Yx0) c3105Xx0.g;
                                        c3235Yx02.getClass();
                                        c3235Yx02.l = c8199o103;
                                        c3235Yx02.j |= 2;
                                    } catch (C1127Ir1 e) {
                                        if (e.g) {
                                            throw new C1127Ir1(e);
                                        }
                                        throw e;
                                    } catch (C6827k14 e2) {
                                        throw e2.a();
                                    }
                                } catch (IOException e3) {
                                    if (e3.getCause() instanceof C1127Ir1) {
                                        throw ((C1127Ir1) e3.getCause());
                                    }
                                    throw new C1127Ir1(e3);
                                }
                            } catch (RuntimeException e4) {
                                if (e4.getCause() instanceof C1127Ir1) {
                                    throw ((C1127Ir1) e4.getCause());
                                }
                                throw e4;
                            }
                        }
                        if (bArr != null) {
                            XF0 xf0 = c;
                            int length = bArr.length;
                            C6137i10 c6137i10 = C6137i10.l;
                            C6137i10 c6137i102 = new C6137i10();
                            try {
                                try {
                                    try {
                                        QW2 b4 = c7931nE2.b(c6137i102.getClass());
                                        b4.f(c6137i102, bArr, 0, length + 0, new C2254Rj(xf0));
                                        b4.b(c6137i102);
                                        if (c6137i102.a != 0) {
                                            throw new RuntimeException();
                                        }
                                        QX0.i(c6137i102);
                                        if (c3105Xx0.h) {
                                            c3105Xx0.l();
                                            c3105Xx0.h = false;
                                        }
                                        C3235Yx0 c3235Yx03 = (C3235Yx0) c3105Xx0.g;
                                        c3235Yx03.getClass();
                                        c3235Yx03.n = c6137i102;
                                        c3235Yx03.j |= 8;
                                    } catch (IOException e5) {
                                        if (e5.getCause() instanceof C1127Ir1) {
                                            throw ((C1127Ir1) e5.getCause());
                                        }
                                        throw new C1127Ir1(e5);
                                    } catch (C6827k14 e6) {
                                        throw e6.a();
                                    }
                                } catch (C1127Ir1 e7) {
                                    if (e7.g) {
                                        throw new C1127Ir1(e7);
                                    }
                                    throw e7;
                                }
                            } catch (IndexOutOfBoundsException unused) {
                                throw C1127Ir1.h();
                            }
                        }
                        if (str != null) {
                            if (c3105Xx0.h) {
                                c3105Xx0.l();
                                c3105Xx0.h = false;
                            }
                            C3235Yx0 c3235Yx04 = (C3235Yx0) c3105Xx0.g;
                            c3235Yx04.getClass();
                            c3235Yx04.j |= 1;
                            c3235Yx04.k = str;
                        }
                        return (C3235Yx0) c3105Xx0.j();
                    } catch (IOException e8) {
                        if (e8.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e8.getCause());
                        }
                        throw new C1127Ir1(e8);
                    } catch (RuntimeException e9) {
                        if (e9.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e9.getCause());
                        }
                        throw e9;
                    }
                } catch (C6827k14 e10) {
                    throw e10.a();
                }
            } catch (C1127Ir1 e11) {
                if (e11.g) {
                    throw new C1127Ir1(e11);
                }
                throw e11;
            }
        } catch (IOException e12) {
            Log.w("Elements", "Failed to create debugger info: failed to parse ELEMENT_SERIALIZED_PROTO_BYTES", e12);
            return null;
        }
    }

    public static C11064wN3 d() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        int i = ((int) (currentTimeMillis % 1000)) * 1000000;
        C10378uN3 c10378uN3 = (C10378uN3) C11064wN3.l.j();
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).j = j;
        if (c10378uN3.h) {
            c10378uN3.l();
            c10378uN3.h = false;
        }
        ((C11064wN3) c10378uN3.g).k = i;
        return (C11064wN3) c10378uN3.j();
    }

    public static void k(View view, InterfaceC11989z40 interfaceC11989z40) {
        if (view == null) {
            return;
        }
        if (view instanceof C11703yE1) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            HashMap hashMap = C3025Xh0.c;
            j(C3025Xh0.h(((C11703yE1) view).D), interfaceC11989z40, iArr);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                k(viewGroup.getChildAt(i), interfaceC11989z40);
            }
        }
    }

    public static void j(C3025Xh0 c3025Xh0, InterfaceC11989z40 interfaceC11989z40, int[] iArr) {
        if (c3025Xh0 == null) {
            return;
        }
        interfaceC11989z40.accept(Pair.create(iArr, c3025Xh0));
        Iterator it = c3025Xh0.c().iterator();
        while (it.hasNext()) {
            j((C3025Xh0) it.next(), interfaceC11989z40, iArr);
        }
    }
}
