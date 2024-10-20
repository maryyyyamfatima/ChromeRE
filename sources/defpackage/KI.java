package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KI extends QV3 {
    public static final String[] C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final CI D;
    public static final DI E;
    public static final EI F;
    public static final FI G;
    public static final GI H;

    static {
        new BI();
        D = new CI();
        E = new DI();
        F = new EI();
        G = new FI();
        H = new GI();
    }

    @Override // defpackage.QV3
    public final String[] q() {
        return C;
    }

    public final void I(C10766vW3 c10766vW3) {
        WeakHashMap weakHashMap = Ec4.a;
        View view = c10766vW3.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c10766vW3.a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.QV3
    public final void h(C10766vW3 c10766vW3) {
        I(c10766vW3);
    }

    @Override // defpackage.QV3
    public final void e(C10766vW3 c10766vW3) {
        I(c10766vW3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.QV3
    public final Animator l(ViewGroup viewGroup, C10766vW3 c10766vW3, C10766vW3 c10766vW32) {
        int i;
        KI ki;
        ObjectAnimator ofObject;
        if (c10766vW3 == null || c10766vW32 == null) {
            return null;
        }
        HashMap hashMap = c10766vW3.a;
        HashMap hashMap2 = c10766vW32.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        View view = c10766vW32.b;
        De4.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            ki = this;
            if (i2 == i3 && i4 == i5) {
                ki.y.getClass();
                ofObject = ObjectAnimator.ofObject(view, F, (TypeConverter) null, C11104wV3.a(i6, i8, i7, i9));
            } else {
                ki.y.getClass();
                ofObject = ObjectAnimator.ofObject(view, G, (TypeConverter) null, C11104wV3.a(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            ki = this;
            ki.y.getClass();
            ofObject = ObjectAnimator.ofObject(view, H, (TypeConverter) null, C11104wV3.a(i2, i4, i3, i5));
        } else {
            ki = this;
            JI ji = new JI(view);
            ki.y.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(ji, D, (TypeConverter) null, C11104wV3.a(i2, i4, i3, i5));
            ki.y.getClass();
            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(ji, E, (TypeConverter) null, C11104wV3.a(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new HI(ji));
            ofObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            Wc4.a(viewGroup4, true);
            ki.a(new II(viewGroup4));
        }
        return ofObject;
    }
}
