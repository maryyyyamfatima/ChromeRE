package defpackage;

import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3291Zi1 extends AbstractC5000ej1 {
    public static final /* synthetic */ int F = 0;
    public final TextView E;

    public C3291Zi1(View view) {
        super(view, false);
        this.E = (TextView) view.findViewById(R.id.title);
    }

    @Override // defpackage.AbstractC5000ej1, defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        super.v(propertyModel, oc1);
        this.E.setText(((KC1) oc1).e.g);
    }
}
