package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9425rc2 extends RecyclerView {
    public final int P0;
    public final int Q0;
    public final int[] R0;
    public final Rect S0;
    public final C9083qc2 T0;
    public C9768sc2 U0;
    public InterfaceC10111tc2 V0;
    public InterfaceC8740pc2 W0;
    public View X0;
    public AbstractC4159cG1 Y0;
    public ViewTreeObserverOnGlobalLayoutListenerC7709mc2 Z0;
    public ViewOnLayoutChangeListenerC8053nc2 a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;

    public C9425rc2(Context context) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.R0 = new int[2];
        this.S0 = new Rect();
        this.d1 = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        C8397oc2 c8397oc2 = new C8397oc2();
        b bVar = this.h;
        RecyclerView recyclerView = bVar.h;
        bVar.e(recyclerView.r, false);
        if (bVar.g != null) {
            r6.b--;
        }
        bVar.g = c8397oc2;
        if (recyclerView.r != null) {
            c8397oc2.b++;
        }
        bVar.d();
        p0(null);
        C9083qc2 c9083qc2 = new C9083qc2(this);
        this.T0 = c9083qc2;
        this.o0 = c9083qc2;
        q0(new C7365lc2(this));
        setPaddingRelative(0, 0, 0, context.getResources().getDimensionPixelOffset(com.android.chrome.R.dimen.f37850_resource_name_obfuscated_res_0x7f080630));
        this.P0 = AbstractC11746yN.a(context, false);
        this.Q0 = AbstractC11746yN.a(context, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(AbstractC8305oK2 abstractC8305oK2) {
        C9768sc2 c9768sc2 = (C9768sc2) abstractC8305oK2;
        this.U0 = c9768sc2;
        super.n0(c9768sc2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d1 = 0;
        this.X0.getViewTreeObserver().addOnGlobalLayoutListener(this.Z0);
        if (this.Y0 != null) {
            x0();
            this.Y0.addOnLayoutChangeListener(this.a1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.c().a();
        this.X0.getViewTreeObserver().removeOnGlobalLayoutListener(this.Z0);
        AbstractC4159cG1 abstractC4159cG1 = this.Y0;
        if (abstractC4159cG1 != null) {
            abstractC4159cG1.removeOnLayoutChangeListener(this.a1);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        if (!isShown()) {
            return false;
        }
        C9768sc2 c9768sc2 = this.U0;
        View view = null;
        if (c9768sc2.l != null && (i2 = c9768sc2.k) >= 0 && i2 < c9768sc2.q()) {
            View r = c9768sc2.l.r(c9768sc2.k);
            if (r != null) {
                view = r;
            } else {
                c9768sc2.k = -1;
            }
        }
        if (view != null && view.onKeyDown(i, keyEvent)) {
            return true;
        }
        int i3 = this.U0.k;
        if (AbstractC7472lu1.b(keyEvent)) {
            return this.U0.R(i3 + 1);
        }
        if (AbstractC7472lu1.e(keyEvent)) {
            return this.U0.R(i3 - 1);
        }
        if (AbstractC7472lu1.a(keyEvent) && view != null) {
            return view.performClick();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getToolType(0) == 3 && (actionMasked == 11 || actionMasked == 12)) {
            return true;
        }
        super.onGenericMotionEvent(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC8740pc2 interfaceC8740pc2;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 0) && (interfaceC8740pc2 = this.W0) != null) {
            boolean z = actionMasked == 1;
            long eventTime = motionEvent.getEventTime();
            C1245Jp c1245Jp = (C1245Jp) interfaceC8740pc2;
            c1245Jp.m(false);
            if (z) {
                c1245Jp.H = eventTime;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void x0() {
        AbstractC4159cG1 abstractC4159cG1 = this.Y0;
        if (abstractC4159cG1 == null) {
            return;
        }
        View view = this.X0;
        int[] iArr = this.R0;
        Ge4.d(view, abstractC4159cG1, iArr);
        setPadding(iArr[0], getPaddingTop(), (this.X0.getWidth() - this.Y0.getWidth()) - iArr[0], getPaddingBottom());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceEvent i5 = TraceEvent.i("OmniboxSuggestionsList.Layout", null);
        try {
            AN3 an3 = new AN3("Android.Omnibox.SuggestionList.LayoutTime2", 2);
            an3.h = SystemClock.currentThreadTimeMillis();
            try {
                super.onLayout(z, i, i2, i3, i4);
                an3.close();
                if (i5 != null) {
                    i5.close();
                }
            } catch (Throwable th) {
                try {
                    an3.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (i5 != null) {
                try {
                    i5.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        TraceEvent i3 = TraceEvent.i("OmniboxSuggestionsList.Measure", null);
        try {
            AN3 an3 = new AN3("Android.Omnibox.SuggestionList.MeasureTime2", 2);
            an3.h = SystemClock.currentThreadTimeMillis();
            try {
                View findViewById = ((a) this.V0).n.getRootView().findViewById(R.id.content);
                View view = this.X0;
                int[] iArr = this.R0;
                Ge4.d(findViewById, view, iArr);
                int measuredHeight = this.X0.getMeasuredHeight() + iArr[1];
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = measuredHeight;
                }
                C8820pp4 c8820pp4 = ((a) this.V0).l;
                Rect rect = this.S0;
                c8820pp4.a.getDecorView().getWindowVisibleDisplayFrame(rect);
                final int height = rect.height() - measuredHeight;
                int measuredWidth = this.X0.getMeasuredWidth();
                int i4 = this.d1;
                if ((i4 == 1 || i4 == 2) && height < this.b1 && getMeasuredWidth() == measuredWidth) {
                    super.onMeasure(this.e1, this.f1);
                    if (this.d1 == 2) {
                        if (i3 != null) {
                            i3.close();
                            return;
                        }
                        return;
                    } else {
                        this.d1 = 2;
                        PostTask.b(AbstractC5103f04.d, new Runnable() { // from class: jc2
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9425rc2 c9425rc2 = C9425rc2.this;
                                if (c9425rc2.d1 != 2) {
                                    return;
                                }
                                c9425rc2.requestLayout();
                                c9425rc2.d1 = 3;
                            }
                        }, 300L);
                        an3.close();
                        if (i3 != null) {
                            i3.close();
                            return;
                        }
                        return;
                    }
                }
                if (this.d1 == 2) {
                    this.d1 = 3;
                }
                if (height != this.b1) {
                    this.b1 = height;
                    if (this.W0 != null) {
                        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: kc2
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC8740pc2 interfaceC8740pc2;
                                C9425rc2 c9425rc2 = C9425rc2.this;
                                int i5 = c9425rc2.b1;
                                int i6 = height;
                                if (i5 != i6 || c9425rc2.c1 == i6 || (interfaceC8740pc2 = c9425rc2.W0) == null) {
                                    return;
                                }
                                C1245Jp c1245Jp = (C1245Jp) interfaceC8740pc2;
                                a aVar = (a) c1245Jp.g;
                                aVar.getClass();
                                if (C11939yv1.g.f(aVar.a.getContext(), aVar.p) || aVar.a.getContext().getResources().getConfiguration().keyboard == 2) {
                                    c1245Jp.m.j = i6;
                                }
                                c9425rc2.c1 = i6;
                            }
                        });
                    }
                }
                this.e1 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(height, DeviceFormFactor.b(((a) this.V0).m) ? Integer.MIN_VALUE : 1073741824);
                this.f1 = makeMeasureSpec;
                super.onMeasure(this.e1, makeMeasureSpec);
                if (this.d1 == 0) {
                    this.d1 = 1;
                }
                an3.close();
                if (i3 != null) {
                    i3.close();
                }
            } finally {
                try {
                    an3.close();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }
}
