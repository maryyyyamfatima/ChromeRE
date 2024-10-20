package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC8362oW implements CK2, View.OnAttachStateChangeListener {
    public final RecyclerView a;
    public final YJ2 g;
    public VV h;
    public C8018nW i;
    public boolean j = false;

    @Override // defpackage.CK2
    public final void a(MotionEvent motionEvent) {
    }

    @Override // defpackage.CK2
    public final void e(boolean z) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC8362oW(RecyclerView recyclerView, YJ2 yj2) {
        this.a = recyclerView;
        this.g = yj2;
    }

    public final void b(int i, boolean z) {
        AbstractC12077zK2 abstractC12077zK2;
        RecyclerView recyclerView = this.a;
        if (recyclerView.isAttachedToWindow()) {
            int i2 = 1;
            if (!this.j) {
                recyclerView.w.add(this);
                recyclerView.addOnAttachStateChangeListener(this);
                this.j = true;
            }
            YJ2 yj2 = this.g;
            if (yj2 == null) {
                if (z) {
                    recyclerView.u0(i);
                    return;
                } else {
                    recyclerView.m0(i);
                    return;
                }
            }
            RecyclerView a = yj2.a();
            if (a == null || (abstractC12077zK2 = a.s) == null || a.isLayoutSuppressed()) {
                return;
            }
            if (!z && yj2.b == -1) {
                G13 g13 = yj2.a;
                if (g13 == null) {
                    return;
                }
                AbstractC12077zK2 abstractC12077zK22 = g13.P.s;
                if (!(abstractC12077zK22 instanceof LinearLayoutManager)) {
                    yj2.b(i, false);
                    return;
                } else {
                    ((LinearLayoutManager) abstractC12077zK22).i1(i, 0);
                    return;
                }
            }
            if (!z) {
                yj2.b(i, false);
                return;
            }
            if (yj2.b == Integer.MIN_VALUE) {
                yj2.b(i, true);
                return;
            }
            Context context = a.getContext();
            int i3 = yj2.b;
            if (i3 == -1) {
                i2 = 3;
            } else if (i3 != 1) {
                switch (i3) {
                    case 2147483646:
                    case Integer.MAX_VALUE:
                        i2 = 5;
                        break;
                }
            } else {
                i2 = 4;
            }
            VB1 a2 = AbstractC3148Yf3.a(context, 0, i2);
            a2.a = i;
            abstractC12077zK2.E0(a2);
        }
    }

    @Override // defpackage.CK2
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        VV vv = this.h;
        if (vv == null || !vv.e.get()) {
            return false;
        }
        vv.a();
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C8018nW c8018nW = this.i;
        if (c8018nW != null) {
            c8018nW.a.a();
            C8705pW.d.remove(c8018nW.b);
        }
        RecyclerView recyclerView = this.a;
        recyclerView.g0(this);
        recyclerView.removeOnAttachStateChangeListener(this);
        this.j = false;
    }
}
