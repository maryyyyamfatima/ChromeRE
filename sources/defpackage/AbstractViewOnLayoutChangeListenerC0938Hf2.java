package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hf2 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnLayoutChangeListenerC0938Hf2 extends AbstractC0808Gf2 implements View.OnLayoutChangeListener {
    public boolean y;

    public abstract TextView m();

    public AbstractViewOnLayoutChangeListenerC0938Hf2(AbstractC9101qf2 abstractC9101qf2, int i, int i2, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(abstractC9101qf2, i, i2, context, viewGroup, c9537rv0);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView m = m();
        if (this.y || m == null) {
            return;
        }
        this.y = true;
        if (m.getPaint().measureText(m.getText().toString()) < m.getWidth() * 0.5f) {
            m.setGravity(LocalizationUtils.isLayoutRtl() ? 5 : 3);
        }
    }

    @Override // defpackage.AbstractC11497xe4
    public void h() {
        View view = this.l;
        this.t = view.getPaddingStart();
        this.u = view.getPaddingTop();
        this.v = view.getPaddingBottom();
        this.l.addOnLayoutChangeListener(this);
    }
}
