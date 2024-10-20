package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescription;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionLayout;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ug1 */
/* loaded from: classes.dex */
public final class C2631Ug1 implements InterfaceC3906bY1, RadioGroup.OnCheckedChangeListener {
    public final C2111Qg1 a;
    public final ZX1 g;
    public final PropertyModel h;
    public final C2501Tg1 i;
    public final RadioButtonWithDescription j;
    public final RadioButtonWithDescription k;
    public final CheckBox l;
    public final boolean m;
    public final WebContents q;
    public final Context s;
    public final Profile r = Profile.d();
    public boolean n = true;
    public boolean o = false;
    public int p = 0;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
    }

    public C2631Ug1(a aVar, ZX1 zx1, C2111Qg1 c2111Qg1, boolean z, WebContents webContents) {
        this.g = zx1;
        this.a = c2111Qg1;
        this.q = webContents;
        this.s = aVar;
        this.m = z;
        View inflate = LayoutInflater.from(aVar).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e012b, (ViewGroup) null);
        ((RadioButtonWithDescriptionLayout) inflate.findViewById(R.id.image_descriptions_dialog_radio_button_group)).g = this;
        RadioButtonWithDescription radioButtonWithDescription = (RadioButtonWithDescription) inflate.findViewById(R.id.image_descriptions_dialog_radio_button_just_once);
        this.j = radioButtonWithDescription;
        this.k = (RadioButtonWithDescription) inflate.findViewById(R.id.image_descriptions_dialog_radio_button_always);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.image_descriptions_dialog_check_box);
        this.l = checkBox;
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Sg1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                C2631Ug1 c2631Ug1 = C2631Ug1.this;
                if (c2631Ug1.j.e()) {
                    c2631Ug1.o = z2;
                } else {
                    c2631Ug1.n = z2;
                }
            }
        });
        radioButtonWithDescription.f(true);
        if (z) {
            boolean z2 = this.o;
            checkBox.setVisibility(0);
            checkBox.setText(R.string.0_resource_name_obfuscated_res_0x7f14040c);
            checkBox.setChecked(z2);
        }
        this.i = new C2501Tg1(this, webContents);
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, this);
        bd2.d(AbstractC4249cY1.c, aVar.getResources(), R.string.0_resource_name_obfuscated_res_0x7f140515);
        bd2.e(AbstractC4249cY1.h, inflate);
        bd2.d(AbstractC4249cY1.n, aVar.getResources(), R.string.0_resource_name_obfuscated_res_0x7f1406d5);
        bd2.d(AbstractC4249cY1.j, aVar.getResources(), R.string.0_resource_name_obfuscated_res_0x7f140514);
        bd2.c(AbstractC4249cY1.v, 1);
        this.h = bd2.a();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int id = this.k.getId();
        CheckBox checkBox = this.l;
        if (i == id) {
            boolean z = this.n;
            checkBox.setVisibility(0);
            checkBox.setText(R.string.0_resource_name_obfuscated_res_0x7f140516);
            checkBox.setChecked(z);
            return;
        }
        if (i == this.j.getId()) {
            if (this.m) {
                boolean z2 = this.o;
                checkBox.setVisibility(0);
                checkBox.setText(R.string.0_resource_name_obfuscated_res_0x7f14040c);
                checkBox.setChecked(z2);
                return;
            }
            checkBox.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        char c;
        int i2;
        char c2;
        Context context = this.s;
        if (i == 0) {
            boolean e = this.k.e();
            C2111Qg1 c2111Qg1 = this.a;
            if (e) {
                c2111Qg1.a.getClass();
                Profile profile = this.r;
                R44.a(profile).e("settings.a11y.enable_accessibility_image_labels_android", true);
                boolean z = this.n;
                c2111Qg1.a.getClass();
                R44.a(profile).e("settings.a11y.enable_accessibility_image_labels_only_on_wifi", z);
                boolean z2 = this.n;
                if (z2 == 0 || C1226Jl0.b(context) == 2) {
                    i2 = R.string.0_resource_name_obfuscated_res_0x7f14051e;
                    c2 = z2;
                } else {
                    i2 = R.string.0_resource_name_obfuscated_res_0x7f14051f;
                    c2 = z2;
                }
            } else if (this.j.e()) {
                c2111Qg1.a(this.q, this.o);
                char c3 = this.o ? (char) 3 : (char) 2;
                i2 = R.string.0_resource_name_obfuscated_res_0x7f14051c;
                c2 = c3;
            } else {
                c2 = 65535;
                i2 = -1;
            }
            this.p = 1;
            c = c2;
        } else {
            this.p = 2;
            c = 4;
            i2 = -1;
        }
        if (i2 != -1) {
            ZN3.b(i2, 1, context).d();
        }
        EI2.h(c, 5, "Accessibility.ImageLabels.Android.DialogOption");
        this.i.destroy();
    }
}
