package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Al3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0059Al3 implements GC, View.OnLayoutChangeListener {
    public PropertyModel a;
    public final JC g;
    public final HashSet h = new HashSet();
    public final InterfaceC0079Ap3 i;
    public RunnableC8795pl3 j;
    public Runnable k;
    public Runnable l;
    public final InterfaceC0079Ap3 m;
    public Callback n;
    public Runnable o;
    public ValueAnimator p;
    public ValueAnimator q;
    public AnimatorSet r;
    public AnimatorSet s;
    public int t;
    public int u;
    public boolean v;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void k(int i) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    public ViewOnLayoutChangeListenerC0059Al3(CC cc, C6900kE3 c6900kE3, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.g = cc;
        this.i = c6900kE3;
        this.m = interfaceC0079Ap3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.v || this.u != 0 || view.getHeight() <= 0) {
            return;
        }
        this.n.onResult(null);
        this.u = view.getHeight();
        c(false);
    }

    public final void a(int i) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((InterfaceC6389il3) it.next()).d(i);
        }
    }

    public final void c(boolean z) {
        this.v = z;
        this.t = z ? 0 : this.u;
        if (!z) {
            ((CC) this.g).d(this);
        }
        int i = this.t;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((InterfaceC6389il3) it.next()).b(i);
        }
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        int i4;
        boolean z2 = i2 > 0;
        PropertyModel propertyModel = this.a;
        LD2 ld2 = AbstractC0189Bl3.d;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.m;
        propertyModel.k(ld2, z2 && ((Boolean) interfaceC0079Ap3.get()).booleanValue());
        this.a.m(AbstractC0189Bl3.i, i2);
        boolean z3 = z2 && i2 == this.t;
        PropertyModel propertyModel2 = this.a;
        ND2 nd2 = AbstractC0189Bl3.c;
        if (!this.v || (!((Boolean) interfaceC0079Ap3.get()).booleanValue() && z2)) {
            i4 = (z3 || !((Boolean) interfaceC0079Ap3.get()).booleanValue()) ? 0 : 4;
        } else {
            i4 = 8;
        }
        propertyModel2.m(nd2, i4);
        RunnableC8795pl3 runnableC8795pl3 = this.j;
        if (runnableC8795pl3 != null && z3) {
            runnableC8795pl3.run();
            this.j = null;
        }
        if (!z2 && this.v) {
            ((CC) this.g).g(this);
            this.v = false;
            this.u = 0;
            this.l.run();
        }
    }
}
