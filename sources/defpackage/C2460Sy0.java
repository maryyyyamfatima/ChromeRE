package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sy0 */
/* loaded from: classes.dex */
public final class C2460Sy0 extends FrameLayout {
    public final C11703yE1 a;
    public final C3998bo g;
    public byte[] h;
    public C2590Ty0 i;
    public H10 j;
    public boolean k;

    public C2460Sy0(Context context, C3998bo c3998bo) {
        super(context);
        this.g = c3998bo;
        C11703yE1 c11703yE1 = new C11703yE1(context);
        this.a = c11703yE1;
        addView(c11703yE1, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a();
        super.onAttachedToWindow();
        this.k = true;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.k = false;
        a();
        super.onDetachedFromWindow();
    }

    public final void b() {
        final byte[] bArr = this.h;
        if (!this.k || bArr == null) {
            return;
        }
        C11703yE1 c11703yE1 = this.a;
        c11703yE1.N = null;
        final H10 h10 = new H10();
        this.j = h10;
        C3998bo c3998bo = this.g;
        InterfaceC1286Jx0 interfaceC1286Jx0 = c3998bo.d;
        int b = interfaceC1286Jx0.b();
        InterfaceC11372xG3 c = interfaceC1286Jx0.c(b);
        C5277fX3 c5277fX3 = new C5277fX3();
        c5277fX3.b(C1156Ix0.class, new C1156Ix0(String.valueOf(b)));
        C2590Ty0 c2590Ty0 = this.i;
        if (c2590Ty0 != null) {
            c5277fX3.b(C2590Ty0.class, c2590Ty0);
        }
        C7849n00 c7849n00 = new C7849n00(getContext(), c3998bo.c, new C5524gE1(interfaceC1286Jx0.a()), c5277fX3);
        int i = C2981Wy1.F;
        C2721Uy1 c2721Uy1 = new C2721Uy1();
        C2981Wy1 c2981Wy1 = new C2981Wy1();
        c2721Uy1.m(c7849n00, 0, 0, c2981Wy1);
        c2721Uy1.i = c2981Wy1;
        c2721Uy1.k.clear();
        C3054Xn a = U80.a();
        a.u = c3998bo;
        a.a = c11703yE1;
        a.d = c;
        c2721Uy1.x(a.a());
        c2721Uy1.w(new InterfaceC7161l00() { // from class: Ry0
            @Override // defpackage.InterfaceC7161l00
            public final WZ a(C7849n00 c7849n002, U80 u80) {
                return ((C10049tQ2) ((InterfaceC8520ox0) C2460Sy0.this.g.a.get())).d(c7849n002, u80, bArr, h10);
            }
        });
        TZ.e(1, c2721Uy1.k, c2721Uy1.j);
        F00 f = ComponentTree.f(c2721Uy1.i, c7849n00);
        f.e = c3998bo.e;
        ExecutorC4027bs4 executorC4027bs4 = c3998bo.b;
        if (executorC4027bs4 != null) {
            f.h = new C6898kE1(executorC4027bs4);
        }
        c11703yE1.H(f.a());
    }

    public final void a() {
        H10 h10 = this.j;
        if (h10 != null) {
            h10.dispose();
            this.j = null;
        }
        C11703yE1 c11703yE1 = this.a;
        c11703yE1.K();
        ComponentTree componentTree = c11703yE1.D;
        if (componentTree != null) {
            componentTree.s();
            c11703yE1.H(null);
        }
        c11703yE1.N = null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("ElementsView does not support addView");
    }

    @Override // android.view.View
    public final void setAccessibilityLiveRegion(int i) {
        this.a.setAccessibilityLiveRegion(i);
    }
}
