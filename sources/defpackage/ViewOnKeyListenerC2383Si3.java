package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Si3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2383Si3 extends AbstractC9720sT1 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final BS1 h;
    public final C11773yS1 i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final C11435xT1 n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public InterfaceC11778yT1 t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final ViewTreeObserverOnGlobalLayoutListenerC2123Qi3 o = new ViewTreeObserverOnGlobalLayoutListenerC2123Qi3(this);
    public final ViewOnAttachStateChangeListenerC2253Ri3 p = new ViewOnAttachStateChangeListenerC2253Ri3(this);
    public int y = 0;

    @Override // defpackage.InterfaceC12121zT1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void l(BS1 bs1) {
    }

    @Override // defpackage.AbstractC9720sT1
    public final void o(boolean z) {
        this.i.h = z;
    }

    public ViewOnKeyListenerC2383Si3(int i, int i2, Context context, View view, BS1 bs1, boolean z) {
        this.g = context;
        this.h = bs1;
        this.j = z;
        this.i = new C11773yS1(bs1, LayoutInflater.from(context), z, R.layout.f55330_resource_name_obfuscated_res_0x7f0e0013);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f27350_resource_name_obfuscated_res_0x7f080017));
        this.r = view;
        this.n = new C11435xT1(context, i, i2);
        bs1.b(this, context);
    }

    @Override // defpackage.AbstractC9720sT1
    public final void p(int i) {
        this.y = i;
    }

    @Override // defpackage.Q93
    public final void b() {
        View view;
        boolean z = true;
        if (!a()) {
            if (this.v || (view = this.r) == null) {
                z = false;
            } else {
                this.s = view;
                C11435xT1 c11435xT1 = this.n;
                c11435xT1.E.setOnDismissListener(this);
                c11435xT1.u = this;
                c11435xT1.D = true;
                C2234Rf c2234Rf = c11435xT1.E;
                c2234Rf.setFocusable(true);
                View view2 = this.s;
                boolean z2 = this.u == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.u = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.o);
                }
                view2.addOnAttachStateChangeListener(this.p);
                c11435xT1.t = view2;
                c11435xT1.q = this.y;
                boolean z3 = this.w;
                Context context = this.g;
                C11773yS1 c11773yS1 = this.i;
                if (!z3) {
                    this.x = AbstractC9720sT1.m(c11773yS1, context, this.k);
                    this.w = true;
                }
                c11435xT1.r(this.x);
                c2234Rf.setInputMethodMode(2);
                Rect rect = this.a;
                c11435xT1.C = rect != null ? new Rect(rect) : null;
                c11435xT1.b();
                C5753gu0 c5753gu0 = c11435xT1.h;
                c5753gu0.setOnKeyListener(this);
                if (this.z) {
                    BS1 bs1 = this.h;
                    if (bs1.m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.f55320_resource_name_obfuscated_res_0x7f0e0012, (ViewGroup) c5753gu0, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(bs1.m);
                        }
                        frameLayout.setEnabled(false);
                        c5753gu0.addHeaderView(frameLayout, null, false);
                    }
                }
                c11435xT1.f(c11773yS1);
                c11435xT1.b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // defpackage.Q93
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // defpackage.Q93
    public final boolean a() {
        return !this.v && this.n.a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.v = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener onDismissListener = this.q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void j() {
        this.w = false;
        C11773yS1 c11773yS1 = this.i;
        if (c11773yS1 != null) {
            c11773yS1.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void h(InterfaceC11778yT1 interfaceC11778yT1) {
        this.t = interfaceC11778yT1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // defpackage.InterfaceC12121zT1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.SubMenuC0074Ao3 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            uT1 r0 = new uT1
            android.content.Context r5 = r9.g
            android.view.View r6 = r9.s
            boolean r8 = r9.j
            int r3 = r9.l
            int r4 = r9.m
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            yT1 r2 = r9.t
            r0.i = r2
            sT1 r3 = r0.j
            if (r3 == 0) goto L23
            r3.h(r2)
        L23:
            boolean r2 = defpackage.AbstractC9720sT1.u(r10)
            r0.h = r2
            sT1 r3 = r0.j
            if (r3 == 0) goto L30
            r3.o(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.q
            r0.k = r2
            r2 = 0
            r9.q = r2
            BS1 r2 = r9.h
            r2.c(r1)
            xT1 r2 = r9.n
            int r3 = r2.k
            int r2 = r2.p()
            int r4 = r9.y
            android.view.View r5 = r9.r
            java.util.WeakHashMap r6 = defpackage.Ec4.a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.r
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            yT1 r0 = r9.t
            if (r0 == 0) goto L79
            r0.d(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnKeyListenerC2383Si3.e(Ao3):boolean");
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void c(BS1 bs1, boolean z) {
        if (bs1 != this.h) {
            return;
        }
        dismiss();
        InterfaceC11778yT1 interfaceC11778yT1 = this.t;
        if (interfaceC11778yT1 != null) {
            interfaceC11778yT1.c(bs1, z);
        }
    }

    @Override // defpackage.AbstractC9720sT1
    public final void n(View view) {
        this.r = view;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void t(int i) {
        this.n.m(i);
    }

    @Override // defpackage.AbstractC9720sT1
    public final void s(boolean z) {
        this.z = z;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void q(int i) {
        this.n.k = i;
    }

    @Override // defpackage.Q93
    public final C5753gu0 d() {
        return this.n.h;
    }
}
