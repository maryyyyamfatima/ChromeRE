package defpackage;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rf */
/* loaded from: classes.dex */
public final class C9440rf implements InterfaceC5816h5 {
    public final InterfaceC5816h5 a;
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef b;

    public C9440rf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef, C0859Gp3 c0859Gp3) {
        this.b = layoutInflaterFactory2C0545Ef;
        this.a = c0859Gp3;
    }

    @Override // defpackage.InterfaceC5816h5
    public final boolean c(AbstractC6160i5 abstractC6160i5, BS1 bs1) {
        return this.a.c(abstractC6160i5, bs1);
    }

    @Override // defpackage.InterfaceC5816h5
    public final boolean d(AbstractC6160i5 abstractC6160i5, BS1 bs1) {
        ViewGroup viewGroup = this.b.A;
        WeakHashMap weakHashMap = Ec4.a;
        viewGroup.requestApplyInsets();
        return this.a.d(abstractC6160i5, bs1);
    }

    @Override // defpackage.InterfaceC5816h5
    public final boolean a(AbstractC6160i5 abstractC6160i5, MenuItem menuItem) {
        return this.a.a(abstractC6160i5, menuItem);
    }

    @Override // defpackage.InterfaceC5816h5
    public final void b(AbstractC6160i5 abstractC6160i5) {
        this.a.b(abstractC6160i5);
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.b;
        if (layoutInflaterFactory2C0545Ef.v != null) {
            layoutInflaterFactory2C0545Ef.k.getDecorView().removeCallbacks(layoutInflaterFactory2C0545Ef.w);
        }
        if (layoutInflaterFactory2C0545Ef.u != null) {
            C6349ie4 c6349ie4 = layoutInflaterFactory2C0545Ef.x;
            if (c6349ie4 != null) {
                c6349ie4.b();
            }
            C6349ie4 a = Ec4.a(layoutInflaterFactory2C0545Ef.u);
            a.a(0.0f);
            layoutInflaterFactory2C0545Ef.x = a;
            a.d(new C9098qf(this));
        }
        InterfaceC4631df interfaceC4631df = layoutInflaterFactory2C0545Ef.m;
        if (interfaceC4631df != null) {
            interfaceC4631df.J();
        }
        layoutInflaterFactory2C0545Ef.t = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0545Ef.A;
        WeakHashMap weakHashMap = Ec4.a;
        viewGroup.requestApplyInsets();
    }
}
