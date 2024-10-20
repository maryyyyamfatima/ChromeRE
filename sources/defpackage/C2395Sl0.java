package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.share.send_tab_to_self.TargetDeviceInfo;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2395Sl0 extends BaseAdapter {
    public final List a;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C2395Sl0(List list) {
        this.a = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (TargetDeviceInfo) this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable a;
        String string;
        if (view != null) {
            return view;
        }
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.f60690_resource_name_obfuscated_res_0x7f0e0267, viewGroup, false);
        TargetDeviceInfo targetDeviceInfo = (TargetDeviceInfo) this.a.get(i);
        ChromeImageView chromeImageView = (ChromeImageView) inflate.findViewById(R.id.device_icon);
        int i2 = targetDeviceInfo.b;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            a = AbstractC2884Wf.a(context, R.drawable.f45880_resource_name_obfuscated_res_0x7f09014c);
        } else if (i2 == 6) {
            a = AbstractC2884Wf.a(context, R.drawable.f53430_resource_name_obfuscated_res_0x7f09049b);
        } else {
            a = AbstractC2884Wf.a(context, R.drawable.f46040_resource_name_obfuscated_res_0x7f09015c);
        }
        chromeImageView.setImageDrawable(a);
        chromeImageView.setVisibility(0);
        ((TextView) inflate.findViewById(R.id.device_name)).setText(targetDeviceInfo.c);
        TextView textView = (TextView) inflate.findViewById(R.id.last_active);
        long days = TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTimeInMillis() - targetDeviceInfo.d);
        Resources resources = context.getResources();
        if (days < 1) {
            string = resources.getString(R.string.f85980_resource_name_obfuscated_res_0x7f1409ef);
        } else if (days == 1) {
            string = resources.getString(R.string.f85970_resource_name_obfuscated_res_0x7f1409ee);
        } else {
            string = resources.getString(R.string.f85960_resource_name_obfuscated_res_0x7f1409ed, Long.valueOf(days));
        }
        textView.setText(string);
        return inflate;
    }
}
