package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3054Xn {
    public View a;
    public final Integer b;
    public final Integer c;
    public InterfaceC11372xG3 d;
    public InterfaceC7103kq0 e;
    public float f;
    public final CK2 g;
    public boolean h;
    public boolean i;
    public final MJ2 j;
    public StringBuilder k;
    public String l;
    public String m;
    public WeakReference n;
    public WeakReference o;
    public final AbstractC0562Ei1 p;
    public AbstractC5771gx0 q;
    public String r;
    public String s;
    public boolean t;
    public C3998bo u;
    public boolean v;
    public int w;
    public AtomicReference x;
    public byte y;

    public C3054Xn() {
    }

    public C3054Xn(U80 u80) {
        C3184Yn c3184Yn = (C3184Yn) u80;
        this.a = c3184Yn.b;
        this.b = c3184Yn.c;
        this.c = c3184Yn.d;
        this.d = c3184Yn.e;
        this.e = c3184Yn.f;
        this.f = c3184Yn.g;
        this.g = c3184Yn.h;
        this.h = c3184Yn.i;
        this.i = c3184Yn.j;
        this.j = c3184Yn.k;
        this.k = c3184Yn.l;
        this.l = c3184Yn.m;
        this.m = c3184Yn.n;
        this.n = c3184Yn.o;
        this.o = c3184Yn.p;
        this.p = c3184Yn.q;
        this.q = c3184Yn.r;
        this.r = c3184Yn.s;
        this.s = c3184Yn.t;
        this.t = c3184Yn.u;
        this.u = c3184Yn.v;
        this.v = c3184Yn.w;
        this.w = c3184Yn.x;
        this.x = c3184Yn.y;
        this.y = (byte) 63;
    }

    public final C3184Yn a() {
        if (this.y != 63 || this.l == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.y & 1) == 0) {
                sb.append(" imagePrefetchRangeRatio");
            }
            if ((this.y & 2) == 0) {
                sb.append(" useIncrementalMountOnChildrenInternal");
            }
            if ((this.y & 4) == 0) {
                sb.append(" useLegacyVisibleInternal");
            }
            if (this.l == null) {
                sb.append(" elementId");
            }
            if (this.m == null) {
                sb.append(" identifierProperty");
            }
            if ((this.y & 8) == 0) {
                sb.append(" shouldAddDebuggerViewTags");
            }
            if ((this.y & 16) == 0) {
                sb.append(" couldOverlapWithElementsConfig");
            }
            if ((this.y & 32) == 0) {
                sb.append(" elementDepthInTree");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C3184Yn(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x);
    }
}
