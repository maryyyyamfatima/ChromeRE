package defpackage;

import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tm */
/* loaded from: classes.dex */
public final class C10168tm extends AbstractC10105tb2 {
    public final TextView I;

    /* renamed from: J */
    public final TextView f11545J;
    public final TextView K;

    public C10168tm(View view) {
        super(view);
        this.I = (TextView) view.findViewById(R.id.title);
        this.f11545J = (TextView) view.findViewById(R.id.caption);
        this.K = (TextView) view.findViewById(R.id.timestamp);
    }

    @Override // defpackage.AbstractC10105tb2, defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        super.v(propertyModel, oc1);
        KC1 kc1 = (KC1) oc1;
        this.I.setText(kc1.e.g);
        this.f11545J.setText(AbstractC7853n04.b(kc1.e));
        this.K.setText(AbstractC7853n04.c(kc1.d));
    }
}
