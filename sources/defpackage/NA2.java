package defpackage;

import J.N;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.CheckableImageView;
import org.chromium.ui.widget.ChromeBulletSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NA2 extends Dialog implements View.OnClickListener {
    public final View a;
    public final LayoutInflater g;
    public final CheckableImageView h;
    public boolean i;

    public NA2(Context context) {
        super(context, R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        LayoutInflater from = LayoutInflater.from(context);
        this.g = from;
        this.i = false;
        View inflate = from.inflate(R.layout.f60070_resource_name_obfuscated_res_0x7f0e0226, (ViewGroup) null);
        this.a = inflate;
        setContentView(inflate);
        ((ButtonCompat) inflate.findViewById(R.id.yes_button)).setOnClickListener(this);
        ((ButtonCompat) inflate.findViewById(R.id.no_button)).setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.dropdown_element);
        linearLayout.setOnClickListener(this);
        b(linearLayout);
        CheckableImageView checkableImageView = (CheckableImageView) inflate.findViewById(R.id.expand_arrow);
        this.h = checkableImageView;
        C9817sk3 c9817sk3 = new C9817sk3(context);
        C9132qk3 a = c9817sk3.a(new int[]{android.R.attr.state_checked}, R.drawable.f47550_resource_name_obfuscated_res_0x7f090200);
        C9132qk3 a2 = c9817sk3.a(new int[0], R.drawable.f47560_resource_name_obfuscated_res_0x7f090201);
        c9817sk3.b(a, a2, R.drawable.f54020_resource_name_obfuscated_res_0x7f0904d8);
        c9817sk3.b(a2, a, R.drawable.f54030_resource_name_obfuscated_res_0x7f0904d9);
        AnimatedStateListDrawable c = c9817sk3.c();
        c.setTintList(Y50.b(context, R.color.f17870_resource_name_obfuscated_res_0x7f07012b));
        checkableImageView.setImageDrawable(c);
        checkableImageView.setChecked(this.i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.yes_button) {
            N.Mq9orIwX(6);
            dismiss();
            return;
        }
        if (id == R.id.no_button) {
            N.Mq9orIwX(7);
            dismiss();
            return;
        }
        if (id == R.id.dropdown_element) {
            LinearLayout linearLayout = (LinearLayout) this.a.findViewById(R.id.dropdown_container);
            if (this.i) {
                N.Mq9orIwX(9);
                linearLayout.removeAllViews();
                linearLayout.setVisibility(8);
            } else {
                N.Mq9orIwX(8);
                linearLayout.setVisibility(0);
                this.g.inflate(R.layout.f60080_resource_name_obfuscated_res_0x7f0e0227, linearLayout);
                a(linearLayout, R.id.privacy_sandbox_consent_dropdown_topics_one, R.string.f83390_resource_name_obfuscated_res_0x7f1408e4);
                a(linearLayout, R.id.privacy_sandbox_consent_dropdown_topics_two, R.string.f83400_resource_name_obfuscated_res_0x7f1408e5);
                a(linearLayout, R.id.privacy_sandbox_consent_dropdown_topics_three, R.string.f83410_resource_name_obfuscated_res_0x7f1408e6);
                a(linearLayout, R.id.privacy_sandbox_consent_dropdown_fledge_one, R.string.f83360_resource_name_obfuscated_res_0x7f1408e1);
                a(linearLayout, R.id.privacy_sandbox_consent_dropdown_fledge_two, R.string.f83370_resource_name_obfuscated_res_0x7f1408e2);
                a(linearLayout, R.id.privacy_sandbox_consent_dropdown_fledge_three, R.string.f83380_resource_name_obfuscated_res_0x7f1408e3);
            }
            boolean z = !this.i;
            this.i = z;
            this.h.setChecked(z);
            b(view);
            view.announceForAccessibility(getContext().getResources().getString(this.i ? R.string.f65840_resource_name_obfuscated_res_0x7f140134 : R.string.f65710_resource_name_obfuscated_res_0x7f140127));
        }
    }

    public final void a(LinearLayout linearLayout, int i, int i2) {
        TextView textView = (TextView) linearLayout.findViewById(i);
        SpannableString a = AbstractC9108qg3.a(getContext().getResources().getString(i2), new C8765pg3(new StyleSpan(1), "<b>", "</b>"));
        a.setSpan(new ChromeBulletSpan(getContext()), 0, a.length(), 0);
        textView.setText(a);
    }

    public final void b(View view) {
        view.setContentDescription(getContext().getResources().getString(R.string.f71070_resource_name_obfuscated_res_0x7f14038b, getContext().getResources().getString(R.string.f83140_resource_name_obfuscated_res_0x7f1408cb), getContext().getResources().getString(this.i ? R.string.f65840_resource_name_obfuscated_res_0x7f140134 : R.string.f65710_resource_name_obfuscated_res_0x7f140127)));
    }

    @Override // android.app.Dialog
    public final void show() {
        N.Mq9orIwX(5);
        super.show();
    }
}
