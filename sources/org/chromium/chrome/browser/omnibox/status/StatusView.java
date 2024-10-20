package org.chromium.chrome.browser.omnibox.status;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC8142nr1;
import defpackage.C2918Wl3;
import defpackage.C3178Yl3;
import defpackage.C3799bD;
import defpackage.S10;
import defpackage.ViewOnLongClickListenerC3048Xl3;
import org.chromium.chrome.browser.omnibox.status.StatusView;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StatusView extends LinearLayout {
    public static final /* synthetic */ int B = 0;
    public int A;
    public View a;
    public int g;
    public int h;
    public ImageView i;
    public TextView j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public Drawable s;
    public TouchDelegate t;
    public S10 u;
    public boolean v;
    public Rect w;
    public int x;
    public long y;
    public C3799bD z;

    public StatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = -1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ImageView) findViewById(R.id.location_bar_status_icon);
        this.j = (TextView) findViewById(R.id.location_bar_verbose_status);
        this.k = findViewById(R.id.location_bar_verbose_status_separator);
        this.l = findViewById(R.id.location_bar_verbose_status_extra_space);
        setOnLongClickListener(new ViewOnLongClickListenerC3048Xl3(this));
        setAccessibilityDelegate(new C3178Yl3(this));
    }

    public final void c(final Drawable drawable, int i, final Runnable runnable) {
        Drawable drawable2;
        this.s = drawable;
        boolean z = drawable == null;
        boolean z2 = this.i.getVisibility() == 8;
        if (!z && (z2 || this.o)) {
            if (this.o) {
                this.i.animate().cancel();
            }
            this.o = false;
            this.n = true;
            b();
            this.i.setVisibility(0);
            this.i.animate().alpha(1.0f).setDuration(225L).withEndAction(new Runnable() { // from class: Sl3
                @Override // java.lang.Runnable
                public final void run() {
                    StatusView statusView = StatusView.this;
                    statusView.n = false;
                    statusView.a();
                    statusView.d();
                }
            }).start();
        } else if (z && (!z2 || this.n)) {
            if (this.n) {
                this.i.animate().cancel();
            }
            this.n = false;
            this.o = true;
            b();
            this.i.animate().setDuration(this.m ? 225L : 0L).alpha(0.0f).withEndAction(new Runnable() { // from class: Tl3
                @Override // java.lang.Runnable
                public final void run() {
                    StatusView statusView = StatusView.this;
                    statusView.i.setVisibility(8);
                    statusView.o = false;
                    statusView.a();
                    statusView.d();
                }
            }).start();
        } else {
            d();
        }
        if (drawable != null) {
            if (!z2) {
                Drawable drawable3 = this.i.getDrawable();
                if (drawable3 instanceof TransitionDrawable) {
                    TransitionDrawable transitionDrawable = (TransitionDrawable) drawable3;
                    if (transitionDrawable.getNumberOfLayers() == 2) {
                        drawable3 = transitionDrawable.getDrawable(1);
                    }
                }
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = drawable3;
                if (i == 1) {
                    RotateDrawable rotateDrawable = new RotateDrawable();
                    rotateDrawable.setDrawable(drawable);
                    rotateDrawable.setToDegrees(180.0f);
                    rotateDrawable.setLevel(10000);
                    drawable2 = rotateDrawable;
                } else {
                    drawable2 = drawable;
                }
                drawableArr[1] = drawable2;
                final C2918Wl3 c2918Wl3 = new C2918Wl3(this, drawableArr);
                this.i.setImageDrawable(c2918Wl3);
                c2918Wl3.setCrossFadeEnabled(true);
                if (i == 0) {
                    this.p = true;
                    int i2 = this.m ? 225 : 0;
                    this.x = i2;
                    if (i2 > 0) {
                        b();
                    }
                    this.y = SystemClock.uptimeMillis();
                    c2918Wl3.startTransition(this.x);
                } else {
                    this.p = true;
                    b();
                    this.i.animate().setDuration(250L).rotationBy(180.0f).setInterpolator(AbstractC8142nr1.d).withStartAction(new Runnable() { // from class: Ul3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = StatusView.B;
                            c2918Wl3.startTransition(225);
                        }
                    }).withEndAction(new Runnable() { // from class: Vl3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StatusView statusView = StatusView.this;
                            statusView.p = false;
                            statusView.a();
                            statusView.i.setRotation(0.0f);
                            Drawable drawable4 = statusView.s;
                            Drawable drawable5 = drawable;
                            if (drawable4 == drawable5) {
                                statusView.i.setImageDrawable(drawable5);
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        }
                    }).start();
                }
                if (this.n) {
                    return;
                }
                d();
                return;
            }
            this.i.setImageDrawable(drawable);
        }
    }

    public final void d() {
        if (this.u == null) {
            return;
        }
        if (!((this.s == null || this.i.getVisibility() == 8 || this.i.getAlpha() == 0.0f) ? false : true)) {
            TouchDelegate touchDelegate = this.t;
            if (touchDelegate != null) {
                this.u.a.remove(touchDelegate);
                this.t = null;
                this.w = new Rect();
                return;
            }
            return;
        }
        Rect rect = new Rect();
        this.i.getHitRect(rect);
        if (rect.equals(new Rect())) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        if (this.g == 0) {
            this.g = getResources().getDimensionPixelSize(R.dimen.f34880_resource_name_obfuscated_res_0x7f0803c0);
        }
        if (this.h == 0) {
            this.h = getResources().getDimensionPixelSize(R.dimen.f34860_resource_name_obfuscated_res_0x7f0803be);
        }
        rect.left -= z ? this.h : this.g;
        rect.right += z ? this.g : this.h;
        if (DeviceFormFactor.a(getContext())) {
            rect.top -= getResources().getDimensionPixelSize(R.dimen.f36020_resource_name_obfuscated_res_0x7f0804ff);
            rect.bottom = getResources().getDimensionPixelSize(R.dimen.f36020_resource_name_obfuscated_res_0x7f0804ff) + rect.bottom;
        }
        if (this.t != null && rect.equals(this.w) && this.v == z) {
            return;
        }
        this.w = rect;
        TouchDelegate touchDelegate2 = this.t;
        if (touchDelegate2 != null) {
            this.u.a.remove(touchDelegate2);
        }
        TouchDelegate touchDelegate3 = new TouchDelegate(rect, this.i);
        this.t = touchDelegate3;
        this.u.a.add(touchDelegate3);
        this.v = z;
    }

    public final void b() {
        C3799bD c3799bD;
        if (!isShown() || (c3799bD = this.z) == null) {
            return;
        }
        this.A = c3799bD.w(this.A);
    }

    public final void a() {
        C3799bD c3799bD = this.z;
        if (c3799bD != null) {
            c3799bD.u(this.A);
            this.A = -1;
        }
    }
}
