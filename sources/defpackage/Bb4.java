package defpackage;

import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Bb4 extends AbstractC10105tb2 {
    public final TextView I;

    /* renamed from: J */
    public final TextView f11438J;

    public Bb4(View view) {
        super(view);
        this.I = (TextView) view.findViewById(R.id.title);
        this.f11438J = (TextView) view.findViewById(R.id.caption);
    }

    @Override // defpackage.AbstractC10105tb2, defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        super.v(propertyModel, oc1);
        OfflineItem offlineItem = ((KC1) oc1).e;
        this.I.setText(offlineItem.g);
        this.f11438J.setText(AbstractC7853n04.a(offlineItem));
        this.B.setContentDescription(offlineItem.g);
    }
}
