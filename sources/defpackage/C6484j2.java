package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j2 */
/* loaded from: classes.dex */
public final class C6484j2 extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        final C1272Ju1 c1272Ju1 = (C1272Ju1) obj;
        TextView textView = (TextView) view;
        textView.setText(c1272Ju1.a);
        textView.setContentDescription(c1272Ju1.a);
        textView.setOnClickListener(new View.OnClickListener() { // from class: i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1272Ju1 c1272Ju12 = C1272Ju1.this;
                c1272Ju12.b.onResult(c1272Ju12);
            }
        });
    }

    public C6484j2(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e01dc, recyclerView);
    }
}
