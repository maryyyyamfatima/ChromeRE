package defpackage;

import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3119Ya extends B12 {
    public final RunnableC2859Wa g;
    public final C2989Xa h;
    public float i;

    /* JADX WARN: Type inference failed for: r3v3, types: [Wa] */
    public C3119Ya(ViewGroup viewGroup) {
        super(viewGroup);
        C2989Xa c2989Xa = new C2989Xa(viewGroup.getContext());
        this.h = c2989Xa;
        c2989Xa.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.g = new Runnable() { // from class: Wa
            @Override // java.lang.Runnable
            public final void run() {
                C3119Ya c3119Ya = C3119Ya.this;
                c3119Ya.a.removeView(c3119Ya.h);
            }
        };
    }

    @Override // defpackage.B12
    public final void b(float f, float f2) {
        ViewGroup viewGroup = this.a;
        viewGroup.removeCallbacks(this.g);
        C2989Xa c2989Xa = this.h;
        if (c2989Xa.getParent() == null) {
            viewGroup.addView(c2989Xa);
        }
    }

    @Override // defpackage.B12
    public final void a(float f) {
        float f2 = -(f - this.i);
        this.i = f;
        this.h.a.onPull(f2 / this.a.getWidth());
    }

    @Override // defpackage.B12
    public final void d() {
        c();
    }

    @Override // defpackage.B12
    public final void c() {
        C2989Xa c2989Xa = this.h;
        c2989Xa.a.onRelease();
        c2989Xa.postInvalidateOnAnimation();
        if (c2989Xa.getParent() != null) {
            this.a.postDelayed(this.g, 500L);
        }
        this.i = 0.0f;
    }
}
