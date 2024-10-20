package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r13 */
/* loaded from: classes.dex */
public final class C9230r13 extends RC1 {
    public final TextView A;

    public C9230r13(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.date);
    }

    @Override // defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        CharSequence a;
        MC1 mc1 = (MC1) oc1;
        Context context = this.a.getContext();
        int i = mc1.e;
        if (i == 0) {
            a = AbstractC11550xn3.a(mc1.d);
        } else if (i == 1) {
            a = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140429);
        } else {
            a = i != 2 ? null : context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140433);
        }
        this.A.setText(a);
    }
}
