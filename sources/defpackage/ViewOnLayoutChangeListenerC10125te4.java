package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: te4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewOnLayoutChangeListenerC10125te4 implements InterfaceC8852pv0, View.OnLayoutChangeListener, InterfaceC3470aG {
    public final View a;
    public final Rect g;
    public final Rect h;
    public final IK3 i;
    public final InterfaceC9782se4 j;
    public float k;
    public Callback l;

    public /* synthetic */ void c(Canvas canvas, Rect rect) {
    }

    public /* synthetic */ void d() {
    }

    public ViewOnLayoutChangeListenerC10125te4(View view, boolean z) {
        Rect rect = new Rect();
        this.g = rect;
        Rect rect2 = new Rect();
        this.h = rect2;
        this.i = new IK3();
        this.k = 1.0f;
        this.a = view;
        view.addOnLayoutChangeListener(this);
        rect2.set(0, 0, view.getWidth(), view.getHeight());
        rect.set(rect2);
        if (z & (Build.VERSION.SDK_INT >= 29)) {
            this.j = new X51();
        } else {
            this.j = new C5672gg3();
        }
    }

    public void h() {
        Rect rect = this.g;
        this.i.getClass();
        TraceEvent i = TraceEvent.i("ViewResourceAdapter:getBitmap", null);
        try {
            if (this.j.d(this.a, new Rect(rect), this.k, this, new C9439re4(this))) {
                rect.setEmpty();
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public long e() {
        return YO2.a(null);
    }

    @Override // defpackage.InterfaceC8852pv0
    public final void a(C9195qv0 c9195qv0) {
        this.l = c9195qv0;
    }

    public boolean g() {
        return !this.g.isEmpty();
    }

    @Override // defpackage.InterfaceC8852pv0
    public final void b() {
        if (this.l == null || !g()) {
            return;
        }
        h();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (i9 == i7 - i5 && i10 == i11) {
            return;
        }
        this.h.set(0, 0, i9, i10);
        this.g.set(0, 0, i9, i10);
        this.j.c(this.a, this.k);
    }

    public final void f(Rect rect) {
        Rect rect2 = this.g;
        if (rect == null) {
            View view = this.a;
            rect2.set(0, 0, view.getWidth(), view.getHeight());
        } else {
            rect2.union(rect);
        }
    }
}
