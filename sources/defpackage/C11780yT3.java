package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yT3 */
/* loaded from: classes2.dex */
public final class C11780yT3 implements PB {
    public final QB a;
    public final RecyclerView g;
    public final RelativeLayout h;
    public Callback i;
    public final C10751vT3 j = new C10751vT3(this);

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f140b46;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f140b43;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ C8385oa2 o() {
        return OB.a();
    }

    @Override // defpackage.PB
    public final /* synthetic */ void onBackPressed() {
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f140b41;
    }

    @Override // defpackage.PB
    public final boolean r() {
        return false;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f140b44;
    }

    @Override // defpackage.PB
    public final boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return false;
    }

    public C11780yT3(Context context, QB qb) {
        this.a = qb;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02d3, (ViewGroup) null);
        this.h = relativeLayout;
        RecyclerView recyclerView = (RecyclerView) relativeLayout.findViewById(R.id.sheet_item_list);
        this.g = recyclerView;
        recyclerView.getContext();
        recyclerView.q0(new C11094wT3());
        if (AbstractC0193Bm2.l()) {
            recyclerView.g(new C11437xT3(context, relativeLayout.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080823)));
        }
    }

    @Override // defpackage.PB
    public final void destroy() {
        ((m) this.a).o(this.j);
    }

    @Override // defpackage.PB
    public final View c() {
        return this.h;
    }

    @Override // defpackage.PB
    public final int b() {
        return this.g.computeVerticalScrollOffset();
    }

    public final int i() {
        RelativeLayout relativeLayout = this.h;
        int y = y(false) + w(relativeLayout.findViewById(R.id.drag_handlebar), false);
        View findViewById = relativeLayout.findViewById(R.id.touch_to_fill_footer);
        if (findViewById.getMeasuredHeight() == 0) {
            z(true);
            findViewById.requestLayout();
        }
        return w(findViewById, false) + y;
    }

    public final int y(boolean z) {
        int dimensionPixelSize;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            RecyclerView recyclerView = this.g;
            if (i < recyclerView.getChildCount()) {
                View childAt = recyclerView.getChildAt(i);
                if (recyclerView.r.s(RecyclerView.J(childAt)) == 2) {
                    i2++;
                }
                if (z && i2 > 2) {
                    dimensionPixelSize = w(childAt, true);
                    break;
                }
                i3 += w(childAt, false);
                i++;
            } else {
                dimensionPixelSize = this.h.getResources().getDimensionPixelSize(AbstractC0193Bm2.l() ? R.dimen.0_resource_name_obfuscated_res_0x7f080822 : R.dimen.0_resource_name_obfuscated_res_0x7f080821);
            }
        }
        return dimensionPixelSize + i3;
    }

    public static int w(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            r2 = (z ? 0 : marginLayoutParams.bottomMargin) + marginLayoutParams.topMargin;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (z) {
            measuredHeight /= 2;
        }
        return r2 + measuredHeight;
    }

    public final void z(boolean z) {
        RelativeLayout relativeLayout = this.h;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.findViewById(R.id.touch_to_fill_footer).getLayoutParams();
        RecyclerView recyclerView = this.g;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
        if (z) {
            layoutParams2.addRule(2, R.id.touch_to_fill_footer);
            layoutParams.addRule(12);
            layoutParams.removeRule(3);
        } else {
            layoutParams2.removeRule(2);
            layoutParams.removeRule(12);
            layoutParams.addRule(3, R.id.sheet_item_list);
        }
        relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(x(), Integer.MIN_VALUE), 0);
        recyclerView.measure(View.MeasureSpec.makeMeasureSpec(x(), Integer.MIN_VALUE), 0);
    }

    public final int x() {
        RelativeLayout relativeLayout = this.h;
        return relativeLayout.getContext().getResources().getDisplayMetrics().widthPixels - (relativeLayout.getResources().getDimensionPixelSize(AbstractC0193Bm2.l() ? R.dimen.0_resource_name_obfuscated_res_0x7f080825 : R.dimen.0_resource_name_obfuscated_res_0x7f080824) * 2);
    }

    @Override // defpackage.PB
    public final float p() {
        int i = 0;
        if (this.g.r != null) {
            i = y(true) + w(this.h.findViewById(R.id.drag_handlebar), false);
        }
        m mVar = (m) this.a;
        return Math.min(i, mVar.f()) / mVar.f();
    }

    @Override // defpackage.PB
    public final float t() {
        int i;
        AbstractC8305oK2 abstractC8305oK2 = this.g.r;
        QB qb = this.a;
        if (abstractC8305oK2 == null) {
            i = 0;
        } else {
            i = i();
            if (i > ((m) qb).f()) {
                z(true);
                this.h.requestLayout();
                i = i();
            }
        }
        m mVar = (m) qb;
        return Math.min(i, mVar.f()) / mVar.f();
    }
}
