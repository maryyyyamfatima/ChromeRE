package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t60, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC9943t60 extends N8 {
    public final Activity a;
    public final View g;
    public final boolean h;
    public final boolean i;
    public float j;
    public float k;
    public int l;
    public T8 m;
    public final View n;
    public View.OnLayoutChangeListener o;
    public ViewOnDragListenerC9257r60 p;
    public final Rect q;
    public final int r;
    public final int s;
    public final Integer t;
    public final Integer u;
    public final View v;
    public final H1 w;

    public DialogC9943t60(Activity activity, int i, int i2, View view, View view2, boolean z, boolean z2, Integer num, Integer num2, View view3, Rect rect, C10021tL c10021tL) {
        super(activity, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        this.a = activity;
        this.r = i;
        this.s = i2;
        this.g = view2;
        this.n = view;
        this.h = z;
        this.i = z2;
        this.t = num;
        this.u = num2;
        this.v = view3;
        this.q = rect;
        this.w = c10021tL;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        int i;
        super.onStart();
        Window window = getWindow();
        boolean z = false;
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -1);
        boolean z2 = this.i;
        if (z2) {
            window.clearFlags(2);
            window.addFlags(32);
            window.addFlags(Integer.MIN_VALUE);
            int i2 = Build.VERSION.SDK_INT;
            Activity activity = this.a;
            if (i2 >= 27) {
                window.setNavigationBarColor(activity.getWindow().getNavigationBarColor());
                AbstractC8540p04.j(window.getDecorView(), activity.getResources().getBoolean(R.bool.f15620_resource_name_obfuscated_res_0x7f06001a));
            }
            AbstractC9771sd.g(window, activity.getWindow().getStatusBarColor());
            AbstractC9771sd.h(window.getDecorView().getRootView(), !AbstractC3899bX.g(activity.getWindow().getStatusBarColor()));
        }
        View view = this.g;
        int i3 = this.r;
        if (i3 != -1 && (i = this.s) != -1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.bottomMargin = i;
            layoutParams.topMargin = i3;
        }
        ViewOnLayoutChangeListenerC8915q60 viewOnLayoutChangeListenerC8915q60 = new ViewOnLayoutChangeListenerC8915q60(this);
        this.o = viewOnLayoutChangeListenerC8915q60;
        boolean z3 = this.h;
        View view2 = this.n;
        if (z3) {
            view = view2;
        }
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC8915q60);
        if (z3 && z2 && this.v != null) {
            z = true;
        }
        if (z) {
            ViewOnDragListenerC9257r60 viewOnDragListenerC9257r60 = new ViewOnDragListenerC9257r60(this);
            this.p = viewOnDragListenerC9257r60;
            view2.setOnDragListener(viewOnDragListenerC9257r60);
        }
    }

    @Override // defpackage.N8, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.h) {
            T8 t8 = this.m;
            if (t8 != null) {
                t8.b();
                this.m = null;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = this.o;
            View view = this.n;
            if (onLayoutChangeListener != null) {
                view.removeOnLayoutChangeListener(onLayoutChangeListener);
                this.o = null;
            }
            if (this.p != null) {
                view.setOnDragListener(null);
                this.p = null;
            }
            super.dismiss();
            return;
        }
        View.OnLayoutChangeListener onLayoutChangeListener2 = this.o;
        View view2 = this.g;
        if (onLayoutChangeListener2 != null) {
            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
            this.o = null;
        }
        view2.getLocationOnScreen(new int[2]);
        ScaleAnimation b = b(this.j, this.k + (this.l - r0[1]), false);
        b.setAnimationListener(new AnimationAnimationListenerC9600s60(this));
        view2.startAnimation(b);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        boolean z = this.h;
        View view = this.v;
        if ((z && this.i && view != null) && view.isAttachedToWindow()) {
            return view.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public static ScaleAnimation b(float f, float f2, boolean z) {
        float f3 = z ? 0.0f : 1.0f;
        float f4 = z ? 1.0f : 0.0f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f3, f4, f3, f4, 0, f, 0, f2);
        scaleAnimation.setDuration(((float) (z ? 250L : 150L)) * Settings.Global.getFloat(V60.a.getContentResolver(), "animator_duration_scale", 1.0f));
        scaleAnimation.setInterpolator(AbstractC8142nr1.g);
        return scaleAnimation;
    }
}
