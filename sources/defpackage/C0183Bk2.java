package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bk2 */
/* loaded from: classes.dex */
public final class C0183Bk2 extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        final C1272Ju1 c1272Ju1 = (C1272Ju1) obj;
        TextView textView = (TextView) ((LinearLayout) view).findViewById(R.id.footer_text);
        textView.setText(c1272Ju1.a);
        textView.setContentDescription(c1272Ju1.a);
        textView.setOnClickListener(new View.OnClickListener() { // from class: zk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1272Ju1 c1272Ju12 = C1272Ju1.this;
                c1272Ju12.b.onResult(c1272Ju12);
            }
        });
        textView.setClickable(true);
    }

    public C0183Bk2(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e01db, recyclerView);
    }
}
