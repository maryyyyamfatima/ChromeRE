package org.chromium.chrome.browser.ntp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.Ge4;
import defpackage.InterfaceC7406lj1;
import defpackage.LB1;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.ui.widget.ChromeBulletSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RevampedIncognitoDescriptionView extends LinearLayout implements InterfaceC7406lj1 {
    public Resources a;
    public int g;
    public int h;
    public LinearLayout i;
    public LinearLayout j;
    public LinearLayout k;
    public LinearLayout l;
    public LinearLayout m;
    public TextView n;
    public SwitchCompat o;
    public ImageView p;
    public TextView q;
    public TextView r;

    public RevampedIncognitoDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.InterfaceC7406lj1
    public final void e(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.o.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // defpackage.InterfaceC7406lj1
    public final void b(boolean z) {
        this.o.setChecked(z);
    }

    @Override // defpackage.InterfaceC7406lj1
    public final void a(View.OnClickListener onClickListener) {
        this.p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = getContext().getResources();
        this.g = Ge4.b(getContext(), this.a.getConfiguration().screenWidthDp);
        this.h = Ge4.b(getContext(), this.a.getConfiguration().screenHeightDp);
        this.i = (LinearLayout) findViewById(R.id.revamped_incognito_ntp_container);
        g(R.id.revamped_incognito_ntp_does_description_view, R.string.f84580_resource_name_obfuscated_res_0x7f14095e);
        g(R.id.revamped_incognito_ntp_does_not_description_view, R.string.f84600_resource_name_obfuscated_res_0x7f140960);
        this.j = (LinearLayout) findViewById(R.id.revamped_incognito_ntp_content);
        this.k = (LinearLayout) findViewById(R.id.revamped_incognito_ntp_description_text_container);
        this.l = (LinearLayout) findViewById(R.id.revamped_incognito_ntp_does_layout);
        this.m = (LinearLayout) findViewById(R.id.revamped_incognito_ntp_does_not_layout);
        this.n = (TextView) findViewById(R.id.revamped_incognito_ntp_learn_more);
        this.o = (SwitchCompat) findViewById(R.id.revamped_cookie_controls_card_toggle);
        this.p = (ImageView) findViewById(R.id.revamped_cookie_controls_card_managed_icon);
        this.q = (TextView) findViewById(R.id.revamped_cookie_controls_card_title);
        this.r = (TextView) findViewById(R.id.revamped_cookie_controls_card_subtitle);
        f();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Configuration configuration = this.a.getConfiguration();
        int b = Ge4.b(getContext(), configuration.screenWidthDp);
        int b2 = Ge4.b(getContext(), configuration.screenHeightDp);
        if (this.g != b || this.h != b2) {
            this.g = b;
            this.h = b2;
            f();
        }
        super.onMeasure(i, i2);
    }

    public final void g(int i, int i2) {
        ((TextView) findViewById(i)).setText(AbstractC9108qg3.a(getContext().getResources().getString(i2).replaceFirst(" *<li>([^<]*)</li>", "<li1>$1</li1>").replaceFirst(" *<li>([^<]*)</li>", "<li2>$1</li2>").replaceFirst(" *<li>([^<]*)</li>\n", "<li3>$1</li3>").replaceAll(" *</?ul>\\n?", ""), new C8765pg3(new ChromeBulletSpan(getContext()), "<li1>", "</li1>"), new C8765pg3(new ChromeBulletSpan(getContext()), "<li2>", "</li2>"), new C8765pg3(new ChromeBulletSpan(getContext()), "<li3>", "</li3>")));
    }

    public final void f() {
        int dimensionPixelSize;
        int min;
        int i;
        int dimensionPixelSize2 = this.a.getDimensionPixelSize(R.dimen.f33940_resource_name_obfuscated_res_0x7f080362);
        int dimensionPixelSize3 = this.a.getDimensionPixelSize(R.dimen.f33960_resource_name_obfuscated_res_0x7f080364);
        int integer = this.a.getInteger(R.integer.f54480_resource_name_obfuscated_res_0x7f0c000d);
        if (this.g <= this.a.getDimensionPixelSize(R.dimen.f34100_resource_name_obfuscated_res_0x7f080372)) {
            i = this.a.getDimensionPixelSize(this.g <= this.a.getDimensionPixelSize(R.dimen.f34050_resource_name_obfuscated_res_0x7f08036d) ? R.dimen.f34040_resource_name_obfuscated_res_0x7f08036c : R.dimen.f34030_resource_name_obfuscated_res_0x7f08036b);
            dimensionPixelSize = this.a.getDimensionPixelSize(R.dimen.f34060_resource_name_obfuscated_res_0x7f08036e);
            this.i.setGravity(8388611);
            this.k.setOrientation(1);
            min = Math.min(dimensionPixelSize2, this.g - (i * 2));
            LB1 lb1 = new LB1(-2);
            lb1.setMargins(0, dimensionPixelSize3, 0, 0);
            this.l.setLayoutParams(lb1);
            this.m.setLayoutParams(lb1);
        } else {
            int dimensionPixelSize4 = this.a.getDimensionPixelSize(R.dimen.f33990_resource_name_obfuscated_res_0x7f080367);
            int dimensionPixelSize5 = this.a.getDimensionPixelSize(R.dimen.f33980_resource_name_obfuscated_res_0x7f080366);
            dimensionPixelSize = this.a.getDimensionPixelSize(this.h <= dimensionPixelSize4 ? R.dimen.f34010_resource_name_obfuscated_res_0x7f080369 : R.dimen.f34000_resource_name_obfuscated_res_0x7f080368);
            this.i.setGravity(1);
            this.k.setOrientation(0);
            min = Math.min(dimensionPixelSize2, this.g - (dimensionPixelSize5 * 2));
            int dimensionPixelSize6 = this.a.getDimensionPixelSize(R.dimen.f33950_resource_name_obfuscated_res_0x7f080363);
            float f = integer;
            LB1 lb12 = new LB1(f);
            lb12.setMargins(0, dimensionPixelSize3, dimensionPixelSize6, 0);
            this.l.setLayoutParams(lb12);
            LB1 lb13 = new LB1(f);
            lb13.setMargins(0, dimensionPixelSize3, 0, 0);
            this.m.setLayoutParams(lb13);
            i = dimensionPixelSize5;
        }
        this.j.setLayoutParams(new LinearLayout.LayoutParams(min, -2));
        int dimensionPixelSize7 = this.a.getDimensionPixelSize(R.dimen.f34020_resource_name_obfuscated_res_0x7f08036a) - ((int) ((getContext().getResources().getDimensionPixelSize(R.dimen.f35890_resource_name_obfuscated_res_0x7f0804f2) - this.n.getTextSize()) / 2.0f));
        ((LinearLayout.LayoutParams) this.n.getLayoutParams()).setMargins(0, dimensionPixelSize7, 0, dimensionPixelSize7);
        this.i.setPadding(i, dimensionPixelSize, i, dimensionPixelSize);
    }

    @Override // defpackage.InterfaceC7406lj1
    public final void c(final View.OnClickListener onClickListener) {
        String string = getContext().getResources().getString(R.string.f84620_resource_name_obfuscated_res_0x7f140962);
        Context context = getContext();
        Objects.requireNonNull(onClickListener);
        this.n.setText(AbstractC9108qg3.a(string, new C8765pg3(new C11997z52(context, R.color.f18160_resource_name_obfuscated_res_0x7f070148, new Callback() { // from class: gQ2
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                onClickListener.onClick((View) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }), "<a>", "</a>")));
        this.n.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // defpackage.InterfaceC7406lj1
    public final void d(int i) {
        String string;
        int i2;
        boolean z = i != 0;
        boolean z2 = !z;
        this.o.setEnabled(z2);
        this.p.setVisibility(z ? 0 : 8);
        this.q.setEnabled(z2);
        this.r.setEnabled(z2);
        Resources resources = getContext().getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(R.string.f78200_resource_name_obfuscated_res_0x7f1406c9));
        if (!z) {
            this.r.setText(sb.toString());
            return;
        }
        if (i == 1) {
            string = resources.getString(R.string.f76690_resource_name_obfuscated_res_0x7f1405ef);
            i2 = R.drawable.f47080_resource_name_obfuscated_res_0x7f0901cd;
        } else {
            if (i != 3) {
                return;
            }
            string = resources.getString(R.string.f78150_resource_name_obfuscated_res_0x7f1406c4);
            i2 = R.drawable.f53230_resource_name_obfuscated_res_0x7f090487;
        }
        this.p.setImageResource(i2);
        sb.append("\n");
        sb.append(string);
        this.r.setText(sb.toString());
    }
}
