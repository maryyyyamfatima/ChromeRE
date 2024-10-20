package defpackage;

import android.view.View;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9996tG extends RC1 {
    public C9996tG(View view) {
        super(view);
    }

    @Override // defpackage.RC1
    public final void v(final PropertyModel propertyModel, OC1 oc1) {
        final HC1 hc1 = (HC1) oc1;
        this.a.setOnClickListener(new View.OnClickListener() { // from class: sG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((Callback) PropertyModel.this.i(GD1.y)).onResult(hc1.d);
            }
        });
    }
}
