package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.List;
import org.chromium.content.browser.picker.DateTimeSuggestion;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2765Vh0 extends ArrayAdapter {
    public final Context a;

    public C2765Vh0(Context context, List list) {
        super(context, R.layout.f56920_resource_name_obfuscated_res_0x7f0e00bd, list);
        this.a = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = this.a;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.f56920_resource_name_obfuscated_res_0x7f0e00bd, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.date_time_suggestion_value);
        TextView textView2 = (TextView) view.findViewById(R.id.date_time_suggestion_label);
        if (i == getCount() - 1) {
            textView.setText(context.getText(R.string.f71960_resource_name_obfuscated_res_0x7f1403e6));
            textView2.setText("");
        } else {
            textView.setText(((DateTimeSuggestion) getItem(i)).b);
            textView2.setText(((DateTimeSuggestion) getItem(i)).c);
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return super.getCount() + 1;
    }
}
