package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.h;
import defpackage.AbstractC3878bS3;
import defpackage.AsyncTaskC7641mP1;
import defpackage.C10547us;
import defpackage.C11420xQ1;
import defpackage.C5245fR1;
import defpackage.C6614jQ1;
import defpackage.C6953kP1;
import defpackage.C7297lP1;
import defpackage.C9700sP1;
import defpackage.DQ1;
import defpackage.MQ1;
import defpackage.OP1;
import defpackage.UP1;
import defpackage.VS0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    public static C6953kP1 u;
    public static final SparseArray v = new SparseArray(2);
    public static final int[] w = {R.attr.state_checked};
    public static final int[] x = {R.attr.state_checkable};
    public final MQ1 a;
    public final C7297lP1 g;
    public C6614jQ1 h;
    public UP1 i;
    public boolean j;
    public int k;
    public boolean l;
    public AsyncTaskC7641mP1 m;
    public Drawable n;
    public int o;
    public int p;
    public int q;
    public final ColorStateList r;
    public final int s;
    public final int t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaRouteButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = androidx.mediarouter.app.f.e(r10)
            r0.<init>(r10, r1)
            r10 = 2131034954(0x7f05034a, float:1.768044E38)
            int r10 = androidx.mediarouter.app.f.g(r0, r10)
            if (r10 == 0) goto L18
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r10)
            r0 = r1
        L18:
            r10 = 2131034942(0x7f05033e, float:1.7680416E38)
            r9.<init>(r0, r11, r10)
            jQ1 r0 = defpackage.C6614jQ1.c
            r9.h = r0
            UP1 r0 = defpackage.UP1.a
            r9.i = r0
            r0 = 0
            r9.k = r0
            android.content.Context r8 = r9.getContext()
            int[] r3 = defpackage.JG2.r0
            android.content.res.TypedArray r10 = r8.obtainStyledAttributes(r11, r3, r10, r0)
            r7 = 0
            r6 = 2131034942(0x7f05033e, float:1.7680416E38)
            r1 = r9
            r2 = r8
            r4 = r11
            r5 = r10
            defpackage.Ec4.l(r1, r2, r3, r4, r5, r6, r7)
            boolean r11 = r9.isInEditMode()
            r1 = 3
            if (r11 == 0) goto L56
            r11 = 0
            r9.a = r11
            r9.g = r11
            int r10 = r10.getResourceId(r1, r0)
            android.graphics.drawable.Drawable r10 = defpackage.AbstractC2884Wf.a(r8, r10)
            r9.n = r10
            goto Lf0
        L56:
            MQ1 r11 = defpackage.MQ1.d(r8)
            r9.a = r11
            lP1 r11 = new lP1
            r11.<init>(r9)
            r9.g = r11
            DQ1 r11 = defpackage.MQ1.g()
            boolean r2 = r11.d()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L72
            int r11 = r11.h
            goto L73
        L72:
            r11 = r0
        L73:
            r9.q = r11
            r9.p = r11
            kP1 r11 = androidx.mediarouter.app.MediaRouteButton.u
            if (r11 != 0) goto L86
            kP1 r11 = new kP1
            android.content.Context r2 = r8.getApplicationContext()
            r11.<init>(r2)
            androidx.mediarouter.app.MediaRouteButton.u = r11
        L86:
            r11 = 4
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            r9.r = r11
            int r11 = r10.getDimensionPixelSize(r0, r0)
            r9.s = r11
            int r11 = r10.getDimensionPixelSize(r3, r0)
            r9.t = r11
            int r11 = r10.getResourceId(r1, r0)
            r1 = 2
            int r1 = r10.getResourceId(r1, r0)
            r9.o = r1
            r10.recycle()
            int r10 = r9.o
            android.util.SparseArray r1 = androidx.mediarouter.app.MediaRouteButton.v
            if (r10 == 0) goto Lbe
            java.lang.Object r10 = r1.get(r10)
            android.graphics.drawable.Drawable$ConstantState r10 = (android.graphics.drawable.Drawable.ConstantState) r10
            if (r10 == 0) goto Lbe
            android.graphics.drawable.Drawable r10 = r10.newDrawable()
            r9.o = r0
            r9.d(r10)
        Lbe:
            android.graphics.drawable.Drawable r10 = r9.n
            if (r10 != 0) goto Lea
            if (r11 == 0) goto Le7
            java.lang.Object r10 = r1.get(r11)
            android.graphics.drawable.Drawable$ConstantState r10 = (android.graphics.drawable.Drawable.ConstantState) r10
            if (r10 == 0) goto Ld4
            android.graphics.drawable.Drawable r10 = r10.newDrawable()
            r9.d(r10)
            goto Lea
        Ld4:
            mP1 r10 = new mP1
            android.content.Context r1 = r9.getContext()
            r10.<init>(r9, r11, r1)
            r9.m = r10
            java.util.concurrent.Executor r11 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r10.executeOnExecutor(r11, r0)
            goto Lea
        Le7:
            r9.a()
        Lea:
            r9.h()
            r9.setClickable(r3)
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void e(C6614jQ1 c6614jQ1) {
        if (c6614jQ1 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.h.equals(c6614jQ1)) {
            return;
        }
        if (this.j) {
            boolean d = this.h.d();
            C7297lP1 c7297lP1 = this.g;
            MQ1 mq1 = this.a;
            if (!d) {
                mq1.j(c7297lP1);
            }
            if (!c6614jQ1.d()) {
                mq1.a(c6614jQ1, c7297lP1, 0);
            }
        }
        this.h = c6614jQ1;
        b();
    }

    public final boolean g() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        this.a.getClass();
        Intent putExtra2 = putExtra.putExtra("key_media_session_token", MQ1.e());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra2, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(putExtra2);
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        h h0 = activity instanceof VS0 ? ((VS0) activity).h0() : null;
        if (h0 == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        this.a.getClass();
        if (MQ1.g().d()) {
            if (h0.B("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.i.getClass();
            C9700sP1 c9700sP1 = new C9700sP1();
            c9700sP1.T0(this.h);
            C10547us c10547us = new C10547us(h0);
            c10547us.g(0, c9700sP1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            c10547us.e(true);
        } else {
            if (h0.B("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            this.i.getClass();
            OP1 op1 = new OP1();
            C6614jQ1 c6614jQ1 = this.h;
            if (c6614jQ1 != null) {
                if (op1.s0 == null) {
                    Bundle bundle = op1.l;
                    if (bundle != null) {
                        op1.s0 = C6614jQ1.b(bundle.getBundle("selector"));
                    }
                    if (op1.s0 == null) {
                        op1.s0 = C6614jQ1.c;
                    }
                }
                if (!op1.s0.equals(c6614jQ1)) {
                    op1.s0 = c6614jQ1;
                    Bundle bundle2 = op1.l;
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    bundle2.putBundle("selector", c6614jQ1.a);
                    op1.E0(bundle2);
                }
                C10547us c10547us2 = new C10547us(h0);
                c10547us2.g(0, op1, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                c10547us2.e(true);
            } else {
                throw new IllegalArgumentException("selector must not be null");
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean f;
        boolean g;
        ApplicationInfo applicationInfo;
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (this.j) {
            this.a.getClass();
            MQ1.b();
            C11420xQ1 c = MQ1.c();
            C5245fR1 c5245fR1 = c == null ? null : c.q;
            if (c5245fR1 != null) {
                if (c5245fR1.b) {
                    if (MQ1.c == null ? false : MQ1.c().g()) {
                        int i = Build.VERSION.SDK_INT;
                        if (i < 31) {
                            g = i == 30 ? g() : false;
                        } else {
                            Context context = getContext();
                            Intent putExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName()).putExtra("key_media_session_token", MQ1.e());
                            Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(putExtra, 0).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    g = false;
                                    break;
                                }
                                ActivityInfo activityInfo = it.next().activityInfo;
                                if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                    context.sendBroadcast(putExtra);
                                    g = true;
                                    break;
                                }
                            }
                            if (!g) {
                                g = g();
                            }
                        }
                        if (g) {
                            f = true;
                        }
                    }
                }
                f = f();
            } else {
                f = f();
            }
        } else {
            f = false;
        }
        return f || performClick;
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a == null || this.l) {
            return onCreateDrawableState;
        }
        int i2 = this.q;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, x);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, w);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.n != null) {
            this.n.setState(getDrawableState());
            if (this.n.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.n.getCurrent();
                int i = this.q;
                if (i == 1 || this.p != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.p = this.q;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.k = i;
        c();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.j = true;
        if (!this.h.d()) {
            this.a.a(this.h, this.g, 0);
        }
        b();
        C6953kP1 c6953kP1 = u;
        ArrayList arrayList = c6953kP1.c;
        if (arrayList.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            c6953kP1.a.registerReceiver(c6953kP1, intentFilter);
        }
        arrayList.add(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.j = false;
            if (!this.h.d()) {
                this.a.j(this.g);
            }
            C6953kP1 c6953kP1 = u;
            ArrayList arrayList = c6953kP1.c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                c6953kP1.a.unregisterReceiver(c6953kP1);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.n;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.s, i3);
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.t, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.n.getIntrinsicWidth();
            int intrinsicHeight = this.n.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.n.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.n.draw(canvas);
        }
    }

    public final void a() {
        if (this.o > 0) {
            AsyncTaskC7641mP1 asyncTaskC7641mP1 = this.m;
            if (asyncTaskC7641mP1 != null) {
                asyncTaskC7641mP1.cancel(false);
            }
            AsyncTaskC7641mP1 asyncTaskC7641mP12 = new AsyncTaskC7641mP1(this, this.o, getContext());
            this.m = asyncTaskC7641mP12;
            this.o = 0;
            asyncTaskC7641mP12.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void d(Drawable drawable) {
        AsyncTaskC7641mP1 asyncTaskC7641mP1 = this.m;
        if (asyncTaskC7641mP1 != null) {
            asyncTaskC7641mP1.cancel(false);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.n);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.r;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.n = drawable;
        refreshDrawableState();
    }

    public final void c() {
        int i = this.k;
        if (i == 0 && !u.b) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final void b() {
        this.a.getClass();
        DQ1 g = MQ1.g();
        boolean z = true;
        boolean z2 = !g.d();
        int i = z2 ? g.h : 0;
        if (this.q != i) {
            this.q = i;
            h();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.j) {
            if (!z2 && !MQ1.i(this.h, 1)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    public final void h() {
        int i = this.q;
        setContentDescription(getContext().getString(i != 1 ? i != 2 ? com.android.chrome.R.string.f77830_resource_name_obfuscated_res_0x7f140673 : com.android.chrome.R.string.f77810_resource_name_obfuscated_res_0x7f140671 : com.android.chrome.R.string.f77820_resource_name_obfuscated_res_0x7f140672));
        AbstractC3878bS3.a(null, this);
    }
}
