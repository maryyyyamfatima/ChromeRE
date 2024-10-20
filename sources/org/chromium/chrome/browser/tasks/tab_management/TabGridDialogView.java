package org.chromium.chrome.browser.tasks.tab_management;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC5521gD3;
import defpackage.AbstractC8142nr1;
import defpackage.C4393cw3;
import defpackage.C4736dw3;
import defpackage.C5080ew3;
import defpackage.C5424fw3;
import defpackage.C5768gw3;
import defpackage.InterpolatorC0485Dt;
import defpackage.OX2;
import defpackage.ViewTreeObserverOnGlobalLayoutListenerC3706aw3;
import defpackage.Y50;
import java.util.HashMap;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabGridDialogView extends FrameLayout {
    public static final /* synthetic */ int P = 0;
    public AnimatorSet A;
    public AnimatorSet B;
    public C4736dw3 C;
    public C5080ew3 D;
    public final HashMap E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f11529J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final Context a;
    public final int g;
    public final float h;
    public View i;
    public View j;
    public View k;
    public View l;
    public ViewGroup m;
    public ViewGroup n;
    public TextView o;
    public RelativeLayout p;
    public PropertyModel q;
    public OX2 r;
    public FrameLayout.LayoutParams s;
    public ViewTreeObserverOnGlobalLayoutListenerC3706aw3 t;
    public Animator u;
    public Animator v;
    public AnimatorSet w;
    public AnimatorSet x;
    public ObjectAnimator y;
    public ObjectAnimator z;

    public TabGridDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = new HashMap();
        this.K = 1;
        this.a = context;
        this.h = AbstractC5521gD3.c(context);
        this.g = (int) context.getResources().getDimension(R.dimen.f41310_resource_name_obfuscated_res_0x7f08079f);
        Object obj = Y50.a;
        context.getColor(R.color.f26740_resource_name_obfuscated_res_0x7f0708a1);
        this.N = AbstractC5521gD3.e(context, false, false);
        this.O = AbstractC5521gD3.e(context, false, true);
        this.L = AbstractC5521gD3.d(context, false, false);
        this.M = AbstractC5521gD3.d(context, false, true);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aw3] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        this.n = viewGroup;
        this.I = viewGroup.getHeight();
        this.f11529J = this.n.getWidth();
        this.t = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: aw3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i = TabGridDialogView.P;
                TabGridDialogView tabGridDialogView = TabGridDialogView.this;
                tabGridDialogView.getClass();
                if (C11939yv1.g.f(tabGridDialogView.a, tabGridDialogView)) {
                    return;
                }
                tabGridDialogView.f11529J = tabGridDialogView.n.getWidth();
                tabGridDialogView.I = tabGridDialogView.n.getHeight();
            }
        };
        this.n.getViewTreeObserver().addOnGlobalLayoutListener(this.t);
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this.t);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        a(configuration.orientation);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.s = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.dialog_container_view);
        this.p = relativeLayout;
        relativeLayout.setLayoutParams(this.s);
        View findViewById = findViewById(R.id.dialog_ungroup_bar);
        this.l = findViewById;
        this.o = (TextView) findViewById.findViewById(R.id.dialog_ungroup_bar_text);
        View findViewById2 = findViewById(R.id.dialog_frame);
        this.i = findViewById2;
        findViewById2.setLayoutParams(this.s);
        this.j = findViewById(R.id.dialog_animation_card_view);
        this.m = (ViewGroup) findViewById(R.id.dialog_snack_bar_container_view);
        a(this.a.getResources().getConfiguration().orientation);
        this.A = new AnimatorSet();
        this.B = new AnimatorSet();
        this.w = new AnimatorSet();
        this.w.play(ObjectAnimator.ofFloat(this.p, (Property<RelativeLayout, Float>) View.ALPHA, 0.0f, 1.0f));
        this.w.setInterpolator(InterpolatorC0485Dt.e);
        this.w.setDuration(300L);
        this.x = new AnimatorSet();
        this.x.play(ObjectAnimator.ofFloat(this.p, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f));
        this.x.setInterpolator(InterpolatorC0485Dt.d);
        this.x.setDuration(300L);
        this.x.addListener(new C4393cw3(this));
        this.C = new C4736dw3(this);
        this.D = new C5080ew3(this);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        this.y = ofFloat;
        ofFloat.setDuration(200L);
        this.y.setInterpolator(AbstractC8142nr1.g);
        this.y.addListener(new C5424fw3(this));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        this.z = ofFloat2;
        ofFloat2.setDuration(200L);
        this.z.setInterpolator(AbstractC8142nr1.d);
        this.z.addListener(new C5768gw3(this));
        this.p.setClipToOutline(true);
    }

    public final void a(int i) {
        Context context = this.a;
        if (i == 1) {
            this.F = (int) context.getResources().getDimension(R.dimen.f41130_resource_name_obfuscated_res_0x7f08078d);
            this.G = (int) context.getResources().getDimension(R.dimen.f41140_resource_name_obfuscated_res_0x7f08078e);
        } else {
            this.F = (int) context.getResources().getDimension(R.dimen.f41140_resource_name_obfuscated_res_0x7f08078e);
            this.G = (int) context.getResources().getDimension(R.dimen.f41130_resource_name_obfuscated_res_0x7f08078d);
        }
        FrameLayout.LayoutParams layoutParams = this.s;
        int i2 = this.F;
        int i3 = this.G;
        layoutParams.setMargins(i2, i3, i2, i3);
        this.H = i;
    }

    public final void b(boolean z) {
        this.l.bringToFront();
        ((GradientDrawable) this.o.getBackground()).setColor(z ? this.M : this.L);
        this.o.setTextColor(z ? this.O : this.N);
    }
}
