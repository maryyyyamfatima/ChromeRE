package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.ntp.RecentTabsGroupView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sI2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9666sI2 extends AbstractC7951nI2 {
    public final boolean b;
    public final /* synthetic */ C10695vI2 c;

    @Override // defpackage.AbstractC7951nI2
    public final void b(RecentTabsGroupView recentTabsGroupView, boolean z) {
    }

    @Override // defpackage.AbstractC7951nI2
    public final int d() {
        return 0;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int f() {
        return 0;
    }

    @Override // defpackage.AbstractC7951nI2
    public final boolean i() {
        return false;
    }

    @Override // defpackage.AbstractC7951nI2
    public final void m(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9666sI2(C10695vI2 c10695vI2, boolean z) {
        super(c10695vI2);
        this.c = c10695vI2;
        this.b = z;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int g() {
        return this.b ? 1 : 2;
    }

    @Override // defpackage.AbstractC7951nI2
    public final View h(boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            return LayoutInflater.from(this.c.a).inflate(this.b ? R.layout.f60430_resource_name_obfuscated_res_0x7f0e024d : R.layout.f60420_resource_name_obfuscated_res_0x7f0e024c, viewGroup, false);
        }
        return view;
    }
}
