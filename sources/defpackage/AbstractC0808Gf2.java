package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gf2 */
/* loaded from: classes.dex */
public abstract class AbstractC0808Gf2 extends AbstractC0288Cf2 {
    public final float r;
    public final float s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;

    public AbstractC0808Gf2(AbstractC9101qf2 abstractC9101qf2, int i, int i2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(abstractC9101qf2, i, i2, context, viewGroup, c9537rv0);
        this.r = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08014e);
        this.s = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080150);
    }

    public final void l(boolean z) {
        float f;
        View view = this.l;
        if (view != null) {
            if (z || this.w != this.x) {
                boolean z2 = this.w;
                this.x = z2;
                if (z2) {
                    f = this.s;
                } else {
                    f = this.r;
                }
                view.setPaddingRelative(this.t, this.u, (int) f, this.v);
                e(false);
            }
        }
    }
}
