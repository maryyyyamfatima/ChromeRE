package org.chromium.chrome.browser.customtabs.features.toolbar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC3494aK3;
import defpackage.AbstractC5647gc2;
import defpackage.C0021Ae0;
import defpackage.C10839vj2;
import defpackage.C8063ne0;
import defpackage.InterfaceC11493xe0;
import defpackage.InterpolatorC0485Dt;
import defpackage.LN3;
import defpackage.SF1;
import defpackage.ViewOnClickListenerC0671Fe0;
import defpackage.ViewOnLongClickListenerC11150we0;
import defpackage.Y50;
import defpackage.ZN3;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TrustedCdn;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.d;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CustomTabToolbar extends d implements View.OnLongClickListener {

    /* renamed from: J, reason: collision with root package name */
    public static final Object f11522J = new Object();
    public int A;
    public ColorStateList B;
    public ValueAnimator C;
    public boolean D;
    public GURL E;
    public final ViewOnLongClickListenerC11150we0 F;
    public LocationBarModel G;
    public InterfaceC11493xe0 H;
    public int I;
    public ImageView v;
    public LinearLayout w;
    public ImageButton x;
    public MenuButton y;
    public Drawable z;

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final int j() {
        return 0;
    }

    public CustomTabToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = new ViewOnLongClickListenerC11150we0(this);
        this.B = Y50.b(getContext(), R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(new ColorDrawable(AbstractC11746yN.a(getContext(), false)));
        this.A = 3;
        this.v = (ImageView) findViewById(R.id.incognito_cct_logo_image_view);
        this.w = (LinearLayout) findViewById(R.id.action_buttons);
        ImageButton imageButton = (ImageButton) findViewById(R.id.close_button);
        this.x = imageButton;
        imageButton.setOnLongClickListener(this);
        this.y = (MenuButton) findViewById(R.id.menu_button_wrapper);
        ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0 = this.F;
        viewOnLongClickListenerC11150we0.getClass();
        TextView textView = (TextView) findViewById(R.id.url_bar);
        viewOnLongClickListenerC11150we0.k = textView;
        textView.setHint("");
        viewOnLongClickListenerC11150we0.k.setEnabled(false);
        viewOnLongClickListenerC11150we0.l = (TextView) findViewById(R.id.title_bar);
        viewOnLongClickListenerC11150we0.m = findViewById(R.id.location_bar_frame_layout);
        View findViewById = findViewById(R.id.title_url_container);
        viewOnLongClickListenerC11150we0.n = findViewById;
        findViewById.setOnLongClickListener(viewOnLongClickListenerC11150we0);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.security_button);
        viewOnLongClickListenerC11150we0.o = imageButton2;
        viewOnLongClickListenerC11150we0.p = new C0021Ae0(imageButton2, viewOnLongClickListenerC11150we0.n);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void v() {
        super.v();
        final ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0 = this.F;
        viewOnLongClickListenerC11150we0.o.setOnClickListener(new View.OnClickListener() { // from class: ue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String e;
                ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we02 = ViewOnLongClickListenerC11150we0.this;
                Tab a = viewOnLongClickListenerC11150we02.g.a();
                if (a == null || a.b() == null || ((Activity) a.m().k().get()) == null || viewOnLongClickListenerC11150we02.s) {
                    return;
                }
                InterfaceC0079Ap3 interfaceC0079Ap3 = viewOnLongClickListenerC11150we02.i;
                Tab a2 = viewOnLongClickListenerC11150we02.v.j.a();
                String str = null;
                if (a2 != null && (e = TrustedCdn.e(a2)) != null) {
                    str = T34.a(e);
                }
                String str2 = str;
                InterfaceC0079Ap3 interfaceC0079Ap32 = viewOnLongClickListenerC11150we02.h;
                XO a3 = XO.a();
                WebContents b = a.b();
                if (b == null || !ProfileManager.b) {
                    return;
                }
                Activity b2 = AbstractC7239lD3.b(a);
                PageInfoController.h(b2, b, str2, 2, new WO(b2, b, interfaceC0079Ap3, new C1827Ob2(a), null, interfaceC0079Ap32, a3), a3);
            }
        });
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void H(Drawable drawable) {
        this.x.setVisibility(drawable != null ? 0 : 8);
        this.x.setImageDrawable(drawable);
        if (drawable != null) {
            f0(this.x);
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void J(ViewOnClickListenerC0671Fe0 viewOnClickListenerC0671Fe0) {
        this.x.setOnClickListener(viewOnClickListenerC0671Fe0);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void d(Drawable drawable, String str, View.OnClickListener onClickListener) {
        ImageButton imageButton = (ImageButton) LayoutInflater.from(getContext()).inflate(R.layout.f56860_resource_name_obfuscated_res_0x7f0e00b7, (ViewGroup) this.w, false);
        imageButton.setOnLongClickListener(this);
        imageButton.setOnClickListener(onClickListener);
        imageButton.setVisibility(0);
        g0(imageButton, (BitmapDrawable) drawable, str);
        this.w.addView(imageButton, 0);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void Y(int i, Drawable drawable, String str) {
        g0((ImageButton) this.w.getChildAt((r0.getChildCount() - 1) - i), (BitmapDrawable) drawable, str);
    }

    public final void g0(ImageButton imageButton, BitmapDrawable bitmapDrawable, String str) {
        Resources resources = getResources();
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f42310_resource_name_obfuscated_res_0x7f080804);
        int max = Math.max(((dimensionPixelSize * 2) - ((bitmapDrawable.getIntrinsicWidth() * dimensionPixelSize) / intrinsicHeight)) / 2, resources.getDimensionPixelSize(R.dimen.f35880_resource_name_obfuscated_res_0x7f0804f1));
        imageButton.setPadding(max, imageButton.getPaddingTop(), max, imageButton.getPaddingBottom());
        imageButton.setImageDrawable(bitmapDrawable);
        f0(imageButton);
        imageButton.setContentDescription(str);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void T(boolean z) {
        this.F.u(z);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void w() {
        this.G.x();
        if (this.F.a == 1) {
            GURL gurl = this.E;
            if (gurl == null || gurl.k()) {
                this.E = this.j.a().getUrl();
            } else if (this.E.equals(this.j.a().getUrl())) {
                return;
            } else {
                T(false);
            }
        }
        this.G.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:            if (r6 != 3) goto L53;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC11493xe0 interfaceC11493xe0 = this.H;
        if (interfaceC11493xe0 == null) {
            return false;
        }
        C10839vj2 c10839vj2 = (C10839vj2) interfaceC11493xe0;
        if (c10839vj2.h.n()) {
            return false;
        }
        return c10839vj2.a.onTouchEvent(motionEvent);
    }

    public final void f0(ImageButton imageButton) {
        Drawable drawable = imageButton.getDrawable();
        if (drawable instanceof LN3) {
            ((LN3) drawable).c(this.B);
        }
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        if (this.I == 2) {
            View findViewById = findViewById(R.id.close_button);
            int indexOfChild = indexOfChild(findViewById);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            View findViewById2 = findViewById(R.id.menu_button_wrapper);
            int indexOfChild2 = indexOfChild(findViewById2);
            ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            removeViewAt(indexOfChild2);
            addView(findViewById2, indexOfChild, layoutParams2);
            removeView(findViewById);
            addView(findViewById, indexOfChild2, layoutParams);
        }
        this.v.setVisibility(this.j.isIncognito() ? 0 : 8);
        int dimensionPixelSize = (this.I == 2 ? this.y : this.x).getVisibility() == 8 ? getResources().getDimensionPixelSize(R.dimen.f30330_resource_name_obfuscated_res_0x7f08016a) : 0;
        int e0 = e0();
        for (int i3 = 0; i3 < e0; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams3.getMarginStart() != dimensionPixelSize) {
                    layoutParams3.setMarginStart(dimensionPixelSize);
                    childAt.setLayoutParams(layoutParams3);
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int i4 = layoutParams4.width;
                if (i4 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE);
                } else if (i4 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                }
                int i5 = layoutParams4.height;
                if (i5 == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE);
                } else if (i5 == -1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                dimensionPixelSize = childAt.getMeasuredWidth() + dimensionPixelSize;
            }
        }
        View childAt2 = getChildAt(e0());
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
        if (layoutParams5.getMarginStart() != dimensionPixelSize) {
            layoutParams5.setMarginStart(dimensionPixelSize);
            childAt2.setLayoutParams(layoutParams5);
        }
        int e02 = e0();
        int i6 = 0;
        while (true) {
            e02++;
            if (e02 >= getChildCount()) {
                break;
            }
            View childAt3 = getChildAt(e02);
            if (childAt3.getVisibility() != 8) {
                i6 += childAt3.getMeasuredWidth();
            }
        }
        ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0 = this.F;
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) viewOnLongClickListenerC11150we0.m.getLayoutParams();
        if (layoutParams6.getMarginEnd() != i6) {
            layoutParams6.setMarginEnd(i6);
            viewOnLongClickListenerC11150we0.m.setLayoutParams(layoutParams6);
        }
        int measuredWidth = viewOnLongClickListenerC11150we0.o.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) viewOnLongClickListenerC11150we0.n.getLayoutParams();
        if (viewOnLongClickListenerC11150we0.o.getVisibility() == 8) {
            measuredWidth -= viewOnLongClickListenerC11150we0.o.getMeasuredWidth();
        }
        layoutParams7.leftMargin = measuredWidth;
        viewOnLongClickListenerC11150we0.n.setLayoutParams(layoutParams7);
        if (this.I == 2) {
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f42260_resource_name_obfuscated_res_0x7f0807ff);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) this.y.getLayoutParams();
            layoutParams8.width = dimensionPixelSize2;
            layoutParams8.gravity = 8388627;
            this.y.setLayoutParams(layoutParams8);
            this.y.setPaddingRelative(0, 0, 0, 0);
            ((FrameLayout.LayoutParams) this.x.getLayoutParams()).gravity = 8388629;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
            layoutParams9.setMarginEnd(dimensionPixelSize2);
            this.w.setLayoutParams(layoutParams9);
        }
        super.onMeasure(i, i2);
    }

    public final int e0() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) == this.F.m) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G.x();
        this.G.y();
        this.G.v();
    }

    @Override // android.view.View
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final ColorDrawable getBackground() {
        return (ColorDrawable) super.getBackground();
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void x(boolean z) {
        if (this.D) {
            this.C.cancel();
        }
        final ColorDrawable background = getBackground();
        final int color = background.getColor();
        final int i = this.j.i();
        if (background.getColor() == i) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
        this.C = duration;
        duration.setInterpolator(InterpolatorC0485Dt.c);
        this.C.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: me0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj = CustomTabToolbar.f11522J;
                CustomTabToolbar customTabToolbar = CustomTabToolbar.this;
                customTabToolbar.getClass();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i2 = color;
                float red = Color.red(i2);
                int i3 = i;
                int a = (int) AbstractC2277Rn2.a(Color.red(i3), red, animatedFraction, red);
                float blue = Color.blue(i2);
                int a2 = (int) AbstractC2277Rn2.a(Color.blue(i3), blue, animatedFraction, blue);
                float green = Color.green(i2);
                int rgb = Color.rgb(a, (int) AbstractC2277Rn2.a(Color.green(i3), green, animatedFraction, green), a2);
                background.setColor(rgb);
                Drawable drawable = customTabToolbar.z;
                if (drawable == null) {
                    return;
                }
                ((GradientDrawable) drawable.mutate()).setColor(rgb);
            }
        });
        this.C.addListener(new C8063ne0(this, background));
        this.C.start();
        this.D = true;
        if (z) {
            return;
        }
        this.C.end();
    }

    public static void c0(CustomTabToolbar customTabToolbar, int i) {
        int a = AbstractC5647gc2.a(i, customTabToolbar.getContext(), customTabToolbar.o());
        if (customTabToolbar.A == a) {
            return;
        }
        customTabToolbar.A = a;
        customTabToolbar.B = AbstractC3494aK3.c(customTabToolbar.getContext(), customTabToolbar.A);
        customTabToolbar.F.w();
        customTabToolbar.S(i);
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final SF1 h() {
        return this.F;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view == this.x || view.getParent() == this.w) {
            return ZN3.e(getContext(), view, view.getContentDescription());
        }
        return false;
    }

    @Override // org.chromium.chrome.browser.toolbar.top.d
    public final void u() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        marginLayoutParams.setMarginEnd(0);
        this.w.setLayoutParams(marginLayoutParams);
    }
}
