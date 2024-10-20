package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class T13 {
    public final RelativeLayout a;
    public final ScrollView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final Button h;
    public final Button i;

    public T13(Context context) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.f60610_resource_name_obfuscated_res_0x7f0e025f, (ViewGroup) null);
        this.a = relativeLayout;
        this.b = (ScrollView) relativeLayout.findViewById(R.id.scroll_view);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.secure_payment_confirmation_image);
        this.c = (TextView) relativeLayout.findViewById(R.id.store);
        this.d = (TextView) relativeLayout.findViewById(R.id.payment);
        this.e = (ImageView) relativeLayout.findViewById(R.id.payment_icon);
        this.f = (TextView) relativeLayout.findViewById(R.id.total);
        this.g = (TextView) relativeLayout.findViewById(R.id.currency);
        this.h = (Button) relativeLayout.findViewById(R.id.continue_button);
        this.i = (Button) relativeLayout.findViewById(R.id.cancel_button);
        imageView.setImageResource(R.drawable.f53080_resource_name_obfuscated_res_0x7f090478);
    }
}
