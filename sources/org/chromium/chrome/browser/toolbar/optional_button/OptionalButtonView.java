package org.chromium.chrome.browser.toolbar.optional_button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC2884Wf;
import defpackage.InterfaceC7913nB;
import defpackage.S93;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OptionalButtonView extends FrameLayout implements Transition.TransitionListener {
    public InterfaceC7913nB A;
    public final c B;
    public final int a;
    public final int g;
    public TextView h;
    public ImageView i;
    public ListMenuButton j;
    public ImageView k;
    public Drawable l;
    public ViewGroup m;
    public String n;
    public String o;
    public int p;
    public Runnable q;
    public int r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public View.OnClickListener w;
    public View.OnLongClickListener x;
    public Callback y;
    public Callback z;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public OptionalButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = 1;
        this.B = new c(this);
        this.r = 0;
        float f = getResources().getDisplayMetrics().density;
        this.a = (int) (52.0f * f);
        this.g = (int) (f * 8.0f);
    }

    @Override // android.view.View
    public final Handler getHandler() {
        return super.getHandler();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ImageView) findViewById(R.id.swappable_icon_secondary_background);
        this.j = (ListMenuButton) findViewById(R.id.optional_toolbar_button);
        this.k = (ImageView) findViewById(R.id.swappable_icon_animation_image);
        this.h = (TextView) findViewById(R.id.action_chip_label);
        this.i.setImageDrawable(AbstractC2884Wf.a(getContext(), R.drawable.f51340_resource_name_obfuscated_res_0x7f09039a));
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (this.r != 6) {
            this.j.setOnClickListener(null);
            this.j.setOnLongClickListener(null);
            this.j.setContentDescription(null);
        }
        Callback callback = this.y;
        if (callback != null) {
            callback.onResult(Integer.valueOf(c()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:            if (r6 != 7) goto L20;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // android.transition.Transition.TransitionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTransitionEnd(android.transition.Transition r6) {
        /*
            r5 = this;
            org.chromium.base.Callback r6 = r5.z
            r0 = 5
            if (r6 == 0) goto L18
            int r6 = r5.c()
            if (r6 == r0) goto L18
            org.chromium.base.Callback r6 = r5.z
            int r1 = r5.c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.onResult(r1)
        L18:
            int r6 = r5.r
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r6 == r1) goto L30
            r1 = 4
            if (r6 == r1) goto L2e
            if (r6 == r0) goto L2c
            r0 = 6
            if (r6 == r0) goto L30
            r0 = 7
            if (r6 == r0) goto L30
            goto L31
        L2c:
            r6 = r2
            goto L31
        L2e:
            r6 = r3
            goto L31
        L30:
            r6 = r4
        L31:
            r5.r = r6
            int r6 = r5.v
            r5.u = r6
            android.widget.ImageView r6 = r5.k
            r0 = 8
            r6.setVisibility(r0)
            int r6 = r5.r
            if (r6 != 0) goto L46
            r5.setVisibility(r0)
            goto L71
        L46:
            org.chromium.components.browser_ui.widget.listmenu.ListMenuButton r6 = r5.j
            r6.setVisibility(r3)
            org.chromium.components.browser_ui.widget.listmenu.ListMenuButton r6 = r5.j
            android.graphics.drawable.Drawable r0 = r5.l
            r6.setImageDrawable(r0)
            org.chromium.components.browser_ui.widget.listmenu.ListMenuButton r6 = r5.j
            android.view.View$OnClickListener r0 = r5.w
            r6.setOnClickListener(r0)
            org.chromium.components.browser_ui.widget.listmenu.ListMenuButton r6 = r5.j
            android.view.View$OnLongClickListener r0 = r5.x
            if (r0 == 0) goto L60
            r3 = r4
        L60:
            r6.setLongClickable(r3)
            org.chromium.components.browser_ui.widget.listmenu.ListMenuButton r6 = r5.j
            android.view.View$OnLongClickListener r0 = r5.x
            r6.setOnLongClickListener(r0)
            org.chromium.components.browser_ui.widget.listmenu.ListMenuButton r6 = r5.j
            java.lang.String r0 = r5.n
            r6.setContentDescription(r0)
        L71:
            int r6 = r5.r
            if (r6 != r2) goto L8b
            android.os.Handler r6 = r5.getHandler()
            nE r0 = defpackage.UN.a
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r1 = "ContextualPageActionPriceTracking"
            java.lang.String r2 = "action_chip_time_ms"
            int r0 = J.N.M37SqSAy(r1, r2, r0)
            long r0 = (long) r0
            org.chromium.chrome.browser.toolbar.optional_button.c r2 = r5.B
            r6.postDelayed(r2, r0)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.toolbar.optional_button.OptionalButtonView.onTransitionEnd(android.transition.Transition):void");
    }

    public final TransitionSet b() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        Fade fade = new Fade();
        ChangeBounds changeBounds = new ChangeBounds();
        S93 s93 = new S93();
        Slide slide = new Slide(8388613);
        slide.addTarget(this.j);
        slide.addTarget(this.i);
        transitionSet.addTransition(slide).addTransition(s93).addTransition(fade).addTransition(changeBounds);
        transitionSet.setDuration(225L);
        transitionSet.addListener((Transition.TransitionListener) this);
        return transitionSet;
    }

    public final TransitionSet a() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        ChangeBounds changeBounds = new ChangeBounds();
        Fade fade = new Fade();
        transitionSet.addTransition(changeBounds).addTransition(fade).addTransition(new S93());
        transitionSet.setDuration(300L);
        transitionSet.addListener((Transition.TransitionListener) this);
        return transitionSet;
    }

    public final int c() {
        switch (this.r) {
            case 0:
            case 1:
            case 2:
                return 5;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 1;
            case 4:
                return 2;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 3;
            case 6:
                return 4;
            case 7:
                return 0;
            default:
                throw new IllegalStateException("Unexpected value: " + this.r);
        }
    }

    public final void d(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public final void e(boolean z) {
        TransitionSet b = b();
        if (!z) {
            b.setDuration(0L);
        }
        setVisibility(0);
        d(0);
        this.j.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.j.setImageDrawable(this.l);
        TransitionManager.beginDelayedTransition(this.m, b);
        d(this.a);
        this.j.setVisibility(0);
        this.i.setColorFilter(this.p);
        this.i.setVisibility(this.v != 1 ? 8 : 0);
        this.r = 3;
    }
}
