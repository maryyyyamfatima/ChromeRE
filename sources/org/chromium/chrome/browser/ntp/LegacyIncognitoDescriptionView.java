package org.chromium.chrome.browser.ntp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.android.chrome.R;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.Ge4;
import defpackage.InterfaceC7406lj1;
import defpackage.M41;
import defpackage.UN;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ntp.LegacyIncognitoDescriptionView;
import org.chromium.ui.widget.ChromeBulletSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LegacyIncognitoDescriptionView extends LinearLayout implements InterfaceC7406lj1 {
    public int a;
    public int g;
    public LinearLayout h;
    public TextView i;
    public TextView j;
    public LinearLayout k;
    public TextView l;
    public TextView[] m;
    public RelativeLayout n;
    public SwitchCompat o;
    public ImageView p;
    public TextView q;
    public TextView r;

    public LegacyIncognitoDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.InterfaceC7406lj1
    public final void c(View.OnClickListener onClickListener) {
        this.l.setOnClickListener(onClickListener);
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
        this.a = getContext().getResources().getConfiguration().screenWidthDp;
        this.g = getContext().getResources().getConfiguration().screenHeightDp;
        g(R.id.new_tab_incognito_features, R.string.f78160_resource_name_obfuscated_res_0x7f1406c5);
        g(R.id.new_tab_incognito_warning, R.string.f78220_resource_name_obfuscated_res_0x7f1406cb);
        this.h = (LinearLayout) findViewById(R.id.new_tab_incognito_container);
        this.i = (TextView) findViewById(R.id.new_tab_incognito_title);
        this.j = (TextView) findViewById(R.id.new_tab_incognito_subtitle);
        this.l = (TextView) findViewById(R.id.learn_more);
        this.m = new TextView[]{this.j, (TextView) findViewById(R.id.new_tab_incognito_features), (TextView) findViewById(R.id.new_tab_incognito_warning)};
        this.k = (LinearLayout) findViewById(R.id.new_tab_incognito_bulletpoints_container);
        this.n = (RelativeLayout) findViewById(R.id.cookie_controls_card);
        this.o = (SwitchCompat) findViewById(R.id.cookie_controls_card_toggle);
        this.p = (ImageView) findViewById(R.id.cookie_controls_card_managed_icon);
        this.q = (TextView) findViewById(R.id.cookie_controls_card_title);
        this.r = (TextView) findViewById(R.id.cookie_controls_card_subtitle);
        f();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = this.a;
        int i4 = configuration.screenWidthDp;
        if (i3 != i4 || this.g != configuration.screenHeightDp) {
            this.a = i4;
            this.g = configuration.screenHeightDp;
            f();
        }
        super.onMeasure(i, i2);
    }

    public final void g(int i, int i2) {
        ((TextView) findViewById(i)).setText(AbstractC9108qg3.a(getContext().getResources().getString(i2).replaceAll("<li>([^<]+)\n", "<li>$1</li>\n").replaceFirst(" *<li>([^<]*)</li>", "<li1>$1</li1>").replaceFirst(" *<li>([^<]*)</li>", "<li2>$1</li2>").replaceFirst(" *<li>([^<]*)</li>\n", "<li3>$1</li3>").replaceAll(" *</?ul>\\n?", ""), new C8765pg3(new ForegroundColorSpan(getContext().getColor(R.color.f22290_resource_name_obfuscated_res_0x7f070597)), "<em>", "</em>"), new C8765pg3(new ChromeBulletSpan(getContext()), "<li1>", "</li1>"), new C8765pg3(new ChromeBulletSpan(getContext()), "<li2>", "</li2>"), new C8765pg3(new ChromeBulletSpan(getContext()), "<li3>", "</li3>")));
    }

    public final void f() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4 = this.a;
        if (i4 <= 720) {
            if (i4 <= 240 || this.g <= 480) {
                i = 48;
            }
            i = 72;
        } else {
            if (this.g > 480) {
                i = 120;
            }
            i = 72;
        }
        ImageView imageView = (ImageView) findViewById(R.id.new_tab_incognito_icon);
        float f = i;
        imageView.getLayoutParams().width = Ge4.b(getContext(), f);
        imageView.getLayoutParams().height = Ge4.b(getContext(), f);
        int i5 = this.a;
        if (i5 <= 720) {
            i2 = 32;
            i3 = i5 <= 240 ? 24 : 32;
            this.h.setGravity(8388611);
            this.j.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.j.setMaxWidth(Ge4.b(getContext(), 600.0f));
            this.k.getLayoutParams().width = Ge4.b(getContext(), Math.min(600, this.a - (i3 * 2)));
            z = false;
        } else {
            i2 = this.g <= 320 ? 16 : 72;
            this.h.setGravity(1);
            int b = Ge4.b(getContext(), 600.0f);
            this.j.setLayoutParams(new LinearLayout.LayoutParams(b, -2));
            this.k.getLayoutParams().width = b;
            i3 = 0;
            z = true;
        }
        if (z) {
            this.k.setOrientation(0);
        } else {
            this.k.setOrientation(1);
        }
        int b2 = Ge4.b(getContext(), i2);
        float f2 = i3;
        this.h.setPadding(Ge4.b(getContext(), f2), b2, Ge4.b(getContext(), f2), b2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.f34090_resource_name_obfuscated_res_0x7f080371);
        TextView[] textViewArr = this.m;
        int length = textViewArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            TextView textView = textViewArr[i6];
            ((LinearLayout.LayoutParams) textView.getLayoutParams()).setMargins(0, dimensionPixelSize, (z && textView == this.k.getChildAt(0)) ? Ge4.b(getContext(), 40.0f) : 0, 0);
            textView.setLayoutParams(textView.getLayoutParams());
        }
        int dimensionPixelSize2 = (int) ((getContext().getResources().getDimensionPixelSize(R.dimen.f35890_resource_name_obfuscated_res_0x7f0804f2) - this.l.getTextSize()) / 2.0f);
        ((LinearLayout.LayoutParams) this.l.getLayoutParams()).setMargins(0, (dimensionPixelSize - dimensionPixelSize2) - Ge4.b(getContext(), 12.0f), 0, Ge4.b(getContext(), 12.0f) - dimensionPixelSize2);
        this.l.requestLayout();
        ((LinearLayout.LayoutParams) this.i.getLayoutParams()).setMargins(0, dimensionPixelSize, 0, 0);
        TextView textView2 = this.i;
        textView2.setLayoutParams(textView2.getLayoutParams());
        String string = getContext().getResources().getString(UN.K.a() ? R.string.f78180_resource_name_obfuscated_res_0x7f1406c7 : R.string.f78170_resource_name_obfuscated_res_0x7f1406c6);
        boolean z2 = this.a > 720;
        this.l.setVisibility(z2 ? 8 : 0);
        if (!z2) {
            this.j.setText(string);
            this.j.setMovementMethod(null);
        } else {
            StringBuilder a = M41.a(string, " ");
            a.append(getContext().getResources().getString(R.string.f76160_resource_name_obfuscated_res_0x7f1405af));
            SpannableString spannableString = new SpannableString(a.toString());
            spannableString.setSpan(new C11997z52(getContext(), R.color.f24730_resource_name_obfuscated_res_0x7f070797, new Callback() { // from class: pz1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    LegacyIncognitoDescriptionView.this.l.callOnClick();
                }
            }), string.length() + 1, spannableString.length(), 0);
            this.j.setText(spannableString);
            this.j.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (this.a <= 720) {
            this.n.getLayoutParams().width = -1;
        } else {
            this.n.getLayoutParams().width = Ge4.b(getContext(), 600.0f);
        }
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
