package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8565p5 {
    public static final C7190l5 f = new C7190l5();
    public ObjectAnimator a;
    public boolean b;
    public float c;
    public final Context d;
    public final C11840ye4 e;

    public final int a() {
        J4 j4 = this.e.a;
        if (j4 != null) {
            return j4.e();
        }
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(new int[]{R.attr.f2140_resource_name_obfuscated_res_0x7f050003});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public C8565p5(Context context, C11840ye4 c11840ye4, KO3 ko3) {
        this.e = c11840ye4;
        this.d = context;
        ko3.a = this;
        this.c = context.getResources().getDimension(R.dimen.f41520_resource_name_obfuscated_res_0x7f0807b5);
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        int[] iArr = {(int) Math.max(0.0f, a() - this.c)};
        C11840ye4 c11840ye4 = this.e;
        ObjectAnimator duration = ObjectAnimator.ofInt(c11840ye4, f, iArr).setDuration(200L);
        this.a = duration;
        duration.addListener(new C7534m5(this));
        this.a.addUpdateListener(new C7878n5(this));
        c11840ye4.getClass();
        c11840ye4.c.setVisibility(0);
        this.a.start();
        this.b = true;
    }

    public final void b() {
        if (this.b) {
            ObjectAnimator objectAnimator = this.a;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator duration = ObjectAnimator.ofInt(this.e, f, 0).setDuration(200L);
            this.a = duration;
            duration.addListener(new C8222o5(this));
            this.a.start();
            this.b = false;
        }
    }
}
