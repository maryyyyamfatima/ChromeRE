package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l2 */
/* loaded from: classes.dex */
public final class C7172l2 extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        final C1402Ku1 c1402Ku1 = (C1402Ku1) obj;
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1402Ku1.this.c.onResult(Boolean.valueOf(!r2.b));
            }
        });
        ((TextView) linearLayout.findViewById(R.id.option_toggle_title)).setText(c1402Ku1.a);
        TextView textView = (TextView) linearLayout.findViewById(R.id.option_toggle_subtitle);
        boolean z = c1402Ku1.b;
        textView.setText(z ? R.string.0_resource_name_obfuscated_res_0x7f140b27 : R.string.0_resource_name_obfuscated_res_0x7f140b26);
        SwitchCompat switchCompat = (SwitchCompat) linearLayout.findViewById(R.id.option_toggle_switch);
        switchCompat.setChecked(z);
        switchCompat.setBackground(null);
    }

    public C7172l2(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0153, recyclerView);
    }
}
