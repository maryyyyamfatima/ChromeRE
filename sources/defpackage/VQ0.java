package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VQ0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C3526aR0 g;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ArrayList arrayList;
        int i9;
        C3526aR0 c3526aR0 = this.g;
        c3526aR0.a.removeOnLayoutChangeListener(this);
        LinearLayout linearLayout = c3526aR0.a;
        int childCount = linearLayout.getChildCount();
        int i10 = c3526aR0.c;
        Runnable runnable = this.a;
        if (i10 == childCount) {
            ArrayList a = c3526aR0.a();
            int i11 = 0;
            boolean z = false;
            while (true) {
                int size = a.size();
                arrayList = c3526aR0.d;
                boolean z2 = true;
                if (i11 >= size || z) {
                    break;
                }
                if (((Integer) a.get(i11)).compareTo((Integer) arrayList.get(i11)) == 0) {
                    z2 = false;
                }
                z |= z2;
                i11++;
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                arrayList2.add(ofFloat);
                while (i9 < linearLayout.getChildCount()) {
                    if (((Integer) arrayList.get(i9)).compareTo((Integer) a.get(i9)) == 0) {
                        int i12 = i9 + 1;
                        i9 = ((Integer) arrayList.get(i12)).compareTo((Integer) a.get(i12)) == 0 ? i9 + 1 : 0;
                    }
                    View childAt = linearLayout.getChildAt(i9);
                    int intValue = ((Integer) arrayList.get(i9)).intValue() - ((Integer) a.get(i9)).intValue();
                    int i13 = i9 + 1;
                    int intValue2 = ((Integer) arrayList.get(i13)).intValue() - ((Integer) arrayList.get(i9)).intValue();
                    int intValue3 = ((Integer) a.get(i13)).intValue() - ((Integer) a.get(i9)).intValue();
                    ofFloat.addUpdateListener(new WQ0(childAt, intValue, intValue2, intValue3));
                    ofFloat.addListener(new XQ0(childAt, intValue3));
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) arrayList.get(arrayList.size() - 1)).intValue(), ((Integer) a.get(a.size() - 1)).intValue());
                ofInt.addUpdateListener(new YQ0(c3526aR0));
                arrayList2.add(ofInt);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(225L);
                animatorSet.setInterpolator(AbstractC8142nr1.g);
                animatorSet.playTogether(arrayList2);
                animatorSet.addListener(new ZQ0(c3526aR0, runnable));
                animatorSet.start();
                return;
            }
            c3526aR0.b();
            runnable.run();
            return;
        }
        c3526aR0.b();
        runnable.run();
    }

    public VQ0(C3526aR0 c3526aR0, RunnableC3327Zp2 runnableC3327Zp2) {
        this.g = c3526aR0;
        this.a = runnableC3327Zp2;
    }
}
