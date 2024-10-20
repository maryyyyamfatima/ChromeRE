package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8722pZ1 {
    public final C1439Lb3 a = new C1439Lb3();
    public final C1439Lb3 b = new C1439Lb3();

    public final C9065qZ1 c(String str) {
        C1439Lb3 c1439Lb3 = this.a;
        if (!(c1439Lb3.get(str) != null)) {
            throw new IllegalArgumentException();
        }
        return (C9065qZ1) c1439Lb3.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0030 -> B:17:0x0047). Please report as a decompilation issue!!! */
    public static C8722pZ1 a(Context context, TypedArray typedArray, int i) {
        C8722pZ1 c8722pZ1;
        int i2;
        boolean hasValue = typedArray.hasValue(i);
        int i3 = typedArray;
        if (hasValue) {
            i2 = typedArray.getResourceId(i, 0);
            i3 = i2;
            if (i2 != 0) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
                    i3 = i2;
                    if (loadAnimator instanceof AnimatorSet) {
                        c8722pZ1 = b(((AnimatorSet) loadAnimator).getChildAnimations());
                        i2 = i2;
                    } else if (loadAnimator != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(loadAnimator);
                        c8722pZ1 = b(arrayList);
                        i2 = i2;
                    }
                } catch (Exception e) {
                    String str = "Can't load animation resource ID #0x" + Integer.toHexString(i2);
                    Log.w("MotionSpec", str, e);
                    i3 = str;
                }
                return c8722pZ1;
            }
        }
        c8722pZ1 = null;
        i2 = i3;
        return c8722pZ1;
    }

    public static C8722pZ1 b(ArrayList arrayList) {
        C8722pZ1 c8722pZ1 = new C8722pZ1();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c8722pZ1.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = AbstractC0270Cc.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = AbstractC0270Cc.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = AbstractC0270Cc.d;
                }
                C9065qZ1 c9065qZ1 = new C9065qZ1(startDelay, duration, interpolator);
                c9065qZ1.d = objectAnimator.getRepeatCount();
                c9065qZ1.e = objectAnimator.getRepeatMode();
                c8722pZ1.a.put(propertyName, c9065qZ1);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(animator)));
            }
        }
        return c8722pZ1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8722pZ1) {
            return this.a.equals(((C8722pZ1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + C8722pZ1.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
