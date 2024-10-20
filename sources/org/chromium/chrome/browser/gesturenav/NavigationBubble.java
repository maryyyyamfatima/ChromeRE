package org.chromium.chrome.browser.gesturenav;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.A12;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC11746yN;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NavigationBubble extends LinearLayout {
    public final ValueAnimator a;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final A12 k;
    public TextView l;
    public ImageView m;
    public Animation.AnimationListener n;
    public boolean o;
    public int p;

    public NavigationBubble(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = getContext().getColor(R.color.f25460_resource_name_obfuscated_res_0x7f0707fd);
        this.g = AbstractC10957w33.g(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, getContext());
        A12 a12 = new A12(this);
        this.k = a12;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
        this.a = duration;
        duration.addUpdateListener(a12);
        getBackground().setColorFilter(AbstractC11746yN.c(context, R.dimen.f30400_resource_name_obfuscated_res_0x7f080172), PorterDuff.Mode.MULTIPLY);
        this.i = getResources().getString(R.string.f79260_resource_name_obfuscated_res_0x7f14073c, getContext().getString(R.string.f67660_resource_name_obfuscated_res_0x7f1401f5));
        this.j = getResources().getString(R.string.f79270_resource_name_obfuscated_res_0x7f14073d);
        this.p = 0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.m = (ImageView) findViewById(R.id.navigation_bubble_arrow);
        this.l = (TextView) findViewById(R.id.navigation_bubble_text);
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.n;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.n;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void b(int i) {
        if (i != 0) {
            if (!(this.l.getVisibility() == 0)) {
                if (this.p != i) {
                    this.p = i;
                    this.l.setText(i == 2 ? this.i : this.j);
                }
                this.l.setVisibility(0);
                measure(0, 0);
                return;
            }
        }
        if (i == 0) {
            if (this.l.getVisibility() == 0) {
                this.l.setVisibility(8);
            }
        }
    }

    public final void a() {
        if (this.o) {
            animate().alpha(1.0f).setDuration(0L);
            this.o = false;
        }
    }
}
