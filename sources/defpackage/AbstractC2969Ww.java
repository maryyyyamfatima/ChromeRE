package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import com.android.chrome.R;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ww, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2969Ww {
    public static final String p = "Ww";
    public final ViewGroup a;
    public final Context b;
    public final Snackbar$SnackbarLayout c;
    public final R50 d;
    public int e;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final AccessibilityManager l;
    public static final int[] o = {R.attr.f12580_resource_name_obfuscated_res_0x7f050417};
    public static final Handler n = new Handler(Looper.getMainLooper(), new C1410Kw());
    public final RunnableC1539Lw f = new RunnableC1539Lw(this);
    public final C1929Ow m = new C1929Ow(this);

    public AbstractC2969Ww(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.a = viewGroup;
        this.d = snackbarContentLayout2;
        this.b = context;
        SJ3.c(context, SJ3.a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = (Snackbar$SnackbarLayout) from.inflate(resourceId != -1 ? R.layout.f58960_resource_name_obfuscated_res_0x7f0e01a2 : R.layout.f56950_resource_name_obfuscated_res_0x7f0e00c2, viewGroup, false);
        this.c = snackbar$SnackbarLayout;
        snackbar$SnackbarLayout.a = this;
        float f = snackbar$SnackbarLayout.i;
        if (f != 1.0f) {
            snackbarContentLayout.g.setTextColor(AbstractC9685sM1.e(f, AbstractC9685sM1.d(snackbarContentLayout, R.attr.f5490_resource_name_obfuscated_res_0x7f050152), snackbarContentLayout.g.getCurrentTextColor()));
        }
        snackbarContentLayout.h = snackbar$SnackbarLayout.k;
        snackbar$SnackbarLayout.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = Ec4.a;
        snackbar$SnackbarLayout.setAccessibilityLiveRegion(1);
        snackbar$SnackbarLayout.setImportantForAccessibility(1);
        snackbar$SnackbarLayout.setFitsSystemWindows(true);
        Ec4.o(snackbar$SnackbarLayout, new C1669Mw(this));
        Ec4.m(snackbar$SnackbarLayout, new C1799Nw(this));
        this.l = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void f() {
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = this.c;
        ViewGroup.LayoutParams layoutParams = snackbar$SnackbarLayout.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || snackbar$SnackbarLayout.n == null) {
            Log.w(p, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (snackbar$SnackbarLayout.getParent() == null) {
            return;
        }
        int i = this.g;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = snackbar$SnackbarLayout.n;
        marginLayoutParams.bottomMargin = rect.bottom + i;
        marginLayoutParams.leftMargin = rect.left + this.h;
        marginLayoutParams.rightMargin = rect.right + this.i;
        marginLayoutParams.topMargin = rect.top;
        snackbar$SnackbarLayout.requestLayout();
        if (Build.VERSION.SDK_INT >= 29) {
            boolean z = false;
            if (this.j > 0) {
                ViewGroup.LayoutParams layoutParams2 = snackbar$SnackbarLayout.getLayoutParams();
                if ((layoutParams2 instanceof C5153f90) && (((C5153f90) layoutParams2).a instanceof C2579Tw)) {
                    z = true;
                }
            }
            if (z) {
                RunnableC1539Lw runnableC1539Lw = this.f;
                snackbar$SnackbarLayout.removeCallbacks(runnableC1539Lw);
                snackbar$SnackbarLayout.post(runnableC1539Lw);
            }
        }
    }

    public final void a(int i) {
        C1199Jf3 b = C1199Jf3.b();
        C1929Ow c1929Ow = this.m;
        synchronized (b.a) {
            if (b.c(c1929Ow)) {
                b.a(b.c, i);
            } else {
                C0939Hf3 c0939Hf3 = b.d;
                boolean z = false;
                if (c0939Hf3 != null) {
                    if (c1929Ow != null && c0939Hf3.a.get() == c1929Ow) {
                        z = true;
                    }
                }
                if (z) {
                    b.a(b.d, i);
                }
            }
        }
    }

    public final void b() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.c.getRootWindowInsets()) == null) {
            return;
        }
        this.j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        f();
    }

    public final void d() {
        C1199Jf3 b = C1199Jf3.b();
        C1929Ow c1929Ow = this.m;
        synchronized (b.a) {
            if (b.c(c1929Ow)) {
                b.d(b.c);
            }
        }
    }

    public final void c() {
        C1199Jf3 b = C1199Jf3.b();
        C1929Ow c1929Ow = this.m;
        synchronized (b.a) {
            if (b.c(c1929Ow)) {
                b.c = null;
                if (b.d != null) {
                    b.e();
                }
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        Snackbar$SnackbarLayout snackbar$SnackbarLayout = this.c;
        if (!z) {
            if (snackbar$SnackbarLayout.getParent() != null) {
                snackbar$SnackbarLayout.setVisibility(0);
            }
            d();
            return;
        }
        snackbar$SnackbarLayout.post(new RunnableC2319Rw(this));
    }
}
