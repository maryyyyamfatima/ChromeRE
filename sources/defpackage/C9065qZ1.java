package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9065qZ1 {
    public final long a;
    public final long b;
    public final TimeInterpolator c;
    public int d = 0;
    public int e = 1;

    public C9065qZ1(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.b = 300L;
        this.c = null;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.a);
        objectAnimator.setDuration(this.b);
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator == null) {
            timeInterpolator = AbstractC0270Cc.b;
        }
        objectAnimator.setInterpolator(timeInterpolator);
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9065qZ1)) {
            return false;
        }
        C9065qZ1 c9065qZ1 = (C9065qZ1) obj;
        if (this.a != c9065qZ1.a || this.b != c9065qZ1.b || this.d != c9065qZ1.d || this.e != c9065qZ1.e) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = AbstractC0270Cc.b;
        }
        Class<?> cls = obj2.getClass();
        Object obj3 = c9065qZ1.c;
        if (obj3 == null) {
            obj3 = AbstractC0270Cc.b;
        }
        return cls.equals(obj3.getClass());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        Object obj = this.c;
        if (obj == null) {
            obj = AbstractC0270Cc.b;
        }
        return ((((obj.getClass().hashCode() + i) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C9065qZ1.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        Object obj = this.c;
        if (obj == null) {
            obj = AbstractC0270Cc.b;
        }
        sb.append(obj.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return AbstractC8207o22.a(sb, this.e, "}\n");
    }
}
