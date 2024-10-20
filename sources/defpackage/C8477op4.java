package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: op4 */
/* loaded from: classes.dex */
public final class C8477op4 extends J4 implements P4 {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public ER3 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public C8133np4 i;
    public C8133np4 j;
    public InterfaceC5816h5 k;
    public boolean l;
    public final ArrayList m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public C7035ke4 t;
    public boolean u;
    public boolean v;
    public final C7101kp4 w;
    public final C7445lp4 x;
    public final C7789mp4 y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public C8477op4(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new C7101kp4(this);
        this.x = new C7445lp4(this);
        this.y = new C7789mp4(this);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public C8477op4(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new C7101kp4(this);
        this.x = new C7445lp4(this);
        this.y = new C7789mp4(this);
        u(dialog.getWindow().getDecorView());
    }

    public final void u(View view) {
        ER3 er3;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.android.chrome.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.z = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((C8477op4) actionBarOverlayLayout.z).o = actionBarOverlayLayout.g;
                int i = actionBarOverlayLayout.r;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    WeakHashMap weakHashMap = Ec4.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        }
        Object findViewById = view.findViewById(com.android.chrome.R.id.action_bar);
        if (findViewById instanceof ER3) {
            er3 = (ER3) findViewById;
        } else if (findViewById instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) findViewById;
            if (toolbar.P == null) {
                toolbar.P = new ER3(toolbar, true);
            }
            er3 = toolbar.P;
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.e = er3;
        this.f = (ActionBarContextView) view.findViewById(com.android.chrome.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.android.chrome.R.id.action_bar_container);
        this.d = actionBarContainer;
        ER3 er32 = this.e;
        if (er32 == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(C8477op4.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = er32.a.getContext();
        this.a = context;
        if ((this.e.b & 4) != 0) {
            this.h = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        v(context.getResources().getBoolean(com.android.chrome.R.bool.0_resource_name_obfuscated_res_0x7f060000));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, JG2.a, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050005, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.m) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.v = true;
            if (true != actionBarOverlayLayout2.o) {
                actionBarOverlayLayout2.o = true;
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap2 = Ec4.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.J4
    public final void h() {
        v(this.a.getResources().getBoolean(com.android.chrome.R.bool.0_resource_name_obfuscated_res_0x7f060000));
    }

    public final void v(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.getClass();
            this.d.getClass();
        } else {
            this.d.getClass();
            this.e.getClass();
        }
        ER3 er3 = this.e;
        er3.getClass();
        boolean z3 = this.n;
        Toolbar toolbar = er3.a;
        toolbar.U = false;
        toolbar.requestLayout();
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        boolean z4 = this.n;
        actionBarOverlayLayout.n = false;
    }

    @Override // defpackage.J4
    public final void p(boolean z2) {
        C7035ke4 c7035ke4;
        this.u = z2;
        if (z2 || (c7035ke4 = this.t) == null) {
            return;
        }
        c7035ke4.a();
    }

    @Override // defpackage.J4
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        X5.a(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.J4
    public final void q(int i) {
        String string = this.a.getString(i);
        ER3 er3 = this.e;
        er3.g = true;
        er3.h = string;
        if ((er3.b & 8) != 0) {
            Toolbar toolbar = er3.a;
            toolbar.G(string);
            if (er3.g) {
                Ec4.n(string, toolbar.getRootView());
            }
        }
    }

    @Override // defpackage.J4
    public final void r(CharSequence charSequence) {
        ER3 er3 = this.e;
        if (er3.g) {
            return;
        }
        er3.h = charSequence;
        if ((er3.b & 8) != 0) {
            Toolbar toolbar = er3.a;
            toolbar.G(charSequence);
            if (er3.g) {
                Ec4.n(charSequence, toolbar.getRootView());
            }
        }
    }

    @Override // defpackage.J4
    public final void n(boolean z2) {
        int i = z2 ? 4 : 0;
        ER3 er3 = this.e;
        int i2 = er3.b;
        this.h = true;
        er3.a((i & 4) | ((-5) & i2));
    }

    @Override // defpackage.J4
    public final int d() {
        return this.e.b;
    }

    @Override // defpackage.J4
    public final AbstractC6160i5 s(C9440rf c9440rf) {
        C8133np4 c8133np4 = this.i;
        if (c8133np4 != null) {
            c8133np4.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout.o) {
            actionBarOverlayLayout.o = false;
            actionBarOverlayLayout.b();
            actionBarOverlayLayout.b();
            actionBarOverlayLayout.i.setTranslationY(-Math.max(0, Math.min(0, actionBarOverlayLayout.i.getHeight())));
        }
        this.f.e();
        C8133np4 c8133np42 = new C8133np4(this, this.f.getContext(), c9440rf);
        BS1 bs1 = c8133np42.i;
        bs1.w();
        try {
            if (!c8133np42.j.c(c8133np42, bs1)) {
                return null;
            }
            this.i = c8133np42;
            c8133np42.i();
            this.f.c(c8133np42);
            t(true);
            return c8133np42;
        } finally {
            bs1.v();
        }
    }

    @Override // defpackage.J4
    public final int e() {
        return this.d.getHeight();
    }

    public final void t(boolean z2) {
        C6349ie4 m;
        C6349ie4 c6349ie4;
        if (z2) {
            if (!this.r) {
                this.r = true;
                w(false);
            }
        } else if (this.r) {
            this.r = false;
            w(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = Ec4.a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                this.e.a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            ER3 er3 = this.e;
            m = Ec4.a(er3.a);
            m.a(0.0f);
            m.c(100L);
            m.d(new DR3(er3, 4));
            c6349ie4 = this.f.m(0, 200L);
        } else {
            ER3 er32 = this.e;
            C6349ie4 a = Ec4.a(er32.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new DR3(er32, 0));
            m = this.f.m(8, 100L);
            c6349ie4 = a;
        }
        C7035ke4 c7035ke4 = new C7035ke4();
        ArrayList arrayList = c7035ke4.a;
        arrayList.add(m);
        View view = (View) m.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c6349ie4.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c6349ie4);
        c7035ke4.b();
    }

    public final void w(boolean z2) {
        boolean z3 = this.r || !this.q;
        View view = this.g;
        final C7789mp4 c7789mp4 = this.y;
        if (!z3) {
            if (this.s) {
                this.s = false;
                C7035ke4 c7035ke4 = this.t;
                if (c7035ke4 != null) {
                    c7035ke4.a();
                }
                int i = this.o;
                C7101kp4 c7101kp4 = this.w;
                if (i != 0 || (!this.u && !z2)) {
                    c7101kp4.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                ActionBarContainer actionBarContainer = this.d;
                actionBarContainer.a = true;
                actionBarContainer.setDescendantFocusability(393216);
                C7035ke4 c7035ke42 = new C7035ke4();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C6349ie4 a = Ec4.a(this.d);
                a.e(f);
                final View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c7789mp4 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: ge4
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) C7789mp4.this.a.d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = c7035ke42.e;
                ArrayList arrayList = c7035ke42.a;
                if (!z4) {
                    arrayList.add(a);
                }
                if (this.p && view != null) {
                    C6349ie4 a2 = Ec4.a(view);
                    a2.e(f);
                    if (!c7035ke42.e) {
                        arrayList.add(a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = z;
                boolean z5 = c7035ke42.e;
                if (!z5) {
                    c7035ke42.c = accelerateInterpolator;
                }
                if (!z5) {
                    c7035ke42.b = 250L;
                }
                if (!z5) {
                    c7035ke42.d = c7101kp4;
                }
                this.t = c7035ke42;
                c7035ke42.b();
                return;
            }
            return;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        C7035ke4 c7035ke43 = this.t;
        if (c7035ke43 != null) {
            c7035ke43.a();
        }
        this.d.setVisibility(0);
        int i2 = this.o;
        C7445lp4 c7445lp4 = this.x;
        if (i2 == 0 && (this.u || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            C7035ke4 c7035ke44 = new C7035ke4();
            C6349ie4 a3 = Ec4.a(this.d);
            a3.e(0.0f);
            final View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c7789mp4 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: ge4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) C7789mp4.this.a.d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = c7035ke44.e;
            ArrayList arrayList2 = c7035ke44.a;
            if (!z6) {
                arrayList2.add(a3);
            }
            if (this.p && view != null) {
                view.setTranslationY(f2);
                C6349ie4 a4 = Ec4.a(view);
                a4.e(0.0f);
                if (!c7035ke44.e) {
                    arrayList2.add(a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = A;
            boolean z7 = c7035ke44.e;
            if (!z7) {
                c7035ke44.c = decelerateInterpolator;
            }
            if (!z7) {
                c7035ke44.b = 250L;
            }
            if (!z7) {
                c7035ke44.d = c7445lp4;
            }
            this.t = c7035ke44;
            c7035ke44.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.p && view != null) {
                view.setTranslationY(0.0f);
            }
            c7445lp4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = Ec4.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // defpackage.J4
    public final Context f() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05000a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.J4
    public final void o() {
        this.e.b(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f14084c);
    }

    @Override // defpackage.J4
    public final boolean b() {
        ER3 er3 = this.e;
        if (er3 != null) {
            C12098zO3 c12098zO3 = er3.a.R;
            if ((c12098zO3 == null || c12098zO3.g == null) ? false : true) {
                C6287iT1 c6287iT1 = c12098zO3 == null ? null : c12098zO3.g;
                if (c6287iT1 != null) {
                    c6287iT1.collapseActionView();
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.J4
    public final void m(boolean z2) {
        if (this.h) {
            return;
        }
        n(z2);
    }

    @Override // defpackage.J4
    public final boolean j(int i, KeyEvent keyEvent) {
        BS1 bs1;
        C8133np4 c8133np4 = this.i;
        if (c8133np4 == null || (bs1 = c8133np4.i) == null) {
            return false;
        }
        bs1.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return bs1.performShortcut(i, keyEvent, 0);
    }
}
