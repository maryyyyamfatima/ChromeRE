package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aj1 */
/* loaded from: classes.dex */
public final class C3626aj1 extends AbstractC5000ej1 {
    public final ImageView E;

    public C3626aj1(View view) {
        super(view, true);
        ImageView imageView = (ImageView) view.findViewById(R.id.placeholder);
        this.E = imageView;
        imageView.setImageDrawable(C9146qn.b(AbstractC2884Wf.a(view.getContext(), R.drawable.0_resource_name_obfuscated_res_0x7f0900a1)));
    }

    @Override // defpackage.AbstractC5000ej1, defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        super.v(propertyModel, oc1);
        this.E.setContentDescription(((KC1) oc1).e.g);
    }
}
