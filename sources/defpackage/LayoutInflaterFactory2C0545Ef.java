package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ef */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0545Ef extends Cif implements InterfaceC12116zS1, LayoutInflater.Factory2 {
    public static final C1439Lb3 f0 = new C1439Lb3(0);
    public static final int[] g0 = {R.attr.windowBackground};
    public static final boolean h0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean i0 = true;
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J */
    public boolean f11440J;
    public boolean K;
    public C0285Cf[] L;
    public C0285Cf M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public C0025Af W;
    public C11498xf X;
    public boolean Y;
    public int Z;
    public boolean b0;
    public Rect c0;
    public Rect d0;
    public C0420Dg e0;
    public final Object i;
    public final Context j;
    public Window k;
    public WindowCallbackC11155wf l;
    public final InterfaceC4631df m;
    public J4 n;
    public C1898Op3 o;
    public CharSequence p;
    public InterfaceC3030Xi0 q;
    public C8755pf r;
    public C0415Df s;
    public AbstractC6160i5 t;
    public ActionBarContextView u;
    public PopupWindow v;
    public RunnableC8068nf w;
    public boolean z;
    public C6349ie4 x = null;
    public boolean y = true;
    public final RunnableC6692jf a0 = new RunnableC6692jf(this);

    public LayoutInflaterFactory2C0545Ef(Context context, Window window, InterfaceC4631df interfaceC4631df, Object obj) {
        a aVar = null;
        this.S = -100;
        this.j = context;
        this.m = interfaceC4631df;
        this.i = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof a) {
                        aVar = (a) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (aVar != null) {
                this.S = ((LayoutInflaterFactory2C0545Ef) aVar.k0()).S;
            }
        }
        if (this.S == -100) {
            C1439Lb3 c1439Lb3 = f0;
            Integer num = (Integer) c1439Lb3.get(this.i.getClass().getName());
            if (num != null) {
                this.S = num.intValue();
                c1439Lb3.remove(this.i.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C1195Jf.d();
    }

    @Override // defpackage.Cif
    public final void f() {
        String str;
        this.O = true;
        o(false);
        x();
        Object obj = this.i;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC11973z12.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                J4 j4 = this.n;
                if (j4 == null) {
                    this.b0 = true;
                } else {
                    j4.m(true);
                }
            }
            synchronized (Cif.h) {
                Cif.h(this);
                Cif.g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.j.getResources().getConfiguration());
        this.P = true;
    }

    @Override // defpackage.Cif
    public final void e() {
        if (this.n != null) {
            B();
            if (this.n.g()) {
                return;
            }
            this.Z |= 1;
            if (this.Y) {
                return;
            }
            View decorView = this.k.getDecorView();
            WeakHashMap weakHashMap = Ec4.a;
            decorView.postOnAnimation(this.a0);
            this.Y = true;
        }
    }

    public final Window.Callback A() {
        return this.k.getCallback();
    }

    public final void B() {
        w();
        if (this.F && this.n == null) {
            Object obj = this.i;
            if (obj instanceof Activity) {
                this.n = new C8477op4((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.n = new C8477op4((Dialog) obj);
            }
            J4 j4 = this.n;
            if (j4 != null) {
                j4.m(this.b0);
            }
        }
    }

    @Override // defpackage.Cif
    public final void k(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.l.a(this.k.getCallback());
    }

    @Override // defpackage.Cif
    public final void j(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.j).inflate(i, viewGroup);
        this.l.a(this.k.getCallback());
    }

    @Override // defpackage.Cif
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.l.a(this.k.getCallback());
    }

    @Override // defpackage.Cif
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ((ViewGroup) this.A.findViewById(R.id.content)).addView(view, layoutParams);
        this.l.a(this.k.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.Cif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.i
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.Cif.h
            monitor-enter(r0)
            defpackage.Cif.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.k
            android.view.View r0 = r0.getDecorView()
            jf r1 = r3.a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            Lb3 r0 = defpackage.LayoutInflaterFactory2C0545Ef.f0
            java.lang.Object r1 = r3.i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            Lb3 r0 = defpackage.LayoutInflaterFactory2C0545Ef.f0
            java.lang.Object r1 = r3.i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            J4 r0 = r3.n
            if (r0 == 0) goto L63
            r0.i()
        L63:
            Af r0 = r3.W
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            xf r0 = r3.X
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.g():void");
    }

    public final void x() {
        if (this.k == null) {
            Object obj = this.i;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void p(Window window) {
        int resourceId;
        Drawable f;
        if (this.k != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC11155wf) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC11155wf windowCallbackC11155wf = new WindowCallbackC11155wf(this, callback);
        this.l = windowCallbackC11155wf;
        window.setCallback(windowCallbackC11155wf);
        int[] iArr = g0;
        Context context = this.j;
        Drawable drawable = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            C1195Jf a = C1195Jf.a();
            synchronized (a) {
                f = a.a.f(resourceId, context, true);
            }
            drawable = f;
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.k = window;
    }

    public final void w() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        if (this.z) {
            return;
        }
        int[] iArr = JG2.o;
        Context context = this.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        x();
        this.k.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (!this.f11440J) {
            if (this.I) {
                viewGroup = (ViewGroup) from.inflate(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e000c, (ViewGroup) null);
                this.G = false;
                this.F = false;
            } else if (this.F) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050009, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new R60(context, typedValue.resourceId) : context).inflate(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0017, (ViewGroup) null);
                InterfaceC3030Xi0 interfaceC3030Xi0 = (InterfaceC3030Xi0) viewGroup.findViewById(com.android.chrome.R.id.decor_content_parent);
                this.q = interfaceC3030Xi0;
                Window.Callback A = A();
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3030Xi0;
                actionBarOverlayLayout.k();
                actionBarOverlayLayout.j.k = A;
                if (this.G) {
                    ((ActionBarOverlayLayout) this.q).j(109);
                }
                if (this.D) {
                    ((ActionBarOverlayLayout) this.q).j(2);
                }
                if (this.E) {
                    ((ActionBarOverlayLayout) this.q).j(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.H ? (ViewGroup) from.inflate(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0016, (ViewGroup) null) : (ViewGroup) from.inflate(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0015, (ViewGroup) null);
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.f11440J + " }");
        }
        Ec4.o(viewGroup, new C7036kf(this));
        if (this.q == null) {
            this.B = (TextView) viewGroup.findViewById(com.android.chrome.R.id.title);
        }
        Method method = He4.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.android.chrome.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.k.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.k.setContentView(viewGroup);
        contentFrameLayout.m = new C7380lf(this);
        this.A = viewGroup;
        Object obj = this.i;
        if (obj instanceof Activity) {
            charSequence = ((Activity) obj).getTitle();
        } else {
            charSequence = this.p;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            InterfaceC3030Xi0 interfaceC3030Xi02 = this.q;
            if (interfaceC3030Xi02 == null) {
                J4 j4 = this.n;
                if (j4 != null) {
                    j4.r(charSequence);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            } else {
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) interfaceC3030Xi02;
                actionBarOverlayLayout2.k();
                ER3 er3 = actionBarOverlayLayout2.j;
                if (!er3.g) {
                    er3.h = charSequence;
                    if ((er3.b & 8) != 0) {
                        Toolbar toolbar = er3.a;
                        toolbar.G(charSequence);
                        if (er3.g) {
                            Ec4.n(charSequence, toolbar.getRootView());
                        }
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.k.getDecorView();
        contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap = Ec4.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        if (contentFrameLayout2.a == null) {
            contentFrameLayout2.a = new TypedValue();
        }
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.a);
        if (contentFrameLayout2.g == null) {
            contentFrameLayout2.g = new TypedValue();
        }
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.g);
        if (obtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.h == null) {
                contentFrameLayout2.h = new TypedValue();
            }
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.h);
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.i == null) {
                contentFrameLayout2.i = new TypedValue();
            }
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.i);
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.j == null) {
                contentFrameLayout2.j = new TypedValue();
            }
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.j);
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.k == null) {
                contentFrameLayout2.k = new TypedValue();
            }
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.k);
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.z = true;
        C0285Cf z = z(0);
        if (this.Q || z.h != null) {
            return;
        }
        this.Z |= 4096;
        if (this.Y) {
            return;
        }
        this.k.getDecorView().postOnAnimation(this.a0);
        this.Y = true;
    }

    @Override // defpackage.Cif
    public final void n(CharSequence charSequence) {
        this.p = charSequence;
        InterfaceC3030Xi0 interfaceC3030Xi0 = this.q;
        if (interfaceC3030Xi0 == null) {
            J4 j4 = this.n;
            if (j4 != null) {
                j4.r(charSequence);
                return;
            }
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3030Xi0;
        actionBarOverlayLayout.k();
        ER3 er3 = actionBarOverlayLayout.j;
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

    @Override // defpackage.InterfaceC12116zS1
    public final boolean a(BS1 bs1, MenuItem menuItem) {
        int i;
        int i2;
        C0285Cf c0285Cf;
        Window.Callback A = A();
        if (A != null && !this.Q) {
            BS1 k = bs1.k();
            C0285Cf[] c0285CfArr = this.L;
            if (c0285CfArr != null) {
                i = c0285CfArr.length;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            while (true) {
                if (i2 < i) {
                    c0285Cf = c0285CfArr[i2];
                    if (c0285Cf != null && c0285Cf.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    c0285Cf = null;
                    break;
                }
            }
            if (c0285Cf != null) {
                return A.onMenuItemSelected(c0285Cf.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f9, code lost:            if ((r7 != null && r7.l()) != false) goto L643;     */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.u(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0112, code lost:            if (r9.equals("ImageButton") == false) goto L676;     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // defpackage.Cif
    public final void d() {
        LayoutInflater from = LayoutInflater.from(this.j);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0545Ef) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:            if (r15.k.getCount() > 0) goto L550;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0150, code lost:            if (r15 != null) goto L536;     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(defpackage.C0285Cf r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.D(Cf, android.view.KeyEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:            if (r6 == false) goto L388;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    @Override // defpackage.InterfaceC12116zS1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.BS1 r6) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.b(BS1):void");
    }

    public final boolean F(C0285Cf c0285Cf, KeyEvent keyEvent) {
        InterfaceC3030Xi0 interfaceC3030Xi0;
        InterfaceC3030Xi0 interfaceC3030Xi02;
        Resources.Theme theme;
        InterfaceC3030Xi0 interfaceC3030Xi03;
        InterfaceC3030Xi0 interfaceC3030Xi04;
        if (this.Q) {
            return false;
        }
        if (c0285Cf.k) {
            return true;
        }
        C0285Cf c0285Cf2 = this.M;
        if (c0285Cf2 != null && c0285Cf2 != c0285Cf) {
            s(c0285Cf2, false);
        }
        Window.Callback A = A();
        int i = c0285Cf.a;
        if (A != null) {
            c0285Cf.g = A.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC3030Xi04 = this.q) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3030Xi04;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.j.l = true;
        }
        if (c0285Cf.g == null && (!z || !(this.n instanceof JO3))) {
            BS1 bs1 = c0285Cf.h;
            if (bs1 == null || c0285Cf.o) {
                if (bs1 == null) {
                    Context context = this.j;
                    if ((i == 0 || i == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050009, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05000a, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05000a, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            R60 r60 = new R60(context, 0);
                            r60.getTheme().setTo(theme);
                            context = r60;
                        }
                    }
                    BS1 bs12 = new BS1(context);
                    bs12.e = this;
                    BS1 bs13 = c0285Cf.h;
                    if (bs12 != bs13) {
                        if (bs13 != null) {
                            bs13.r(c0285Cf.i);
                        }
                        c0285Cf.h = bs12;
                        C4831eD1 c4831eD1 = c0285Cf.i;
                        if (c4831eD1 != null) {
                            bs12.b(c4831eD1, bs12.a);
                        }
                    }
                    if (c0285Cf.h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC3030Xi02 = this.q) != null) {
                    if (this.r == null) {
                        this.r = new C8755pf(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC3030Xi02).l(c0285Cf.h, this.r);
                }
                c0285Cf.h.w();
                if (A.onCreatePanelMenu(i, c0285Cf.h)) {
                    c0285Cf.o = false;
                } else {
                    BS1 bs14 = c0285Cf.h;
                    if (bs14 != null) {
                        if (bs14 != null) {
                            bs14.r(c0285Cf.i);
                        }
                        c0285Cf.h = null;
                    }
                    if (z && (interfaceC3030Xi0 = this.q) != null) {
                        ((ActionBarOverlayLayout) interfaceC3030Xi0).l(null, this.r);
                    }
                    return false;
                }
            }
            c0285Cf.h.w();
            Bundle bundle = c0285Cf.p;
            if (bundle != null) {
                c0285Cf.h.s(bundle);
                c0285Cf.p = null;
            }
            if (!A.onPreparePanel(0, c0285Cf.g, c0285Cf.h)) {
                if (z && (interfaceC3030Xi03 = this.q) != null) {
                    ((ActionBarOverlayLayout) interfaceC3030Xi03).l(null, this.r);
                }
                c0285Cf.h.v();
                return false;
            }
            c0285Cf.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0285Cf.h.v();
        }
        c0285Cf.k = true;
        c0285Cf.l = false;
        this.M = c0285Cf;
        return true;
    }

    public final void r(BS1 bs1) {
        C4097c5 c4097c5;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.q;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = actionBarOverlayLayout.j.a.a;
        if (actionMenuView != null && (c4097c5 = actionMenuView.y) != null) {
            c4097c5.b();
            V4 v4 = c4097c5.y;
            if (v4 != null && v4.b()) {
                v4.j.dismiss();
            }
        }
        Window.Callback A = A();
        if (A != null && !this.Q) {
            A.onPanelClosed(108, bs1);
        }
        this.K = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.C0285Cf r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L33
            int r2 = r6.a
            if (r2 != 0) goto L33
            Xi0 r2 = r5.q
            if (r2 == 0) goto L33
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            ER3 r2 = r2.j
            androidx.appcompat.widget.Toolbar r2 = r2.a
            androidx.appcompat.widget.ActionMenuView r2 = r2.a
            if (r2 == 0) goto L2a
            c5 r2 = r2.y
            if (r2 == 0) goto L25
            boolean r2 = r2.d()
            if (r2 == 0) goto L25
            r2 = r0
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L2a
            r2 = r0
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 == 0) goto L33
            BS1 r6 = r6.h
            r5.r(r6)
            return
        L33:
            android.content.Context r2 = r5.j
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L52
            boolean r4 = r6.m
            if (r4 == 0) goto L52
            Bf r4 = r6.e
            if (r4 == 0) goto L52
            r2.removeView(r4)
            if (r7 == 0) goto L52
            int r7 = r6.a
            r5.q(r7, r6, r3)
        L52:
            r6.k = r1
            r6.l = r1
            r6.m = r1
            r6.f = r3
            r6.n = r0
            Cf r7 = r5.M
            if (r7 != r6) goto L62
            r5.M = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.s(Cf, boolean):void");
    }

    public final void q(int i, C0285Cf c0285Cf, BS1 bs1) {
        if (bs1 == null) {
            if (c0285Cf == null && i >= 0) {
                C0285Cf[] c0285CfArr = this.L;
                if (i < c0285CfArr.length) {
                    c0285Cf = c0285CfArr[i];
                }
            }
            if (c0285Cf != null) {
                bs1 = c0285Cf.h;
            }
        }
        if ((c0285Cf == null || c0285Cf.m) && !this.Q) {
            WindowCallbackC11155wf windowCallbackC11155wf = this.l;
            Window.Callback callback = this.k.getCallback();
            windowCallbackC11155wf.getClass();
            try {
                windowCallbackC11155wf.j = true;
                callback.onPanelClosed(i, bs1);
            } finally {
                windowCallbackC11155wf.j = false;
            }
        }
    }

    public final C0285Cf z(int i) {
        C0285Cf[] c0285CfArr = this.L;
        if (c0285CfArr == null || c0285CfArr.length <= i) {
            C0285Cf[] c0285CfArr2 = new C0285Cf[i + 1];
            if (c0285CfArr != null) {
                System.arraycopy(c0285CfArr, 0, c0285CfArr2, 0, c0285CfArr.length);
            }
            this.L = c0285CfArr2;
            c0285CfArr = c0285CfArr2;
        }
        C0285Cf c0285Cf = c0285CfArr[i];
        if (c0285Cf != null) {
            return c0285Cf;
        }
        C0285Cf c0285Cf2 = new C0285Cf(i);
        c0285CfArr[i] = c0285Cf2;
        return c0285Cf2;
    }

    public final boolean E(C0285Cf c0285Cf, int i, KeyEvent keyEvent) {
        BS1 bs1;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0285Cf.k || F(c0285Cf, keyEvent)) && (bs1 = c0285Cf.h) != null) {
            return bs1.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final void v(int i) {
        C0285Cf z = z(i);
        if (z.h != null) {
            Bundle bundle = new Bundle();
            z.h.t(bundle);
            if (bundle.size() > 0) {
                z.p = bundle;
            }
            z.h.w();
            z.h.clear();
        }
        z.o = true;
        z.n = true;
        if ((i == 108 || i == 0) && this.q != null) {
            C0285Cf z2 = z(0);
            z2.k = false;
            F(z2, null);
        }
    }

    public final void G() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // defpackage.Cif
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f11440J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            G();
            this.f11440J = true;
            return true;
        }
        if (i == 2) {
            G();
            this.D = true;
            return true;
        }
        if (i == 5) {
            G();
            this.E = true;
            return true;
        }
        if (i == 10) {
            G();
            this.H = true;
            return true;
        }
        if (i == 108) {
            G();
            this.F = true;
            return true;
        }
        if (i == 109) {
            G();
            this.G = true;
            return true;
        }
        return this.k.requestFeature(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(boolean r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LayoutInflaterFactory2C0545Ef.o(boolean):boolean");
    }

    public static Configuration t(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final AbstractC12184zf y(Context context) {
        if (this.W == null) {
            if (C5975hZ3.d == null) {
                Context applicationContext = context.getApplicationContext();
                C5975hZ3.d = new C5975hZ3(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new C0025Af(this, C5975hZ3.d);
        }
        return this.W;
    }

    public final int C(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return y(context).c();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.X == null) {
                    this.X = new C11498xf(this, context);
                }
                return this.X.c();
            }
        }
        return i;
    }
}
