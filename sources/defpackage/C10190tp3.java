package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tp3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10190tp3 extends BaseAdapter {
    public final LayoutInflater a;
    public final /* synthetic */ AbstractViewOnClickListenerC10533up3 g;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.o;
    }

    public C10190tp3(AbstractViewOnClickListenerC10533up3 abstractViewOnClickListenerC10533up3) {
        this.g = abstractViewOnClickListenerC10533up3;
        this.a = (LayoutInflater) abstractViewOnClickListenerC10533up3.a.getSystemService("layout_inflater");
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.g.b(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (textView == null) {
            textView = (TextView) this.a.inflate(R.layout.f61470_resource_name_obfuscated_res_0x7f0e02b7, viewGroup, false);
        }
        textView.setText(this.g.c(i));
        return textView;
    }
}
