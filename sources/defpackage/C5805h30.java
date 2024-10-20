package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h30 */
/* loaded from: classes2.dex */
public final class C5805h30 {
    public final InterfaceC5461g30 a;
    public final View b;
    public final RadioButtonWithDescription c;
    public final PropertyModel d;
    public final ZX1 e;

    public C5805h30(final Context context, ZX1 zx1, InterfaceC5461g30 interfaceC5461g30, String str, String str2) {
        this.a = interfaceC5461g30;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0092, (ViewGroup) null);
        this.b = inflate;
        RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) inflate.findViewById(R.id.sync_confirm_import_choice);
        RadioButtonWithDescription radioButtonWithDescription2 = (RadioButtonWithDescription) inflate.findViewById(R.id.sync_keep_separate_choice);
        this.c = radioButtonWithDescription2;
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        boolean z = C1202Jg1.c(d).h() != null;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd2 = AbstractC4249cY1.j;
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1403d2);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        LD2 ld22 = AbstractC4249cY1.m;
        AD2 ad22 = new AD2();
        ad22.a = !z;
        e.put(ld22, ad22);
        PD2 pd22 = AbstractC4249cY1.n;
        String string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        GD2 gd22 = new GD2();
        gd22.a = string2;
        e.put(pd22, gd22);
        PD2 pd23 = AbstractC4249cY1.h;
        GD2 gd23 = new GD2();
        gd23.a = inflate;
        e.put(pd23, gd23);
        JD2 jd2 = AbstractC4249cY1.a;
        C5117f30 c5117f30 = new C5117f30(this);
        GD2 gd24 = new GD2();
        gd24.a = c5117f30;
        e.put(jd2, gd24);
        PropertyModel propertyModel = new PropertyModel(e);
        this.d = propertyModel;
        this.e = zx1;
        ((TextView) inflate.findViewById(R.id.sync_import_data_prompt)).setText(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140ae2, str));
        radioButtonWithDescription.h(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140ae4, str2));
        radioButtonWithDescription2.h(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140ae7));
        List asList = Arrays.asList(radioButtonWithDescription, radioButtonWithDescription2);
        radioButtonWithDescription.k = asList;
        radioButtonWithDescription2.k = asList;
        if (z) {
            radioButtonWithDescription2.f(true);
            radioButtonWithDescription.setOnClickListener(new View.OnClickListener() { // from class: c30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC4871eL1.e(context, R.string.0_resource_name_obfuscated_res_0x7f1405ef);
                }
            });
        } else {
            radioButtonWithDescription2.j = new PG2() { // from class: d30
                @Override // defpackage.PG2
                public final void a(RadioButtonWithDescription radioButtonWithDescription3) {
                    C5805h30.this.d.k(AbstractC4249cY1.m, false);
                }
            };
            radioButtonWithDescription.j = new PG2() { // from class: e30
                @Override // defpackage.PG2
                public final void a(RadioButtonWithDescription radioButtonWithDescription3) {
                    C5805h30.this.d.k(AbstractC4249cY1.m, false);
                }
            };
        }
        zx1.l(propertyModel, 1, false);
    }
}
