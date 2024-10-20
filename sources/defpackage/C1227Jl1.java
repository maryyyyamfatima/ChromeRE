package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.widget.DualControlLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1227Jl1 extends ArrayAdapter {
    public C1227Jl1(Context context, Object[] objArr) {
        super(context, R.layout.f58070_resource_name_obfuscated_res_0x7f0e0139, objArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = (TextView) C1357Kl1.d(R.layout.f58070_resource_name_obfuscated_res_0x7f0e0139, getContext(), viewGroup);
        }
        textView.setText(getItem(i).toString());
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DualControlLayout dualControlLayout;
        if (view instanceof DualControlLayout) {
            dualControlLayout = (DualControlLayout) view;
        } else {
            dualControlLayout = (DualControlLayout) C1357Kl1.d(R.layout.f58080_resource_name_obfuscated_res_0x7f0e013a, getContext(), viewGroup);
        }
        ((TextView) dualControlLayout.getChildAt(0)).setText((CharSequence) null);
        TextView textView = (TextView) dualControlLayout.getChildAt(1);
        textView.setText(getItem(i).toString());
        textView.setMinimumWidth(0);
        return dualControlLayout;
    }
}
