package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kw */
/* loaded from: classes.dex */
public final class C1410Kw implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            AbstractC2969Ww abstractC2969Ww = (AbstractC2969Ww) message.obj;
            Snackbar$SnackbarLayout snackbar$SnackbarLayout = abstractC2969Ww.c;
            if (snackbar$SnackbarLayout.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = snackbar$SnackbarLayout.getLayoutParams();
                if (layoutParams instanceof C5153f90) {
                    C5153f90 c5153f90 = (C5153f90) layoutParams;
                    C2579Tw c2579Tw = new C2579Tw();
                    C2709Uw c2709Uw = c2579Tw.h;
                    c2709Uw.getClass();
                    c2709Uw.a = abstractC2969Ww.m;
                    c2579Tw.b = new C2189Qw(abstractC2969Ww);
                    c5153f90.b(c2579Tw);
                    c5153f90.g = 80;
                }
                snackbar$SnackbarLayout.o = true;
                abstractC2969Ww.a.addView(snackbar$SnackbarLayout);
                snackbar$SnackbarLayout.o = false;
                snackbar$SnackbarLayout.setVisibility(4);
            }
            WeakHashMap weakHashMap = Ec4.a;
            if (snackbar$SnackbarLayout.isLaidOut()) {
                abstractC2969Ww.e();
            } else {
                abstractC2969Ww.k = true;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        AbstractC2969Ww abstractC2969Ww2 = (AbstractC2969Ww) message.obj;
        int i2 = message.arg1;
        AccessibilityManager accessibilityManager = abstractC2969Ww2.l;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            Snackbar$SnackbarLayout snackbar$SnackbarLayout2 = abstractC2969Ww2.c;
            if (snackbar$SnackbarLayout2.getVisibility() == 0) {
                if (snackbar$SnackbarLayout2.h == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(AbstractC0270Cc.a);
                    ofFloat.addUpdateListener(new C0630Ew(abstractC2969Ww2));
                    ofFloat.setDuration(75L);
                    ofFloat.addListener(new C0500Dw(abstractC2969Ww2, i2));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = snackbar$SnackbarLayout2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = snackbar$SnackbarLayout2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(AbstractC0270Cc.b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new C1150Iw(abstractC2969Ww2, i2));
                    valueAnimator.addUpdateListener(new C1280Jw(abstractC2969Ww2));
                    valueAnimator.start();
                }
                return true;
            }
        }
        abstractC2969Ww2.c();
        return true;
    }
}
