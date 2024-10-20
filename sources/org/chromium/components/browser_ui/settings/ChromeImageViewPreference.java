package org.chromium.components.browser_ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.android.chrome.R;
import defpackage.AbstractC4871eL1;
import defpackage.C1812Ny2;
import defpackage.InterfaceC4184cL1;
import defpackage.L53;
import defpackage.Y50;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeImageViewPreference extends Preference {
    public InterfaceC4184cL1 T;
    public View.OnClickListener U;
    public int V;
    public int W;
    public Integer X;
    public int Y;
    public boolean Z;
    public ImageView a0;
    public View b0;

    @Override // androidx.preference.Preference, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Preference) obj);
    }

    public ChromeImageViewPreference(Context context) {
        this(context, null);
    }

    public ChromeImageViewPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z = true;
        this.L = R.layout.0_resource_name_obfuscated_res_0x7f0e0206;
        N();
        if (this.W == R.color.0_resource_name_obfuscated_res_0x7f07012b) {
            return;
        }
        this.W = R.color.0_resource_name_obfuscated_res_0x7f07012b;
        W();
    }

    @Override // androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        Integer num;
        super.v(c1812Ny2);
        ImageView imageView = (ImageView) c1812Ny2.v(R.id.image_view_widget);
        this.a0 = imageView;
        imageView.setBackgroundColor(0);
        this.a0.setVisibility(0);
        View view = c1812Ny2.a;
        this.b0 = view;
        if (view != null && (num = this.X) != null) {
            view.setBackgroundColor(Y50.b(this.a, num.intValue()).getDefaultColor());
        }
        W();
        final InterfaceC4184cL1 interfaceC4184cL1 = this.T;
        View view2 = this.b0;
        if (interfaceC4184cL1 == null) {
            return;
        }
        AbstractC4871eL1.c(interfaceC4184cL1, this, view2);
        if (interfaceC4184cL1.d(this) || interfaceC4184cL1.a(this)) {
            ImageView imageView2 = (ImageView) view2.findViewById(R.id.image_view_widget);
            imageView2.setImageDrawable(AbstractC4871eL1.a(interfaceC4184cL1, this));
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: dL1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    InterfaceC4184cL1 interfaceC4184cL12 = InterfaceC4184cL1.this;
                    ChromeImageViewPreference chromeImageViewPreference = this;
                    if (interfaceC4184cL12.d(chromeImageViewPreference)) {
                        AbstractC4871eL1.e(chromeImageViewPreference.a, R.string.0_resource_name_obfuscated_res_0x7f1405ef);
                    } else if (interfaceC4184cL12.a(chromeImageViewPreference)) {
                        AbstractC4871eL1.e(chromeImageViewPreference.a, interfaceC4184cL12.c() ? R.string.0_resource_name_obfuscated_res_0x7f1405f1 : R.string.0_resource_name_obfuscated_res_0x7f1405f0);
                    }
                }
            });
        }
    }

    @Override // androidx.preference.Preference
    public final void w() {
        AbstractC4871eL1.d(this.T, this);
    }

    public final void X(int i, int i2, View.OnClickListener onClickListener) {
        this.V = i;
        this.Y = i2;
        this.U = onClickListener;
        W();
        q();
    }

    public final void W() {
        int i = this.V;
        if (i == 0 || this.a0 == null) {
            return;
        }
        this.a0.setImageDrawable(L53.b(i, this.W, this.a));
        this.a0.setEnabled(this.Z);
        if (this.Z) {
            this.a0.setOnClickListener(this.U);
        }
        if (this.Y != 0) {
            ImageView imageView = this.a0;
            imageView.setContentDescription(imageView.getResources().getString(this.Y));
        }
    }
}
