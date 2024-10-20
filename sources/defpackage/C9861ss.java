package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9861ss {
    public static final C9176qs f = new C9176qs();
    public final C9518rs a = new C9518rs(this);
    public final InterfaceC7458ls[] b = new InterfaceC7458ls[18];
    public final Callback[] c = new Callback[18];
    public final boolean[] d = new boolean[18];
    public int e;

    public static boolean b() {
        return UN.d.a();
    }

    public static void c(int i) {
        EI2.h(((Integer) f.get(Integer.valueOf(i))).intValue(), 18, "Android.BackPress.Intercept");
    }

    public final void a(InterfaceC7458ls interfaceC7458ls, final int i) {
        this.b[i] = interfaceC7458ls;
        Callback callback = new Callback() { // from class: ps
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9861ss c9861ss = C9861ss.this;
                InterfaceC7458ls[] interfaceC7458lsArr = c9861ss.b;
                int i2 = i;
                Boolean bool = (Boolean) ((C8385oa2) interfaceC7458lsArr[i2].r()).g;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    boolean[] zArr = c9861ss.d;
                    if (booleanValue == zArr[i2]) {
                        return;
                    }
                    if (bool.booleanValue()) {
                        c9861ss.e++;
                    } else {
                        c9861ss.e--;
                    }
                    zArr[i2] = bool.booleanValue();
                    c9861ss.a.a = c9861ss.e != 0;
                }
            }
        };
        Callback[] callbackArr = this.c;
        callbackArr[i] = callback;
        ((C8385oa2) interfaceC7458ls.r()).m(callbackArr[i]);
    }

    public final void d(int i) {
        InterfaceC7458ls[] interfaceC7458lsArr = this.b;
        InterfaceC7458ls interfaceC7458ls = interfaceC7458lsArr[i];
        Boolean bool = (Boolean) ((C8385oa2) interfaceC7458ls.r()).g;
        if (bool != null && bool.booleanValue()) {
            int i2 = this.e - 1;
            this.e = i2;
            this.d[i] = false;
            this.a.a = i2 != 0;
        }
        InterfaceC7697ma2 r = interfaceC7458ls.r();
        Callback[] callbackArr = this.c;
        ((C8385oa2) r).n(callbackArr[i]);
        callbackArr[i] = null;
        interfaceC7458lsArr[i] = null;
    }
}
