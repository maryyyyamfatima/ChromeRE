package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: km3 */
/* loaded from: classes.dex */
public final class C7082km3 {
    public final PropertyModel a;
    public final TextView b;

    public C7082km3(Context context, C6134i03 c6134i03) {
        PropertyModel propertyModel = new PropertyModel(AbstractC6738jm3.b);
        this.a = propertyModel;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00ef, (ViewGroup) null);
        this.b = textView;
        UD2.a(propertyModel, textView, new TD2() { // from class: hm3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                TextView textView2 = (TextView) obj;
                FD2 fd2 = (FD2) obj2;
                C7082km3.this.getClass();
                PD2 pd2 = AbstractC6738jm3.a;
                if (fd2 == pd2) {
                    textView2.setText((CharSequence) propertyModel2.i(pd2));
                }
            }
        });
        new C8458om3(context, new C6395im3(this), c6134i03);
    }
}
