package org.chromium.chrome.browser.feed;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.chrome.R;
import defpackage.AX;
import defpackage.AbstractC11746yN;
import defpackage.AbstractC8293oI0;
import defpackage.C7569mB;
import defpackage.C9097qe4;
import defpackage.QZ3;
import defpackage.UN;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedPlaceholderLayout extends LinearLayout {
    public static final C7569mB r = new C7569mB("FeedLoadingPlaceholder", "enable-animation-on-instant-start", false);
    public static final PathInterpolator s = new PathInterpolator(0.17f, 0.17f, 0.85f, 1.0f);
    public static final PathInterpolator t = new PathInterpolator(0.33f, 0.0f, 0.83f, 0.83f);
    public static final PathInterpolator u = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public final Context a;
    public final Resources g;
    public long h;
    public final int i;
    public boolean j;
    public QZ3 k;
    public final ArrayList l;
    public final ArrayList m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public boolean q;

    public FeedPlaceholderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new AnimatorSet();
        this.o = new AnimatorSet();
        this.p = new AnimatorSet();
        this.a = context;
        Resources resources = context.getResources();
        this.g = resources;
        this.i = resources.getConfiguration().screenWidthDp;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.k = new QZ3(this);
        boolean z = !AbstractC8293oI0.b();
        this.q = z;
        if (z) {
            Resources resources = this.g;
            new C9097qe4(this, this.k, resources.getDimensionPixelSize(R.dimen.f29790_resource_name_obfuscated_res_0x7f080134), resources.getDimensionPixelSize(R.dimen.f37620_resource_name_obfuscated_res_0x7f080619)).b();
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.placeholders_layout);
        linearLayout.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = b(12);
        this.j = getResources().getConfiguration().orientation == 2;
        d(linearLayout, false, layoutParams, d(linearLayout, false, layoutParams, d(linearLayout, true, layoutParams, 0)));
        AnimatorSet animatorSet = this.o;
        animatorSet.setStartDelay(0L);
        animatorSet.playTogether(this.l);
        ArrayList arrayList = this.m;
        AnimatorSet animatorSet2 = this.p;
        animatorSet2.playTogether(arrayList);
        boolean z2 = !this.q;
        AnimatorSet animatorSet3 = this.n;
        if (z2) {
            animatorSet3.play(animatorSet).before(animatorSet2);
        } else if (e()) {
            animatorSet3.playSequentially(animatorSet2);
        }
        this.h = SystemClock.elapsedRealtime();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.c();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        f(isAttachedToWindow());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f(true);
    }

    public final void f(boolean z) {
        AnimatorSet animatorSet = this.n;
        if (animatorSet == null) {
            return;
        }
        boolean z2 = isShown() && z;
        if (animatorSet.isStarted() && !z2) {
            animatorSet.cancel();
        } else if (!animatorSet.isStarted() && z2 && e()) {
            animatorSet.start();
        }
    }

    public final int d(LinearLayout linearLayout, boolean z, LinearLayout.LayoutParams layoutParams, int i) {
        LayerDrawable layerDrawable;
        ViewGroup.LayoutParams layoutParams2;
        LayerDrawable layerDrawable2;
        View view;
        Context context = this.a;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setOrientation(!z ? 1 : 0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        int i2 = this.i;
        if (z) {
            int b = b(92);
            int b2 = b(15);
            layerDrawable = new LayerDrawable(c(1, b, b));
            layerDrawable.setLayerInset(0, 0, b2, 0, this.j ? b(48) : b(72));
        } else {
            layerDrawable = new LayerDrawable(c(1, b(i2), b(207)));
        }
        appCompatImageView.setImageDrawable(layerDrawable);
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        int b3 = b(15);
        int i3 = b3 / 2;
        int b4 = b(20);
        int b5 = b(i2);
        int b6 = b(80);
        if (z) {
            layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        if (z) {
            GradientDrawable[] c = c(4, b5, b4);
            int b7 = b(15) + b(92) + (this.j ? b(48) : b(72));
            layerDrawable2 = new LayerDrawable(c);
            int i4 = b7 - b3;
            int i5 = i4 - b4;
            layerDrawable2.setLayerInset(0, 0, b3, b3, i5);
            layerDrawable2.setLayerInset(1, 0, ((b6 - b4) / 2) + b3, b3, i4 - ((b4 + b6) / 2));
            layerDrawable2.setLayerInset(2, 0, (b3 + b6) - b4, b3, i4 - b6);
            layerDrawable2.setLayerInset(3, 0, i5, b3 * 7, b3);
        } else {
            int i6 = (b3 * 2) + b6;
            LayerDrawable layerDrawable3 = new LayerDrawable(c(3, b5, b4));
            int i7 = (i6 - b3) - b4;
            layerDrawable3.setLayerInset(0, i3, b3, b3, i7);
            int i8 = (i6 - b4) / 2;
            layerDrawable3.setLayerInset(1, i3, i8, b3, i8);
            layerDrawable3.setLayerInset(2, i3, i7, b3, b3);
            layerDrawable2 = layerDrawable3;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setImageDrawable(layerDrawable2);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        if (z) {
            a(appCompatImageView2, i);
            view = appCompatImageView2;
        } else {
            a(appCompatImageView, i);
            view = appCompatImageView;
        }
        linearLayout2.addView(view);
        int i9 = i + 83;
        if (z) {
            a(appCompatImageView, i9);
        } else {
            a(appCompatImageView2, i9);
            appCompatImageView = appCompatImageView2;
        }
        linearLayout2.addView(appCompatImageView);
        int i10 = i9 + 83;
        linearLayout.addView(linearLayout2);
        return i10;
    }

    public final View a(AppCompatImageView appCompatImageView, int i) {
        if (!AX.e().g("disable-feed-placeholder-animation") && e()) {
            appCompatImageView.setAlpha(0.0f);
            appCompatImageView.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, "alpha", 0.0f, 1.0f);
            long j = i;
            ofFloat.setStartDelay(j);
            ofFloat.setDuration(620L);
            ofFloat.setInterpolator(s);
            ArrayList arrayList = this.l;
            arrayList.add(ofFloat);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, "translationY", b(33), 0.0f);
            ofFloat2.setDuration(1283L);
            ofFloat2.setInterpolator(u);
            arrayList.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(appCompatImageView, "alpha", 1.0f, 0.6f);
            ofFloat3.setStartDelay(j);
            ofFloat3.setDuration(620L);
            ofFloat3.setInterpolator(t);
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(2);
            this.m.add(ofFloat3);
        }
        return appCompatImageView;
    }

    public final GradientDrawable[] c(int i, int i2, int i3) {
        GradientDrawable[] gradientDrawableArr = new GradientDrawable[i];
        int b = b(12);
        for (int i4 = 0; i4 < i; i4++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawableArr[i4] = gradientDrawable;
            gradientDrawable.setShape(0);
            gradientDrawableArr[i4].setSize(i2, i3);
            gradientDrawableArr[i4].setCornerRadius(b);
            gradientDrawableArr[i4].setColor(AbstractC11746yN.c(this.a, R.dimen.f30390_resource_name_obfuscated_res_0x7f080171));
        }
        return gradientDrawableArr;
    }

    public final int b(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public final boolean e() {
        boolean z = this.q;
        return !z || (z && UN.z.a() && r.c());
    }
}
