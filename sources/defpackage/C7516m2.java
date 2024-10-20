package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m2 */
/* loaded from: classes.dex */
public final class C7516m2 extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        String str = (String) obj;
        TextView textView = (TextView) ((LinearLayout) view).findViewById(R.id.tab_title);
        textView.setText(str);
        textView.setContentDescription(str);
    }

    public C7516m2(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0152, recyclerView);
    }

    public C7516m2(RecyclerView recyclerView, int i) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e0156, recyclerView);
    }
}
