package defpackage;

import android.view.ViewTreeObserver;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uY2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC10432uY2 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ AbstractC10775vY2 a;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (OP0.b(G61.a(OP0.b))) {
            AbstractC10775vY2 abstractC10775vY2 = this.a;
            int i = AbstractC10775vY2.l0;
            if (!abstractC10775vY2.R0()) {
                return;
            }
        }
        a(this.a.i0.getHeight());
    }

    public ViewTreeObserverOnScrollChangedListenerC10432uY2(AbstractC10775vY2 abstractC10775vY2) {
        this.a = abstractC10775vY2;
    }

    public final void a(int i) {
        AbstractC10775vY2 abstractC10775vY2 = this.a;
        if (abstractC10775vY2.N) {
            boolean z = abstractC10775vY2.i0.getScrollY() == 0;
            boolean z2 = abstractC10775vY2.h0.getBottom() == abstractC10775vY2.i0.getScrollY() + i;
            boolean z3 = abstractC10775vY2.h0.getBottom() > i;
            if (!z3 || z) {
                abstractC10775vY2.f0.setElevation(0.0f);
            } else {
                abstractC10775vY2.f0.setElevation(abstractC10775vY2.N().getDimensionPixelSize(R.dimen.f40790_resource_name_obfuscated_res_0x7f080768));
            }
            if (!z3 || z2) {
                abstractC10775vY2.g0.setElevation(0.0f);
            } else {
                abstractC10775vY2.g0.setElevation(abstractC10775vY2.N().getDimensionPixelSize(R.dimen.f40610_resource_name_obfuscated_res_0x7f080756));
            }
        }
    }
}
