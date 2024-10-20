package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m80 */
/* loaded from: classes.dex */
public final class C7553m80 extends AbstractViewOnLayoutChangeListenerC0938Hf2 {
    public TextView z;

    public C7553m80(AbstractC9101qf2 abstractC9101qf2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(abstractC9101qf2, R.layout.0_resource_name_obfuscated_res_0x7f0e00a8, R.id.contextual_search_term_view, context, viewGroup, c9537rv0);
    }

    @Override // defpackage.AbstractViewOnLayoutChangeListenerC0938Hf2, defpackage.AbstractC11497xe4
    public final void h() {
        super.h();
        this.z = (TextView) this.l.findViewById(R.id.contextual_search_term);
    }

    @Override // defpackage.AbstractViewOnLayoutChangeListenerC0938Hf2
    public final TextView m() {
        return this.z;
    }
}
