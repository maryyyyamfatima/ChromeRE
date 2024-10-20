package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F00 {
    public final C7849n00 a;
    public WZ d;
    public InterfaceC6554jE1 h;
    public InterfaceC6554jE1 i;
    public C7070kk3 j;
    public J00 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final C11866yj0 p;
    public boolean q;
    public boolean r;
    public String s;
    public C5524gE1 t;
    public boolean b = true;
    public int c = 0;
    public boolean e = true;
    public boolean f = false;
    public boolean g = true;
    public boolean k = false;

    public F00(C7849n00 c7849n00) {
        boolean z = B10.a;
        this.o = false;
        this.p = C11866yj0.i;
        this.q = false;
        this.r = false;
        this.a = c7849n00;
    }

    public final ComponentTree a() {
        if (this.d == null) {
            this.d = C10054tR2.w0(this.a).i;
        }
        if (this.t != null && this.s == null) {
            this.s = this.d.c0();
        }
        return new ComponentTree(this);
    }
}
