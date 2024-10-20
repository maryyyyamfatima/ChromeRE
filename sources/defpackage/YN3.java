package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YN3 {
    public final Context a;
    public CharSequence b;
    public View c;
    public Integer d;
    public Integer e;
    public int f = 0;

    public YN3(Context context) {
        this.a = context;
    }

    public final ZN3 a() {
        Context context = this.a;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.f56880_resource_name_obfuscated_res_0x7f0e00b9, (ViewGroup) null);
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.announceForAccessibility(this.b);
        }
        if (this.d != null) {
            textView.getBackground().setTint(this.d.intValue());
        }
        Integer num = this.e;
        if (num != null) {
            textView.setTextAppearance(num.intValue());
        }
        ZN3 zn3 = new ZN3(context, textView);
        View view = this.c;
        Toast toast = zn3.a;
        if (view != null) {
            Point point = AbstractC1895Op0.b(context).c;
            int i = point.x;
            int i2 = point.y;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            int i3 = iArr[0];
            boolean z = i3 < i / 2;
            int i4 = z ? 3 : 5;
            int i5 = z ? (width / 2) + i3 : (i - i3) - (width / 2);
            int i6 = iArr[1];
            toast.setGravity(i4 | 48, i5, i6 < i2 / 2 ? (height / 2) + i6 : i6 - ((height * 3) / 2));
        }
        toast.setDuration(this.f);
        return zn3;
    }
}
