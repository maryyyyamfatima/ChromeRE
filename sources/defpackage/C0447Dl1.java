package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.components.infobars.InfoBar;
import org.chromium.ui.widget.OptimizedFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0447Dl1 extends OptimizedFrameLayout {
    public final int g;
    public final ArrayList h;
    public final ArrayList i;
    public final InterfaceC6730jl1 j;
    public AbstractC0187Bl1 k;
    public final C10850vl1 l;
    public final Runnable m;

    public C0447Dl1(Context context, RunnableC0577El1 runnableC0577El1, C0707Fl1 c0707Fl1) {
        super(context, null);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.g = context.getResources().getDimensionPixelSize(R.dimen.f34280_resource_name_obfuscated_res_0x7f080384);
        this.l = new C10850vl1(this);
        this.j = c0707Fl1;
        this.m = runnableC0577El1;
    }

    public final void e() {
        ArrayList arrayList;
        if (this.k != null) {
            return;
        }
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        do {
            size--;
            arrayList = this.h;
            if (size < 0) {
                if (!arrayList2.isEmpty()) {
                    if (((C2136Ql1) arrayList2.get(0)).getChildAt(0) != ((InfoBar) ((C2136Ql1) arrayList2.get(0)).a).k) {
                        f(new C11879yl1(this));
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    InterfaceC2006Pl1 interfaceC2006Pl1 = ((C2136Ql1) arrayList2.get(0)).a;
                    InterfaceC2006Pl1 interfaceC2006Pl12 = null;
                    for (int i = 0; i < arrayList.size() && arrayList.get(i) != interfaceC2006Pl1; i++) {
                        interfaceC2006Pl12 = (InterfaceC2006Pl1) arrayList.get(i);
                    }
                    if (interfaceC2006Pl12 != null) {
                        f(new C11193wl1(this, interfaceC2006Pl12));
                        return;
                    }
                }
                if (arrayList2.size() >= Math.min(arrayList.size(), 3)) {
                    this.j.b(arrayList2.size() > 0 ? ((C2136Ql1) arrayList2.get(0)).a : null);
                    return;
                } else {
                    InterfaceC2006Pl1 interfaceC2006Pl13 = (InterfaceC2006Pl1) arrayList.get(arrayList2.size());
                    f(arrayList2.isEmpty() ? new C10507ul1(this, interfaceC2006Pl13) : new C10164tl1(this, interfaceC2006Pl13));
                    return;
                }
            }
        } while (arrayList.contains(((C2136Ql1) arrayList2.get(size)).a));
        if (size == 0 && arrayList2.size() >= 2) {
            f(new C11536xl1(this));
            return;
        }
        C2136Ql1 c2136Ql1 = (C2136Ql1) arrayList2.get(size);
        if (size != arrayList2.size() - 1) {
            removeView(c2136Ql1);
            arrayList2.remove(c2136Ql1);
            j();
            c(c2136Ql1);
        }
        f(new C0317Cl1(this));
    }

    public final void f(AbstractC0187Bl1 abstractC0187Bl1) {
        this.k = abstractC0187Bl1;
        abstractC0187Bl1.e();
        if (isLayoutRequested()) {
            return;
        }
        AbstractC0187Bl1 abstractC0187Bl12 = this.k;
        abstractC0187Bl12.getClass();
        C12222zl1 c12222zl1 = new C12222zl1(abstractC0187Bl12);
        Animator a = abstractC0187Bl12.a();
        abstractC0187Bl12.a = a;
        a.addListener(c12222zl1);
        abstractC0187Bl12.a.start();
    }

    public final void c(C2136Ql1 c2136Ql1) {
        addView(c2136Ql1, 0, new FrameLayout.LayoutParams(-1, -2));
        this.i.add(c2136Ql1);
        j();
    }

    public final void j() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin = ((size - 1) - i) * this.g;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // org.chromium.ui.widget.OptimizedFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C10850vl1 c10850vl1 = this.l;
        c10850vl1.getClass();
        int size = View.MeasureSpec.getSize(i);
        int i3 = c10850vl1.b;
        boolean z = size > i3;
        boolean z2 = c10850vl1.d;
        int i4 = c10850vl1.c;
        if (z != z2) {
            c10850vl1.d = z;
            FrameLayout frameLayout = c10850vl1.a;
            if (!z) {
                frameLayout.setPadding(0, 0, 0, 0);
                frameLayout.removeView(c10850vl1.e);
                frameLayout.removeView(c10850vl1.f);
            } else {
                if (c10850vl1.e == null) {
                    View view = new View(frameLayout.getContext());
                    c10850vl1.e = view;
                    view.setBackgroundResource(R.drawable.f50930_resource_name_obfuscated_res_0x7f090361);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0, 3);
                    int i5 = -i4;
                    layoutParams.leftMargin = i5;
                    c10850vl1.e.setLayoutParams(layoutParams);
                    View view2 = new View(frameLayout.getContext());
                    c10850vl1.f = view2;
                    view2.setBackgroundResource(R.drawable.f50930_resource_name_obfuscated_res_0x7f090361);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, 0, 5);
                    layoutParams2.rightMargin = i5;
                    c10850vl1.f.setScaleX(-1.0f);
                    c10850vl1.f.setLayoutParams(layoutParams2);
                }
                frameLayout.setPadding(i4, 0, i4, 0);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(c10850vl1.e);
                frameLayout.addView(c10850vl1.f);
            }
        }
        if (z) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, (i4 * 2) + i3), View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        if (c10850vl1.d) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c10850vl1.c, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            c10850vl1.e.measure(makeMeasureSpec, makeMeasureSpec2);
            c10850vl1.f.measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }

    @Override // android.view.View
    public final void announceForAccessibility(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        super.announceForAccessibility(charSequence);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.l.a();
        AbstractC0187Bl1 abstractC0187Bl1 = this.k;
        if (abstractC0187Bl1 != null) {
            if (abstractC0187Bl1.a != null) {
                return;
            }
            C12222zl1 c12222zl1 = new C12222zl1(abstractC0187Bl1);
            Animator a = abstractC0187Bl1.a();
            abstractC0187Bl1.a = a;
            a.addListener(c12222zl1);
            abstractC0187Bl1.a.start();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!super.onInterceptTouchEvent(motionEvent) && this.k == null) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty() || ((C2136Ql1) arrayList.get(0)).a.j()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }
}
