package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l70 */
/* loaded from: classes.dex */
public final class C7203l70 extends AbstractC0808Gf2 {
    public TextView y;
    public TextView z;

    public C7203l70(AbstractC9101qf2 abstractC9101qf2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(abstractC9101qf2, R.layout.0_resource_name_obfuscated_res_0x7f0e00a3, R.id.contextual_search_context_view, context, viewGroup, c9537rv0);
    }

    @Override // defpackage.AbstractC11497xe4
    public final void h() {
        View view = this.l;
        this.t = view.getPaddingStart();
        this.u = view.getPaddingTop();
        this.v = view.getPaddingBottom();
        View view2 = this.l;
        this.y = (TextView) view2.findViewById(R.id.selected_text);
        this.z = (TextView) view2.findViewById(R.id.surrounding_text_end);
    }
}
