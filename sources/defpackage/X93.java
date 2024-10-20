package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import org.chromium.chrome.browser.gesturenav.NavigationBubble;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class X93 extends ViewGroup {
    public static long A;
    public static boolean B;
    public final DecelerateInterpolator a;
    public final float g;
    public final int h;
    public float i;
    public C5498g91 j;
    public C5498g91 k;
    public boolean l;
    public int m;
    public float n;
    public boolean o;
    public final NavigationBubble p;
    public int q;
    public int r;
    public int s;
    public AnimationSet t;
    public int u;
    public boolean v;
    public int w;
    public boolean x;
    public final U93 y;
    public final V93 z;

    public X93(Context context) {
        super(context);
        this.y = new U93(this);
        V93 v93 = new V93(this);
        this.z = v93;
        getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.a = new DecelerateInterpolator(2.0f);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.android.chrome.R.dimen.f37320_resource_name_obfuscated_res_0x7f0805ed);
        this.h = dimensionPixelSize;
        NavigationBubble navigationBubble = (NavigationBubble) LayoutInflater.from(getContext()).inflate(com.android.chrome.R.layout.f59030_resource_name_obfuscated_res_0x7f0e01ab, (ViewGroup) null);
        this.p = navigationBubble;
        navigationBubble.l.setText(getResources().getString(com.android.chrome.R.string.f79260_resource_name_obfuscated_res_0x7f14073c, getContext().getString(com.android.chrome.R.string.f67660_resource_name_obfuscated_res_0x7f1401f5)));
        this.q = dimensionPixelSize;
        addView(navigationBubble);
        this.g = getResources().getDisplayMetrics().density * 32.0f;
        v93.setAnimationListener(new W93(this));
    }

    public final float a() {
        return this.v ? -Math.min(0.0f, this.n) : Math.max(0.0f, this.n);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [h91] */
    public final void c(U93 u93) {
        C5498g91 c5498g91;
        if (this.l && (c5498g91 = this.j) != null) {
            boolean z = this.v;
            final ViewGroupOnHierarchyChangeListenerC6528j91 viewGroupOnHierarchyChangeListenerC6528j91 = c5498g91.a;
            viewGroupOnHierarchyChangeListenerC6528j91.h.onResult(Boolean.valueOf(z));
            RunnableC5842h91 runnableC5842h91 = viewGroupOnHierarchyChangeListenerC6528j91.k;
            if (runnableC5842h91 != null) {
                viewGroupOnHierarchyChangeListenerC6528j91.i.removeCallbacks(runnableC5842h91);
                viewGroupOnHierarchyChangeListenerC6528j91.k = null;
            }
            if (viewGroupOnHierarchyChangeListenerC6528j91.k == null) {
                viewGroupOnHierarchyChangeListenerC6528j91.k = new Runnable() { // from class: h91
                    @Override // java.lang.Runnable
                    public final void run() {
                        X93 x93 = ViewGroupOnHierarchyChangeListenerC6528j91.this.i;
                        if (x93.l) {
                            x93.l = false;
                        }
                    }
                };
            }
            c5498g91.b.post(viewGroupOnHierarchyChangeListenerC6528j91.k);
        }
        AnimationSet animationSet = this.t;
        NavigationBubble navigationBubble = this.p;
        if (animationSet == null || this.u != this.q) {
            this.u = this.q;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, this.q / 2, navigationBubble.getHeight() / 2);
            scaleAnimation.setInterpolator(AbstractC8142nr1.f);
            scaleAnimation.setDuration(600L);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(this.a);
            alphaAnimation.setDuration(600L);
            AnimationSet animationSet2 = new AnimationSet(false);
            this.t = animationSet2;
            animationSet2.addAnimation(alphaAnimation);
            this.t.addAnimation(scaleAnimation);
        }
        navigationBubble.n = u93;
        navigationBubble.clearAnimation();
        navigationBubble.startAnimation(this.t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            return;
        }
        int measuredHeight = getMeasuredHeight();
        NavigationBubble navigationBubble = this.p;
        int measuredWidth = navigationBubble.getMeasuredWidth();
        int measuredHeight2 = navigationBubble.getMeasuredHeight();
        int i5 = this.m;
        int i6 = measuredHeight / 2;
        int i7 = measuredHeight2 / 2;
        navigationBubble.layout(i5, i6 - i7, measuredWidth + i5, i6 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.p.measure(View.MeasureSpec.makeMeasureSpec(this.q, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [i91, java.lang.Runnable] */
    public final void b() {
        this.o = false;
        if (this.l) {
            this.l = false;
        }
        NavigationBubble navigationBubble = this.p;
        navigationBubble.b(0);
        this.q = this.h;
        navigationBubble.offsetLeftAndRight(this.s - this.m);
        this.m = navigationBubble.getLeft();
        this.m = navigationBubble.getLeft();
        C5498g91 c5498g91 = this.k;
        if (c5498g91 != null) {
            final ViewGroupOnHierarchyChangeListenerC6528j91 viewGroupOnHierarchyChangeListenerC6528j91 = c5498g91.a;
            if (viewGroupOnHierarchyChangeListenerC6528j91.l != null) {
                return;
            }
            ?? r2 = new Runnable() { // from class: i91
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroupOnHierarchyChangeListenerC6528j91 viewGroupOnHierarchyChangeListenerC6528j912 = ViewGroupOnHierarchyChangeListenerC6528j91.this;
                    viewGroupOnHierarchyChangeListenerC6528j912.l = null;
                    X93 x93 = viewGroupOnHierarchyChangeListenerC6528j912.i;
                    if (x93 == null || x93.getParent() == null) {
                        return;
                    }
                    RunnableC6186i91 runnableC6186i91 = viewGroupOnHierarchyChangeListenerC6528j912.l;
                    if (runnableC6186i91 != null) {
                        viewGroupOnHierarchyChangeListenerC6528j912.i.removeCallbacks(runnableC6186i91);
                        viewGroupOnHierarchyChangeListenerC6528j912.l = null;
                    }
                    viewGroupOnHierarchyChangeListenerC6528j912.removeView(viewGroupOnHierarchyChangeListenerC6528j912.i);
                }
            };
            viewGroupOnHierarchyChangeListenerC6528j91.l = r2;
            c5498g91.b.post(r2);
        }
    }
}
