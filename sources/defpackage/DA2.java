package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.widget.RadioButtonWithDescriptionAndAuxButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DA2 extends d implements RG2 {
    public final RadioButtonWithDescriptionAndAuxButton A;
    public final RadioButtonWithDescriptionAndAuxButton B;
    public final QB C;
    public final View z;

    public DA2(View view, QB qb) {
        super(view);
        this.z = view;
        this.C = qb;
        RadioButtonWithDescriptionAndAuxButton radioButtonWithDescriptionAndAuxButton = (RadioButtonWithDescriptionAndAuxButton) view.findViewById(R.id.enhanced_option);
        this.B = radioButtonWithDescriptionAndAuxButton;
        RadioButtonWithDescriptionAndAuxButton radioButtonWithDescriptionAndAuxButton2 = (RadioButtonWithDescriptionAndAuxButton) view.findViewById(R.id.standard_option);
        this.A = radioButtonWithDescriptionAndAuxButton2;
        radioButtonWithDescriptionAndAuxButton.j(this);
        radioButtonWithDescriptionAndAuxButton2.j(this);
    }

    @Override // defpackage.RG2
    public final void e(int i) {
        LayoutInflater from = LayoutInflater.from(this.z.getContext());
        int id = this.B.getId();
        QB qb = this.C;
        if (i != id) {
            if (i == this.A.getId()) {
                ((m) qb).p(new C9969tA2(from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0221, (ViewGroup) null)), true);
                return;
            }
            return;
        }
        ((m) qb).p(new C9969tA2(from.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0220, (ViewGroup) null)), true);
    }
}
