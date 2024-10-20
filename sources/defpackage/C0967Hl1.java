package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967Hl1 extends AbstractC9180qs3 {
    public static boolean w = true;
    public final JC p;
    public final C8793pl1 q;
    public final C0447Dl1 r;
    public ViewGroup s;
    public Animator t;
    public boolean u;
    public int v;

    /* JADX WARN: Type inference failed for: r4v3, types: [El1] */
    public C0967Hl1(Context context, C8793pl1 c8793pl1, CC cc, boolean z) {
        super(context);
        this.q = c8793pl1;
        this.p = cc;
        setVerticalScrollBarEnabled(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.topMargin = (int) (((z ? 144 : 104) * AbstractC1895Op0.b(context).d) + 0.5f);
        setLayoutParams(layoutParams);
        C0447Dl1 c0447Dl1 = new C0447Dl1(context, new Runnable() { // from class: El1
            @Override // java.lang.Runnable
            public final void run() {
                C0967Hl1.this.d(true);
            }
        }, new C0707Fl1(this));
        this.r = c0447Dl1;
        addView(c0447Dl1, new FrameLayout.LayoutParams(-1, -2, 1));
    }

    @Override // defpackage.AbstractC9180qs3, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() != 8) {
            setVisibility(0);
            setAlpha(0.0f);
            animate().alpha(1.0f).setDuration(250L);
        }
    }

    @Override // defpackage.AbstractC9180qs3
    public final void d(boolean z) {
        Animator animator = this.t;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.j;
        if (animator2 != null) {
            animator2.cancel();
        }
        ObjectAnimator b = b(z);
        this.j = b;
        b.addListener(new C8837ps3(this));
        this.j.start();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        if (getHeight() > 0) {
            getHeight();
        }
        Iterator it = this.q.a.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9821sl1) c11814ya2.next()).getClass();
            }
        }
    }

    public final void g() {
        ViewGroup viewGroup = this.s;
        if (viewGroup != null && getParent() == null) {
            viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -2, 81));
            addOnLayoutChangeListener(this.g);
        }
    }
}
