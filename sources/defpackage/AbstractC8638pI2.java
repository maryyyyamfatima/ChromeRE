package defpackage;

import J.N;
import com.android.chrome.R;
import org.chromium.chrome.browser.ntp.RecentTabsGroupView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pI2 */
/* loaded from: classes.dex */
public abstract class AbstractC8638pI2 extends AbstractC7951nI2 {
    public final /* synthetic */ C10695vI2 b;

    @Override // defpackage.AbstractC7951nI2
    public final int f() {
        return 1;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int g() {
        return 0;
    }

    @Override // defpackage.AbstractC7951nI2
    public final boolean i() {
        return N.MEv1xg6U(this.b.d.p.a);
    }

    @Override // defpackage.AbstractC7951nI2
    public final void m(boolean z) {
        C4857eI2 c4857eI2 = this.b.d;
        if (c4857eI2.t) {
            return;
        }
        N.MNaMvyV8(c4857eI2.p.a, z);
    }

    @Override // defpackage.AbstractC7951nI2
    public final void b(RecentTabsGroupView recentTabsGroupView, boolean z) {
        recentTabsGroupView.h.setText(R.string.0_resource_name_obfuscated_res_0x7f14070e);
        recentTabsGroupView.i.setVisibility(8);
        recentTabsGroupView.b(false);
        recentTabsGroupView.a(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8638pI2(C10695vI2 c10695vI2) {
        super(c10695vI2);
        this.b = c10695vI2;
    }
}
