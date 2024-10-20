package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.management.ManagementView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iL1 */
/* loaded from: classes.dex */
public final class C6247iL1 extends AbstractC5426fx {
    public final String l;

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "management";
    }

    public C6247iL1(C7857n12 c7857n12, Profile profile) {
        super(c7857n12);
        this.l = c7857n12.a().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405f3);
        C5903hL1 c5903hL1 = new C5903hL1(c7857n12, profile);
        ManagementView managementView = (ManagementView) LayoutInflater.from(c7857n12.a()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00f9, (ViewGroup) null);
        UD2.a(c5903hL1.b, managementView, new TD2() { // from class: fL1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                ManagementView managementView2 = (ManagementView) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = AbstractC6589jL1.b;
                if (fd2 == ld2) {
                    boolean j = propertyModel.j(ld2);
                    if (managementView2.a != j) {
                        managementView2.a = j;
                        managementView2.a();
                        return;
                    }
                    return;
                }
                PD2 pd2 = AbstractC6589jL1.a;
                if (fd2 == pd2) {
                    String str = (String) propertyModel.i(pd2);
                    if (TextUtils.equals(managementView2.g, str)) {
                        return;
                    }
                    managementView2.g = str;
                    managementView2.a();
                    return;
                }
                PD2 pd22 = AbstractC6589jL1.c;
                if (fd2 == pd22) {
                    managementView2.k.setText((SpannableString) propertyModel.i(pd22));
                    managementView2.k.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });
        d(managementView);
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.l;
    }
}
