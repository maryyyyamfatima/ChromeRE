package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.regex.Pattern;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4116c80 extends AbstractC0288Cf2 {
    public boolean A;
    public final I70 r;
    public final float s;
    public final int t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public float z;

    public C4116c80(AbstractC9101qf2 abstractC9101qf2, I70 i70, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        super(abstractC9101qf2, R.layout.f56680_resource_name_obfuscated_res_0x7f0e00a4, R.id.contextual_search_promo, context, viewGroup, c9537rv0);
        this.s = context.getResources().getDisplayMetrics().density;
        this.t = AbstractC10957w33.a(context);
        this.r = i70;
    }

    public final void l() {
        if (this.u) {
            m();
            this.u = false;
            this.w = 0.0f;
            this.v = 0.0f;
        }
    }

    public final void n(float f) {
        if (this.u) {
            float f2 = this.x;
            this.w = Math.round(JM1.b(f * f2, 0.0f, f2));
            this.v = f;
        } else {
            this.w = 0.0f;
            this.v = 0.0f;
        }
    }

    @Override // defpackage.AbstractC11497xe4
    public final void h() {
        View view = this.l;
        ((Button) view.findViewById(R.id.contextual_search_allow_button)).setOnClickListener(new View.OnClickListener() { // from class: W70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4116c80 c4116c80 = C4116c80.this;
                if (c4116c80.A) {
                    return;
                }
                c4116c80.A = true;
                S70.a().e("search.contextual_search_fully_opted_in", true);
                S70.f(1);
                Pattern pattern = AbstractC8584p80.a;
                EI2.b("Search.ContextualSearchPromoCardChoice", true);
            }
        });
        ((Button) view.findViewById(R.id.contextual_search_no_thanks_button)).setOnClickListener(new View.OnClickListener() { // from class: X70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4116c80 c4116c80 = C4116c80.this;
                if (c4116c80.A) {
                    return;
                }
                c4116c80.A = true;
                S70.a().e("search.contextual_search_fully_opted_in", false);
                S70.f(0);
                Pattern pattern = AbstractC8584p80.a;
                EI2.b("Search.ContextualSearchPromoCardChoice", false);
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.contextual_search_promo_text);
        textView.setText(AbstractC9108qg3.a(view.getResources().getString(R.string.f71640_resource_name_obfuscated_res_0x7f1403c5), new C8765pg3(new C11997z52(view.getContext(), new Callback() { // from class: Y70
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4116c80 c4116c80 = C4116c80.this;
                c4116c80.getClass();
                new Handler().post(new RunnableC3773b80(c4116c80));
            }
        }), "<link>", "</link>")));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        f();
        float f = this.x;
        this.x = this.l.getMeasuredHeight();
        if (this.u) {
            this.w = Math.round((this.w / f) * r1);
        }
    }

    public final void m() {
        View view = this.l;
        if (view != null && this.u && this.y) {
            view.setVisibility(4);
            this.y = false;
        }
    }

    @Override // defpackage.AbstractC0288Cf2, defpackage.AbstractC11497xe4
    public final void a() {
        l();
        super.a();
    }

    @Override // defpackage.AbstractC11497xe4
    public final void e(boolean z) {
        super.e(z);
        if (z) {
            f();
            float f = this.x;
            this.x = this.l.getMeasuredHeight();
            if (this.u) {
                this.w = Math.round((this.w / f) * r0);
            }
        }
    }
}
