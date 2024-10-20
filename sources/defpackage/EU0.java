package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class EU0 {
    public final ZX1 a;
    public final PropertyModel b;
    public final View c;

    public EU0(Context context, ZX1 zx1, final DU0 du0, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0118, (ViewGroup) null);
        this.c = inflate;
        this.a = zx1;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd2 = new GD2();
        gd2.a = inflate;
        e.put(pd2, gd2);
        JD2 jd2 = AbstractC4249cY1.a;
        CU0 cu0 = new CU0();
        GD2 gd22 = new GD2();
        gd22.a = cu0;
        PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd22, e);
        this.b = a;
        inflate.findViewById(R.id.fre_uma_dialog_dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: AU0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EU0 eu0 = EU0.this;
                eu0.a.c(3, eu0.b);
            }
        });
        Switch r6 = (Switch) inflate.findViewById(R.id.fre_uma_dialog_switch);
        r6.setChecked(z);
        r6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: BU0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                DU0.this.o(z2);
            }
        });
        zx1.l(a, 1, false);
    }
}
