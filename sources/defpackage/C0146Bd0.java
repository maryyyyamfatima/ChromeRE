package defpackage;

import android.app.Activity;
import java.util.Objects;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bd0 */
/* loaded from: classes.dex */
public final class C0146Bd0 implements InterfaceC11941yv3 {
    public final Activity a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;
    public final IC h;
    public final C4502dG0 i;
    public final C7851n02 j;
    public final B84 k;
    public final InterfaceC7968nM l;
    public final JC m;
    public final ZU0 n;
    public final InterfaceC10912vv3 o;
    public final InterfaceC0079Ap3 p;
    public final InterfaceC0079Ap3 q;
    public final InterfaceC0079Ap3 r;
    public final InterfaceC3241Yy1 s;
    public final InterfaceC0079Ap3 t;
    public C0016Ad0 u;
    public C5877hG0 v;
    public final InterfaceC3241Yy1 w;

    @Override // defpackage.InterfaceC11941yv3
    public final InterfaceC5451g12 a(String str, InterfaceC5451g12 interfaceC5451g12, Tab tab) {
        return null;
    }

    public C0146Bd0(Activity activity, boolean z, boolean z2, String str, int i, boolean z3, C8744pd0 c8744pd0, C4502dG0 c4502dG0, C7851n02 c7851n02, B84 b84, InterfaceC3241Yy1 interfaceC3241Yy1, InterfaceC7968nM interfaceC7968nM, JC jc, ZU0 zu0, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0079Ap3 interfaceC0079Ap33, InterfaceC3241Yy1 interfaceC3241Yy12, InterfaceC0079Ap3 interfaceC0079Ap34, int i2) {
        this.a = activity;
        this.b = z;
        this.c = z2;
        this.e = str;
        this.f = i;
        this.g = z3;
        this.h = c8744pd0;
        this.i = c4502dG0;
        this.j = c7851n02;
        this.k = b84;
        this.w = interfaceC3241Yy1;
        this.l = interfaceC7968nM;
        this.m = jc;
        this.n = zu0;
        this.o = interfaceC10912vv3;
        this.p = interfaceC0079Ap3;
        this.q = interfaceC0079Ap32;
        this.r = interfaceC0079Ap33;
        this.s = interfaceC3241Yy12;
        this.t = interfaceC0079Ap34;
        this.d = i2;
    }

    @Override // defpackage.InterfaceC11941yv3
    public final IC c(TabImpl tabImpl) {
        C11830yd0 c11830yd0 = new C11830yd0(this, tabImpl);
        IC ic = this.h;
        return ic == null ? c11830yd0 : new G10(c11830yd0, ic);
    }

    @Override // defpackage.InterfaceC11941yv3
    public final AbstractC10328uD3 e(Tab tab) {
        C0016Ad0 c0016Ad0 = new C0016Ad0(tab, this.a, this.d, this.e, this.f, this.j, this.g, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        this.u = c0016Ad0;
        return c0016Ad0;
    }

    @Override // defpackage.InterfaceC11941yv3
    public final C12055zG0 d(TabImpl tabImpl) {
        if (this.c) {
            this.v = new C5877hG0(tabImpl);
        } else {
            this.v = new C12173zd0(tabImpl, this.i, this.k);
        }
        return new C12055zG0(this.v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [wd0] */
    @Override // defpackage.InterfaceC11941yv3
    public final ContextMenuPopulatorFactory b(Tab tab) {
        C2049Pu c2049Pu;
        int i = this.d;
        int i2 = i == 3 || i == 4 ? 2 : 1;
        InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) this.p.get();
        tab.isIncognito();
        if (true ^ SysUtils.isLowEndDevice()) {
            final InterfaceC3241Yy1 interfaceC3241Yy1 = this.w;
            Objects.requireNonNull(interfaceC3241Yy1);
            c2049Pu = new InterfaceC0079Ap3() { // from class: wd0
                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return (GC0) InterfaceC3241Yy1.this.get();
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }
            };
        } else {
            c2049Pu = new C2049Pu();
        }
        return new HN(new C7136kv3(tab, interfaceC10590uz3, c2049Pu, new RunnableC12082zL2(), new InterfaceC0079Ap3() { // from class: xd0
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return (ViewOnClickListenerC1069If3) C0146Bd0.this.s.get();
            }
        }), this.t, i2, C4502dG0.b);
    }
}
