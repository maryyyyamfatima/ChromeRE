package org.chromium.chrome.browser.accessibility_tab_switcher;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.A1;
import defpackage.AbstractC10957w33;
import defpackage.AbstractC1558Lz3;
import defpackage.AbstractC9771sd;
import defpackage.B1;
import defpackage.C10598v1;
import defpackage.C10941w1;
import defpackage.C11627y1;
import defpackage.C11970z1;
import defpackage.C1587Mf2;
import defpackage.RunnableC11284x1;
import defpackage.Y50;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabFavicon;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AccessibilityTabModelListItem extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int M = 0;
    public boolean A;
    public boolean B;
    public C10598v1 C;
    public final GestureDetector D;
    public final int E;
    public AccessibilityTabModelListView F;
    public boolean G;
    public final RunnableC11284x1 H;
    public final Handler I;

    /* renamed from: J, reason: collision with root package name */
    public final C11627y1 f11517J;
    public final C11970z1 K;
    public final A1 L;
    public final int a;
    public final int g;
    public final int h;
    public AnimatorSet i;
    public final float j;
    public final float k;
    public final int l;
    public final int m;
    public final ColorStateList n;
    public final ColorStateList o;
    public final ColorStateList p;
    public final ColorStateList q;
    public float r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public ImageView v;
    public ImageButton w;
    public LinearLayout x;
    public Button y;
    public Tab z;

    public AccessibilityTabModelListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new RunnableC11284x1(this);
        this.I = new Handler();
        this.f11517J = new C11627y1(this);
        this.K = new C11970z1(this);
        this.L = new A1(this);
        this.D = new GestureDetector(context, new B1(this));
        float dimension = context.getResources().getDimension(R.dimen.f40900_resource_name_obfuscated_res_0x7f080775);
        this.j = dimension;
        this.k = dimension / 3.0f;
        this.E = context.getResources().getDimensionPixelOffset(R.dimen.f27910_resource_name_obfuscated_res_0x7f080051);
        this.n = Y50.b(context, R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
        this.o = Y50.b(context, R.color.f17750_resource_name_obfuscated_res_0x7f070117);
        this.p = Y50.b(context, R.color.f17860_resource_name_obfuscated_res_0x7f07012a);
        this.q = Y50.b(context, R.color.f27100_resource_name_obfuscated_res_0x7f0708d4);
        this.l = getResources().getInteger(R.integer.f54680_resource_name_obfuscated_res_0x7f0c0043);
        this.m = getResources().getInteger(R.integer.f54690_resource_name_obfuscated_res_0x7f0c0044);
        this.a = 100;
        this.g = 300;
        this.h = 4000;
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        this.s = linearLayout;
        this.t = (TextView) linearLayout.findViewById(R.id.title);
        this.u = (TextView) this.s.findViewById(R.id.description);
        this.v = (ImageView) this.s.findViewById(R.id.start_icon);
        this.w = (ImageButton) this.s.findViewById(R.id.end_button);
        this.v.setBackgroundResource(R.drawable.f51090_resource_name_obfuscated_res_0x7f090371);
        this.x = (LinearLayout) findViewById(R.id.undo_contents);
        this.y = (Button) findViewById(R.id.undo_button);
        setClickable(true);
        setFocusable(true);
        this.w.setOnClickListener(this);
        this.y.setOnClickListener(this);
        setOnClickListener(this);
        this.w.setVisibility(0);
        this.w.setImageResource(R.drawable.f45040_resource_name_obfuscated_res_0x7f0900c7);
        this.w.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.w.setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.f27930_resource_name_obfuscated_res_0x7f080053), getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.f27920_resource_name_obfuscated_res_0x7f080052), getPaddingBottom());
    }

    public final void e(boolean z) {
        if (z && this.A) {
            this.x.setVisibility(0);
            this.s.setVisibility(4);
            this.x.requestFocus();
        } else {
            this.s.setVisibility(0);
            this.x.setVisibility(4);
            g();
            f();
        }
    }

    public final void g() {
        String str;
        String str2;
        String string;
        Tab tab = this.z;
        if (tab == null || !tab.isInitialized()) {
            str = null;
            str2 = null;
        } else {
            str = this.z.getTitle();
            str2 = this.z.getUrl().i();
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = getContext().getResources().getString(R.string.f88850_resource_name_obfuscated_res_0x7f140b14);
        }
        if (!str.equals(this.t.getText())) {
            this.t.setText(str);
        }
        if (this.B) {
            string = getContext().getString(R.string.f66560_resource_name_obfuscated_res_0x7f140182, str);
        } else {
            string = getContext().getString(R.string.f66550_resource_name_obfuscated_res_0x7f140181, str);
        }
        if (!string.equals(getContentDescription())) {
            setContentDescription(string);
            this.w.setContentDescription(getContext().getString(R.string.f66470_resource_name_obfuscated_res_0x7f140179, str));
        }
        if (this.z.isIncognito()) {
            setBackgroundResource(R.color.f17390_resource_name_obfuscated_res_0x7f0700e8);
            this.v.getBackground().setLevel(this.m);
            AbstractC9771sd.i(R.style.f102610_resource_name_obfuscated_res_0x7f150442, this.t);
            AbstractC9771sd.i(R.style.f102750_resource_name_obfuscated_res_0x7f150450, this.u);
            this.w.setImageTintList(this.q);
        } else {
            setBackgroundColor(AbstractC10957w33.a(getContext()));
            this.v.getBackground().setLevel(this.l);
            AbstractC9771sd.i(R.style.f102580_resource_name_obfuscated_res_0x7f15043f, this.t);
            AbstractC9771sd.i(R.style.f102770_resource_name_obfuscated_res_0x7f150452, this.u);
            this.w.setImageTintList(this.p);
        }
        if (TextUtils.isEmpty(str2)) {
            this.u.setVisibility(8);
        } else {
            this.u.setText(str2);
            this.u.setVisibility(0);
        }
    }

    public final void f() {
        Tab tab = this.z;
        if (tab != null) {
            Bitmap e = TabFavicon.e(tab);
            if (e != null) {
                this.v.setImageTintList(null);
                this.v.setImageBitmap(e);
            } else {
                this.v.setImageResource(R.drawable.f47730_resource_name_obfuscated_res_0x7f090212);
                this.v.setImageTintList(this.z.isIncognito() ? this.o : this.n);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.C == null) {
            return;
        }
        int id = this.z.getId();
        if (view == this && !this.C.a.h.z(id)) {
            C10941w1 c10941w1 = this.C.a;
            C1587Mf2 c1587Mf2 = c10941w1.i;
            if (c1587Mf2 != null) {
                c1587Mf2.J(id, true);
            }
            TabModel tabModel = c10941w1.h;
            tabModel.q(AbstractC1558Lz3.d(tabModel, id), 3, false);
            c10941w1.notifyDataSetChanged();
            return;
        }
        if (view == this.w) {
            this.G = true;
            if (!this.A) {
                b();
                return;
            }
            a();
            this.r = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.SCALE_X, 1.2f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.SCALE_Y, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.ALPHA, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat3, ofFloat2, ofFloat);
            animatorSet.addListener(this.f11517J);
            animatorSet.setDuration(this.a);
            animatorSet.start();
            this.i = animatorSet;
            return;
        }
        Button button = this.y;
        if (view == button) {
            this.y.announceForAccessibility(button.getContext().getString(R.string.f66780_resource_name_obfuscated_res_0x7f140198, this.z.getTitle()));
            this.I.removeCallbacks(this.H);
            C10941w1 c10941w12 = this.C.a;
            c10941w12.h.m(id);
            c10941w12.notifyDataSetChanged();
            e(false);
            setAlpha(0.0f);
            float f = this.r;
            if (f > 0.0f) {
                setTranslationX(getWidth());
                c(false);
            } else if (f < 0.0f) {
                setTranslationX(-getWidth());
                c(false);
            } else {
                setScaleX(1.2f);
                setScaleY(0.0f);
                c(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z != null) {
            f();
            g();
            this.z.v(this.L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Tab tab = this.z;
        if (tab != null) {
            tab.w(this.L);
        }
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.I.removeCallbacks(this.H);
        if (this.D.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (Math.abs(getTranslationX()) > this.j) {
                d(300L);
            } else {
                c(false);
            }
            this.F.g = true;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setHeight(int i) {
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, i);
        } else if (layoutParams.height == i) {
            return;
        } else {
            layoutParams.height = i;
        }
        setLayoutParams(layoutParams);
    }

    public final void d(long j) {
        a();
        this.r = getTranslationX();
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = getTranslationX() > 0.0f ? getWidth() : -getWidth();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) property, fArr);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.ALPHA, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat2, ofFloat);
        animatorSet.addListener(this.f11517J);
        animatorSet.setDuration(Math.min(j, this.g));
        animatorSet.start();
        this.i = animatorSet;
    }

    public final void c(boolean z) {
        int i;
        a();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.TRANSLATION_X, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.ALPHA, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.SCALE_X, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.SCALE_Y, 1.0f);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "height", this.E);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofInt);
        if (z) {
            i = this.a;
        } else {
            i = this.g;
        }
        animatorSet.setDuration(i);
        animatorSet.start();
        this.i = animatorSet;
    }

    public final void b() {
        a();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "height", 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<AccessibilityTabModelListItem, Float>) View.SCALE_Y, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.addListener(this.K);
        animatorSet.setDuration(this.g);
        animatorSet.start();
        this.i = animatorSet;
    }

    public final void a() {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.i.cancel();
        }
        this.i = null;
    }
}
