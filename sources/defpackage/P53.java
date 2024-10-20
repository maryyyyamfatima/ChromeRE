package defpackage;

import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P53 implements InterfaceC3467aF1 {
    public final /* synthetic */ int a = R.string.f90320_resource_name_obfuscated_res_0x7f140bbf;
    public final /* synthetic */ Q53 g;

    @Override // defpackage.InterfaceC3467aF1
    public final void P() {
        Q53 q53 = this.g;
        View findViewById = q53.p.findViewById(R.id.loading_view_container);
        findViewById.setVisibility(0);
        findViewById.setContentDescription(q53.s.getString(this.a));
        q53.p.findViewById(R.id.image).setVisibility(8);
        q53.f(0L);
    }

    public P53(Q53 q53) {
        this.g = q53;
    }

    @Override // defpackage.InterfaceC3467aF1
    public final void n() {
        this.g.b();
    }
}
