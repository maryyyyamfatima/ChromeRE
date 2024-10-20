package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.b;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G13 extends b implements InterfaceC4792e61 {
    public static final /* synthetic */ int T = 0;
    public final C11703yE1 O;
    public final RecyclerView P;
    public C0596Ep0 Q;
    public boolean R;
    public AbstractC2348Sb3 S;

    public G13(Context context, C8617pE1 c8617pE1) {
        super(context);
        this.R = false;
        this.P = c8617pE1;
        c8617pE1.o0(new F13());
        androidx.recyclerview.widget.b bVar = c8617pE1.h;
        bVar.e = 0;
        bVar.m();
        addView(c8617pE1);
        C11703yE1 c11703yE1 = new C11703yE1(new C7849n00(getContext(), (String) null, (C5524gE1) null, (C5277fX3) null));
        this.O = c11703yE1;
        c11703yE1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(c11703yE1);
    }

    @Override // androidx.swiperefreshlayout.widget.b, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        t(View.MeasureSpec.getSize(i));
    }

    public final void t(int i) {
        measureChild(this.O, View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    @Override // androidx.swiperefreshlayout.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C11703yE1 c11703yE1 = this.O;
        if (c11703yE1.getVisibility() == 8) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        c11703yE1.layout(paddingLeft, paddingTop, c11703yE1.getMeasuredWidth() + paddingLeft, c11703yE1.getMeasuredHeight() + paddingTop);
    }

    @Override // androidx.swiperefreshlayout.widget.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6206iD0 c6206iD0;
        C0596Ep0 c0596Ep0 = this.Q;
        if (c0596Ep0 != null && (c6206iD0 = c0596Ep0.a) != null) {
            AbstractC4830eD0.a(c6206iD0, this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.b, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() == null || this.m.d) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.P.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.InterfaceC4105c61
    public final C0596Ep0 b() {
        return this.Q;
    }

    @Override // defpackage.InterfaceC4105c61
    public final void c(C0596Ep0 c0596Ep0) {
        this.Q = c0596Ep0;
    }

    @Override // defpackage.InterfaceC4792e61
    public final void a(ArrayList arrayList) {
        RecyclerView recyclerView = this.P;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof C11703yE1) {
                arrayList.add((C11703yE1) childAt);
            }
        }
    }
}
