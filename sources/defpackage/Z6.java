package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.Preference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Z6 extends Preference implements InterfaceC9555ry2 {
    public final Y6 T;
    public final int U;
    public final String V;
    public final C7034ke3 W;
    public final int X;
    public final int Y;

    @Override // androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        TextView textView = (TextView) c1812Ny2.v(R.id.title);
        textView.setAllCaps(true);
        textView.setTextColor(this.U);
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        Context context = this.a;
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0038, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(com.android.chrome.R.id.site);
        CheckBox checkBox = (CheckBox) inflate.findViewById(com.android.chrome.R.id.third_parties_exception_checkbox);
        if (!this.W.o(8)) {
            checkBox.setVisibility(8);
            checkBox.setChecked(false);
        }
        V6 v6 = new V6(this, checkBox, editText);
        C5490g8 c5490g8 = new C5490g8(context, com.android.chrome.R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140bf2);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.f = this.V;
        c4115c8.q = inflate;
        c5490g8.f(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140be6, v6);
        c5490g8.e(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f1402f4, v6);
        DialogC5834h8 a = c5490g8.a();
        ((LayoutInflaterFactory2C0545Ef) a.c()).y = false;
        a.setOnShowListener(new W6(editText));
        a.show();
        Button button = a.j.k;
        button.setEnabled(false);
        editText.addTextChangedListener(new X6(this, button, editText));
        return true;
    }

    public Z6(Context context, String str, C7034ke3 c7034ke3, Y6 y6) {
        super(context, null);
        this.V = str;
        this.W = c7034ke3;
        this.T = y6;
        this.k = this;
        K("add_exception");
        Resources resources = this.a.getResources();
        int b = AbstractC10957w33.b(this.a);
        this.U = b;
        this.X = resources.getColor(com.android.chrome.R.color.0_resource_name_obfuscated_res_0x7f07012e);
        this.Y = Y50.b(this.a, com.android.chrome.R.color.0_resource_name_obfuscated_res_0x7f07014a).getDefaultColor();
        Drawable c = AbstractC9771sd.c(resources, com.android.chrome.R.drawable.0_resource_name_obfuscated_res_0x7f090409, 0);
        c.mutate();
        c.setColorFilter(b, PorterDuff.Mode.SRC_IN);
        J(c);
        R(resources.getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140be5));
    }
}
