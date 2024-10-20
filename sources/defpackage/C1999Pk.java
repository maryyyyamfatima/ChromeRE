package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pk */
/* loaded from: classes.dex */
public final class C1999Pk implements InterfaceC2259Rk {
    public final View a;
    public InterfaceC2129Qk g;
    public final ZX1 h;
    public final PropertyModel i;

    public C1999Pk(Context context, ZX1 zx1) {
        this.h = zx1;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0043, (ViewGroup) null);
        this.a = inflate;
        inflate.findViewById(R.id.avs_consent_ui_learn_more).setOnClickListener(new View.OnClickListener() { // from class: Nk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((C1609Mk) C1999Pk.this.g).i.run();
            }
        });
        Resources resources = context.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, new C2998Xb3(zx1, new Callback() { // from class: Ok
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C1999Pk c1999Pk = C1999Pk.this;
                InterfaceC2129Qk interfaceC2129Qk = c1999Pk.g;
                if (interfaceC2129Qk == null) {
                    return;
                }
                if (intValue == 1) {
                    ((C1609Mk) interfaceC2129Qk).c(0);
                } else if (intValue == 2) {
                    ((C1609Mk) interfaceC2129Qk).f(2);
                } else if (intValue != 5) {
                    EI2.h(10, 11, "Assistant.VoiceSearch.ConsentOutcome");
                    ((C1609Mk) interfaceC2129Qk).g(false);
                } else {
                    ((C1609Mk) interfaceC2129Qk).e();
                }
                c1999Pk.g = null;
            }
        }));
        bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f140268);
        bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f14026a);
        bd2.c(AbstractC4249cY1.v, 1);
        bd2.b(AbstractC4249cY1.r, true);
        bd2.e(AbstractC4249cY1.h, inflate);
        this.i = bd2.a();
    }

    @Override // defpackage.InterfaceC2259Rk
    public final void i(C1609Mk c1609Mk) {
        this.g = c1609Mk;
        this.h.l(this.i, 1, false);
    }

    @Override // defpackage.InterfaceC2259Rk
    public final void dismiss() {
        this.g = null;
        this.h.c(3, this.i);
    }
}
