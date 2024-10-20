package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.DualControlLayout;
import org.chromium.components.browser_ui.widget.PromoDialogLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class OC2 extends N8 implements View.OnClickListener, DialogInterface.OnDismissListener {
    public static final int[] h = {R.id.button_primary, R.id.button_secondary};
    public final FrameLayout a;
    public final PromoDialogLayout g;

    public abstract NC2 a();

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public OC2(Activity activity) {
        super(activity, R.style.f97690_resource_name_obfuscated_res_0x7f150255);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setBackgroundColor(activity.getResources().getColor(R.color.f24720_resource_name_obfuscated_res_0x7f070796));
        LayoutInflater.from(activity).inflate(R.layout.f60130_resource_name_obfuscated_res_0x7f0e022f, (ViewGroup) frameLayout, true);
        this.g = (PromoDialogLayout) frameLayout.findViewById(R.id.promo_dialog_layout);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.a);
        NC2 a = a();
        PromoDialogLayout promoDialogLayout = this.g;
        promoDialogLayout.q = a;
        a.getClass();
        if (promoDialogLayout.q.a != 0) {
            promoDialogLayout.n.setImageDrawable(C11674y84.b(promoDialogLayout.getResources(), promoDialogLayout.q.a, promoDialogLayout.getContext().getTheme()));
        } else {
            ((ViewGroup) promoDialogLayout.n.getParent()).removeView(promoDialogLayout.n);
        }
        promoDialogLayout.q.getClass();
        promoDialogLayout.o.setText(promoDialogLayout.q.b);
        promoDialogLayout.q.getClass();
        int i = promoDialogLayout.q.c;
        if (i == 0) {
            ((ViewGroup) promoDialogLayout.p.getParent()).removeView(promoDialogLayout.p);
        } else {
            promoDialogLayout.p.setText(i);
        }
        ViewStub viewStub = (ViewStub) promoDialogLayout.findViewById(R.id.footer_stub);
        if (promoDialogLayout.q.d == 0) {
            ((ViewGroup) viewStub.getParent()).removeView(viewStub);
        } else {
            ((TextView) viewStub.inflate()).setText(promoDialogLayout.q.d);
        }
        DualControlLayout dualControlLayout = (DualControlLayout) promoDialogLayout.findViewById(R.id.button_bar);
        promoDialogLayout.q.getClass();
        dualControlLayout.addView(DualControlLayout.a(promoDialogLayout.getContext(), true, promoDialogLayout.getResources().getString(promoDialogLayout.q.e), null));
        if (promoDialogLayout.q.f != 0) {
            dualControlLayout.addView(DualControlLayout.a(promoDialogLayout.getContext(), false, promoDialogLayout.getResources().getString(promoDialogLayout.q.f), null));
        }
        getWindow().setLayout(-1, -1);
        int[] iArr = h;
        for (int i2 = 0; i2 < 2; i2++) {
            View findViewById = findViewById(iArr[i2]);
            if (findViewById != null) {
                findViewById.setOnClickListener(this);
            }
        }
    }
}
