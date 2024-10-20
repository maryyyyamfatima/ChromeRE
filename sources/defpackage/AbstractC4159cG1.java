package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.omnibox.UrlBarApi26;
import org.chromium.chrome.browser.omnibox.status.StatusView;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cG1 */
/* loaded from: classes.dex */
public abstract class AbstractC4159cG1 extends FrameLayout {
    public final ImageButton a;
    public final ImageButton g;
    public final ImageButton h;
    public final UrlBarApi26 i;
    public C5809h34 j;
    public C8815pp k;
    public InterfaceC3472aG1 l;
    public ViewOnClickListenerC3303Zk3 m;
    public boolean n;
    public final LinearLayout o;
    public final S10 p;

    public void b() {
    }

    public void d(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
    }

    public AbstractC4159cG1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.layout.0_resource_name_obfuscated_res_0x7f0e0171);
        S10 s10 = new S10(this);
        this.p = s10;
        setTouchDelegate(s10);
    }

    public AbstractC4159cG1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(i, (ViewGroup) this, true);
        this.a = (ImageButton) findViewById(R.id.delete_button);
        this.i = (UrlBarApi26) findViewById(R.id.url_bar);
        this.g = (ImageButton) findViewById(R.id.mic_button);
        this.h = (ImageButton) findViewById(R.id.lens_camera_button);
        this.o = (LinearLayout) findViewById(R.id.url_action_container);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutTransition(null);
        final StatusView statusView = (StatusView) findViewById(R.id.location_bar_status);
        statusView.u = this.p;
        statusView.i.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Ql3
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = StatusView.B;
                StatusView.this.d();
            }
        });
    }

    public void a(C8815pp c8815pp, C5809h34 c5809h34, ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3, InterfaceC3472aG1 interfaceC3472aG1, QZ2 qz2) {
        this.k = c8815pp;
        this.j = c5809h34;
        this.m = viewOnClickListenerC3303Zk3;
        this.l = interfaceC3472aG1;
    }

    public void c() {
        this.n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        UrlBarApi26 urlBarApi26;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int childCount = getChildCount();
            urlBarApi26 = this.i;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.getMarginStart() != i5) {
                    layoutParams.setMarginStart(i5);
                    childAt.setLayoutParams(layoutParams);
                }
                if (childAt == urlBarApi26) {
                    break;
                }
                int i6 = layoutParams.width;
                if (i6 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE);
                } else if (i6 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                }
                int i7 = layoutParams.height;
                if (i7 == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE);
                } else if (i7 == -1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                i5 += childAt.getMeasuredWidth();
            }
            i4++;
        }
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            for (int i8 = 0; i8 < linearLayout.getChildCount(); i8++) {
                View childAt2 = linearLayout.getChildAt(i8);
                if (childAt2.getVisibility() != 8) {
                    arrayList.add(childAt2);
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) it.next()).getLayoutParams();
            i9 += marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart() + marginLayoutParams.width;
        }
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            i9 += marginLayoutParams2.getMarginEnd() + marginLayoutParams2.getMarginStart();
        }
        ViewOnClickListenerC3303Zk3 viewOnClickListenerC3303Zk3 = this.m;
        C1359Kl3 c1359Kl3 = viewOnClickListenerC3303Zk3.g;
        if (c1359Kl3.b()) {
            if (viewOnClickListenerC3303Zk3.a.i.getVisibility() == 0) {
                i3 = c1359Kl3.q;
            }
        }
        int i10 = i9 + i3;
        if (DeviceFormFactor.a(getContext())) {
            i10 += getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803c8);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) urlBarApi26.getLayoutParams();
        if (layoutParams2.getMarginEnd() != i10) {
            layoutParams2.setMarginEnd(i10);
            urlBarApi26.setLayoutParams(layoutParams2);
        }
        super.onMeasure(i, i2);
    }

    public final void e(int i) {
        C1359Kl3 c1359Kl3 = this.m.g;
        int i2 = (i - c1359Kl3.r) - c1359Kl3.s;
        boolean z = i >= c1359Kl3.t;
        if (z) {
            c1359Kl3.a.m(AbstractC1878Ol3.n, i2);
        }
        if (z != c1359Kl3.l) {
            c1359Kl3.l = z;
            c1359Kl3.f();
        }
    }
}
