package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fk2 */
/* loaded from: classes.dex */
public final class C0703Fk2 extends AbstractC5798h2 {
    @Override // defpackage.AbstractC5798h2
    public final void v(View view, Object obj) {
        String str = (String) obj;
        TextView textView = (TextView) ((LinearLayout) view).findViewById(R.id.tab_title);
        textView.setText(str);
        textView.setContentDescription(str);
    }

    public C0703Fk2(RecyclerView recyclerView) {
        super(R.layout.0_resource_name_obfuscated_res_0x7f0e01da, recyclerView);
    }
}
