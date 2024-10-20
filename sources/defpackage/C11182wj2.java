package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.Objects;
import org.chromium.base.SysUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wj2 */
/* loaded from: classes.dex */
public final class C11182wj2 extends C0796Gd0 implements T20, ValueAnimator.AnimatorUpdateListener {
    public LinearLayout A;
    public C6280iS B;
    public CustomTabToolbar C;
    public View D;
    public int E;
    public final Runnable F;
    public Runnable G;
    public int H;
    public final Activity a;
    public final int g;
    public final int h;
    public final Integer i;
    public final Integer j;
    public final C0666Fd0 k;
    public final C10153tj2 l;
    public final int m;
    public final int n;
    public final ValueAnimator o;
    public int p;
    public final boolean q;
    public int r;
    public ViewGroup s;
    public ViewGroup t;
    public int u = 1;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public ImageView z;

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        C7851n02.i.getClass();
        Activity activity = this.a;
        boolean p = C7851n02.p(activity);
        int i = configuration.orientation;
        int l = l();
        if (p == this.y && i == this.x && l == this.r) {
            return;
        }
        this.y = p;
        this.x = i;
        this.r = l;
        if (n()) {
            activity.getWindow().clearFlags(512);
        }
        this.F.run();
    }

    public C11182wj2(a aVar, int i, Integer num, Integer num2, C0666Fd0 c0666Fd0, I5 i5) {
        int max;
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        this.a = aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            maximumWindowMetrics = aVar.getWindowManager().getMaximumWindowMetrics();
            bounds = maximumWindowMetrics.getBounds();
            max = Math.max(bounds.width(), bounds.height());
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            aVar.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        this.g = max;
        this.n = JM1.c(i, max, (int) (max * 0.5f));
        this.r = l();
        this.k = c0666Fd0;
        this.h = UN.h.a() ? (int) ((max - m()) * 0.1f) : 0;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.o = valueAnimator;
        valueAnimator.setDuration(200L);
        valueAnimator.addListener(new C9810sj2(this));
        valueAnimator.addUpdateListener(this);
        i5.b(this);
        this.x = aVar.getResources().getConfiguration().orientation;
        C7851n02.i.getClass();
        this.y = C7851n02.p(aVar);
        this.i = num;
        this.j = num2;
        this.q = SysUtils.isLowEndDevice();
        this.m = aVar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080161);
        this.l = new C10153tj2(this);
        this.F = i2 >= 30 ? new Runnable() { // from class: qj2
            @Override // java.lang.Runnable
            public final void run() {
                C11182wj2.this.r();
            }
        } : new Runnable() { // from class: rj2
            @Override // java.lang.Runnable
            public final void run() {
                C11182wj2 c11182wj2 = C11182wj2.this;
                ViewGroup viewGroup = c11182wj2.s;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10496uj2(c11182wj2));
            }
        };
    }

    @Override // defpackage.C0796Gd0
    public final void W() {
        Activity activity = this.a;
        this.s = (ViewGroup) activity.findViewById(android.R.id.content);
        this.t = (ViewGroup) activity.findViewById(R.id.coordinator);
        this.t.setElevation(activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080160));
        this.F.run();
    }

    public final void r() {
        int max;
        int i;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        Insets insets;
        if (this.s == null) {
            return;
        }
        Activity activity = this.a;
        activity.getWindow().addFlags(32);
        activity.getWindow().clearFlags(2);
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            navigationBars = WindowInsets.Type.navigationBars();
            insets = windowInsets.getInsets(navigationBars);
            max = insets.bottom;
        } else {
            int i2 = this.r;
            int m = m() + this.s.getHeight();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            max = i2 - Math.max(m, point.y);
        }
        this.w = max;
        int m2 = m();
        if (n()) {
            i = this.r - m2;
            activity.getWindow().clearFlags(512);
        } else {
            this.u = 1;
            activity.getWindow().addFlags(512);
            i = this.n;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (attributes.height != i) {
            attributes.y = Math.max(m2, this.r - i);
            activity.getWindow().setAttributes(attributes);
            View findViewById = activity.findViewById(R.id.drag_bar);
            if (findViewById != null) {
                findViewById.setVisibility(n() ? 8 : 0);
            }
        }
        s();
        o();
        q(true);
    }

    @Override // defpackage.C0796Gd0
    public final void d(View view, CustomTabToolbar customTabToolbar, int i) {
        this.D = view;
        this.C = customTabToolbar;
        this.E = customTabToolbar.getBackground().getColor();
        Activity activity = this.a;
        ((ViewStub) activity.findViewById(R.id.custom_tabs_handle_view_stub)).inflate();
        View findViewById = activity.findViewById(R.id.custom_tabs_handle_view);
        findViewById.setElevation(activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080160));
        s();
        GradientDrawable gradientDrawable = (GradientDrawable) findViewById.getBackground();
        j(gradientDrawable, i);
        findViewById.setBackground(gradientDrawable);
        View findViewById2 = findViewById.findViewById(R.id.drag_bar);
        GradientDrawable gradientDrawable2 = (GradientDrawable) findViewById2.getBackground();
        j(gradientDrawable2, i);
        if (this.q) {
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080165);
            gradientDrawable.setStroke(dimensionPixelSize, customTabToolbar.k(this.E));
            findViewById2.setBackground(new InsetDrawable((Drawable) gradientDrawable2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0));
        } else {
            findViewById2.setBackground(gradientDrawable2);
        }
        customTabToolbar.z = gradientDrawable2;
        int color = customTabToolbar.getBackground().getColor();
        Drawable drawable = customTabToolbar.z;
        if (drawable != null) {
            ((GradientDrawable) drawable.mutate()).setColor(color);
        }
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        C10839vj2 c10839vj2 = new C10839vj2(this, activity);
        customTabToolbar.H = c10839vj2;
        final ImageButton imageButton = customTabToolbar.x;
        Objects.requireNonNull(imageButton);
        c10839vj2.g = new Runnable() { // from class: le0
            @Override // java.lang.Runnable
            public final void run() {
                imageButton.callOnClick();
            }
        };
        final ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0 = customTabToolbar.F;
        viewOnLongClickListenerC11150we0.t = true;
        viewOnLongClickListenerC11150we0.s = true;
        int i2 = viewOnLongClickListenerC11150we0.a;
        final boolean z = i2 != 0;
        final boolean z2 = i2 != 1;
        viewOnLongClickListenerC11150we0.l(true);
        viewOnLongClickListenerC11150we0.u(true);
        viewOnLongClickListenerC11150we0.o.setImageTintList(Y50.b(viewOnLongClickListenerC11150we0.v.getContext(), viewOnLongClickListenerC11150we0.g.m()));
        viewOnLongClickListenerC11150we0.p.a(R.drawable.0_resource_name_obfuscated_res_0x7f09011f);
        viewOnLongClickListenerC11150we0.l.setText(R.string.0_resource_name_obfuscated_res_0x7f140b6b);
        viewOnLongClickListenerC11150we0.q.run();
        PostTask.b(AbstractC5103f04.a, viewOnLongClickListenerC11150we0.u.c(new Runnable() { // from class: te0
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we02 = ViewOnLongClickListenerC11150we0.this;
                int i3 = 0;
                viewOnLongClickListenerC11150we02.s = false;
                viewOnLongClickListenerC11150we02.u(!z2);
                viewOnLongClickListenerC11150we02.l(z);
                while (true) {
                    Runnable[] runnableArr = viewOnLongClickListenerC11150we02.r;
                    if (i3 >= runnableArr.length) {
                        return;
                    }
                    Runnable runnable = runnableArr[i3];
                    if (runnable != null) {
                        runnable.run();
                        runnableArr[i3] = null;
                    }
                    i3++;
                }
            }
        }), 1800L);
        View findViewById3 = activity.findViewById(R.id.drag_bar);
        if (findViewById3 != null) {
            findViewById3.setVisibility(n() ? 8 : 0);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static void j(GradientDrawable gradientDrawable, int i) {
        gradientDrawable.mutate();
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    @Override // defpackage.C0796Gd0
    public final void h(float f) {
        Activity activity = this.a;
        int color = activity.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f070131);
        ((GradientDrawable) activity.findViewById(R.id.drag_bar).getBackground()).setColor(AbstractC3899bX.a(this.E, color & (-16777216), f * ((color >>> 24) / 255.0f), false));
    }

    public final void s() {
        boolean n = n();
        Activity activity = this.a;
        if (n || this.q) {
            this.p = 0;
        } else {
            this.p = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080168);
        }
        ((ViewGroup.MarginLayoutParams) activity.findViewById(R.id.custom_tabs_handle_view).getLayoutParams()).setMargins(0, this.p, 0, 0);
        ((ViewGroup.MarginLayoutParams) this.D.getLayoutParams()).setMargins(0, (n() ? 0 : this.m) + this.p, 0, 0);
        this.D.requestLayout();
    }

    public final boolean n() {
        return this.x == 2 || this.y;
    }

    public final void k(ViewGroup.LayoutParams layoutParams) {
        layoutParams.height = (this.g - this.a.getWindow().getAttributes().y) - this.C.getHeight();
        this.z.setLayoutParams(layoutParams);
    }

    public final void o() {
        int i;
        ViewGroup viewGroup = this.t;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int i2 = layoutParams.height;
        layoutParams.height = (((this.r - this.a.getWindow().getAttributes().y) - (n() ? 0 : this.m)) - this.p) - this.w;
        this.t.setLayoutParams(layoutParams);
        if (i2 < 0 || (i = layoutParams.height) == i2) {
            return;
        }
        C0666Fd0 c0666Fd0 = this.k;
        CustomTabsConnection customTabsConnection = c0666Fd0.a;
        customTabsConnection.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("size", i);
        if (customTabsConnection.s(c0666Fd0.b, "onResized", bundle) && customTabsConnection.d) {
            customTabsConnection.m(bundle, "extraCallback(onResized)");
        }
    }

    public final void q(boolean z) {
        AbstractC8826pq4 c6763jq4;
        Activity activity = this.a;
        if (z) {
            if (this.w == 0 || n()) {
                p();
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = this.A;
            int i = this.m;
            if (linearLayout2 == null) {
                LinearLayout linearLayout3 = (LinearLayout) activity.getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00b5, (ViewGroup) null);
                this.A = linearLayout3;
                linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, this.w));
                if (this.t != null) {
                    this.A.setTranslationY((n() ? 0 : i) + r0.getLayoutParams().height + this.p);
                }
                p();
                this.s.addView(this.A);
            } else {
                ViewGroup viewGroup = this.t;
                if (viewGroup != null) {
                    int i2 = viewGroup.getLayoutParams().height;
                    if (n()) {
                        i = 0;
                    }
                    this.A.setTranslationY(i + i2 + this.p);
                }
                this.A.setAlpha(0.0f);
                this.A.setVisibility(0);
                this.A.animate().alpha(1.0f).setDuration(16L);
            }
        } else {
            LinearLayout linearLayout4 = this.A;
            if (linearLayout4 != null) {
                linearLayout4.animate().alpha(0.0f).setDuration(16L);
            }
        }
        View decorView = activity.getWindow().getDecorView();
        Window window = activity.getWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            c6763jq4 = new C8483oq4(window);
        } else {
            c6763jq4 = i3 >= 26 ? new C6763jq4(window, decorView) : new C6420iq4(window, decorView);
        }
        if (z) {
            c6763jq4.c(2);
        } else {
            c6763jq4.a(2);
        }
    }

    public final void p() {
        Activity activity = this.a;
        Integer num = this.i;
        int intValue = num != null ? num.intValue() : activity.getColor(R.color.0_resource_name_obfuscated_res_0x7f0707fc);
        boolean z = true;
        boolean z2 = !AbstractC3899bX.g(intValue);
        if (z2) {
            intValue = AbstractC3899bX.b(intValue);
        }
        if (this.w == 0 || n()) {
            activity.getWindow().setNavigationBarColor(intValue);
        } else {
            this.A.findViewById(R.id.bar).setBackgroundColor(intValue);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        Integer num2 = this.j;
        if (num2 == null && num != null && z2) {
            num2 = Integer.valueOf(activity.getColor(R.color.0_resource_name_obfuscated_res_0x7f07007a));
        }
        if (this.w != 0 && !n()) {
            z = false;
        }
        if (z) {
            if (num2 != null) {
                activity.getWindow().setNavigationBarDividerColor(num2.intValue());
            }
        } else {
            View findViewById = this.A.findViewById(R.id.divider);
            if (num2 != null) {
                findViewById.setBackgroundColor(num2.intValue());
            } else {
                findViewById.setVisibility(8);
            }
        }
    }

    public final int l() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.a;
        if (i >= 30) {
            currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds.height();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (this.y) {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public final int m() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int statusBars;
        Insets insets;
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.a;
        if (i >= 30) {
            currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            statusBars = WindowInsets.Type.statusBars();
            insets = windowInsets.getInsets(statusBars);
            return insets.top;
        }
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return activity.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final void t(int i) {
        ImageView imageView;
        int c = JM1.c(i, m() + this.h, this.g);
        Activity activity = this.a;
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (attributes.y == c) {
            return;
        }
        attributes.y = c;
        activity.getWindow().setAttributes(attributes);
        if (this.G != null) {
            return;
        }
        if (this.u != 2 && (((imageView = this.z) == null || imageView.getVisibility() != 0) && c < this.H)) {
            ImageView imageView2 = this.z;
            if (imageView2 != null) {
                k(imageView2.getLayoutParams());
            } else {
                ImageView imageView3 = new ImageView(activity);
                this.z = imageView3;
                imageView3.setElevation(activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080160));
                this.z.setBackgroundColor(activity.getColor(R.color.0_resource_name_obfuscated_res_0x7f0708d8));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, 0);
                marginLayoutParams.setMargins(0, (n() ? 0 : this.m) + this.C.getHeight() + this.p, 0, 0);
                C6280iS c6280iS = new C6280iS(activity);
                this.B = c6280iS;
                c6280iS.d(0);
                this.z.setImageDrawable(this.B);
                this.z.setScaleType(ImageView.ScaleType.CENTER);
                int[] iArr = {activity.getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e5)};
                C6280iS c6280iS2 = this.B;
                C5936hS c5936hS = c6280iS2.a;
                c5936hS.i = iArr;
                c5936hS.a(0);
                c5936hS.a(0);
                c6280iS2.invalidateSelf();
                k(marginLayoutParams);
            }
            if (this.z.getParent() == null) {
                this.s.addView(this.z);
            }
            this.z.clearAnimation();
            this.z.setAlpha(0.0f);
            this.z.setVisibility(0);
            this.z.animate().alpha(1.0f).setDuration(100L).setListener(null);
            this.B.start();
        }
        ImageView imageView4 = this.z;
        if (imageView4 != null) {
            k(imageView4.getLayoutParams());
        }
    }

    @Override // defpackage.C0796Gd0
    public final void b(Runnable runnable) {
        if (this.G != null) {
            return;
        }
        this.G = runnable;
        Activity activity = this.a;
        int i = activity.getWindow().getAttributes().y;
        int i2 = this.r - this.w;
        if (n()) {
            activity.getWindow().addFlags(512);
        }
        ValueAnimator valueAnimator = this.o;
        valueAnimator.setDuration(activity.getResources().getInteger(android.R.integer.config_mediumAnimTime));
        valueAnimator.setIntValues(i, i2);
        valueAnimator.setInterpolator(new AccelerateInterpolator());
        valueAnimator.start();
    }

    @Override // defpackage.C0796Gd0
    public final boolean a() {
        return !n();
    }
}
