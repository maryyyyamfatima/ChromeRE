package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j70 */
/* loaded from: classes.dex */
public final class C6515j70 extends AbstractViewOnLayoutChangeListenerC0938Hf2 {
    public boolean A;
    public final N70 B;
    public boolean C;
    public float D;
    public C4424d20 E;
    public boolean F;
    public TextView z;

    public C6515j70(N70 n70, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(n70, R.layout.0_resource_name_obfuscated_res_0x7f0e00a1, R.id.contextual_search_caption_view, context, viewGroup, c9537rv0);
        this.D = 0.0f;
        this.B = n70;
    }

    public final void o(String str) {
        AbstractC0288Cf2.k(str);
        this.A = true;
        this.F = false;
        d();
        this.z.setText(AbstractC0288Cf2.k(str));
        l(true);
        this.C = true;
    }

    @Override // defpackage.AbstractViewOnLayoutChangeListenerC0938Hf2
    public final TextView m() {
        return this.z;
    }

    @Override // defpackage.AbstractViewOnLayoutChangeListenerC0938Hf2, defpackage.AbstractC11497xe4
    public final void h() {
        super.h();
        this.z = (TextView) this.l.findViewById(R.id.contextual_search_caption);
    }

    @Override // defpackage.AbstractC11497xe4
    public final void g() {
        super.g();
        if (this.F) {
            return;
        }
        this.F = true;
        C4424d20 c = C4424d20.c(this.q.z0(), 0.0f, 1.0f, 218L, null);
        this.E = c;
        c.a(new InterfaceC4080c20() { // from class: i70
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d20) {
                C6515j70 c6515j70 = C6515j70.this;
                c6515j70.getClass();
                c6515j70.D = c4424d20.b();
            }
        });
        C4424d20 c4424d20 = this.E;
        c4424d20.j = AbstractC8142nr1.e;
        c4424d20.start();
    }

    public final void n(float f) {
        ((ContextualSearchManager) this.B.s0).t.getClass();
        if (S70.d()) {
            return;
        }
        this.w = f > 0.5f;
        l(false);
        if (this.A) {
            C4424d20 c4424d20 = this.E;
            if (c4424d20 != null) {
                c4424d20.cancel();
            }
            this.D = 1.0f - f;
        }
    }
}
