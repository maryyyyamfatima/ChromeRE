package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sy2 */
/* loaded from: classes.dex */
public final class C2462Sy2 extends AbstractC10105tb2 {
    public final TextView I;

    /* renamed from: J */
    public final TextView f11470J;

    public C2462Sy2(View view) {
        super(view);
        this.I = (TextView) view.findViewById(R.id.title);
        this.f11470J = (TextView) view.findViewById(R.id.timestamp);
    }

    @Override // defpackage.AbstractC10105tb2, defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        super.v(propertyModel, oc1);
        KC1 kc1 = (KC1) oc1;
        this.I.setText(kc1.e.g);
        this.f11470J.setText(AbstractC7853n04.c(kc1.d));
        OfflineItem offlineItem = kc1.e;
        ImageView imageView = (ImageView) this.a.findViewById(R.id.media_button);
        int i = offlineItem.i;
        imageView.setImageResource((i == 1 || i == 2) ? R.drawable.0_resource_name_obfuscated_res_0x7f090300 : 0);
    }
}
